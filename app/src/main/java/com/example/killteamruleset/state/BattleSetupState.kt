package com.example.killteamruleset.state

import com.example.killteamruleset.ui.model.MapCategory
import com.example.killteamruleset.ui.model.CritOp
import androidx.compose.runtime.mutableStateOf
import com.example.killteamruleset.ui.model.GameMap

object BattleSetupState {

    var selectedCategory = mutableStateOf<MapCategory?>(null)
    var selectedMap = mutableStateOf<GameMap?>(null)
    var selectedCritOp = mutableStateOf<CritOp?>(null)
}