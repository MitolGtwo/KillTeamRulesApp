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
                description = R.string.hand_axes_description,
                weapons = listOf(
                    WeaponProfile(
                        name = "Hand Axe",
                        type = WeaponType.MELEE,
                        attacks = 3,
                        hit = "4+",
                        damage = "3/4",
                        keywords = listOf(
                        )
                    )
                )
            ),
            Equipment(
                id = "gas_bombardment",
                name = "GAS BOMBARDMENT",
                lore =R.string.gas_bombardment_lore,
                description = R.string.gas_bombardment_description
            )
        ),

        "deathwatch" to listOf(

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

        "exaction_squad" to listOf(

            Equipment(
                id = "reinforced_mirrovisor",
                name = "REINFORCED MIRROR-VISOR",
                lore =R.string.reinforced_mirrovisor_lore,
                description = R.string.reinforced_mirrovisor_description
            ),
            Equipment(
                id = "manacles",
                name = "MANACLES",
                lore =R.string.manacles_lore,
                description = R.string.manacles_description
            ),
            Equipment(
                id = "strobing_phosphorlumen",
                name = "STROBING PHOSPHOR-LUMEN",
                lore =R.string.strobing_phosphorlumen_lore,
                description = R.string.strobing_phosphorlumen_description
            ),
            Equipment(
                id = "special_issue_shells",
                name = "SPECIAL ISSUE SHELLS",
                lore =R.string.special_issue_shells_lore,
                description = R.string.special_issue_shells_description
            )
        ),

        "hunter_clade" to listOf(

            Equipment(
                id = "rad_bombardment",
                name = "RAD BOMBARDMENT",
                lore =R.string.rad_bombardment_lore,
                description = R.string.rad_bombardment_description
            ),
            Equipment(
                id = "redundacy_systems",
                name = "REDUNDANCY SYSTEMS",
                lore =R.string.redundacy_systems_lore,
                description = R.string.redundacy_systems_description
            ),
            Equipment(
                id = "refractor_field",
                name = "REFRACTOR FIELD",
                lore =R.string.refractor_field_lore,
                description = R.string.refractor_field_description
            ),
            Equipment(
                id = "extremis_mindlink",
                name = "EXTREMIS MIND-LINK",
                lore =R.string.extremis_mindlink_lore,
                description = R.string.extremis_mindlink_description
            )
        ),

        "imperial_navy_breachers" to listOf(

            Equipment(
                id = "rebreathers",
                name = "REBREATHERS",
                lore =R.string.rebreathers_lore,
                description = R.string.rebreathers_description
            ),
            Equipment(
                id = "slugs",
                name = "SLUGS",
                lore =R.string.slugs_lore,
                description = R.string.slugs_description
            ),
            Equipment(
                id = "combat_stimms",
                name = "COMBAT STIMMS",
                lore =R.string.combat_stimms_lore,
                description = R.string.combat_stimms_description
            ),
            Equipment(
                id = "system_override_device",
                name = "SYSTEM OVERRIDE DEVICE",
                lore =R.string.system_override_device_lore,
                description = R.string.system_override_device_description
            )
        ),

        "inquisitorial_agents" to listOf(

            Equipment(
                id = "inquisitorial_rosette",
                name = "INQUISITORIAL ROSETTE",
                lore =R.string.inquisitorial_rosette_lore,
                description = R.string.inquisitorial_rosette_description
            ),
            Equipment(
                id = "combat_daggers",
                name = "COMBAT DAGGERS",
                lore =R.string.combat_daggers_lore,
                description = R.string.combat_daggers_description,
                weapons = listOf(
                    WeaponProfile(
                        name = "Combat Dagger",
                        type = WeaponType.MELEE,
                        attacks = 3,
                        hit = "4+",
                        damage = "3/4",
                        keywords = listOf(
                        )
                    )
                )

            ),
            Equipment(
                id = "armoured_bodysuits",
                name = "ARMOURED BODYSUITS",
                lore =R.string.armoured_bodysuits_lore,
                description = R.string.armoured_bodysuits_description
            ),
            Equipment(
                id = "servo_skull",
                name = "SERVO-SKULL",
                lore =R.string.servo_skull_lore,
                description = R.string.servo_skull_description
            )
        ),

        "kasrkin" to listOf(

            Equipment(
                id = "foregrip",
                name = "FOREGRIP",
                lore =R.string.foregrip_lore,
                description = R.string.foregrip_description
            ),
            Equipment(
                id = "long_range_scope",
                name = "LONG-RANGE SCOPE",
                lore =R.string.long_range_scope_lore,
                description = R.string.long_range_scope_description
            ),
            Equipment(
                id = "relics_of_cadia",
                name = "RELICS OF CADIA",
                lore =R.string.relics_of_cadia_lore,
                description = R.string.relics_of_cadia_description
            ),
            Equipment(
                id = "combat_daggers",
                name = "COMBAT DAGGERS",
                lore =R.string.kasrkin_combat_daggers_lore,
                description = R.string.kasrkin_combat_daggers_description,
                weapons = listOf(
                    WeaponProfile(
                        name = "Combat Dagger",
                        type = WeaponType.MELEE,
                        attacks = 3,
                        hit = "4+",
                        damage = "3/4",
                        keywords = listOf(
                        )
                    )
                )

            ),
        ),


        "novitiates" to listOf(

            Equipment(
                id = "icon_of_faith",
                name = "ICON OF FAITH",
                lore =R.string.icon_of_faith_lore,
                description = R.string.icon_of_faith_description
            ),
            Equipment(
                id = "sanctified_rounds",
                name = "SANCTIFIED ROUNDS",
                lore =R.string.sanctified_rounds_lore,
                description = R.string.sanctified_rounds_description
            ),
            Equipment(
                id = "auto_chastisers",
                name = "AUTO-CHASTISERS",
                lore =R.string.auto_chastisers_lore,
                description = R.string.auto_chastisers_description
            ),
            Equipment(
                id = "holy_embrocations",
                name = "HOLY EMBROCATIONS",
                lore =R.string.kasrkin_combat_daggers_lore,
                description = R.string.holy_embrocations_description,


            ),
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
