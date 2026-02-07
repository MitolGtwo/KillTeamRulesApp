package com.example.killteamruleset.ui.data

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.FactionRule

object FactionRuleRepository {

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
                title = 0,
                lore = null,
                ruleText = null,
                imageRes = R.drawable.wrecka_krew_tokens
                ),

        )
    )

    fun getForTeam(teamId: String): List<FactionRule> {
        return rulesByTeam[teamId].orEmpty()
    }
}