package com.example.killteamruleset.ui.data

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Equipment
import com.example.killteamruleset.ui.model.Poison
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

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
        ),
        "plague_marines" to listOf(

            Equipment(
                id = "plague_bell",
                name = R.string.plague_bell,
                lore =R.string.plague_bell,
                description = R.string.plague_bell_description
            ),
            Equipment(
                id = "blight_grenades",
                name = R.string.plague_blight_grenades,
                lore =R.string.plague_blight_grenades_lore,
                description = R.string.plague_blight_grenades_description,
                weapons = listOf(
                    WeaponProfile(
                        name = "Blight Grennade",
                        type = WeaponType.RANGED,
                        attacks = 4,
                        hit = "4+",
                        damage = "2/4",
                        keywords = listOf(
                            Range(6),
                            Blast(2),
                            Saturate,
                            Severe,
                            Poison,
                        )
                    )
                )
            ),
            Equipment(
                id = "plague_rounds",
                name = R.string.plague_rounds,
                lore =R.string.plague_rounds_lore,
                description = R.string.plague_rounds_description
            ),
            Equipment(
                id = "poison_vent",
                name = R.string.plague_poison_vents,
                lore =R.string.plague_poison_vents_lore,
                description = R.string.plague_poison_vents_description
            )
        )


    )

    fun getForTeam(teamId: String): List<Equipment> =
        equipmentByTeam[teamId].orEmpty()
}
