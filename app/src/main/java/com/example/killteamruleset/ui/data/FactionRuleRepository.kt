package com.example.killteamruleset.ui.data


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.FactionRule
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Seek_light
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

object FactionRuleRepository {

    
    private val rulesByTeam = mapOf(
        //AoD
         "angels_of_death" to listOf(
            FactionRule(
                id = "astartes",
                title = "ASTARTES",
                lore = R.string.astartes_lore,
                ruleText = R.string.astartes_description,

            ),
            FactionRule(
                id = "chapter_tactics",
                title = "CHAPTER TACTICS",
                lore = R.string.chapter_tactics_lore,
                ruleText = R.string.chapter_tactics_description,

                )

        ),

        //Battleclade
        "battle_clade" to listOf(
            FactionRule(
                id = "noospheric_network",
                title = "NOOSPHERIC NETWORK",
                lore = R.string.noospheric_network_lore,
                ruleText = R.string.noospheric_network_description,

                ),
            FactionRule(
                id = "battleclade_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.battleclade_tokens
            ),

            ),

         //Celestian Insidiants
         "celestian_insidiants" to listOf(
            FactionRule(
                id = "martyrdoom",
                title = "MARTYRDOM",
                lore = R.string.martyrdoom_lore,
                ruleText = R.string.martyrdoom_description,

            ),
             
              FactionRule(
                id = "weapons_of_the_witch_hunters",
                title = "WEAPONS OF THE WITCH HUNTERS",
                lore = R.string.weapons_of_the_witch_hunters_lore,
                ruleText = R.string.weapons_of_the_witch_hunters_description,

                ),

               FactionRule(
                id = "inspiration",
                title = "INSPIRATION",
                lore = R.string.inspiration_lore,
                ruleText = R.string.inspiration_description,

                ),
             
            FactionRule(
                id = "celestian_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.celestian_tokens
                ),

        ),

        //DEATH KORPS
         "death_Korps" to listOf(
            FactionRule(
                id = "guardsman_orders",
                title = "GUARDSMAN ORDERS",
                lore = R.string.guardsman_orders_lore,
                ruleText = R.string.guardsman_orders_description,

            ),
            FactionRule(
                id = "dk_tokens",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.dk_tokens
                ),

        ),

        //DeathWatch
         "deathwatch" to listOf(
            FactionRule(
                id = "veteran_astartes",
                title = "VETERAN ASTARTES",
                lore = R.string.veteran_astartes_lore,
                ruleText = R.string.veteran_astartes_description,

            ),
            FactionRule(
                id = "special_issue_ammunition",
                title = "SPECIAL ISSUE AMMUNITION",
                lore = R.string.special_issue_ammunition_lore,
                ruleText = R.string.special_issue_ammunition_description,

                ),
            FactionRule(
                id = "wrecka_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.wrecka_krew_tokens
                ),

        ),

        //Elucidian Starstriders
         "elucidian_star" to listOf(
            FactionRule(
                id = "warrant_of_trade",
                title = "WARRANT OF TRADE",
                lore = R.string.warrant_of_trade_lore,
                ruleText = R.string.warrant_of_trade_description,

            ),
            FactionRule(
                id = "privateer_support_assets",
                title = "PRIVATEER SUPPORT ASSETS",
                lore = R.string.privateer_support_assets_lore,
                ruleText = R.string.privateer_support_assets_description,
                weapons = listOf(
                    WeaponProfile(
                        name = "Archeotech Beam",
                        type = WeaponType.RANGED,
                        attacks = 4,
                        hit = "3+",
                        damage = "6/7",
                        keywords = listOf(
                            Heavy("Reposition Only"),
                            Piercing(2),
                            Silent
                        )

                    ),
                    WeaponProfile(
                        name = "Plasma Battery",
                        type = WeaponType.RANGED,
                        attacks = 5,
                        hit = "4+",
                        damage = "5/6",
                        keywords = listOf(
                            Heavy("Reposition Only"),
                            Lethal(5),
                            Piercing(1),
                            Silent
                        )
                    ),
                    WeaponProfile(
                        name = "Macrocannon",
                        type = WeaponType.RANGED,
                        attacks = 5,
                        hit = "4+",
                        damage = "4/5",
                        keywords = listOf(
                            Heavy("Reposition Only"),
                            Piercing_Crits(1),
                            Saturate,
                            Silent,
                            Torrent(2)
                        )

                    ),
                    WeaponProfile(
                        name = "Guided Shell",
                        type = WeaponType.MELEE,
                        attacks = 5,
                        hit = "4+",
                        damage = "3/4",
                        keywords = listOf(
                            Blast(2),
                            Heavy("Reposition Only"),
                            Silent
                        )

                    ),
                    WeaponProfile(
                        name = "Cluster Bomb",
                        type = WeaponType.RANGED,
                        attacks = 5,
                        hit = "4+",
                        damage = "2/3",
                        keywords = listOf(
                            Blast(3),
                            Heavy("Reposition Only"),
                            Silent
                        )
                    )
                )

                ),
            FactionRule(
                id = "wrecka_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.wrecka_krew_tokens
                ),

        ),

        "exaction_squad" to listOf(
            FactionRule(
                id = "ruthless_efficiency",
                title = "RUTHLESS EFFICIENCY",
                lore = R.string.ruthless_efficiency_lore,
                ruleText = R.string.ruthless_efficiency_description,

                ),
            FactionRule(
                id = "marked_for_justice",
                title = "MARKED FOR JUSTICE",
                lore = R.string.marked_for_justice_lore,
                ruleText = R.string.marked_for_justice_description,

                ),
            FactionRule(
                id = "repress",
                title = "REPRESS",
                lore = R.string.repress_lore,
                ruleText = R.string.repress_description,

                ),
            FactionRule(
                id = "wrecka_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.wrecka_krew_tokens
            ),

            ),
        //Hunter Clade
        "hunter_clade" to listOf(
            FactionRule(
                id = "doctrina_imperatives",
                title = "DOCTRINA IMPERATIVES",
                lore = R.string.doctrina_imperatives_lore,
                ruleText = R.string.doctrina_imperatives_description,

                ),
            FactionRule(
                id = "wrecka_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.wrecka_krew_tokens
            ),
        ),

        //Imperial Navy breachers
        "imperial_navy_breachers" to listOf(
            FactionRule(
                id = "void_armour",
                title = "VOID ARMOUR",
                lore = R.string.void_armour_lore,
                ruleText = R.string.void_armour_description,
                ),
            FactionRule(
                id = "breach_and_clear",
                title = "BREACH AND CLEAR",
                lore = R.string.breach_and_clear_lore,
                ruleText = R.string.breach_and_clear_description,
            ),
            FactionRule(
                id = "wrecka_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.wrecka_krew_tokens
            ),
        ),

        //Inquisitorial Agent
        "inquisitorial_agents" to listOf(
            FactionRule(
                id = "inquisitorial_requisition",
                title = "INQUISITORIAL REQUISITION",
                lore = R.string.inquisitorial_requisition_lore,
                ruleText = R.string.inquisitorial_requisition_description,
            ),
            FactionRule(
                id = "inquisitorial_deathkorps",
                title = "DEATH KORPS",
                ruleText = R.string.inquisitorial_deathkorps_description,
            ),
            FactionRule(
                id = "inquisitorial_exaction_squad",
                title = "EXACTION SQUAD",
                ruleText = R.string.inquisitorial_exaction_squad_description,
            ),
            FactionRule(
                id = "inquisitorial_imperial_navy",
                title = "IMPERIAL NAVY BREACHERS",
                ruleText = R.string.inquisitorial_imperial_navy_description,
            ),
            FactionRule(
                id = "inquisitorial_kasrkin",
                title = "KASRKIN",
                ruleText = R.string.inquisitorial_kasrkin_description,
            ),
            FactionRule(
                id = "inquisitorial_sister_of_silence",
                title = "SISTERS OF SILENCE",
                ruleText = R.string.inquisitorial_sister_of_silence_description,
            ),
            FactionRule(
                id = "inquisitorial_tempestus_scions",
                title = "TEMPESTUS SCIONS",
                ruleText = R.string.inquisitorial_tempestus_scions_description,
            ),
            FactionRule(
                id = "wrecka_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.wrecka_krew_tokens
            ),
        ),

        //Kasrkin
        "kasrkin" to listOf(
            FactionRule(
                id = "skill_at_arms",
                title = "SKILL AT ARMS",
                lore = R.string.skill_at_arms_lore,
                ruleText = R.string.skill_at_arms_description,
                ),
            FactionRule(
                id = "light_em_up",
                title = "Light ’Em Up",
                lore = R.string.light_em_up_lore,
                ruleText = R.string.light_em_up_description,
            ),
            FactionRule(
                id = "strike_fast",
                title = "Strike Fast",
                lore = R.string.strike_fast_lore,
                ruleText = R.string.strike_fast_description,
            ),
            FactionRule(
                id = "ice_in_your_veins",
                title = "Ice In Your Veins",
                lore = R.string.ice_in_your_veins_lore,
                ruleText = R.string.ice_in_your_veins_description,
            ),
            FactionRule(
                id = "for_cadia",
                title = "For Cadia!",
                lore = R.string.for_cadia_lore,
                ruleText = R.string.for_cadia_description,
            ),

            FactionRule(
                id = "rapid_fire",
                title = "RAPID FIRE",
                lore = R.string.rapid_fire_lore,
                ruleText = R.string.rapid_fire_description,

                ),
            FactionRule(
                id = "wrecka_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.wrecka_krew_tokens
            ),

            ),


        //Novitiate
        "novitiates" to listOf(
            FactionRule(
                id = "acts_of_faith",
                title = "WRECKA RAMPAGE",
                lore = R.string.acts_of_faith_lore,
                ruleText = R.string.acts_of_faith_description,

                ),
            FactionRule(
                id = "wrecka_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.wrecka_krew_tokens
            ),
        ),

        //Phobos
        "phobos_strike_team" to listOf(
            FactionRule(
                id = "omni_scrambler",
                title = "OMNI-SCRAMBLER",
                lore = R.string.omni_scrambler_lore,
                ruleText = R.string.omni_scrambler_description,

                ),
            FactionRule(
                id = "terror",
                title = "TERROR",
                lore = R.string.terror_lore,
                ruleText = R.string.terror_description,

                ),
            FactionRule(
                id = "phobos_astartes",
                title = "ASTARTES",
                lore = R.string.phobos_astartes_lore,
                ruleText = R.string.phobos_astartes_description,

                ),
            FactionRule(
                id = "multispectrum_array",
                title = "MULTI-SPECTRUM ARRAY",
                lore = R.string.multispectrum_array_lore,
                ruleText = R.string.multispectrum_array_description,

                ),
            FactionRule(
                id = "wrecka_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.wrecka_krew_tokens
            ),
        ),


        //Ratlings
        "ratlings" to listOf(
            FactionRule(
                id = "scarper",
                title = "SCARPER",
                lore = R.string.scarper_lore,
                ruleText = R.string.scarper_description,

                ),
            FactionRule(
                id = "wrecka_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.wrecka_krew_tokens
            ),

            ),


        "sanctifiers" to listOf(
            FactionRule(
                id = "blaze",
                title = "BLAZE",
                lore = R.string.blaze_lore,
                ruleText = R.string.blaze_description,

                ),
            FactionRule(
                id = "ministorum_sermon",
                title = "MINISTORUM SERMON",
                lore = R.string.ministorum_sermon_lore,
                ruleText = R.string.ministorum_sermon_description,

                ),
            FactionRule(
                id = "wrecka_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.wrecka_krew_tokens
            ),
        ),


        "scout_squat" to listOf(
            FactionRule(
                id = "foward_scouting",
                title = "FORWARD SCOUTING",
                lore = R.string.foward_scouting_lore,
                ruleText = R.string.foward_scouting_description,

                ),

            FactionRule(
                id = "wrecka_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.wrecka_krew_tokens
            ),
        ),


        "tempestus_aquilon" to listOf(
                FactionRule(
                    id = "drop_insertion",
                    title = "DROP INSERTION",
                    lore = R.string.drop_insertion_lore,
                    ruleText = R.string.drop_insertion_description,
                    ),
            FactionRule(
                id = "grav_chute",
                title = "GRAV‑CHUTE",
                lore = R.string.grav_chute_lore,
                ruleText = R.string.grav_chute_description,

                ),
        FactionRule(
            id = "wrecka_markers",
            title =null,
            lore = null,
            ruleText = null,
            imageRes = R.drawable.wrecka_krew_tokens
        ),
    ),


        "wolf_scout" to listOf(
            FactionRule(
                id = "elemental_storm",
                title = "ELEMENTAL STORM",
                lore = R.string.elemental_storm_lore,
                ruleText = R.string.elemental_storm_description,
            ),
            FactionRule(
                id = "hunting_astartes",
                title = "HUNTING ASTARTES",
                lore = R.string.hunting_astartes_lore,
                ruleText = R.string.hunting_astartes_description,

                ),
            FactionRule(
                id = "wrecka_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.wrecka_krew_tokens
            ),
        ),




        "blades_of_khaine" to listOf(
            FactionRule(
                id = "aspect_techniques",
                title = "ASPECT TECHNIQUES",
                lore = R.string.aspect_techniques_lore,
                ruleText = R.string.aspect_techniques_description,
                ),
            FactionRule(
                id = "the_woe",
                imageRes = R.drawable.howling_banshee,
                title = "THE WOE",
                lore = R.string.the_woe_lore,
                ruleText = R.string.the_woe_description,
                ),
            FactionRule(
                id = "rain_of_tears",
                imageRes = R.drawable.howling_banshee,
                title = "RAIN OF TEARS",
                lore = R.string.rain_of_tears_lore,
                ruleText = R.string.rain_of_tears_description,
            ),
            FactionRule(
                id = "acrobatic",
                imageRes = R.drawable.howling_banshee,
                title = "ACROBATIC",
                lore = R.string.acrobatic_lore,
                ruleText = R.string.acrobatic_description,
            ),
            FactionRule(
                id = "scream_that_steals",
                imageRes = R.drawable.howling_banshee,
                title = "SCREAM-THAT-STEALS",
                lore = R.string.scream_that_steals_lore,
                ruleText = R.string.scream_that_steals_description,
            ),
            FactionRule(
                id = "shriek_that_kills",
                imageRes = R.drawable.howling_banshee,
                title = "SHRIEK-THAT-KILLS",
                lore = R.string.shriek_that_kills_lore,
                ruleText = R.string.shriek_that_kills_description,
                weapons = listOf(
                    WeaponProfile(
                        name = "Shriek-that-kills",
                        type = WeaponType.RANGED,
                        attacks = 5,
                        hit = "3+",
                        damage = "1/2",
                        keywords = listOf(
                            Range(6),
                            Saturate,
                            Seek_light,
                            Stun,
                            Torrent(1)
                        )
                    )
                )
            ),
            FactionRule(
                id = "the_slicing_hurricane",
                imageRes = R.drawable.dire_avenger,
                title = "THE SLICING HURRICANE",
                lore = R.string.the_slicing_hurricane_lore,
                ruleText = R.string.the_slicing_hurricane_description,
            ),
            FactionRule(
                id = "death_thousand_blades",
                imageRes = R.drawable.dire_avenger,
                title = "DEATH OF A THOUSAND BLADES",
                lore = R.string.death_thousand_blades_lore,
                ruleText = R.string.death_thousand_blades_description,
            ),
            FactionRule(
                id = "vigilance_of_the_avenger",
                imageRes = R.drawable.dire_avenger,
                title = "VIGILANCE OF THE AVENGER",
                lore = R.string.vigilance_of_the_avenger_lore,
                ruleText = R.string.vigilance_of_the_avenger_description,
            ),
            FactionRule(
                id = "the_slicing_hurricane",
                imageRes = R.drawable.dire_avenger,
                title = "THE SLICING HURRICANE",
                lore = R.string.the_slicing_hurricane_lore,
                ruleText = R.string.the_slicing_hurricane_description,
            ),
            FactionRule(
                id = "unstinting_immovable",
                imageRes = R.drawable.dire_avenger,
                title = "UNSTINTING, IMMOVABLE",
                lore = R.string.unstinting_immovable_lore,
                ruleText = R.string.unstinting_immovable_description,
            ),
            FactionRule(
                id = "raging_heat",
                imageRes = R.drawable.dire_avenger,
                title = "RAGING HEAT OF THE DYING FLAME",
                lore = R.string.raging_heat_lore,
                ruleText = R.string.raging_heat_description,
            ),

            FactionRule(
                id = "patient_blow",
                imageRes = R.drawable.striking_scorpion,
                title = "PATIENT STALK, SUDDEN BLOW",
                lore = R.string.patient_blow_lore,
                ruleText = R.string.patient_blow_description,
            ),
            FactionRule(
                id = "strike_and_fade",
                imageRes = R.drawable.striking_scorpion,
                title = "STRIKE AND FADE",
                lore = R.string.strike_and_fade_lore,
                ruleText = R.string.strike_and_fade_description,
            ),
            FactionRule(
                id = "scorpion_eye",
                imageRes = R.drawable.striking_scorpion,
                title = "SCORPION’S EYE",
                lore = R.string.scorpion_eye_lore,
                ruleText = R.string.scorpion_eye_description,
            ),
            FactionRule(
                id = "merciless_strikes",
                imageRes = R.drawable.striking_scorpion,
                title = "MERCILESS STRIKES",
                lore = R.string.merciless_strikes_lore,
                ruleText = R.string.merciless_strikes_description,
            ),
            FactionRule(
                id = "one_with_gloom",
                imageRes = R.drawable.striking_scorpion,
                title = "ONE WITH THE GLOOM",
                lore = R.string.one_with_gloom_lore,
                ruleText = R.string.one_with_gloom_description,
            ),
            FactionRule(
                id = "blades_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.blades_tokens
            ),
        ),



        "brood_brothers" to listOf(
            FactionRule(
                id = "brood_crossfire",
                title = "CROSSFIRE",
                lore = R.string.brood_crossfire_lore,
                ruleText = R.string.brood_crossfire_description,
            ),
            FactionRule(
                id = "brood_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.brood_tokens
            ),
        ),


        "canoptek_circle" to listOf(
            FactionRule(
                id = "obelisk_node_matrix",
                title = "OBELISK NODE MATRIX",
                lore = R.string.obelisk_node_matrix_lore,
                ruleText = R.string.obelisk_node_matrix_description,
                imageRes = R.drawable.canoptek_node

                ),
            FactionRule(
                id = "canoptek_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.canoptek_tokens
            ),

            ),


        //Wrecka Krew
        "wrecka_krew" to listOf(
            FactionRule(
                id = "wrecka_rampage",
                title = "WRECKA RAMPAGE",
                lore = R.string.wrecka_rampage_lore,
                ruleText = R.string.wrecka_rampage_description,

            ),
            FactionRule(
                id = "wrecka_tanked_up",
                title = "TANKED UP",
                lore = R.string.wrecka_tanked_up_lore,
                ruleText = R.string.wrecka_tanked_up_description,

                ),
            FactionRule(
                id = "wrecka_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.wrecka_krew_tokens
                ),

        ),



        //Chaos Cult
        "chaos_cult" to listOf(
            FactionRule(
                id = "accursed_gifts",
                title = "ACCURSED GIFTS",
                lore = R.string.accursed_gifts_lore,
                ruleText = R.string.accursed_gifts_description,
                ),
            FactionRule(
                id = "gift1",
                title = "1. Deformed Wings",
                lore = R.string.gift1_lore,
                ruleText = R.string.gift1_description,
            ),
            FactionRule(
                id = "gift2",
                title = "2. Fleet",
                lore = R.string.gift2_lore,
                ruleText = R.string.gift2_description,
            ),
            FactionRule(
                id = "gift3",
                title = "3. Chitinous",
                lore = R.string.gift3_lore,
                ruleText = R.string.gift3_description,
            ),
            FactionRule(
                id = "gift4",
                title = "4. Horned",
                lore = R.string.gift4_lore,
                ruleText = R.string.gift4_description,
            ),
            FactionRule(
                id = "gift5",
                title = "5. Sinewed",
                lore = R.string.gift5_lore,
                ruleText = R.string.gift5_description,
            ),
            FactionRule(
                id = "gift6",
                title = "6. Barbed",
                lore = R.string.gift6_lore,
                ruleText = R.string.gift6_description,
            ),
            FactionRule(
                id = "mutation",
                title = "MUTATION",
                lore = R.string.mutation_lore,
                ruleText = R.string.mutation_description,

                ),
        ),


        //Blooded
        "blooded" to listOf(
            FactionRule(
                id = "blooded",
                title = "BLOODED",
                lore = R.string.blooded_lore,
                ruleText = R.string.blooded_description,

                ),
            FactionRule(
                id = "blooded_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.blooded_tokens
            ),
        ),


        "fellgor_ravagers" to listOf(
            FactionRule(
                id = "frenzy",
                title = "FRENZY",
                lore = R.string.frenzy_lore,
                ruleText = R.string.frenzy_description,

                ),
            FactionRule(
                id = "fellgor_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.fellgor_tokens
            ),
        ),



        "gellepox_infected" to listOf(
            FactionRule(
                id = "techno_curse",
                title = "TECHNO-CURSE",
                lore = R.string.techno_curse_lore,
                ruleText = R.string.techno_curse_description,
                ),
            FactionRule(
                id = "barrelwarp",
                title = "Barrelwarp",
                lore = R.string.barrelwarp_lore,
                ruleText = R.string.barrelwarp_description,
            ),
            FactionRule(
                id = "screaming_rustpikes",
                title = "Screaming Rustspikes",
                lore = R.string.screaming_rustpikes_lore,
                ruleText = R.string.screaming_rustpikes_description,
            ),
            FactionRule(
                id = "viral_vox_static",
                title = "Viral Vox-static",
                lore = R.string.viral_vox_static_lore,
                ruleText = R.string.viral_vox_static_description,
            ),
            FactionRule(
                id = "faction_mutoid_vermin",
                title = "MUTOID VERMIN",
                lore = R.string.faction_mutoid_vermin_lore,
                ruleText = R.string.faction_mutoid_vermin_description,
            ),
            FactionRule(
                id = "nightmare_hulks",
                title = "NIGHTMARE HULKS",
                lore = R.string.nightmare_hulks_lore,
                ruleText = R.string.nightmare_hulks_description,
            ),
            FactionRule(
                id = "revoltingly_resilient",
                title = "REVOLTINGLY RESILIENT",
                lore = R.string.revoltingly_resilient_lore,
                ruleText = R.string.revoltingly_resilient_description,
            ),
        ),



        "goremongers" to listOf(
            FactionRule(
                id = "runes_of_khorne",
                title = "RUNES OF KHORNE",
                lore = R.string.runes_of_khorne_lore,
                ruleText = R.string.runes_of_khorne_description,
                ),
            FactionRule(
                id = "gore_tanks",
                title = "GORE TANKS",
                lore = R.string.gore_tanks_lore,
                ruleText = R.string.gore_tanks_description,
                imageRes = R.drawable.goremongers_bloodtank
            ),
            FactionRule(
                id = "sanguavitae",
                title = "SANGUAVITAE",
                lore = R.string.sanguavitae_lore,
                ruleText = R.string.sanguavitae_description,
            ),
            FactionRule(
                id = "goremongers_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.goremongers_tokens
            ),
        ),

        "legionaries" to listOf(
            FactionRule(
                id = "marks_of_chaos",
                title = "MARKS OF CHAOS",
                lore = R.string.marks_of_chaos_lore,
                ruleText = R.string.marks_of_chaos_description,
            ),
            FactionRule(
                id = "khorne",
                title = "KHORNE",
                lore = null,
                ruleText = R.string.khorne_description,
                imageRes = R.drawable.legio_khorne
            ),
            FactionRule(
                id = "nurgle",
                title = "NURGLE",
                lore = null,
                ruleText = R.string.nurgle_description,
                imageRes = R.drawable.legio_nurgle
            ),
            FactionRule(
                id = "slaanesh",
                title = "SLAANESH",
                lore = null,
                ruleText = R.string.slaanesh_description,
                imageRes = R.drawable.legio_slaanesh
            ),
            FactionRule(
                id = "tzeentch",
                title = "TZEENTCH",
                lore = null,
                ruleText = R.string.tzeentch_description,
                imageRes = R.drawable.legio_tzeentch
            ),
            FactionRule(
                id = "undivided",
                title = "UNDIVIDED",
                lore = null,
                ruleText = R.string.undivided_description,
                imageRes = R.drawable.legio_undivided
            ),
            FactionRule(
                id = "legionaries_astartes",
                title = "ASTARTES",
                lore = R.string.legionaries_astartes_lore,
                ruleText = R.string.legionaries_astartes_description
            ),
            FactionRule(
                id = "goremongers_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.legionaries_tokens
            ),
        ),






        "murderwing" to listOf(
            FactionRule(
                id = "jump_pack",
                title = "JUMP PACK",
                lore = R.string.jump_pack_lore,
                ruleText = R.string.jump_pack_description,
            ),
            FactionRule(
                id = "jump_pack_example",
                title = "JUMP PACK EXAMPLE",
                lore = null,
                ruleText = R.string.jump_pack_example_description,
                imageRes = R.drawable.jumpack
            ),
            FactionRule(
                id = "boost_actions",
                title = "BOOST ACTIONS",
                lore = R.string.boost_actions_lore,
                ruleText = R.string.boost_actions_description,
            ),
            FactionRule(
                id = "boost_action_example",
                title = "BOOST ACTIONS EXAMPLE",
                ruleText = R.string.boost_actions_description,
                imageRes = R.drawable.boost_action
            ),
            FactionRule(
                id = "murderwing_astartes",
                title = "ASTARTES",
                lore = R.string.murderwing_astartes_lore,
                ruleText = R.string.murderwing_astartes_description,
            ),
            FactionRule(
                id = "murderwing_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.murderwing_tokens
            ),
        ),



        "nemesis_claw" to listOf(
            FactionRule(
                id = "nemesis_astartes",
                title = "ASTARTES",
                lore = R.string.nemesis_astartes_lore,
                ruleText = R.string.nemesis_astartes_description,

                ),
            FactionRule(
                id = "in_midnight_clad",
                title = "IN MIDNIGHT CLAD",
                lore = R.string.in_midnight_clad_lore,
                ruleText = R.string.in_midnight_clad_description,

                ),
            FactionRule(
                id = "nemesis_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.nemesis_token
            ),
        ),


        "warpcoven" to listOf(
            FactionRule(
                id = "boons_of_tzeentch",
                title = "BOONS OF TZEENTCH",
                lore = R.string.boons_of_tzeentch_lore,
                ruleText = R.string.boons_of_tzeentch_description,

                ),
            FactionRule(
                id = "incorporeal_sight",
                title = "Incorporeal Sight",
                lore = R.string.incorporeal_sight_lore,
                ruleText = R.string.incorporeal_sight_description,

                ),
            FactionRule(
                id = "time_walk",
                title = "Time-Walk",
                lore = R.string.time_walk_lore,
                ruleText = R.string.time_walk_description,

                ),
            FactionRule(
                id = "warp_echoes",
                title = "Echoes from the Warp",
                lore = R.string.warp_echoes_lore,
                ruleText = R.string.warp_echoes_description,

                ),
            FactionRule(
                id = "warp_swell",
                title = "Warp Swell",
                lore = R.string.warp_swell_lore,
                ruleText = R.string.warp_swell_description,

                ),
            FactionRule(
                id = "mutant_appendage",
                title = "Mutant Appendage",
                lore = R.string.mutant_appendage_lore,
                ruleText = R.string.mutant_appendage_description,

                ),
            FactionRule(
                id = "immaterial_flight",
                title = "Immaterial Flight",
                lore = R.string.immaterial_flight_lore,
                ruleText = R.string.immaterial_flight_description,

                ),
            FactionRule(
                id = "twist_of_fate",
                title = "Twist of Fate",
                lore = R.string.twist_of_fate_lore,
                ruleText = R.string.twist_of_fate_description,

                ),
            FactionRule(
                id = "master_immaterium",
                title = "Master of the Immaterium",
                lore = R.string.master_immaterium_lore,
                ruleText = R.string.master_immaterium_description,

                ),
            FactionRule(
                id = "nemesis_astartes",
                title = "ASTARTES",
                lore = R.string.nemesis_astartes_lore,
                ruleText = R.string.nemesis_astartes_description,

                ),
            FactionRule(
                id = "warpcoven_astartes",
                title = "ASTARTES",
                lore = R.string.warpcoven_astartes_lore,
                ruleText = R.string.warpcoven_astartes_description,
            ),
        ),


        "plague_marines" to listOf(
            FactionRule(

                id = "plague_astartes",
                title = "ASTARTES",
                lore = R.string.plague_astartes_lore,
                ruleText = R.string.plague_astartes_description,

                ),
            FactionRule(
                id = "plague_posion",
                title = "POISON",
                lore = R.string.plague_poison_lore,
                ruleText = R.string.plague_poison_description,

                ),
            FactionRule(
                id = "disgustingly_resilient",
                title = "DISGUSTINGLY RESILIENT",
                lore = R.string.plague_disgustingly_resilent_lore,
                ruleText = R.string.plague_disgustingly_resilent_description,

                )
            ),




        )

    fun getForTeam(teamId: String): List<FactionRule> {
        return rulesByTeam[teamId].orEmpty()
    }
}
