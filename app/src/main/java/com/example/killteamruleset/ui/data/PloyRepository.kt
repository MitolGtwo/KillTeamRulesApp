package com.example.killteamruleset.ui.data

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ploy
import com.example.killteamruleset.ui.model.PloyType

object PloyRepository {

    private val ploysByTeam = mapOf(
        angels_of_death to listOf(
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


            // ── Wreckas FIREFIGHT ──
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
