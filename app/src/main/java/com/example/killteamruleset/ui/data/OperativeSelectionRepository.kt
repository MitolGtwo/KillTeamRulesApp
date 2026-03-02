package com.example.killteamruleset.ui.data

import com.example.killteamruleset.ui.data.Chaos.Blooded.BloodedOperativeSelection
import com.example.killteamruleset.ui.data.Chaos.ChaosCult.ChaosCultOperativeSelection
import com.example.killteamruleset.ui.data.Chaos.FellgorRavagers.FellgorOperativeSelection
import com.example.killteamruleset.ui.data.Chaos.GellerpoxInfected.GellerpoxOperativeSelection
import com.example.killteamruleset.ui.data.Chaos.Goremongers.GoremongersOperativeSelection
import com.example.killteamruleset.ui.data.Chaos.Legionaries.LegionariesOperativeSelection
import com.example.killteamruleset.ui.data.Chaos.Murderwing.MurderwingOperativeSelection
import com.example.killteamruleset.ui.data.Chaos.NemesisClaw.NemesisOperativeSelection
import com.example.killteamruleset.ui.data.Chaos.PlagueMarines.PlagueMarineOperativeSelection
import com.example.killteamruleset.ui.data.Chaos.Warpcoven.WarpcovenOperativeSelection
import com.example.killteamruleset.ui.data.Empire.list.AngelsOfDeath.AngelsOfDeathOperativeSelection
import com.example.killteamruleset.ui.data.Empire.list.BattleClade.BattlecladeOperativeSelection
import com.example.killteamruleset.ui.data.Empire.list.CelestianInsidiants.CelestianOperativeSelection
import com.example.killteamruleset.ui.data.Empire.list.DeathKorps.DeathKorpsOperativeSelection
import com.example.killteamruleset.ui.data.Empire.list.DeathWatch.DeathWatchOperativeSelection
import com.example.killteamruleset.ui.data.Empire.list.ElucidianStarstriders.ElucidianOperativeSelection
import com.example.killteamruleset.ui.data.Empire.list.ExactionSquad.ExactionOperativeSelection
import com.example.killteamruleset.ui.data.Empire.list.HunterClade.HunterCladeOperativeSelection
import com.example.killteamruleset.ui.data.Empire.list.ImperialNavyBreachers.NavisOperativeSelection
import com.example.killteamruleset.ui.data.Empire.list.InquisitorialAgents.InquisitorialOperativeSelection
import com.example.killteamruleset.ui.data.Empire.list.Karskin.KasrkinOperativeSelection
import com.example.killteamruleset.ui.data.Empire.list.Novitiates.NovitiatesOperativeSelection
import com.example.killteamruleset.ui.data.Empire.list.PhobosStrikeTeam.PhobosOperativeSelection
import com.example.killteamruleset.ui.data.Empire.list.Ratlings.RatlingsOperativeSelection
import com.example.killteamruleset.ui.data.Empire.list.Sanctifiers.SanctifiersOperativeSelection
import com.example.killteamruleset.ui.data.Empire.list.ScoutSquad.ScoutOperativeSelection
import com.example.killteamruleset.ui.data.Empire.list.TempestusAquilons.AquilonOperativeSelection
import com.example.killteamruleset.ui.data.Empire.list.WolfScouts.WolfOperativeSelection
import com.example.killteamruleset.ui.data.Xenos.WreckaKrew.WreckaKrewOperativeSelection
import com.example.killteamruleset.ui.model.OperativeSelectionRule

object OperativeSelectionRepository {

    private val rulesByTeam: Map<String, List<OperativeSelectionRule>> = mapOf(
        "angels_of_death" to AngelsOfDeathOperativeSelection,
        "battle_clade" to BattlecladeOperativeSelection,
        "blooded" to BloodedOperativeSelection,
        "celestian_insidiants" to CelestianOperativeSelection,
        "chaos_cult" to ChaosCultOperativeSelection,
        "death_Korps" to DeathKorpsOperativeSelection,
        "deathwatch" to DeathWatchOperativeSelection,
        "fellgor_ravagers" to FellgorOperativeSelection,
        "gellepox_infected" to GellerpoxOperativeSelection,
        "goremongers" to GoremongersOperativeSelection,
        "elucidian_star" to ElucidianOperativeSelection,
        "exaction_squad" to ExactionOperativeSelection,
         "hunter_clade" to HunterCladeOperativeSelection,
        "imperial_navy_breachers" to NavisOperativeSelection,
        "inquisitorial_agents" to InquisitorialOperativeSelection,
        "kasrkin" to KasrkinOperativeSelection,
        "legionaries" to LegionariesOperativeSelection,
        "murderwing" to MurderwingOperativeSelection,
        "nemesis_claw" to NemesisOperativeSelection,
        "novitiates" to NovitiatesOperativeSelection,
        "plague_marines" to PlagueMarineOperativeSelection,
        "phobos_strike_team" to PhobosOperativeSelection,
        "ratlings" to RatlingsOperativeSelection,
        "sanctifiers" to SanctifiersOperativeSelection,
        "scout_squat" to ScoutOperativeSelection,
        "tempestus_aquilon" to AquilonOperativeSelection,
        "wolf_scout" to WolfOperativeSelection,
        "warpcoven" to WarpcovenOperativeSelection,
        "wrecka_krew" to WreckaKrewOperativeSelection,

    )

    fun getRulesForTeam(teamId: String): List<OperativeSelectionRule> =
        rulesByTeam[teamId].orEmpty()
}
