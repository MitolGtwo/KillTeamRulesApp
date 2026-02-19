package com.example.killteamruleset.ui.data

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.FactionRule

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
                id = "benedictions",
                title = "BENEDICTIONS",
                lore = R.string.benedictions_lore,
                ruleText = R.string.benedictions_description,

                ),
             
              FactionRule(
                id = "weapons_of_the_witch_hunters",
                title = "WEAPONS OF THE WITCH HUNTERS",
                lore = R.string.weapons_of_the_witch_hunters_lore,
                ruleText = R.string.weapons_of_the_witch_hunters_description,

                ),

               FactionRule(
                id = "inspiration",
                title = INSPIRATION",
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
