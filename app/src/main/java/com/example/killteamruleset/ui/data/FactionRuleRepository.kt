package com.example.killteamruleset.ui.data

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.FactionRule

object FactionRuleRepository {

    private val rulesByTeam = mapOf(
        "wrecka_krew" to listOf(
            FactionRule(
                id = "wrecka_rampage",
                title = "WRECKA RAMPAGE",
                lore = "The sound of explosions, thea acrid stench of smoke and screams of battle drive" +
                        " Wrecka Krews forwards to ever more destructive acts.",
                ruleText = "Whenever a friendly **WRECKA KREW** Operative is shooting, fighting or" +
                        " retaliating in the Roll Attack Dice step:\n\n•For each attack dice result " +
                        "of 6 you retain, you gain one Wrecka point.\n•You can spend up to 3 of " +
                        "your Wrecka points (unless it’s a **BOMB SQUIG**). For each point you spend this"+
                        " way, retain one of your fails as a normal success instead of discarding it.\n\n" +
                        "You cannot have more than 6 Wrecka points at once. You can gain and spend " +
                        "Wrecka points during the same action and can do so in an order of your choice," +
                        "unless you started the action with 6, in which case you can " +
                        "only spend them.",

            ),
            FactionRule(
                id = "wrecka_rampage",
                title = "TANKED UP",
                lore = "Wrecka Krews are empowered by by the thrill of explosive combat, lending them" +
                        " fresh impetus as they undertake their murderous rampages.",
                ruleText = "The first time a friendly **WRECKA KREW** Operative (excluding **BOMB SGUIG**) " +
                        "that has an Engage order performs either the **Charge**, **Shoot** or **Fight** action" +
                        " (excluding **Guard**) during each of its activations/counteractions, add 1 to" +
                        " its APL stat until the start of its next activation",

                ),
            FactionRule(
                id = "wrecka_markers",
                title = "Token Guide",
                lore = null,
                ruleText = "",
                imageRes = R.drawable.wrecka_krew_tokens
                ),

        )
    )

    fun getForTeam(teamId: String): List<FactionRule> {
        return rulesByTeam[teamId].orEmpty()
    }
}