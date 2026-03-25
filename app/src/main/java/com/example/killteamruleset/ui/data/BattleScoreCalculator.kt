package com.example.killteamruleset.ui.data

import com.example.killteamruleset.ui.model.BattleSession

object BattleScoreCalculator {

    fun getPlayerCrit(
        battle: BattleSession?,
        viewedIndex: Int?,
        fallback: Int
    ): Int {
        return battle?.turns
            ?.take((viewedIndex ?: battle.currentTurn - 1) + 1)
            ?.sumOf { it.playerCrit }
            ?: fallback
    }

    fun getPlayerTac(
        battle: BattleSession?,
        viewedIndex: Int?,
        fallback: Int
    ): Int {
        return battle?.turns
            ?.take((viewedIndex ?: battle.currentTurn - 1) + 1)
            ?.sumOf { it.playerTac }
            ?: fallback
    }

    fun getPlayerKill(
        battle: BattleSession?,
        viewedIndex: Int?,
        fallback: Int
    ): Int {
        return battle?.turns
            ?.take((viewedIndex ?: battle.currentTurn - 1) + 1)
            ?.sumOf { it.playerKill }
            ?: fallback
    }
}