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
import com.example.killteamruleset.ui.data.Xenos.BladesOfKhaine.BladesOperativeSelection
import com.example.killteamruleset.ui.data.Xenos.BroodBrothers.BroodOperativeSelection
import com.example.killteamruleset.ui.data.Xenos.CanoptekCircle.CanoptekOperativeSelection
import com.example.killteamruleset.ui.data.Xenos.CorsairVoidscarred.VoidscarredOperativeSelection
import com.example.killteamruleset.ui.data.Xenos.FarstalkerKinband.FarstalkerOperativeSelection
import com.example.killteamruleset.ui.data.Xenos.HandOfTheArchon.HandOperativeSelection
import com.example.killteamruleset.ui.data.Xenos.HearthkynSalvagers.SalvagersOperativeSelection
import com.example.killteamruleset.ui.data.Xenos.HernkynYaegirs.YaegirsOperativeSelection
import com.example.killteamruleset.ui.data.Xenos.HierotekCircle.HierotekOperativeSelection
import com.example.killteamruleset.ui.data.Xenos.Kommandos.KommandosOperativeSelection
import com.example.killteamruleset.ui.data.Xenos.Mandrakes.MandrakeOperativeSelection
import com.example.killteamruleset.ui.data.Xenos.Pathfinders.PathfindersOperativeSelection
import com.example.killteamruleset.ui.data.Xenos.Raveners.RavenersOperativeSelection
import com.example.killteamruleset.ui.data.Xenos.VespidStingwings.VespidsOperativeSelection
import com.example.killteamruleset.ui.data.Xenos.VespidStingwings.VespidsOperatives
import com.example.killteamruleset.ui.data.Xenos.VoidDancers.VoidDancersOperativeSelection
import com.example.killteamruleset.ui.data.Xenos.WreckaKrew.WreckaKrewOperativeSelection
import com.example.killteamruleset.ui.data.Xenos.Wyrmblade.WyrmbladeOperativeSelection
import com.example.killteamruleset.ui.data.Xenos.XV26StealthBattlesuits.XV26OperativeSelection
import com.example.killteamruleset.ui.model.OperativeSelectionRule

object OperativeSelectionRepository {

    private val rulesByTeam: Map<String, List<OperativeSelectionRule>> = mapOf(
        "angels_of_death" to AngelsOfDeathOperativeSelection,
        "battle_clade" to BattlecladeOperativeSelection,
        "blades_of_khaine" to BladesOperativeSelection,
        "blooded" to BloodedOperativeSelection,
        "brood_brothers" to BroodOperativeSelection,
        "canoptek_circle" to CanoptekOperativeSelection,
        "celestian_insidiants" to CelestianOperativeSelection,
        "chaos_cult" to ChaosCultOperativeSelection,
        "corsair_voidscarred" to VoidscarredOperativeSelection,
        "death_Korps" to DeathKorpsOperativeSelection,
        "deathwatch" to DeathWatchOperativeSelection,
        "farstalker_kinband" to FarstalkerOperativeSelection,
        "fellgor_ravagers" to FellgorOperativeSelection,
        "gellepox_infected" to GellerpoxOperativeSelection,
        "goremongers" to GoremongersOperativeSelection,
        "elucidian_star" to ElucidianOperativeSelection,
        "exaction_squad" to ExactionOperativeSelection,
        "hand_ofthe_archon" to HandOperativeSelection,
         "hunter_clade" to HunterCladeOperativeSelection,
        "hearthkyn_salvager" to SalvagersOperativeSelection,
        "hernkyn_yaegirs" to YaegirsOperativeSelection,
        "hierotek_circle" to HierotekOperativeSelection,
        "imperial_navy_breachers" to NavisOperativeSelection,
        "inquisitorial_agents" to InquisitorialOperativeSelection,
        "kasrkin" to KasrkinOperativeSelection,
        "kommandos" to KommandosOperativeSelection,
        "legionaries" to LegionariesOperativeSelection,
        "mandrakes" to MandrakeOperativeSelection,
        "murderwing" to MurderwingOperativeSelection,
        "nemesis_claw" to NemesisOperativeSelection,
        "novitiates" to NovitiatesOperativeSelection,
        "pathfinders" to PathfindersOperativeSelection,
        "plague_marines" to PlagueMarineOperativeSelection,
        "phobos_strike_team" to PhobosOperativeSelection,
        "ratlings" to RatlingsOperativeSelection,
        "raveners" to RavenersOperativeSelection,
        "sanctifiers" to SanctifiersOperativeSelection,
        "scout_squat" to ScoutOperativeSelection,
        "tempestus_aquilon" to AquilonOperativeSelection,
        "vespids" to VespidsOperativeSelection,
        "void_dancer" to VoidDancersOperativeSelection,
        "wolf_scout" to WolfOperativeSelection,
        "warpcoven" to WarpcovenOperativeSelection,
        "wyrmblade" to WyrmbladeOperativeSelection,
        "wrecka_krew" to WreckaKrewOperativeSelection,
        "xv26" to XV26OperativeSelection

    )

    fun getRulesForTeam(teamId: String): List<OperativeSelectionRule> =
        rulesByTeam[teamId].orEmpty()
}
