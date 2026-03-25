package com.example.killteamruleset.state

import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import com.example.killteamruleset.ui.model.Ploy

object PlayerPloyState {

    val activeStrategyPloys = mutableStateListOf<Ploy>()
    val activeFirefightPloys = mutableStateListOf<Ploy>()

    fun clearSelections() {
        activeStrategyPloys.clear()
        activeFirefightPloys.clear()
    }
}

object OpponentPloyState {

    val activeStrategyPloys = mutableStateListOf<Ploy>()
    val activeFirefightPloys = mutableStateListOf<Ploy>()

    fun clearSelections() {
        activeStrategyPloys.clear()
        activeFirefightPloys.clear()
    }
}
