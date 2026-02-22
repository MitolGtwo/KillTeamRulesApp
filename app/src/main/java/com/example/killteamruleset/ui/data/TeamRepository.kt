package com.example.killteamruleset.ui.data

import com.example.killteamruleset.ui.model.Alliance
import com.example.killteamruleset.ui.model.Archetypes
import com.example.killteamruleset.ui.model.Team
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.TeamType


object TeamRepository {

    private val teams = listOf(
        Team(
            id = "angels_of_death",
            name = "Angels Of Death",
            alliance = Alliance.IMPERIUM,
            type = TeamType.ELITE,
            difficulty = "Easy",
            archetypes = listOf(Archetypes.SECURITY, Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.aod_faction_bg,
            backgroundRes = R.drawable.aod_bg,
            assemblyPdfAsset = "pdfs/aod_assembly.pdf",
            iconRes = R.drawable.aod_logo,
            quote = "They are my bulk weapon against the terror. They are my space marines, and they shall know no fear"
        ),
        Team(
            id = "battle_clade",
            name = "Battle Clade",
            alliance = Alliance.IMPERIUM,
            type = TeamType.HORDE,
            difficulty = "Very Hard",
            archetypes = listOf(Archetypes.RECON, Archetypes.INFILTRATION),
            factionRulesBackgroundRes = R.drawable.battleclade_faction_bg,
            backgroundRes = R.drawable.battleclade_bg,
            assemblyPdfAsset = "pdfs/battleclade_assembly.pdf",
            iconRes = R.drawable.battleclade_logo,
            quote = "Let nothing dissuade your quest for knowledge"
        ),
        Team(
            id = "celestian_insidiants",
            name = "Celestian Insidiants",
            alliance = Alliance.IMPERIUM,
            type = TeamType.HORDE,
            difficulty = "Hard",
            archetypes = listOf(Archetypes.SECURITY, Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.celestian_faction_bg,
            backgroundRes = R.drawable.celestian_bg,
            assemblyPdfAsset = "pdfs/wrecka_assembly.pdf",
            iconRes = R.drawable.celestian_logo,
            quote = "Abhor Witchcraft, my sisters, for there is no heresy greater or more foul"
        ),
        Team(
            id = "death_Korps",
            name = "Death Korps",
            alliance = Alliance.IMPERIUM,
            type = TeamType.HORDE,
            difficulty = "Hard",
            archetypes = listOf(Archetypes.SECURITY, Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.deathkorps_faction_bg,
            backgroundRes = R.drawable.deathkorps_bg,
            assemblyPdfAsset = "pdfs/deathkorps_assembly.pdf",
            iconRes = R.drawable.deathkorps_logo,
            quote = "In life, shame.\nIn death, atonement."
        ),
        Team(
            id = "deathwatch",
            name = "DeathWatch",
            alliance = Alliance.IMPERIUM,
            type = TeamType.ELITE,
            difficulty = "Hard",
            archetypes = listOf(Archetypes.SECURITY, Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.dw_faction_bg,
            backgroundRes = R.drawable.dw_bg,
            assemblyPdfAsset = "pdfs/dw_assembly.pdf",
            iconRes = R.drawable.dw_logo,
            quote = "Suffer not the alien"
        ),
        Team(
            id = "elucidian_star",
            name = "Elucidian Starstriders",
            alliance = Alliance.IMPERIUM,
            type = TeamType.HORDE,
            difficulty = "Hard",
            archetypes = listOf(Archetypes.SECURITY, Archetypes.RECON),
            factionRulesBackgroundRes = R.drawable.elucian_faction_bg,
            backgroundRes = R.drawable.elucian_bg,
            assemblyPdfAsset = "pdfs/elucidian_assembly.pdf",
            iconRes = R.drawable.elucian_logo,
            quote = "There is nowhere we cannot travel, nothing we cannot accomplish"
        ),
        Team(
            id = "exaction_squad",
            name = "Exaction Squad",
            alliance = Alliance.IMPERIUM,
            type = TeamType.HORDE,
            difficulty = "Medium",
            archetypes = listOf(Archetypes.SECURITY, Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.exaction_faction_bg,
            backgroundRes = R.drawable.exaction_bg,
            assemblyPdfAsset = "pdfs/exaction_assembly.pdf",
            iconRes = R.drawable.exaction_logo,
            quote = "Innocence is irrelevant. You have been judge of transgressing the lex imperialis"
        ),
        Team(
            id = "hunter_clade",
            name = "Hunter Clade",
            alliance = Alliance.IMPERIUM,
            type = TeamType.HORDE,
            difficulty = "Hard",
            archetypes = listOf(Archetypes.RECON, Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.hunterclade_faction_bg,
            backgroundRes = R.drawable.hunterclade_bg,
            assemblyPdfAsset = "pdfs/wrecka_assembly.pdf",
            iconRes = R.drawable.hunterclade_logo,
            quote = "True and sacred might his knowledge be"
        ),
        Team(
            id = "imperial_navy_breachers",
            name = "Imperial Navy Breachers",
            alliance = Alliance.IMPERIUM,
            type = TeamType.HORDE,
            difficulty = "Hard",
            archetypes = listOf(Archetypes.SECURITY, Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.navy_faction_bg,
            backgroundRes = R.drawable.navy_bg,
            assemblyPdfAsset = "pdfs/navy_assembly.pdf",
            iconRes = R.drawable.navy_logo,
            quote = "Through the start, by his light, with our blood, and out shot"
        ),
        Team(
            id = "inquisitorial_agents",
            name = "Inquisitorial Agents",
            alliance = Alliance.IMPERIUM,
            type = TeamType.HORDE,
            difficulty = "Very Hard",
            archetypes = listOf(Archetypes.SECURITY, Archetypes.SEEK_AND_DESTROY,Archetypes.RECON,Archetypes.INFILTRATION),
            factionRulesBackgroundRes = R.drawable.inquisitorial_faction_bg,
            backgroundRes = R.drawable.inquisitorial_bg,
            assemblyPdfAsset = "pdfs/inquisitorial_assembly.pdf",
            iconRes = R.drawable.inquisitorial_logo,
            quote = "Innocence proves nothing"
        ),
        Team(
            id = "kasrkin",
            name = "Kasrkin",
            alliance = Alliance.IMPERIUM,
            type = TeamType.HORDE,
            difficulty = "Medium",
            archetypes = listOf(Archetypes.SECURITY,Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.kasrkin_faction_bg,
            backgroundRes = R.drawable.kasrkin_bg,
            assemblyPdfAsset = "pdfs/kasrkin_assembly.pdf",
            iconRes = R.drawable.kasrkin_logo,
            quote = "Our strength is not ignoring the horrors, it is the opposite. The devastation we witness is our fuel to fight on."
        ),
        Team(
            id = "novitiates",
            name = "Novitiates",
            alliance = Alliance.IMPERIUM,
            type = TeamType.HORDE,
            difficulty = "Medium",
            archetypes = listOf(Archetypes.SECURITY,Archetypes.RECON),
            factionRulesBackgroundRes = R.drawable.novitiates_faction_bg,
            backgroundRes = R.drawable.novitiates_bg,
            assemblyPdfAsset = "pdfs/novitiates_assembly.pdf",
            iconRes = R.drawable.novitiates_logo,
            quote = "There is no light but the light of the emperor"
        ),
        Team(
            id = "phobos_strike_team",
            name = "Phobos Strike Team",
            alliance = Alliance.IMPERIUM,
            type = TeamType.ELITE,
            difficulty = "Hard",
            archetypes = listOf(Archetypes.INFILTRATION,Archetypes.RECON),
            factionRulesBackgroundRes = R.drawable.phobos_faction_bg,
            backgroundRes = R.drawable.phobos_bg,
            assemblyPdfAsset = "pdfs/phobos_assembly.pdf",
            iconRes = R.drawable.phobos_logo,
            quote = "You say we are but a handful of warriors facing an army of heretics, but every space marine is an army in his own right"
        ),
        Team(
            id = "ratlings",
            name = "Ratlings",
            alliance = Alliance.IMPERIUM,
            type = TeamType.HORDE,
            difficulty = "Hard",
            archetypes = listOf(Archetypes.INFILTRATION,Archetypes.SECURITY),
            factionRulesBackgroundRes = R.drawable.ratlings_faction_bg,
            backgroundRes = R.drawable.ratlings_bg,
            assemblyPdfAsset = "pdfs/ratlings_assembly.pdf",
            iconRes = R.drawable.ratlings_logo,
            quote = "settle your sights in the target. Take a breath. Hold. Squeeze. One dead Ork"
        ),
        Team(
            id = "sanctifiers",
            name = "Sanctifiers",
            alliance = Alliance.IMPERIUM,
            type = TeamType.HORDE,
            difficulty = "Very Hard",
            archetypes = listOf(Archetypes.SEEK_AND_DESTROY,Archetypes.SECURITY),
            factionRulesBackgroundRes = R.drawable.sanctifiers_faction_bg,
            backgroundRes = R.drawable.sanctifiers_bg,
            assemblyPdfAsset = "pdfs/sanctifier_assembly.pdf",
            iconRes = R.drawable.sanctifiers_logo,
            quote = "Burn the heretic. Kill the mutant. Purge the unclean"
        ),
        Team(
            id = "scout_squat",
            name = "Scout Squat",
            alliance = Alliance.IMPERIUM,
            type = TeamType.HORDE,
            difficulty = "Medium",
            archetypes = listOf(Archetypes.INFILTRATION,Archetypes.RECON),
            factionRulesBackgroundRes = R.drawable.scout_faction_bg,
            backgroundRes = R.drawable.scout_bg,
            assemblyPdfAsset = "pdfs/scout_assembly.pdf",
            iconRes = R.drawable.scout_logo,
            quote = "They were right. It was only after this that we arrived at our destination, where our examination would truly begin"
        ),
        Team(
            id = "tempestus_aquilon",
            name = "Tempestus Aquilons",
            alliance = Alliance.IMPERIUM,
            type = TeamType.HORDE,
            difficulty = "Medium",
            archetypes = listOf(Archetypes.SEEK_AND_DESTROY,Archetypes.RECON),
            factionRulesBackgroundRes = R.drawable.tempestus_faction_bg,
            backgroundRes = R.drawable.tempestus_bg,
            assemblyPdfAsset = "pdfs/tempestus_assembly.pdf",
            iconRes = R.drawable.tempestus_logo,
            quote = "The emperor expects two things of us, the first is absolute, uncompromising belief, the second is victory at any cost"
        ),
        Team(
            id = "wolf_scout",
            name = "Wolf Scouts",
            alliance = Alliance.IMPERIUM,
            type = TeamType.ELITE,
            difficulty = "Easy",
            archetypes = listOf(Archetypes.SEEK_AND_DESTROY,Archetypes.RECON),
            factionRulesBackgroundRes = R.drawable.wolfscouts_faction_bg,
            backgroundRes = R.drawable.wolfscouts_bg2,
            assemblyPdfAsset = "pdfs/tempestus_assembly.pdf",
            iconRes = R.drawable.wolfscouts_logo,
            quote = "Aaaauuuuuuu!!"
        ),
        Team(
            id = "blooded",
            name = "Blooded",
            alliance = Alliance.CHAOS,
            type = TeamType.HORDE,
            difficulty = "Hard",
            archetypes = listOf(Archetypes.SEEK_AND_DESTROY, Archetypes.INFILTRATION),
            factionRulesBackgroundRes = R.drawable.blooded_faction_bg,
            backgroundRes = R.drawable.blooded_bg,
            assemblyPdfAsset = "pdfs/blooded_assembly.pdf",
            iconRes = R.drawable.blooded_logo,
            quote = "There is no peace amongst the stars! Only an eternity of carnage and slaughter, and the laughter of thirsting gods!"
        ),
        Team(
            id = "chaos_cult",
            name = "Chaos Cult",
            alliance = Alliance.CHAOS,
            type = TeamType.HORDE,
            difficulty = "Medium",
            archetypes = listOf(Archetypes.SEEK_AND_DESTROY, Archetypes.INFILTRATION),
            factionRulesBackgroundRes = R.drawable.chaos_cult_faction_bg,
            backgroundRes = R.drawable.chaos_cult_bg,
            assemblyPdfAsset = "pdfs/chaos_cult_assembly.pdf",
            iconRes = R.drawable.chaos_cult_logo,
            quote = "We were betrayed, the false emperor ignored our prayers, though we have given our entire existence to him"
        ),
        Team(
            id = "fellgor_ravagers",
            name = "Fellgors Ravagers",
            alliance = Alliance.CHAOS,
            type = TeamType.HORDE,
            difficulty = "Medium",
            archetypes = listOf(Archetypes.SEEK_AND_DESTROY, Archetypes.RECON),
            factionRulesBackgroundRes = R.drawable.fellgor_faction_bg,
            backgroundRes = R.drawable.fellgor_bg,
            assemblyPdfAsset = "pdfs/fellgor_assembly.pdf",
            iconRes = R.drawable.fellgor_logo,
            quote = "Beeeeeee!!"
        ),
        Team(
            id = "gellepox_infected",
            name = "Gellepox Infected",
            alliance = Alliance.CHAOS,
            type = TeamType.HORDE,
            difficulty = "Hard",
            archetypes = listOf(Archetypes.SEEK_AND_DESTROY, Archetypes.SECURITY),
            factionRulesBackgroundRes = R.drawable.gellepox_faction_bg,
            backgroundRes = R.drawable.gellepox_bg,
            assemblyPdfAsset = "pdfs/gellepox_assembly.pdf",
            iconRes = R.drawable.gellepox_logo,
            quote = "We are sent to spread our glorious gifts"
        ),
        Team(
            id = "goremongers",
            name = "Goremongers",
            alliance = Alliance.CHAOS,
            type = TeamType.ELITE,
            difficulty = "Medium",
            archetypes = listOf(Archetypes.SEEK_AND_DESTROY, Archetypes.RECON),
            factionRulesBackgroundRes = R.drawable.goremongers_faction_bg,
            backgroundRes = R.drawable.goremongers_bg,
            assemblyPdfAsset = "pdfs/goremongers_assembly.pdf",
            iconRes = R.drawable.goremongers_logo,
            quote = "Do you smell that cooper tang? there is blood in the air and fear on the wind"
        ),
        Team(
            id = "legionaries",
            name = "Legionaries",
            alliance = Alliance.CHAOS,
            type = TeamType.ELITE,
            difficulty = "Medium",
            archetypes = listOf(Archetypes.SEEK_AND_DESTROY, Archetypes.SECURITY),
            factionRulesBackgroundRes = R.drawable.legionaries_faction_bg,
            backgroundRes = R.drawable.legionaries_bg,
            assemblyPdfAsset = "pdfs/legionaries_assembly.pdf",
            iconRes = R.drawable.legionaries_logo,
            quote = "We have the eye of the gods, we have the eye of the despoiler. None can stand against us"
        ),
        Team(
            id = "murderwing",
            name = "Murderwing",
            alliance = Alliance.CHAOS,
            type = TeamType.ELITE,
            difficulty = "Medium",
            archetypes = listOf(Archetypes.SEEK_AND_DESTROY, Archetypes.RECON),
            factionRulesBackgroundRes = R.drawable.murderwing_faction_bg,
            backgroundRes = R.drawable.murderwing_bg,
            assemblyPdfAsset = "pdfs/murderwing_assembly.pdf",
            iconRes = R.drawable.murderwing_logo,
            quote = "Let them scurry away like vermin. They will only make the kill more pleasing to inflict"
        ),
        Team(
            id = "nemesis_claw",
            name = "Nemesis_Claw",
            alliance = Alliance.CHAOS,
            type = TeamType.ELITE,
            difficulty = "Medium",
            archetypes = listOf(Archetypes.SEEK_AND_DESTROY, Archetypes.INFILTRATION),
            factionRulesBackgroundRes = R.drawable.nemesis_faction_bg,
            backgroundRes = R.drawable.nemesis_bg,
            assemblyPdfAsset = "pdfs/nemesis_assembly.pdf",
            iconRes = R.drawable.nemesis_logo,
            quote = "Run and hide you gutless little worms"
        ),
        Team(
            id = "warpcoven",
            name = "WarpCoven",
            alliance = Alliance.CHAOS,
            type = TeamType.ELITE,
            difficulty = "Very Hard",
            archetypes = listOf(Archetypes.RECON, Archetypes.SECURITY),
            factionRulesBackgroundRes = R.drawable.warpcoven_faction_bg,
            backgroundRes = R.drawable.warpcoven_bg,
            assemblyPdfAsset = "pdfs/warpcoven_assembly.pdf",
            iconRes = R.drawable.warpcoven_logo,
            quote = "All must change. Forever, in all ways. At all times"
        ),
        Team(
            id = "plague_marines",
            name = "Plague Marines",
            alliance = Alliance.CHAOS,
            type = TeamType.ELITE,
            difficulty = "Easy",
            archetypes = listOf(Archetypes.RECON, Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.plague_faction_bg,
            backgroundRes = R.drawable.plague_bg,
            assemblyPdfAsset = "pdfs/plague_assembly.pdf",
            iconRes = R.drawable.plague_logo,
            quote = "The rotted brotherhood"
        ),
        Team(
            id = "blades_of_khaine",
            name = "Blades of Khaine",
            alliance = Alliance.XENOS,
            type = TeamType.HORDE,
            difficulty = "Very Hard",
            archetypes = listOf(Archetypes.RECON, Archetypes.SEEK_AND_DESTROY,Archetypes.INFILTRATION,Archetypes.SECURITY),
            factionRulesBackgroundRes = R.drawable.blades_faction_bg,
            backgroundRes = R.drawable.blades_bg,
            assemblyPdfAsset = "pdfs/blades_assembly.pdf",
            iconRes = R.drawable.blades_logo,
            quote = "I know this however. Were it not for the Blades of Khaine, the asuryani would be no more"
        ),
        Team(
            id = "brood_brothers",
            name = "Brood Brothers",
            alliance = Alliance.XENOS,
            type = TeamType.HORDE,
            difficulty = "Very Hard",
            archetypes = listOf(Archetypes.INFILTRATION,Archetypes.SECURITY),
            factionRulesBackgroundRes = R.drawable.broodbrothers_faction_bg,
            backgroundRes = R.drawable.broodbrothers_bg,
            assemblyPdfAsset = "pdfs/broodbrothers_assembly.pdf",
            iconRes = R.drawable.broodbrothers_logo,
            quote = "Your lives mean nothing to them. but the star children care for their chosen"
        ),
        Team(
            id = "canoptek_circle",
            name = "Canoptek Circle",
            alliance = Alliance.XENOS,
            type = TeamType.ELITE,
            difficulty = "Very Hard",
            archetypes = listOf(Archetypes.RECON,Archetypes.SECURITY),
            factionRulesBackgroundRes = R.drawable.canoptek_faction_bg,
            backgroundRes = R.drawable.canoptek_bg,
            assemblyPdfAsset = "pdfs/canoptek_assembly.pdf",
            iconRes = R.drawable.canoptek_logo,
            quote = "Death stands above me, whispering low\n" +
                    "I know not what in my ear\n" +
                    "\n" +
                    "Of his strange language all I know\n" +
                    "\n" +
                    "There is only pain and fear."
        ),
        Team(
            id = "corsair_voidscarred",
            name = "Corsair Voidscarred",
            alliance = Alliance.XENOS,
            type = TeamType.HORDE,
            difficulty = "Medium",
            archetypes = listOf(Archetypes.RECON,Archetypes.INFILTRATION),
            factionRulesBackgroundRes = R.drawable.corsair_faction_bg,
            backgroundRes = R.drawable.corsair_bg,
            assemblyPdfAsset = "pdfs/corsair_assembly.pdf",
            iconRes = R.drawable.corsair_logo,
            quote = "The starts belonged to my ancestros. thus they belong to me"
        ),
        Team(
            id = "farstalker_kinband",
            name = "Farstalker Kinband",
            alliance = Alliance.XENOS,
            type = TeamType.HORDE,
            difficulty = "Medium",
            archetypes = listOf(Archetypes.RECON,Archetypes.INFILTRATION),
            factionRulesBackgroundRes = R.drawable.farstalker_faction_bg,
            backgroundRes = R.drawable.farstalker_bg,
            assemblyPdfAsset = "pdfs/farstalker_assembly.pdf",
            iconRes = R.drawable.farstalker_logo,
            quote = "You wish my kindred to fight your enemies... the Greater Good requires it"
        ),
        Team(
            id = "hand_ofthe_archon",
            name = "Hand of the Archon",
            alliance = Alliance.XENOS,
            type = TeamType.HORDE,
            difficulty = "Medium",
            archetypes = listOf(Archetypes.RECON,Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.hand_faction_bg,
            backgroundRes = R.drawable.hand_bg,
            assemblyPdfAsset = "pdfs/hand_assembly.pdf",
            iconRes = R.drawable.hand_logo,
            quote = "We are barbs of malicious spite that coil in the ear; we are the patient listener offering sage counsel"
        ),
        Team(
            id = "hearthkyn_salvager",
            name = "Hearthkyn Salvagers",
            alliance = Alliance.XENOS,
            type = TeamType.HORDE,
            difficulty = "Medium",
            archetypes = listOf(Archetypes.RECON,Archetypes.SECURITY),
            factionRulesBackgroundRes = R.drawable.salvagers_faction_bg,
            backgroundRes = R.drawable.salvagers_bg,
            assemblyPdfAsset = "pdfs/hand_assembly.pdf",
            iconRes = R.drawable.salvagers_logo,
            quote = "Kin is Kin\n" +
                    "\n" +
                    "Luck has, need keeps, toil earns\n" +
                    "\n" +
                    "Like Kin\n" +
                    "\n" +
                    "The Ancestors are Watching"
        ),
        Team(
            id = "hernkyn_yaegirs",
            name = "Hernkyn Yaegirs",
            alliance = Alliance.XENOS,
            type = TeamType.HORDE,
            difficulty = "Medium",
            archetypes = listOf(Archetypes.INFILTRATION,Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.yaegirs_faction_bg,
            backgroundRes = R.drawable.yaegirs_bg,
            assemblyPdfAsset = "pdfs/yaegirs_assembly.pdf",
            iconRes = R.drawable.yaegirs_logo,
            quote = "A molter fury with which to crush those who wrong us"
        ),
        Team(
            id = "hierotek_circle",
            name = "Hierotek Circle",
            alliance = Alliance.XENOS,
            type = TeamType.ELITE,
            difficulty = "Very Hard",
            archetypes = listOf(Archetypes.RECON,Archetypes.SECURITY),
            factionRulesBackgroundRes = R.drawable.hierotek_faction_bg,
            backgroundRes = R.drawable.hierotek_bg,
            assemblyPdfAsset = "pdfs/hierotek_assembly.pdf",
            iconRes = R.drawable.hierotek_logo,
            quote = "History requires two parties. The historian, and their audience. Without that, one just talking to oneself. So kindly stop screaming, and you might learn something"
        ),
        Team(
            id = "kommandos",
            name = "Kommandos",
            alliance = Alliance.XENOS,
            type = TeamType.HORDE,
            difficulty = "Medium",
            archetypes = listOf(Archetypes.INFILTRATION,Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.kommandos_faction_bg,
            backgroundRes = R.drawable.kommandos_bg,
            assemblyPdfAsset = "pdfs/kommandos_assembly.pdf",
            iconRes = R.drawable.kommandos_logo,
            quote = "Brutal and kunning"
        ),
        Team(
            id = "mandrakes",
            name = "Mandrakes",
            alliance = Alliance.XENOS,
            type = TeamType.HORDE,
            difficulty = "Hard",
            archetypes = listOf(Archetypes.INFILTRATION,Archetypes.RECON),
            factionRulesBackgroundRes = R.drawable.mandrakes_faction_bg,
            backgroundRes = R.drawable.mandrakes_bg,
            assemblyPdfAsset = "pdfs/mandrakes_assembly.pdf",
            iconRes = R.drawable.mandrakes_logo,
            quote = "The darkness came alive and it took them  all"
        ),
        Team(
            id = "pathfinders",
            name = "Pathfinders",
            alliance = Alliance.XENOS,
            type = TeamType.HORDE,
            difficulty = "Medium",
            archetypes = listOf(Archetypes.INFILTRATION,Archetypes.RECON),
            factionRulesBackgroundRes = R.drawable.pathfinders_faction_bg,
            backgroundRes = R.drawable.pathfinders_bg,
            assemblyPdfAsset = "pdfs/pathfinders_assembly.pdf",
            iconRes = R.drawable.pathfinders_logo,
            quote = "You are strong. It will be good to have that strength"
        ),
        Team(
            id = "raveners",
            name = "Raveners",
            alliance = Alliance.XENOS,
            type = TeamType.ELITE,
            difficulty = "Very Hard",
            archetypes = listOf(Archetypes.INFILTRATION,Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.raveners_faction_bg,
            backgroundRes = R.drawable.raveners_bg,
            assemblyPdfAsset = "pdfs/raveners_assembly.pdf",
            iconRes = R.drawable.raveners_logo,
            quote = "Amenaza nivel Exterminatus"
        ),
        Team(
            id = "vespids",
            name = "Vespid Stingwings",
            alliance = Alliance.XENOS,
            type = TeamType.HORDE,
            difficulty = "Easy",
            archetypes = listOf(Archetypes.RECON,Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.vespids_faction_bg,
            backgroundRes = R.drawable.vespids_bg,
            assemblyPdfAsset = "pdfs/vespids_assembly.pdf",
            iconRes = R.drawable.vespids_logo,
            quote = "bzzzzzzzzzzzz"
        ),
        Team(
            id = "wyrmblade",
            name = "Wyrmblade",
            alliance = Alliance.XENOS,
            type = TeamType.HORDE,
            difficulty = "Hard",
            archetypes = listOf(Archetypes.INFILTRATION,Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.wyrmblade_faction_bg,
            backgroundRes = R.drawable.wyrmblade_bg,
            assemblyPdfAsset = "pdfs/wyrmblade_assembly.pdf",
            iconRes = R.drawable.wyrmblade_logo,
            quote = "A plan generations in the making"
        ),
        Team(
            id = "xv26",
            name = "XV26 Stealth Battlesuits",
            alliance = Alliance.XENOS,
            type = TeamType.ELITE,
            difficulty = "Hard",
            archetypes = listOf(Archetypes.INFILTRATION,Archetypes.RECON),
            factionRulesBackgroundRes = R.drawable.xv26_faction_bg,
            backgroundRes = R.drawable.xv26_bg,
            assemblyPdfAsset = "pdfs/wyrmblade_assembly.pdf",
            iconRes = R.drawable.xv26_logo,
            quote = "We uphold the greater good"
        ),
        Team(
            id = "wrecka_krew",
            name = "Wrecka Krew",
            alliance = Alliance.XENOS,
            type = TeamType.ELITE,
            difficulty = "Easy",
            archetypes = listOf(Archetypes.SECURITY, Archetypes.SEEK_AND_DESTROY),
            factionRulesBackgroundRes = R.drawable.wrecka_krew_bg,
            backgroundRes = R.drawable.wrecka_bg,
            assemblyPdfAsset = "pdfs/wrecka_assembly.pdf",
            iconRes = R.drawable.wrecka_logo,
            quote = "Show ´em a proppa scrap"
        )
    )

    fun getTeamsByAlliance(alliance: Alliance): List<Team> =
        teams.filter { it.alliance == alliance }

    fun getTeamById(id: String): Team =
        teams.first { it.id == id }

    // ✅ ADD THIS
    fun getAllTeams(): List<Team> = teams
}