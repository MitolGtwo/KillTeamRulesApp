package com.example.killteamruleset.state


import androidx.compose.runtime.mutableStateOf
import com.example.killteamruleset.ui.model.Alliance

object AllianceUIState {
    val expandedAlliance = mutableStateOf<Alliance?>(null)
}