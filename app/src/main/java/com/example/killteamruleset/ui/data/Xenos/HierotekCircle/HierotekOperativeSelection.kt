package com.example.killteamruleset.ui.data.Xenos.HierotekCircle


import com.example.killteamruleset.ui.model.OperativeSelectionRule


val HierotekOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1 HIEROTEK CIRCLE operative selected from the following list:"
    ),
    OperativeSelectionRule(
        text = "CHRONOMANCER operative with one of the following options:",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "○ Aeonstave",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "○ Entropic lance",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "PSYCHOMANCER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "TECHNOMANCER",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "1 PLASMACYTE ACCELERATOR operative"
    ),
    OperativeSelectionRule(
        text = "1 PLASMACYTE REANIMATOR operative"
    ),
    OperativeSelectionRule(
        text = "5 HIEROTEK CIRCLE operatives selected from the following list:"
    ),

    OperativeSelectionRule(
        text = "APPRENTEK",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "DEATHMARK",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "DESPOTEK",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "○ Gauss blaster; bayonet",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "○ Tesla carbine; bayonet",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "GUARDIAN with one of the following options:",
        indent = 1
    ),    OperativeSelectionRule(
        text = "○ Gauss blaster; bayonet",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "○ Tesla carbine; bayonet",
        indent = 2
    ),

    OperativeSelectionRule(
        text = "Other than DEATHMARK and GUARDIAN\n" +
                "operatives, your kill team can only include each\n" +
                "operative on this list once.",
        isFooter = true
    )
)
