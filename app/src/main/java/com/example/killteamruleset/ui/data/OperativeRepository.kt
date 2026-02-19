package com.example.killteamruleset.ui.data

import com.example.killteamruleset.ui.data.Chaos.PlagueMarines.PlagueMarinesOperatives
import com.example.killteamruleset.ui.data.Empire.list.AngelsOfDeath.aodOperatives
import com.example.killteamruleset.ui.data.Empire.list.BattleClade.BattlecladeOperatives
import com.example.killteamruleset.ui.data.Empire.list.DeathKorps.DeathKorpsOperatives
import com.example.killteamruleset.ui.data.Empire.list.HunterClade.HunterCladeOperatives
import com.example.killteamruleset.ui.data.Xenos.WreckaKrew.WreckaKrewOperatives
import com.example.killteamruleset.ui.model.Operative

object OperativeRepository {

    fun getOperativesForTeam(teamId: String): List<Operative> {
        return when (teamId) {
            "angels_of_death" -> aodOperatives
            "battle_clade" -> BattlecladeOperatives
            "celestian_insidiants" -> CelestianOperatives
            "death_Korps" -> DeathKorpsOperatives
            "hunter_clade" -> HunterCladeOperatives
            "plague_marines" -> PlagueMarinesOperatives
            "wrecka_krew" -> WreckaKrewOperatives
            else -> emptyList()
        }
    }
}
