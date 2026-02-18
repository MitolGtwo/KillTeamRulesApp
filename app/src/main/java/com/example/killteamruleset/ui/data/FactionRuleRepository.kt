package com.example.killteamruleset.ui.data

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.FactionRule

object FactionRuleRepository {

    //Wrecka Krew
    private val rulesByTeam = mapOf(
        "wrecka_krew" to listOf(
            FactionRule(
                id = "wrecka_rampage",
                title = R.string.wrecka_rampage,
                lore = R.string.wrecka_rampage_lore,
                ruleText = R.string.wrecka_rampage_description,

            ),
            FactionRule(
                id = "wrecka_tanked_up",
                title = R.string.wrecka_tanked_up,
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
                title = R.string.plague_astartes,
                lore = R.string.plague_astartes_lore,
                ruleText = R.string.plague_astartes_description,

                ),
            FactionRule(
                id = "plague_posion",
                title = R.string.plague_poison,
                lore = R.string.plague_poison_lore,
                ruleText = R.string.plague_poison_description,

                ),
            FactionRule(
                id = "disgustingly_resilient",
                title = R.string.plague_disgustingly_resilent,
                lore = R.string.plague_disgustingly_resilent_lore,
                ruleText = R.string.plague_disgustingly_resilent_description,

                )
            )
            )

    fun getForTeam(teamId: String): List<FactionRule> {
        return rulesByTeam[teamId].orEmpty()
    }
}