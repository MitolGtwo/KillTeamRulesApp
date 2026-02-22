package com.example.killteamruleset.ui.data.Empire.list.ImperialNavyBreachers

import com.example.killteamruleset.ui.model.OperativeSelectionRule

val NavisOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1 IMPERIAL NAVY BREACHER SERGEANT AT-ARMS Operative with one of the following:"
    ),

    OperativeSelectionRule(
        text = "•Navis Shotgun and Navis Hatchet",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Or one option from each of the following"
    ),

    OperativeSelectionRule(
        text = "• Bolt Pistol or Heirloom Autopistol",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "• Chainsword or Power Weapon",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "10 IMPERIAL NAVY BREACHER Operatives selected from the following list",
    ),

    OperativeSelectionRule(
        text = "• ARMSMAN",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "• AXEJACK",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "• C.A.T. UNIT*",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "• ENDURANT",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "• GHEISTSKULL*",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "• GRENADIER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "•GUNNER with Navis las-Volley and Gun Butt",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "•GUNNER with Meltagun and Gun Butt",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "•GUNNER with Plasma gun and Gun Butt",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "• HATCHCUTTER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "• SURVEYOR",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "• VOID-JAMMER",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "Other than ARMSMAN Operatives, your kill team can only include each Operative" +
                " on this list once. Your kill team can only include up to two GUNNER Operatives.\n" +
                "\nYour kill team can only incluse a GHEISTSKULL Operative if it also includes a" +
                " VOID-JAMMER Operative, and it can only include a C.A.T. UNIT Operative if it also" +
                " includes a SURVEYOR Operative.\n" +
                "\n* These Operatives count as half a selection each, meaning you can select both" +
                " of them and its treated as one selection in total.",
        isFooter = true
    )
)
