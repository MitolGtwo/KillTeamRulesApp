package com.example.killteamruleset.ui.data

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ploy
import com.example.killteamruleset.ui.model.PloyType

object PloyRepository {

    private val ploysByTeam = mapOf(
        "wrecka_krew" to listOf(
            // ── STRATEGY ──
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


            // ── FIREFIGHT ──
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


        )
    )

    fun getForTeam(teamId: String): List<Ploy> =
        ploysByTeam[teamId].orEmpty()
}