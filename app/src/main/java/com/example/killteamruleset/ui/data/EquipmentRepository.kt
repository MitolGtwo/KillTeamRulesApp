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

        "phobos_strike_team" to listOf(

            Equipment(
                id = "phobos_purity_seal",
                name = "PURITY SEALS",
                lore =R.string.phobos_purity_seal_lore,
                description = R.string.phobos_purity_seal_description
            ),
            Equipment(
                id = "additional_utility",
                name = "ADDITIONAL UTILITY GRENADES",
                lore =R.string.additional_utility_lore,
                description = R.string.additional_utility_description
            ),
            Equipment(
                id = "phobos_combat_blades",
                name = "COMBAT BLADES",
                lore =R.string.phobos_combat_blades_lore,
                description = R.string.phobos_combat_blades_description,
                weapons = listOf(
                    WeaponProfile(
                        name = "Combat Blades",
                        type = WeaponType.MELEE,
                        attacks = 5,
                        hit = "3+",
                        damage = "3/4",
                        keywords = listOf(
                        )
                    )
                )
            ),
            Equipment(
                id = "phobos_special_issue_ammunition",
                name = "SPECIAL ISSUE AMMUNITION",
                lore =R.string.phobos_special_issue_ammunition_lore,
                description = R.string.phobos_special_issue_ammunition_description
            )
        ),

        "ratlings" to listOf(

            Equipment(
                id = "purloined_rations",
                name = "PURLOINED RATIONS",
                lore =R.string.purloined_rations_lore,
                description = R.string.purloined_rations_description
            ),
            Equipment(
                id = "lucky_round",
                name = "LUCKY ROUND",
                lore =R.string.lucky_round_lore,
                description = R.string.lucky_round_description
            ),
            Equipment(
                id = "stolen_goods",
                name = "STOLEN GOODS",
                lore =R.string.stolen_goods_lore,
                description = R.string.stolen_goods_description
            ),
            Equipment(
                id = "improvised_armour",
                name = "IMPROVISED ARMOUR",
                lore =R.string.improvised_armour_lore,
                description = R.string.improvised_armour_description
            )
        ),

        "sanctifiers" to listOf(

            Equipment(
                id = "sanctification_orbs",
                name = "SANCTIFICATION ORBS",
                lore =R.string.sanctification_orbs_lore,
                description = R.string.sanctification_orbs_description,
                abilities = listOf(
                    Ability(
                        title = "Sanctification Orb",
                        usage = R.string.sanctification_orb_usage,
                        description = R.string.sanctification_orb_description2
                    )
                )
            ),

            Equipment(
                id = "sanctifiers_purity_seals",
                name = "PURITY SEALS",
                lore =R.string.sanctifiers_purity_seals_lore,
                description = R.string.sanctifiers_purity_seals_description
            ),
            Equipment(
                id = "ecclesiarchy_texts",
                name = "ECCLESIARCHY TEXTS",
                lore =R.string.ecclesiarchy_texts_lore,
                description = R.string.ecclesiarchy_texts_description
            ),

            Equipment(
                id = "imperial_cult_symbols",
                name = "IMPERIAL CULT SYMBOLS",
                lore =R.string.imperial_cult_symbols_lore,
                description = R.string.imperial_cult_symbols_description
            )
        ),


        "scout_squat" to listOf(

            Equipment(
                id = "camo_cloak_scout",
                name = "CAMO CLOAK",
                lore =R.string.camo_cloak_scout_lore,
                description = R.string.camo_cloak_scout_description,

            ),

            Equipment(
                id = "targeting_oculars",
                name = "TARGETING OCULARS",
                lore =R.string.targeting_oculars_lore,
                description = R.string.targeting_oculars_description
            ),
            Equipment(
                id = "scout_combat_blades",
                name = "COMBAT BLADES",
                lore =R.string.scout_combat_blades_lore,
                description = R.string.scout_combat_blades_description,
                weapons = listOf(
                    WeaponProfile(
                        name = "Combat Blades",
                        type = WeaponType.MELEE,
                        attacks = 3,
                        hit = "3+",
                        damage = "4/5",
                        keywords = listOf(
                        )
                    )
                )
            ),

            Equipment(
                id = "heavy_weapon_bipod",
                name = "HEAVY WEAPON BIPOD",
                lore =R.string.heavy_weapon_bipod_lore,
                description = R.string.heavy_weapon_bipod_description
            )
        ),


        "tempestus_aquilon" to listOf(


            Equipment(
                id = "tempestus_daggers",
                name = "TEMPESTUS DAGGERS",
                lore =R.string.tempestus_daggers_lore,
                description = R.string.tempestus_daggers_description,
                weapons = listOf(
                    WeaponProfile(
                        name = "Tempestus Dagger",
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
                id = "aquilon_combat_stimms",
                name = "COMBAT STIMMS",
                lore =R.string.aquilon_combat_stimms_lore,
                description = R.string.aquilon_combat_stimms_description,

                ),

            Equipment(
                id = "drop_agury",
                name = "DROP AUGURY",
                lore =R.string.drop_agury_lore,
                description = R.string.drop_agury_description
            ),

            Equipment(
                id = "remote_overseer",
                name = "REMOTE OVERSEER",
                lore =R.string.remote_overseer_lore,
                description = R.string.remote_overseer_description
            )
        ),


        "wolf_scout" to listOf(

            Equipment(
                id = "frost_weapons",
                name = "FROST WEAPONS",
                lore =R.string.frost_weapons_lore,
                description = R.string.frost_weapons_description,
            ),

            Equipment(
                id = "runic_charms",
                name = "RUNIC CHARMS",
                lore =R.string.runic_charms_lore,
                description = R.string.runic_charms_description,
                ),

            Equipment(
                id = "wolfteeth_necklaces",
                name = "WOLFTEETH NECKLACES",
                lore =R.string.wolfteeth_necklaces_lore,
                description = R.string.wolfteeth_necklaces_description
            ),

            Equipment(
                id = "talismanic_trophies",
                name = "TALISMANIC TROPHIES",
                lore =R.string.talismanic_trophies_lore,
                description = R.string.talismanic_trophies_description
            )
        ),




        "blades_of_khaine" to listOf(

            Equipment(
                id = "rune_prophecy",
                name = "RUNE OF PROPHECY",
                lore =R.string.rune_prophecy_lore,
                description = R.string.rune_prophecy_description
            ),
            Equipment(
                id = "rune_shielding",
                name = "RUNE OF SHIELDING",
                lore =R.string.rune_shielding_lore,
                description = R.string.rune_shielding_description
            ),
            Equipment(
                id = "rune_foresight",
                name = "RUNE OF FORESIGHT",
                lore =R.string.rune_foresight_lore,
                description = R.string.rune_foresight_description
            ),
            Equipment(
                id = "wraithbone_talisman",
                name = "WRAITHBONE TALISMAN",
                lore =R.string.wraithbone_talisman_lore,
                description = R.string.wraithbone_talisman_description
            )
        ),


        "brood_brothers" to listOf(

            Equipment(
                id = "brood_cult_talisman",
                name = "CULT TALISMAN",
                lore =R.string.brood_cult_talisman_lore,
                description = R.string.brood_cult_talisman_description
            ),
            Equipment(
                id = "brood_covert_guises",
                name = "COVERT GUISES",
                lore =R.string.brood_covert_guises_lore,
                description = R.string.brood_covert_guises_description
            ),
            Equipment(
                id = "cult_knives",
                name = "CULT KNIVES",
                lore =R.string.cult_knives_lore,
                description = R.string.cult_knives_description,
                weapons = listOf(
                    WeaponProfile(
                        name = "Cult Knife",
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
                id = "lookout",
                name = "LOOKOUT",
                lore =R.string.lookout_lore,
                description = R.string.lookout_description
            )
        ),




        "canoptek_circle" to listOf(

            Equipment(
                id = "matrix_manipulator",
                name = "MATRIX MANIPULATOR",
                lore =R.string.matrix_manipulator_lore,
                description = R.string.matrix_manipulator_description
            ),
            Equipment(
                id = "awakened_obelisk_nodes",
                name = "AWAKENED OBELISK NODES",
                lore =R.string.awakened_obelisk_nodes_lore,
                description = R.string.awakened_obelisk_nodes_description
            ),
            Equipment(
                id = "nanoscarab_caskets",
                name = "NANOSCARAB CASKETS",
                lore =R.string.nanoscarab_caskets_lore,
                description = R.string.nanoscarab_caskets_description
            ),
            Equipment(
                id = "phase_shifter",
                name = "PHASE SHIFTER",
                lore =R.string.phase_shifter_lore,
                description = R.string.phase_shifter_description
            )
        ),



        "corsair_voidscarred" to listOf(

            Equipment(
                id = "diuturnal_mantles",
                name = "DIUTURNAL MANTLES",
                lore =R.string.diuturnal_mantles_lore,
                description = R.string.diuturnal_mantles_description
            ),
            Equipment(
                id = "mistfield",
                name = "MISTFIELD",
                lore =R.string.mistfield_lore,
                description = R.string.mistfield_description
            ),
            Equipment(
                id = "runes_of_guidance",
                name = "RUNES OF GUIDANCE",
                lore =R.string.runes_of_guidance_lore,
                description = R.string.runes_of_guidance_description
            ),
            Equipment(
                id = "star_charts",
                name = "STAR CHARTS",
                lore =R.string.star_charts_lore,
                description = R.string.star_charts_description
            )
        ),



        "farstalker_kinband" to listOf(

            Equipment(
                id = "piercing_shot",
                name = "PIERCING SHOT",
                lore =R.string.piercing_shot_lore,
                description = R.string.piercing_shot_description
            ),
            Equipment(
                id = "toxin_shot",
                name = "TOXIN SHOT",
                lore =R.string.toxin_shot_lore,
                description = R.string.toxin_shot_description
            ),
            Equipment(
                id = "meat",
                name = "MEAT",
                lore =R.string.meat_lore,
                description = R.string.meat_description
            ),
            Equipment(
                id = "trophy",
                name = "TROPHY",
                lore =R.string.trophy_lore,
                description = R.string.trophy_description
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





        "blooded" to listOf(

            Equipment(
                id = "chaos_sigil",
                name = "CHAOS SIGIL",
                lore =R.string.chaos_sigil_lore,
                description = R.string.chaos_sigil_description
            ),
            Equipment(
                id = "sinister_trophies",
                name = "SINISTER TROPHIES",
                lore =R.string.sinister_trophies_lore,
                description = R.string.sinister_trophies_description,
            ),
            Equipment(
                id = "symbols_of_worship",
                name = "SYMBOLS OF BLOODY WORSHIP",
                lore =R.string.symbols_of_worship_lore,
                description = R.string.symbols_of_worship_description
            ),
            Equipment(
                id = "wicked_blades",
                name = "WICKED BLADES",
                lore =R.string.wicked_blades_lore,
                description = R.string.wicked_blades_description
            )
        ),

        "chaos_cult" to listOf(

            Equipment(
                id = "baleful_script",
                name = "BALEFUL SCRIPT",
                lore =R.string.baleful_script_lore,
                description = R.string.baleful_script_description
            ),
            Equipment(
                id = "chaos_covert_guises",
                name = "COVERT GUISES",
                lore =R.string.chaos_covert_guises_lore,
                description = R.string.chaos_covert_guises_description,
            ),
            Equipment(
                id = "unholy_talisman",
                name = "UNHOLY TALISMAN",
                lore =R.string.unholy_talisman_lore,
                description = R.string.unholy_talisman_description
            ),
            Equipment(
                id = "vile_blessing",
                name = "VILE BLESSING",
                lore =R.string.vile_blessing_lore,
                description = R.string.vile_blessing_description
            )

        ),


        "fellgor_ravagers" to listOf(

            Equipment(
                id = "brass_adornments",
                name = "BRASS ADORNMENTS",
                lore =R.string.brass_adornments_lore,
                description = R.string.brass_adornments_description
            ),
            Equipment(
                id = "gore_marks",
                name = "GORE MARKS",
                lore =R.string.gore_marks_lore,
                description = R.string.gore_marks_description
            ),

            Equipment(
                id = "fellgor_chaos_sigil",
                name = "CHAOS SIGIL",
                lore =R.string.fellgor_chaos_sigil_lore,
                description = R.string.fellgor_chaos_sigil_description,
            ),
            Equipment(
                id = "war_paint",
                name = "WAR PAINT",
                lore =R.string.war_paint_lore,
                description = R.string.war_paint_description
            )
        ),



        "gellepox_infected" to listOf(

            Equipment(
                id = "mutoid_vermin",
                name = "MUTOID VERMIN",
                lore =R.string.mutoid_vermin_lore,
                description = R.string.mutoid_vermin_description
            ),
            Equipment(
                id = "pulluted_stockpile",
                name = "POLLUTED STOCKPILE",
                lore =R.string.pulluted_stockpile_lore,
                description = R.string.pulluted_stockpile_description
            ),

            Equipment(
                id = "fellgor_chaos_sigil",
                name = "MUTATED SYMPTOMS",
                lore =R.string.fellgor_chaos_sigil_lore,
                description = R.string.fellgor_chaos_sigil_description,
            ),
            Equipment(
                id = "plague_bellows",
                name = "PLAGUE BELLOWS",
                lore =R.string.plague_bellows_lore,
                description = R.string.plague_bellows_description
            )
        ),



        "goremongers" to listOf(

            Equipment(
                id = "gory_totem",
                name = "GORY TOTEM",
                lore =R.string.gory_totem_lore,
                description = R.string.gory_totem_description
            ),
            Equipment(
                id = "bloody_cadaver",
                name = "BLOODY CADAVER",
                lore =R.string.bloody_cadaver_lore,
                description = R.string.bloody_cadaver_description
            ),

            Equipment(
                id = "gore_chaos_sigil",
                name = "CHAOS SIGIL",
                lore =R.string.gore_chaos_sigil_lore,
                description = R.string.gore_chaos_sigil_description,
            ),
            Equipment(
                id = "wrist_chains",
                name = "WRIST CHAINS",
                lore =R.string.wrist_chains_lore,
                description = R.string.wrist_chains_description
            )
        ),



        "legionaries" to listOf(

            Equipment(
                id = "warded_armour",
                name = "WARDED ARMOUR",
                lore =R.string.warded_armour_lore,
                description = R.string.warded_armour_description
            ),
            Equipment(
                id = "tainted_round",
                name = "TAINTED ROUNDS",
                lore =R.string.tainted_rounds_lore,
                description = R.string.tainted_rounds_description
            ),

            Equipment(
                id = "chaos_talismans",
                name = "CHAOS TALISMANS",
                lore =R.string.chaos_talismans_lore,
                description = R.string.chaos_talismans_description,
            ),
            Equipment(
                id = "malefic_blades",
                name = "MALEFIC BLADES",
                lore =R.string.malefic_blades_lore,
                description = R.string.malefic_blades_description,
                weapons = listOf(
                    WeaponProfile(
                        name = "Malefic Blade",
                        type = WeaponType.MELEE,
                        attacks = 5,
                        hit = "3+",
                        damage = "3/4",
                        keywords = listOf(
                        )
                    )
                )
            )
        ),



        "murderwing" to listOf(

            Equipment(
                id = "bladefins",
                name = "BLADEFINS",
                lore =R.string.bladefins_lore,
                description = R.string.bladefins_description,
                abilities = listOf(
                    Ability(
                        title = "Slice from Above",
                        usage = R.string.bladefins_usage,
                        description = R.string.bladefins_description2
                    )

                ),
            ),
            Equipment(
                id = "clawed_armour",
                name = "CLAWED ARMOUR",
                lore =R.string.clawed_armour_lore,
                description = R.string.clawed_armour_description,
                abilities = listOf(
                    Ability(
                        title = "Slice from Above",
                        usage = R.string.clawed_armour_usage,
                        description = R.string.clawed_armour_description2
                    )

                ),
            ),

            Equipment(
                id = "warp_fuel",
                name = "WARP FUEL",
                lore =R.string.warp_fuel_lore,
                description = R.string.warp_fuel_description,
            ),
            Equipment(
                id = "vox_casters",
                name = "VOX-CASTERS",
                lore =R.string.vox_casters_lore,
                description = R.string.vox_casters_description,
                abilities = listOf(
                    Ability(
                        title = "Vox-Cry",
                        usage = R.string.vox_casters_usage,
                        description = R.string.vox_casters_description2
                    )

                ),
            )
        ),

        "nemesis_claw" to listOf(

            Equipment(
                id = "flayed_skin",
                name = "FLAYED SKIN",
                lore =R.string.flayed_skin_lore,
                description = R.string.flayed_skin_description
            ),
            Equipment(
                id = "chain_snare",
                name = "CHAIN SNARE",
                lore =R.string.chain_snare_lore,
                description = R.string.chain_snare_description
            ),

            Equipment(
                id = "grisly_trophy",
                name = "GRISLY TROPHY",
                lore =R.string.grisly_trophy_lore,
                description = R.string.grisly_trophy_description,
            ),
            Equipment(
                id = "nemesis_comms_jammers",
                name = "COMMS JAMMERS",
                lore =R.string.nemesis_comms_jammers_lore,
                description = R.string.nemesis_comms_jammers_description
            )
        ),



        "warpcoven" to listOf(

            Equipment(
                id = "ensorcelled_rounds",
                name = "ENSORCELLED ROUNDS",
                lore =R.string.ensorcelled_rounds_lore,
                description = R.string.ensorcelled_rounds_description
            ),
            Equipment(
                id = "daemonmaw_weapons",
                name = "DAEMONMAW WEAPONS",
                lore =R.string.daemonmaw_weapons_lore,
                description = R.string.daemonmaw_weapons_description
            ),

            Equipment(
                id = "arcane_robes",
                name = "ARCANE ROBES",
                lore =R.string.arcane_robes_lore,
                description = R.string.arcane_robes_description,
            ),
            Equipment(
                id = "nemesis_comms_jammers",
                name = "COMMS JAMMERS",
                lore =R.string.nemesis_comms_jammers_lore,
                description = R.string.nemesis_comms_jammers_description
            )
        ),





        "plague_marines" to listOf(

            Equipment(
                id = "plague_bell",
                name = "PLAGUE BELLS",
                lore =R.string.plague_bell_lore,
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
