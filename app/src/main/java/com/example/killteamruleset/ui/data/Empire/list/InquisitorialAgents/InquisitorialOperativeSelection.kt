package com.example.killteamruleset.ui.data.Empire.list.InquisitorialAgents


import com.example.killteamruleset.ui.model.OperativeSelectionRule

val InquisitorialOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1 INQUISITORIAL AGENT INTERROGATOR Operative"
    ),
    OperativeSelectionRule(
        text = "1 INQUISITORIAL AGENT TOME-SKULL Operative"
    ),

    OperativeSelectionRule(
        text = "5 INQUISITORIAL AGENT Operatives selected from the following list:"
    ),

    OperativeSelectionRule(
        text = "• AUTOSAVANT",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "• QUESTKEEPER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "• DEATH WORLD VETERAN",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "• ENLIGHTENER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "• HEXORCIST",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "• MYSTIC",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "• PENAL LEGIONNAIRE",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "• PISTOLIER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "• GUN SERVITOR with one of the following options:",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Heavy Bolter; Servo Claw",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "Multi-melta; Servo Claw",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "Plasma Cannon; Servo Claw",
        indent = 2
    ),

    OperativeSelectionRule(
        text = "5 INQUISITORIAL AGENT REQUISITIONED Operatives selected from the faction rule " +
                "list, from the same group, you cannot select multiple Operatives from different" +
                " groups.\n" +
                "\nYour kill team can only include each operative " +
                "on this list once, unless youa re not including any " +
                "REQUISITIONED operatives, in which case you " +
                "can include up to two GUN SERVITOR operatives, " +
                "but each one must have different options. " +
                "Your kill team (including any REQUISITIONED " +
                "operatives) cannot include more than one " +
                "weapon with the Piercing 2 weapon rule, and " +
                "cannot include more than three weapons with the " +
                "Piercing X (excluding Piercing Crits X) weapon " +
                "rule combined."
    ),


    OperativeSelectionRule(
        text = "",
        isFooter = true
    )
)
