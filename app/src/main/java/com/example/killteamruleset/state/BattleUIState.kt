package com.example.killteamruleset.state

import androidx.compose.runtime.mutableStateOf
import com.example.killteamruleset.ui.model.Team

object BattleUIState {

    var opponentName = mutableStateOf("")

    var playerTeam = mutableStateOf<Team?>(null)
    var opponentTeam = mutableStateOf<Team?>(null)
}