package com.example.killteamruleset.ui.data

import com.example.killteamruleset.ui.data.Chaos.Blooded.BlooodedOperatives
import com.example.killteamruleset.ui.data.Chaos.ChaosCult.ChaosCultOperatives
import com.example.killteamruleset.ui.data.Chaos.FellgorRavagers.FellgorOperatives
import com.example.killteamruleset.ui.data.Chaos.GellerpoxInfected.GellerpoxOperatives
import com.example.killteamruleset.ui.data.Chaos.Goremongers.GoremongersOperatives
import com.example.killteamruleset.ui.data.Chaos.Legionaries.LegionariesOperatives
import com.example.killteamruleset.ui.data.Chaos.Murderwing.MurdewingOperatives
import com.example.killteamruleset.ui.data.Chaos.NemesisClaw.NemesisOperatives
import com.example.killteamruleset.ui.data.Chaos.PlagueMarines.PlagueMarinesOperatives
import com.example.killteamruleset.ui.data.Chaos.Warpcoven.WarpcovenOperatives
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
import com.example.killteamruleset.ui.data.Empire.list.PhobosStrikeTeam.PhobosOperatives
import com.example.killteamruleset.ui.data.Empire.list.Ratlings.RatlingsOperatives
import com.example.killteamruleset.ui.data.Empire.list.Sanctifiers.SanctifiersOperatives
import com.example.killteamruleset.ui.data.Empire.list.ScoutSquad.ScoutOperatives
import com.example.killteamruleset.ui.data.Empire.list.TempestusAquilons.AquilonOperatives
import com.example.killteamruleset.ui.data.Empire.list.WolfScouts.Wolfperatives
import com.example.killteamruleset.ui.data.Xenos.BladesOfKhaine.BladesOperatives
import com.example.killteamruleset.ui.data.Xenos.BroodBrothers.BroodOperatives
import com.example.killteamruleset.ui.data.Xenos.CanoptekCircle.CanoptekOperatives
import com.example.killteamruleset.ui.data.Xenos.CorsairVoidscarred.VoidscarredOperatives
import com.example.killteamruleset.ui.data.Xenos.FarstalkerKinband.FarstalkerOperatives
import com.example.killteamruleset.ui.data.Xenos.HandOfTheArchon.HandOperatives
import com.example.killteamruleset.ui.data.Xenos.HearthkynSalvagers.SalvagersOperatives
import com.example.killteamruleset.ui.data.Xenos.HernkynYaegirs.YaegirsOperatives
import com.example.killteamruleset.ui.data.Xenos.HierotekCircle.HierotekOperatives
import com.example.killteamruleset.ui.data.Xenos.Kommandos.KommandosOperatives
import com.example.killteamruleset.ui.data.Xenos.Mandrakes.MandrakesOperatives
import com.example.killteamruleset.ui.data.Xenos.Pathfinders.PathfindersOperatives
import com.example.killteamruleset.ui.data.Xenos.Raveners.RavenersOperatives
import com.example.killteamruleset.ui.data.Xenos.WreckaKrew.WreckaKrewOperatives
import com.example.killteamruleset.ui.model.Operative

object OperativeRepository {

    fun getOperativesForTeam(teamId: String): List<Operative> {
        return when (teamId) {
            "angels_of_death" -> aodOperatives
            "battle_clade" -> BattlecladeOperatives
            "blades_of_khaine" -> BladesOperatives
            "blooded" -> BlooodedOperatives
            "brood_brothers" -> BroodOperatives
            "canoptek_circle" -> CanoptekOperatives
            "celestian_insidiants" -> CelestianOperatives
            "chaos_cult" -> ChaosCultOperatives
            "corsair_voidscarred" -> VoidscarredOperatives
            "death_Korps" -> DeathKorpsOperatives
            "deathwatch" -> DeathWatchOperatives
            "farstalker_kinband" -> FarstalkerOperatives
            "fellgor_ravagers" -> FellgorOperatives
            "gellepox_infected" -> GellerpoxOperatives
            "goremongers" -> GoremongersOperatives
            "elucidian_star" -> ElucidianOperatives
            "exaction_squad" -> ExactionOperatives
            "hand_ofthe_archon" -> HandOperatives
            "hearthkyn_salvager" -> SalvagersOperatives
            "hernkyn_yaegirs" -> YaegirsOperatives
            "hierotek_circle" -> HierotekOperatives
            "hunter_clade" -> HunterCladeOperatives
            "imperial_navy_breachers" -> NavybreachersOperatives
            "inquisitorial_agents" -> InquisitorialOperatives
            "kasrkin"-> KasrkinOperatives
            "kommandos" -> KommandosOperatives
            "legionaries" -> LegionariesOperatives
            "mandrakes" -> MandrakesOperatives
            "murderwing" -> MurdewingOperatives
            "nemesis_claw" -> NemesisOperatives
            "novitiates" -> NovitiatesOperatives
            "pathfinders" -> PathfindersOperatives
            "phobos_strike_team" -> PhobosOperatives
            "ratlings" -> RatlingsOperatives
            "raveners" -> RavenersOperatives
            "sanctifiers" -> SanctifiersOperatives
            "scout_squat" -> ScoutOperatives
            "tempestus_aquilon" -> AquilonOperatives
            "wolf_scout" -> Wolfperatives
            "plague_marines" -> PlagueMarinesOperatives
            "warpcoven" -> WarpcovenOperatives
            "wrecka_krew" -> WreckaKrewOperatives
            else -> emptyList()
        }
    }
}
