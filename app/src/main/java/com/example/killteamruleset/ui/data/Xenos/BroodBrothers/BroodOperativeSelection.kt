package com.example.killteamruleset.ui.data.Xenos.BroodBrothers


import com.example.killteamruleset.ui.model.OperativeSelectionRule

val BroodOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1  BROOD BROTHER COMMANDER operative with one of the following options:"
    ),

    OperativeSelectionRule(
        text = "Bolt pistol; chainsword and claw",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Drum-fed autogun; bayonet",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Laspistol; power weapon and claw",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "9  BROOD BROTHER operatives selected from the following list:",
    ),


    OperativeSelectionRule(
        text = "AGITATOR",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "GUNNER with Bayonet and Flamer 1",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "GUNNER with Bayonet and Grenade Launcher 1",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "GUNNER with Bayonet and Meltagun 1",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "GUNNER with Bayonet and Plasma Gun 1",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "ICONWARD",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "KNIFE FIGHTER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "MEDIC",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "SAPPER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "SNIPER 1",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "TROOPER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "VETERAN",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "VOX-OPERATOR",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "3 BROOD BROTHER operatives selected from the following list 3"
    ),

    OperativeSelectionRule(
        text = "2 PSYCHIC FAMILIAR operatives (still counts as one selection)",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "MAGUS (counts as two selections) 2",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "PATRIARCH (counts as three selections) 2",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "PRIMUS (counts as two selections) 2",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "TROOPER",
        indent = 1
    ),


    OperativeSelectionRule(
        text = "Other than TROOPER Operatives, you kill team can only include each Operative on this list once.\n\n"+
                "You cannot select more than three of these Operatives 1 combined.\n" +
                "\n Your kill team can only include up to one\n" +
                "BROODCOVEN operative. If one of these\n" +
                "operatives is selected for deployment, your\n" +
                "COMMANDER operative loses the LEADER\n" +
                "keyword for the battle.\n" +
                "\n Up to three times, instead of selecting one of\n" +
                "these operatives, you can select one BROOD\n" +
                "BROTHER ploy to cost you 0CP for the battle.\n" +
                "Note that ‘counts as’ selections still apply; for\n" +
                "example, if you select a PATRIARCH operative,\n" +
                "you could not do this.",
        isFooter = true
    )
)
