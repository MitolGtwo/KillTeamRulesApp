package com.example.killteamruleset.ui.data

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ploy
import com.example.killteamruleset.ui.model.PloyType

object PloyRepository {

    private val ploysByTeam = mapOf(
        "wrecka_krew" to listOf(
            // ── Wreckas STRATEGY ──
            Ploy(
                id = "waaagh",
                name =R.string.wrecka_waaagh,
                type = PloyType.STRATEGY,
                lore = R.string.wrecka_waaagh_lore,
                description = R.string.wrecka_waaagh_description
            ),
            Ploy(
                id = "tuff_gitz",
                name = R.string.wrecka_tuff_gitz,
                type = PloyType.STRATEGY,
                lore = R.string.wrecka_tuff_gitz_lore,
                description = R.string.wrecka_tuff_gitz_description
            ),
            Ploy(
                id = "destruction",
                name = R.string.wrecka_destruction,
                type = PloyType.STRATEGY,
                lore = R.string.wrecka_destruction_lore,
                description = R.string.wrecka_destruction_description
            ),
            Ploy(
                id = "amped_up",
                name = R.string.wrecka_amped_up,
                type = PloyType.STRATEGY,
                lore = R.string.wrecka_amped_up_lore,
                description = R.string.wrecka_amped_up_description
            ),


            // ── Wreckas FIREFIGHT ──
            Ploy(
                id = "demolition_job",
                name = R.string.wrecka_demolition_job,
                type = PloyType.FIREFIGHT,
                lore = R.string.wrecka_demolition_job_lore,
                description = R.string.wrecka_demolition_job_description
            ),
            Ploy(
            id = "proppa_scrap",
            name = R.string.wrecka_proppa_scrap,
            type = PloyType.FIREFIGHT,
            lore = R.string.wrecka_proppa_scrap_lore,
            description = R.string.wrecka_proppa_scrap_description
            ),
            Ploy(
                id = "kaboom",
                name = R.string.wrecka_kaboom,
                type = PloyType.FIREFIGHT,
                lore = R.string.wrecka_kaboom_lore,
                description = R.string.wrecka_kaboom_description
            ),
            Ploy(
                id = "just_a_scratch",
                name = R.string.wrecka_jas,
                type = PloyType.FIREFIGHT,
                lore = R.string.wrecka_jas_lore,
                description = R.string.wrecka_jas_description
            )
        ),

        "plague_marines" to listOf(
            // ── Wreckas STRATEGY ──
            Ploy(
                id = "contagion",
                name =R.string.plague_contagion,
                type = PloyType.STRATEGY,
                lore = R.string.plague_contagion_lore,
                description = R.string.plague_contagion_description
            ),
            Ploy(
                id = "lumbering_death",
                name = R.string.plague_lumbering_death,
                type = PloyType.STRATEGY,
                lore = R.string.plague_lumbering_lore,
                description = R.string.plague_lumbering_description
            ),
            Ploy(
                id = "cloud_flies",
                name = R.string.plague_cloud_flies,
                type = PloyType.STRATEGY,
                lore = R.string.plague_cloud_flies_lore,
                description = R.string.plague_cloud_flies_description
            ),
            Ploy(
                id = "nurglins",
                name = R.string.plague_nurglings,
                type = PloyType.STRATEGY,
                lore = R.string.plague_nurglings_lore,
                description = R.string.plague_nurglings_description
            ),


            // ── Wreckas FIREFIGHT ──
            Ploy(
                id = "virulent_poison",
                name = R.string.plague_virulent_poison,
                type = PloyType.FIREFIGHT,
                lore = R.string.plague_virulent_poison_lore,
                description = R.string.plague_virulent_poison_description
            ),
            Ploy(
                id = "poisonous_demise",
                name = R.string.plague_poisonous_demise,
                type = PloyType.FIREFIGHT,
                lore = R.string.plague_poisonous_demise_lore,
                description = R.string.plague_poisonous_demise_description
            ),
            Ploy(
                id = "sickening_resilience",
                name = R.string.plague_sickening_resilence,
                type = PloyType.FIREFIGHT,
                lore = R.string.plague_sickening_resilence_lore,
                description = R.string.plague_sickening_resilence_description
            ),
            Ploy(
                id = "curse_of_rot",
                name = R.string.plague_curse_rot,
                type = PloyType.FIREFIGHT,
                lore = R.string.plague_curse_rot_lore,
                description = R.string.plague_curse_rot_description
            )
        )
    )

    fun getForTeam(teamId: String): List<Ploy> =
        ploysByTeam[teamId].orEmpty()
}