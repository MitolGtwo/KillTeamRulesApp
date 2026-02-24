package com.example.killteamruleset.ui.data.Empire.list.ScoutSquad


import com.example.killteamruleset.ui.model.OperativeSelectionRule

val ScoutOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1 SCOUT SQUAD SERGEANT Operative with one of the following options"
    ),

    OperativeSelectionRule(
        text = "Astartes Shotgun; Fists",
        indent = 2
    ),

    OperativeSelectionRule(
        text = "Boltgun; Fists",
        indent = 2
    ),

    OperativeSelectionRule(
        text = "Bolt Pistol; Chainsword",
        indent = 2
    ),

    OperativeSelectionRule(
        text = "8 SCOUT SQUAD Operatives selected from the following list:",
    ),
    OperativeSelectionRule(
        text = "HEAVY GUNNER with Fists, Bolt Pistol and Heavy Bolter",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "HEAVY GUNNER with Fists, Bolt Pistol and Missile Launcher",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "HUNTER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "SNIPER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "TRACKER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "WARRIOR with one of the following options:",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Astartes Shotgun; Fists",
        indent = 2
    ),

    OperativeSelectionRule(
        text = "Boltgun; Fists",
        indent = 2
    ),

    OperativeSelectionRule(
        text = "Bolt Pistol; Chainsword",
        indent = 2
    ),

    OperativeSelectionRule(
        text = "Other than WARRIOR Operatives, your kill team can only include each Operative" +
                " on this list once.",
        isFooter = true
    )
)