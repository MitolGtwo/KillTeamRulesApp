package com.example.killteamruleset.ui.data

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Equipment

object EquipmentRepository {

    private val equipmentByTeam = mapOf(

        "wrecka_krew" to listOf(

            Equipment(
                id = "drill_rokkits",
                name = R.string.wrecka_drillrokkit,
                lore =R.string.wrecka_drillrokkit_lore,
                description = R.string.wrecka_drillrokkit_description
            ),
            Equipment(
                id = "extra_armour",
                name = R.string.wrecka_extra_armour,
                lore =R.string.wrecka_extra_armour_lore,
                description = R.string.wrecka_extra_armour_description
            ),
            Equipment(
                id = "engine_oil",
                name = R.string.wrecka_engine_oil,
                lore =R.string.wrecka_engine_oil_lore,
                description = R.string.wrecka_engine_oil_description
            ),
            Equipment(
                id = "glyphs",
                name = R.string.wrecka_glyphs,
                lore =R.string.wrecka_glyphs_lore,
                description = R.string.wrecka_glyphs_description
            )
        )
    )

    fun getForTeam(teamId: String): List<Equipment> =
        equipmentByTeam[teamId].orEmpty()
}
