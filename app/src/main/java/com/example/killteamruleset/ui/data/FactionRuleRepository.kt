package com.example.killteamruleset.ui.data

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.FactionRule

object FactionRuleRepository {

    
    private val rulesByTeam = mapOf(
        //AoD
         "wrecka_krew" to listOf(
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
