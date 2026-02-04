package com.example.killteamruleset.ui.data

import com.example.killteamruleset.ui.data.Xenos.WreckaKrew.WreckaKrewOperativeSelection
import com.example.killteamruleset.ui.data.Xenos.WreckaKrew.OperativeSelectionRule

object OperativeSelectionRepository {

    fun getRulesForTeam(teamId: String): List<OperativeSelectionRule> =
        when (teamId) {
            "wrecka_krew" -> WreckaKrewOperativeSelection
            else -> emptyList()
        }
}