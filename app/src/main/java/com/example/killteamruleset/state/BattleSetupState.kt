package com.example.killteamruleset.state

import androidx.compose.runtime.mutableStateOf
import com.example.killteamruleset.ui.model.CritOp
import com.example.killteamruleset.ui.model.GameMap
import com.example.killteamruleset.ui.model.MapCategory

object BattleSetupState {

    var selectedCategory = mutableStateOf<MapCategory?>(null)
    var selectedMap = mutableStateOf<GameMap?>(null)
    var selectedCritOp = mutableStateOf<CritOp?>(null)

}