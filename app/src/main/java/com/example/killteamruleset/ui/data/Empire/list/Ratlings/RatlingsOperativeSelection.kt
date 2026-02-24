package com.example.killteamruleset.ui.data.Empire.list.Ratlings


import com.example.killteamruleset.ui.model.OperativeSelectionRule

val RatlingsOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1 RATLING FIXER Operative with one of the following option:"
    ),

    OperativeSelectionRule(
        text = "• Battle Rifle; Fists ",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "• Sniper Rifle; Fists",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "10 RATLING Operatives selected from the following list:",
    ),
    OperativeSelectionRule(
        text = "BATTLEMUTT",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "BULLGRYN* with one option from each of the following:",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "○ Grenadier Gauntlet or Power Maul",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "○ Brute Shield or Slabshield",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "OGRYN",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "BIG SHOT",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "BOMBER",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "HARDBIT",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "RAIDER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "SNEAK",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "SNIPER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "SPOTTER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "STASHMASTER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "VOX-THIEF",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "Other than BULLGRYN, OGRYN and SNIPER Operatives, your kill team can only include" +
                " each Operative on this list once.\n* You cannot select more than three of" +
                " these Operatives combined. Up to three times, instead of selecting one of" +
                " these Operatives, you can select on RATLING ploy to cost you 0CP for the battle. ",
        isFooter = true
    )
)