package com.example.killteamruleset.ui.data

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.FactionRule
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Silent
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

                ),
            FactionRule(
                id = "wrecka_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.wrecka_krew_tokens
                ),

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
                id = "wrecka_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.wrecka_krew_tokens
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
                id = "wrecka_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.wrecka_krew_tokens
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
                id = "wrecka_markers",
                title =null,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.wrecka_krew_tokens
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
            )
            )

    fun getForTeam(teamId: String): List<FactionRule> {
        return rulesByTeam[teamId].orEmpty()
    }
}
