package com.example.killteamruleset.state


import androidx.compose.runtime.mutableStateOf
import com.example.killteamruleset.ui.model.MapCategory
import com.example.killteamruleset.ui.model.GameMap
import com.example.killteamruleset.ui.model.CritOp

object MapsUIState {

    val selectedCategory = mutableStateOf<MapCategory?>(null)

    val selectedMap = mutableStateOf<GameMap?>(null) // ✅ FIXED
    val selectedCritOp = mutableStateOf<CritOp?>(null)
    val selectedMapSet = mutableStateOf<String?>(null)
}