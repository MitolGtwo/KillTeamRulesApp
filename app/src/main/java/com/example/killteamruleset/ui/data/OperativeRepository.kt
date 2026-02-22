package com.example.killteamruleset.ui.data

import com.example.killteamruleset.ui.data.Chaos.PlagueMarines.PlagueMarinesOperatives
import com.example.killteamruleset.ui.data.Empire.list.AngelsOfDeath.aodOperatives
import com.example.killteamruleset.ui.data.Empire.list.BattleClade.BattlecladeOperatives
import com.example.killteamruleset.ui.data.Empire.list.CelestianInsidiants.CelestianOperatives
import com.example.killteamruleset.ui.data.Empire.list.DeathKorps.DeathKorpsOperatives
import com.example.killteamruleset.ui.data.Empire.list.DeathWatch.DeathWatchOperatives
import com.example.killteamruleset.ui.data.Empire.list.ElucidianStarstriders.ElucidianOperatives
import com.example.killteamruleset.ui.data.Empire.list.ExactionSquad.ExactionOperatives
import com.example.killteamruleset.ui.data.Empire.list.HunterClade.HunterCladeOperatives
import com.example.killteamruleset.ui.data.Empire.list.ImperialNavyBreachers.NavybreachersOperatives
import com.example.killteamruleset.ui.data.Empire.list.InquisitorialAgents.InquisitorialOperatives
import com.example.killteamruleset.ui.data.Empire.list.Karskin.KasrkinOperatives
import com.example.killteamruleset.ui.data.Empire.list.Novitiates.NovitiatesOperatives
import com.example.killteamruleset.ui.data.Xenos.WreckaKrew.WreckaKrewOperatives
import com.example.killteamruleset.ui.model.Operative

object OperativeRepository {

    fun getOperativesForTeam(teamId: String): List<Operative> {
        return when (teamId) {
            "angels_of_death" -> aodOperatives
            "battle_clade" -> BattlecladeOperatives
            "celestian_insidiants" -> CelestianOperatives
            "death_Korps" -> DeathKorpsOperatives
            "deathwatch" -> DeathWatchOperatives
            "elucidian_star" -> ElucidianOperatives
            "exaction_squad" -> ExactionOperatives
            "hunter_clade" -> HunterCladeOperatives
            "imperial_navy_breachers" -> NavybreachersOperatives
            "inquisitorial_agents" -> InquisitorialOperatives
            "kasrkin"-> KasrkinOperatives
            "novitiates" -> NovitiatesOperatives
            "plague_marines" -> PlagueMarinesOperatives
            "wrecka_krew" -> WreckaKrewOperatives
            else -> emptyList()
        }
    }
}
