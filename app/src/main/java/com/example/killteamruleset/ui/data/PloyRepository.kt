package com.example.killteamruleset.ui.data

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ploy
import com.example.killteamruleset.ui.model.PloyType

object PloyRepository {

    private val ploysByTeam = mapOf(
        "angels_of_death" to listOf(
            // ── Aod STRATEGY ──
            Ploy(
                id = "combat_doctrine",
                name ="COMBAT DOCTRINE",
                type = PloyType.STRATEGY,
                lore = R.string.combat_doctrine_lore,
                description = R.string.combat_doctrine_description
            ),
            Ploy(
                id = "no_fear",
                name = "AND THEY SHALL KNOW NO FEAR",
                type = PloyType.STRATEGY,
                lore = R.string.no_fear_lore,
                description = R.string.no_fear_description
            ),
            Ploy(
                id = "adaptive_tactics",
                name = "ADAPTIVE TACTICS",
                type = PloyType.STRATEGY,
                lore = R.string.adaptive_tactics_lore,
                description = R.string.adaptive_tactics_description
            ),
            Ploy(
                id = "indomitus",
                name = "INDOMITUS",
                type = PloyType.STRATEGY,
                lore = R.string.indomitus_lore,
                description = R.string.indomitus_description
            ),


            // ── AOD FIREFIGHT ──
            Ploy(
                id = "adjust_doctrine",
                name = "ADJUST DOCTRINE",
                type = PloyType.FIREFIGHT,
                lore = R.string.adjust_doctrine_lore,
                description = R.string.adjust_doctrine_description
            ),
            Ploy(
            id = "transhuman_physiology",
            name = "TRANSHUMAN PHYSIOLOGY",
            type = PloyType.FIREFIGHT,
            lore = R.string.transhuman_physiology_lore,
            description = R.string.transhuman_physiology_description
            ),
            Ploy(
                id = "shock_assault",
                name = "SHOCK ASSAULT",
                type = PloyType.FIREFIGHT,
                lore = R.string.shock_assault_lore,
                description = R.string.shock_assault_description
            ),
            Ploy(
                id = "wrath_of_vengeance",
                name = "WRATH OF VENGEANCE",
                type = PloyType.FIREFIGHT,
                lore = R.string.wrath_of_vengeance_lore,
                description = R.string.wrath_of_vengeance_description
            )
        ),

        "battle_clade" to listOf(

            // ── BATTLECLADE STRATEGY ──
            Ploy(
                id = "noospheric_possession",
                name ="NOOSPHERIC POSSESION",
                type = PloyType.STRATEGY,
                lore = R.string.noospheric_possession_lore,
                description = R.string.noospheric_possession_description
            ),
            Ploy(
                id = "duty_of_reclamation",
                name = "DUTY OF RECLAMATION",
                type = PloyType.STRATEGY,
                lore = R.string.duty_of_reclamation_lore,
                description = R.string.duty_of_reclamation_description
            ),
            Ploy(
                id = "incantation_of_the_iron_soul",
                name = "INCANTATION OF THE IRON SOUL",
                type = PloyType.STRATEGY,
                lore = R.string.incantation_of_the_iron_soul_lore,
                description = R.string.incantation_of_the_iron_soul_description
            ),
            Ploy(
                id = "prioritised_acquisition",
                name = "PRIORITISED ACQUISITION",
                type = PloyType.STRATEGY,
                lore = R.string.prioritised_acquisition_lore,
                description = R.string.prioritised_acquisition_description
            ),


            // ── AOD FIREFIGHT ──
            Ploy(
                id = "system_exorcism",
                name = "SYSTEM EXORCISM",
                type = PloyType.FIREFIGHT,
                lore = R.string.system_exorcism_lore,
                description = R.string.system_exorcism_description
            ),
            Ploy(
                id = "remote_access",
                name = "REMOTE ACCESS",
                type = PloyType.FIREFIGHT,
                lore = R.string.remote_access_lore,
                description = R.string.remote_access_description
            ),
            Ploy(
                id = "autoferric_supplication",
                name = "AUTOFERRIC SUPPLICATION",
                type = PloyType.FIREFIGHT,
                lore = R.string.autoferric_supplication_lore,
                description = R.string.autoferric_supplication_description
            ),
            Ploy(
                id = "servile_surrogacy",
                name = "SERVILE SURROGACY",
                type = PloyType.FIREFIGHT,
                lore = R.string.servile_surrogacy_lore,
                description = R.string.servile_surrogacy_description
            )
        ),


         "celestian_insidiants" to listOf(
            // ── Celestian Insidiants STRATEGY ──
            Ploy(
                id = "suspect_&_eliminate",
                name ="SUSPECT & ELIMINATE",
                type = PloyType.STRATEGY,
                lore = R.string.suspect_&_eliminate_lore,
                description = R.string.suspect_&_eliminate_description
            ),
            Ploy(
                id = "wrathful_determination",
                name = "WRATHFUL DETERMINATION",
                type = PloyType.STRATEGY,
                lore = R.string.wrathful_determination_lore,
                description = R.string.wrathful_determination_description
            ),
             Ploy(
                id = "suffering_&_sacrifice",
                name = "SUFFERING & SACRIFICE",
                type = PloyType.STRATEGY,
                lore = R.string.suffering_&_sacrifice_lore,
                description = R.string.suffering_&_sacrifice_description
            ),
            Ploy(
                id = "holy_resilience",
                name = "HOLY RESILIENCE",
                type = PloyType.STRATEGY,
                lore = R.string.holy_resilience_lore,
                description = R.string.holy_resilience_description
            ),

            // ── CELESTIAN FIREFIGHT ──
            Ploy(
                id = "glory_to_the_martyrs",
                name = "GLORY TO THE MARTYRS",
                type = PloyType.FIREFIGHT,
                lore = R.string.glory_to_the_martyrs_lore,
                description = R.string.glory_to_the_martyrs_description
            ),
            Ploy(
            id = "faith_&_fury",
            name = "FAITH & FURY",
            type = PloyType.FIREFIGHT,
            lore = R.string.faith_&_fury_lore,
            description = R.string.faith_&_fury_description
            ),
            Ploy(
                id = "unshakeable_pursuit",
                name = "UNSHAKEABLE PURSUIT",
                type = PloyType.FIREFIGHT,
                lore = R.string.unshakeable_pursuit_lore,
                description = R.string.unshakeable_pursuit_description
            ),
            Ploy(
                id = "fervent_hate",
                name = "FERVENT HATE",
                type = PloyType.FIREFIGHT,
                lore = R.string.fervent_hate_lore,
                description = R.string.fervent_hate_description
            )
        ),

        "death_Korps" to listOf(
            // ── DEATH KORPS STRATEGY ──
            Ploy(
                id = "siege_warfare",
                name ="SIEGE WARFARE",
                type = PloyType.STRATEGY,
                lore = R.string.siege_warfare_lore,
                description = R.string.siege_warfare_description
            ),
            Ploy(
                id = "take_cover",
                name = "TAKE COVER",
                type = PloyType.STRATEGY,
                lore = R.string.take_cover_lore,
                description = R.string.take_cover_description
            ),
            Ploy(
                id = "clear_the_line",
                name = "CLEAR THE LINE",
                type = PloyType.STRATEGY,
                lore = R.string.clear_the_line_lore,
                description = R.string.clear_the_line_description
            ),
            Ploy(
                id = "regroup",
                name = "REGROUP",
                type = PloyType.STRATEGY,
                lore = R.string.regroup_lore,
                description = R.string.regroup_description
            ),


            // ── DEATH KORPS FIREFIGHT ──
            Ploy(
                id = "inspirational_leadership",
                name = "INSPIRATIONAL LEADERSHIP",
                type = PloyType.FIREFIGHT,
                lore = R.stringinspirational_leadership_lore,
                description = R.string.inspirational_leadership_description
            ),
            Ploy(
            id = "combined_arms",
            name = "COMBINED ARMS",
            type = PloyType.FIREFIGHT,
            lore = R.string.combined_arms_lore,
            description = R.string.combined_arms_description
            ),
            Ploy(
                id = "in_life_shame",
                name = "IN LIFE, SHAME",
                type = PloyType.FIREFIGHT,
                lore = R.string.in_life_shame_lore,
                description = R.string.in_life_shame_description
            ),
            Ploy(
                id = "in_death_atonement",
                name = "IN DEATH, ATONEMENT",
                type = PloyType.FIREFIGHT,
                lore = R.string.in_death_atonement_lore,
                description = R.string.in_death_atonement_description
            )
        ),

        
        
        "wrecka_krew" to listOf(
            // ── Wreckas STRATEGY ──
            Ploy(
                id = "waaagh",
                name ="WAAAAGH!",
                type = PloyType.STRATEGY,
                lore = R.string.wrecka_waaagh_lore,
                description = R.string.wrecka_waaagh_description
            ),
            Ploy(
                id = "tuff_gitz",
                name = "TUFF GITZ",
                type = PloyType.STRATEGY,
                lore = R.string.wrecka_tuff_gitz_lore,
                description = R.string.wrecka_tuff_gitz_description
            ),
            Ploy(
                id = "destruction",
                name = "DESTRUCTION",
                type = PloyType.STRATEGY,
                lore = R.string.wrecka_destruction_lore,
                description = R.string.wrecka_destruction_description
            ),
            Ploy(
                id = "amped_up",
                name = "AMPED UP",
                type = PloyType.STRATEGY,
                lore = R.string.wrecka_amped_up_lore,
                description = R.string.wrecka_amped_up_description
            ),


            // ── Wreckas FIREFIGHT ──
            Ploy(
                id = "demolition_job",
                name = "DEMOLITION JOB",
                type = PloyType.FIREFIGHT,
                lore = R.string.wrecka_demolition_job_lore,
                description = R.string.wrecka_demolition_job_description
            ),
            Ploy(
            id = "proppa_scrap",
            name = "PROPPA SCRAP",
            type = PloyType.FIREFIGHT,
            lore = R.string.wrecka_proppa_scrap_lore,
            description = R.string.wrecka_proppa_scrap_description
            ),
            Ploy(
                id = "kaboom",
                name = "KABOOM",
                type = PloyType.FIREFIGHT,
                lore = R.string.wrecka_kaboom_lore,
                description = R.string.wrecka_kaboom_description
            ),
            Ploy(
                id = "just_a_scratch",
                name = "JUST A SCRATCH",
                type = PloyType.FIREFIGHT,
                lore = R.string.wrecka_jas_lore,
                description = R.string.wrecka_jas_description
            )
        ),

        "plague_marines" to listOf(
            // ── PLAGUE MARINES STRATEGY ──
            Ploy(
                id = "contagion",
                name ="CONTAGION",
                type = PloyType.STRATEGY,
                lore = R.string.plague_contagion_lore,
                description = R.string.plague_contagion_description
            ),
            Ploy(
                id = "lumbering_death",
                name = "LUMBERING DEATH",
                type = PloyType.STRATEGY,
                lore = R.string.plague_lumbering_lore,
                description = R.string.plague_lumbering_description
            ),
            Ploy(
                id = "cloud_flies",
                name = "CLOUD OF FLIES",
                type = PloyType.STRATEGY,
                lore = R.string.plague_cloud_flies_lore,
                description = R.string.plague_cloud_flies_description
            ),
            Ploy(
                id = "nurglins",
                name = "NURGLINGS",
                type = PloyType.STRATEGY,
                lore = R.string.plague_nurglings_lore,
                description = R.string.plague_nurglings_description
            ),


            // ── PLAGUE MARINES FIREFIGHT ──
            Ploy(
                id = "virulent_poison",
                name = "VIRULENT POISON",
                type = PloyType.FIREFIGHT,
                lore = R.string.plague_virulent_poison_lore,
                description = R.string.plague_virulent_poison_description
            ),
            Ploy(
                id = "poisonous_demise",
                name = "POISONUS DEMISE",
                type = PloyType.FIREFIGHT,
                lore = R.string.plague_poisonous_demise_lore,
                description = R.string.plague_poisonous_demise_description
            ),
            Ploy(
                id = "sickening_resilience",
                name = "SICKENING RESILIENCE",
                type = PloyType.FIREFIGHT,
                lore = R.string.plague_sickening_resilence_lore,
                description = R.string.plague_sickening_resilence_description
            ),
            Ploy(
                id = "curse_of_rot",
                name = "CURSE OF ROT",
                type = PloyType.FIREFIGHT,
                lore = R.string.plague_curse_rot_lore,
                description = R.string.plague_curse_rot_description
            )
        )
    )

    fun getForTeam(teamId: String): List<Ploy> =
        ploysByTeam[teamId].orEmpty()
}
