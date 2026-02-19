package com.example.killteamruleset.ui.data

import com.example.killteamruleset.ui.data.Chaos.PlagueMarines.PlagueMarineOperativeSelection
import com.example.killteamruleset.ui.data.Empire.list.AngelsOfDeath.AngelsOfDeathOperativeSelection
import com.example.killteamruleset.ui.data.Empire.list.BattleClade.BattlecladeOperativeSelection
import com.example.killteamruleset.ui.data.Xenos.WreckaKrew.WreckaKrewOperativeSelection
import com.example.killteamruleset.ui.model.OperativeSelectionRule

object OperativeSelectionRepository {

    private val rulesByTeam: Map<String, List<OperativeSelectionRule>> = mapOf(
        "angels_of_death" to AngelsOfDeathOperativeSelection,
        "battle_clade" to BattlecladeOperativeSelection,
        "celestian_insidiants" to CelestianOperativeSelection,
        "death_Korps" to DeathKorpsOperativeSelection,
        "wrecka_krew" to WreckaKrewOperativeSelection,
        "plague_marines" to PlagueMarineOperativeSelection
    )

    fun getRulesForTeam(teamId: String): List<OperativeSelectionRule> =
        rulesByTeam[teamId].orEmpty()
}
