package com.example.killteamruleset.state

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import com.example.killteamruleset.dataStore
import com.example.killteamruleset.ui.model.BattleSession
import com.example.killteamruleset.ui.model.BattleState
import com.example.killteamruleset.ui.model.TurnData
import com.google.gson.Gson
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import kotlin.plus

object BattleRepository {

    private val PLAYER_TEAM = stringPreferencesKey("player_team")
    private val OPPONENT_TEAM = stringPreferencesKey("opponent_team")
    private val OPPONENT_NAME = stringPreferencesKey("opponent_name")

    private val CURRENT_BATTLE = stringPreferencesKey("current_battle")

    private val BATTLE_HISTORY = stringPreferencesKey("battle_history")
    fun saveState(context: Context, state: BattleState) {
        CoroutineScope(Dispatchers.IO).launch {
            context.dataStore.edit {
                it[PLAYER_TEAM] = state.playerTeamId
                it[OPPONENT_TEAM] = state.opponentTeamId
                it[OPPONENT_NAME] = state.opponentName
            }
        }
    }


    fun loadHistory(context: Context): Flow<List<BattleSession>> {
        return context.dataStore.data.map { prefs ->
            val json = prefs[BATTLE_HISTORY] ?: return@map emptyList()

            Gson().fromJson(
                json,
                Array<BattleSession>::class.java
            )?.toList() ?: emptyList()
        }
    }

    fun loadState(context: Context): Flow<BattleState> {
        return context.dataStore.data.map { prefs ->
            BattleState(
                playerTeamId = prefs[PLAYER_TEAM] ?: "",
                opponentTeamId = prefs[OPPONENT_TEAM] ?: "",
                opponentName = prefs[OPPONENT_NAME] ?: ""
            )
        }
    }

    fun savePrimaryOp(
        context: Context,
        isPlayer: Boolean,
        type: String?,
        revealed: Boolean
    ) {
        CoroutineScope(Dispatchers.IO).launch {

            val typeKey = if (isPlayer)
                stringPreferencesKey("player_primary_op_type")
            else
                stringPreferencesKey("opponent_primary_op_type")

            val revealKey = if (isPlayer)
                booleanPreferencesKey("player_primary_op_revealed")
            else
                booleanPreferencesKey("opponent_primary_op_revealed")

            context.dataStore.edit { prefs ->
                prefs[typeKey] = type ?: ""
                prefs[revealKey] = revealed
            }
        }
    }

    fun saveCurrentBattle(context: Context, battle: BattleSession) {
        CoroutineScope(Dispatchers.IO).launch {

            val json = Gson().toJson(battle)

            context.dataStore.edit {
                it[CURRENT_BATTLE] = json
            }
        }
    }

    fun loadCurrentBattle(context: Context): Flow<BattleSession?> {
        return context.dataStore.data.map { prefs ->
            prefs[CURRENT_BATTLE]?.let {
                Gson().fromJson(it, BattleSession::class.java)
            }
        }
    }

    fun updateInitiative(context: Context, playerHasInitiative: Boolean) {
        CoroutineScope(Dispatchers.IO).launch {

            val gson = Gson()

            context.dataStore.edit { prefs ->

                val json = prefs[CURRENT_BATTLE] ?: return@edit
                val battle = gson.fromJson(json, BattleSession::class.java)

                // 🔥 SAVE INITIATIVE HISTORY
                val updatedInitiativeHistory =
                    battle.initiativeHistory + playerHasInitiative

                // 🔥 APPLY CP RULES
                val (playerCPGain, opponentCPGain) =
                    if (playerHasInitiative) {
                        1 to 2
                    } else {
                        2 to 1
                    }

                val updated = battle.copy(
                    initiativeHistory = updatedInitiativeHistory,
                    playerCP = battle.playerCP + playerCPGain,
                    opponentCP = battle.opponentCP + opponentCPGain
                )

                prefs[CURRENT_BATTLE] = gson.toJson(updated)
            }
        }
    }



    fun finishBattle(context: Context) {
        CoroutineScope(Dispatchers.IO).launch {

            val gson = Gson()

            context.dataStore.edit { prefs ->

                val currentJson = prefs[CURRENT_BATTLE] ?: return@edit
                val currentBattle = gson.fromJson(currentJson, BattleSession::class.java)

                // 🔥 Mark finished
                val finishedBattle = currentBattle.copy(isFinished = true)

                // 🔥 Load history
                val historyJson = prefs[BATTLE_HISTORY]
                val historyList = if (historyJson != null) {
                    gson.fromJson(historyJson, Array<BattleSession>::class.java).toMutableList()
                } else {
                    mutableListOf()
                }

                // 🔥 Add new battle at top
                historyList.add(0, finishedBattle)

                // 🔥 LIMIT TO 8
                val trimmed = historyList.take(8)

                // 🔥 Save history
                prefs[BATTLE_HISTORY] = gson.toJson(trimmed)

                // 🔥 CLEAR CURRENT BATTLE
                prefs.remove(CURRENT_BATTLE)
            }
        }
    }


    fun nextTurn(context: Context, turnData: TurnData) {
        CoroutineScope(Dispatchers.IO).launch {

            val gson = Gson()

            context.dataStore.edit { prefs ->

                val json = prefs[CURRENT_BATTLE] ?: return@edit
                val battle = gson.fromJson(json, BattleSession::class.java)

                val updatedTurns = battle.turns + turnData

                val updated = battle.copy(
                    currentTurn = (battle.currentTurn + 1).coerceAtMost(4),
                    turns = updatedTurns
                )

                prefs[CURRENT_BATTLE] = gson.toJson(updated)
            }
        }
    }



    fun startNewBattle(
        context: Context,
        playerName: String,
        opponentName: String,
        playerTeamId: String,
        opponentTeamId: String,
        mapType: String,
        mapNumber: Int,
        critOpNumber: Int,
        critOpName: String
    ) {
        CoroutineScope(Dispatchers.IO).launch {

            val newBattle = BattleSession(
                playerName = playerName,
                opponentName = opponentName,
                playerTeamId = playerTeamId,
                opponentTeamId = opponentTeamId,
                currentTurn = 1,
                isFinished = false,
                turns = emptyList(),
                initiativeHistory = emptyList(),

                playerCP = 0,
                opponentCP = 0,

                // 🔥 NEW
                mapType = mapType,
                mapNumber = mapNumber,
                critOpNumber = critOpNumber,
                critOpName = critOpName
            )

            context.dataStore.edit {
                it[CURRENT_BATTLE] = Gson().toJson(newBattle)
            }
        }
    }





}