package com.example.killteamruleset.ui.data

import com.example.killteamruleset.ui.model.Ploy
import com.example.killteamruleset.ui.model.PloyType

object PloyRepository {

    private val ploysByTeam = mapOf(
        "wrecka_krew" to listOf(
            // ── STRATEGY ──
            Ploy(
                id = "waaagh",
                name = "WAAAGH!",
                type = PloyType.STRATEGY,
                lore = "When the Wrecka Krew´s violent rampage reaches its crescendo, a rage overcomes" +
                        " them. They bellow the infamous Ork battle cry as they set upon their enemies" +
                        " with hammer and fist.",
                description = "Friendly **WRECKA KREW** Operatives´ melee weapons have the Balanced" +
                        " weapon rule."
            ),
            Ploy(
                id = "tuff_gitz",
                name = "TUFF GITZ",
                type = PloyType.STRATEGY,
                lore = "Wrecka Krews don´t have time for mukkin´ about. They´ll gladly take a hit" +
                        " if it means they get to land a few of their own.",
                description = "Whenever an Operative is shooting a friendly **WRECKA KREW** Operative" +
                        " that has an **Engage** order, you can re-roll one of you defense dice."
            ),
            Ploy(
                id = "destruction",
                name = "DESTRUCTION",
                type = PloyType.STRATEGY,
                lore = "If an enemy takes cover, this just proves Wrecka krews with the opportunity" +
                        " to blow more stuff up.",
                description = "Friendly **WRECKA KREW** Operatives´ ranged weapons have the Saturate" +
                        " weapon rule."
            ),
            Ploy(
                id = "amped_up",
                name = "AMPED UP",
                type = PloyType.STRATEGY,
                lore = "Orks thrive in the chaos and cacophony of battle. The greater the explosions" +
                        " and destruction around them, the more their adrenaline kicks in. When whipped" +
                        " up into such a fury, they can fight on through injuries that would ordinarily" +
                        " lay them low.",
                description = "Each friendly **WRECKA KREW** Operative that has an **Engage** order" +
                        " can immediately regain up to D3+1 lost wounds (roll separately for each)."
            ),


            // ── FIREFIGHT ──
            Ploy(
                id = "demolition_job",
                name = "DEMOLITION JOB",
                type = PloyType.FIREFIGHT,
                lore = "Should a prime target present itself, the Wrecka Krew will unleash their" +
                        " combined destructive might, demolishing anything in the vicinity.",
                description = "Use this firefight ploy after a friendly **WRECKA KREW** Operative" +
                        " performs the **Shoot** or **Fight** action; just before incapacitated" +
                        " Operatives are removed (if any). Place one of your Demolition markers within" +
                        " the target´s control range (if it´s using a Blast weapon, the primary target)." +
                        " Whenever a friendly **WRECKA KREW** Operative (excluding BOMB **SQUIG**)" +
                        " is shooting against, fighting against, or retaliating against an Operative" +
                        " that´s within 3\" of that marker, you can spend a Wrecka pont for free (" +
                        "even if you have none). In the Ready step of the next Strategy phase, remove" +
                        " that marker."
            ),
            Ploy(
                    id = "proppa_scrap",
            name = "PROPPA SCRAP",
            type = PloyType.FIREFIGHT,
            lore = "Orks like nothing better than a good scrap. With fist or hammer, they seek to" +
                    " demonstrate that might is right.",
            description = "Use this firefight ploy during a **WRECKA KREW BREAKKA BOY** or **WRECKA" +
                    " KREW BOSS NOB** Operative´s activation. During that activation, that Operative" +
                    " can perform two **Fight** actions."
            ),
            Ploy(
                id = "kaboom",
                name = "KABOOM!",
                type = PloyType.FIREFIGHT,
                lore = "The more intense the dakka and the louder the boom explosions, the more" +
                        " satisfying the carnage!",
                description = "Use this firefight ploy when a friendly **WRECKA KREW** Operative" +
                        " performs the **Shoot** action and a weapon with Blast is selected. Until" +
                        " the end of that action, add 1\" to that Blast range, and it has the Severe" +
                        " weapon rule when shooting the primary target. You cannot use this ploy and" +
                        " the **Drill Rokkits** rule, note that Severe as not being a natural 6, doesn´t" +
                        " generate Wrecka points."
            ),
            Ploy(
                id = "just_a_scratch",
                name = "JUST A SCRATCH",
                type = PloyType.FIREFIGHT,
                lore = "The favorite for Ork players, Orks have a remarkable ability to shrug off" +
                        " grievous damage that would incapacitate most other creatures.",
                description = "Use this firefight ploy when an attack dice inflicts Normal Dmg on a friendly" +
                        " **WRECKA KREW** Operative (excluding **BOMB SQUIG**). ignore that inflicted" +
                        " damage."
            )


        )
    )

    fun getForTeam(teamId: String): List<Ploy> =
        ploysByTeam[teamId].orEmpty()
}