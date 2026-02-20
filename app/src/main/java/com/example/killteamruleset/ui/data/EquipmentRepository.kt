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
        "angels_of_death" to listOf(

            Equipment(
                id = "purity_seals",
                name = "PURITY SEALS",
                lore =R.string.purity_seals_lore,
                description = R.string.purity_seals_description
            ),
            Equipment(
                id = "chapter_reliquaries",
                name = "CHAPTER RELIQUARIES",
                lore =R.string.chapter_reliquaries_lore,
                description = R.string.chapter_reliquaries_description
            ),
            Equipment(
                id = "tilting_shields",
                name = "TILTING SHIELDS",
                lore =R.string.tilting_shields_lore,
                description = R.string.tilting_shields_description
            ),
            Equipment(
                id = "auspex",
                name = "AUSPEX",
                lore =R.string.auspex_lore,
                description = R.string.auspex_description
            )
        ),

        "battle_clade" to listOf(

            Equipment(
                id = "covert guises",
                name = "COVERT GUISES",
                lore =R.string.covert_guises_lore,
                description = R.string.covert_guises_description
            ),
            Equipment(
                id = "electromantic_capacitors",
                name = "ELECTROMANTIC CAPACITORS",
                lore =R.string.electromantic_capacitors_lore,
                description = R.string.electromantic_capacitors_description
            ),
            Equipment(
                id = "concealed_apparatus",
                name = "CONCEALED APPARATUS",
                lore =R.string.concealed_apparatus_lore,
                description = R.string.concealed_apparatus_description
            ),
            Equipment(
                id = "neurocyclic_reserve_cells",
                name = "NEUROCYCLIC RESERVE CELLS",
                lore =R.string.neurocylic_reserve_cells_lore,
                description = R.string.neurocylic_reserve_cells_description
            )
        ),


        "celestian_insidiants" to listOf(

            Equipment(
                id = "psyk_out_grenades",
                name = "PSYK-OUT GRENADES",
                lore =R.string.psyk_out_grenades_lore,
                description = R.string.psyk_out_grenades_description
            ),
            Equipment(
                id = "vocifera_mortis",
                name = "VOCIFERA MORTIS",
                lore =R.string.vocifera_mortis_lore,
                description = R.string.vocifera_mortis_description
            ),
            Equipment(
                id = "saintly_relics",
                name = "SAINTLY RELICS",
                lore =R.string.saintly_relics_lore,
                description = R.string.saintly_relics_description
            ),
            Equipment(
                id = "auto_flagellator",
                name = "AUTO-FLAGELLATOR",
                lore =R.string.auto_flagellator_lore,
                description = R.string.auto_flagellator_description
            )
        ),


        "death_Korps" to listOf(

            Equipment(
                id = "chronometer",
                name = "CHRONOMETER",
                lore =R.string.chronometer_lore,
                description = R.string.chronometer_description
            ),
            Equipment(
                id = "comm_beads",
                name = "COMM-BEADS",
                lore =R.string.comm_beads_lore,
                description = R.string.comm_beads_description
            ),
            Equipment(
                id = "hand_axes",
                name = "HAND AXES",
                lore =R.string.hand_axes_lore,
                description = R.string.hand_axes_description
            ),
            Equipment(
                id = "gas_bombardment",
                name = "GAS BOMBARDMENT",
                lore =R.string.gas_bombardment_lore,
                description = R.string.gas_bombardment_description
            )
        ),

        "DeathWatch" to listOf(

            Equipment(
                id = "digital_weapons",
                name = "Digital Weapons",
                lore =R.string.digital_weapons_lore,
                description = R.string.digital_weapons_description
            ),
            Equipment(
                id = "scrutavore_servothrall",
                name = "SCRUTAVORE SERVO-THRALL",
                lore =R.string.scrutavore_servothrall_lore,
                description = R.string.scrutavore_servothrall_description
            ),
            Equipment(
                id = "sanctusv_biooscryer_cuffs",
                name = "SANCTUS-V VIOSCRYER CUFFS",
                lore =R.string.sanctusv_biooscryer_cuffs_lore,
                description = R.string.sanctusv_biooscryer_cuffs_description
            ),
            Equipment(
                id = "ammunition_reserve",
                name = "AMMUNITION RESERVE",
                lore =R.string.ammunition_reserve_lore,
                description = R.string.ammunition_reserve_description
            )
        ),


        "elucidian_star" to listOf(

            Equipment(
                id = "armoured_undersuit",
                name = "ARMOURED UNDERSUIT",
                lore =R.string.armoured_undersuit_lore,
                description = R.string.armoured_undersuit_description
            ),
            Equipment(
                id = "hot_shot_capacitor_packs",
                name = "HOT SHOT CAPACITOR PACKS",
                lore =R.string.hot_shot_capacitor_packs_lore,
                description = R.string.hot_shot_capacitor_packs_description
            ),
            Equipment(
                id = "improved_coordinates_uplink",
                name = "IMPROVED COORDINATES UPLINK",
                lore =R.string.improved_coordinates_uplink_lore,
                description = R.string.improved_coordinates_uplink_description
            ),
            Equipment(
                id = "rapid_gunnery",
                name = "RAPID GUNNERY",
                lore =R.string.rapid_gunnery_lore,
                description = R.string.rapid_gunnery_description
            )
        ),


        
        "wrecka_krew" to listOf(

            Equipment(
                id = "drill_rokkits",
                name = "DRILL ROKKITS",
                lore =R.string.wrecka_drillrokkit_lore,
                description = R.string.wrecka_drillrokkit_description
            ),
            Equipment(
                id = "extra_armour",
                name = "EXTRA ARMOUR",
                lore =R.string.wrecka_extra_armour_lore,
                description = R.string.wrecka_extra_armour_description
            ),
            Equipment(
                id = "engine_oil",
                name = "ENGINE OIL",
                lore =R.string.wrecka_engine_oil_lore,
                description = R.string.wrecka_engine_oil_description
            ),
            Equipment(
                id = "glyphs",
                name = "GLYPHS",
                lore =R.string.wrecka_glyphs_lore,
                description = R.string.wrecka_glyphs_description
            )
        ),
        "plague_marines" to listOf(

            Equipment(
                id = "plague_bell",
                name = "PLAGUE BELLS",
                lore =R.string.plague_bell,
                description = R.string.plague_bell_description
            ),
            Equipment(
                id = "blight_grenades",
                name = "BLIGHT GRENADES",
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
                name = "PLAGUE ROUNDS",
                lore =R.string.plague_rounds_lore,
                description = R.string.plague_rounds_description
            ),
            Equipment(
                id = "poison_vent",
                name = "POISON VENTS",
                lore =R.string.plague_poison_vents_lore,
                description = R.string.plague_poison_vents_description
            )
        )


    )

    fun getForTeam(teamId: String): List<Equipment> =
        equipmentByTeam[teamId].orEmpty()
}
