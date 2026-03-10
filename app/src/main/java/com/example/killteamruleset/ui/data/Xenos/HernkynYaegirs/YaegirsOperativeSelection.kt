package com.example.killteamruleset.ui.data.Xenos.HernkynYaegirs



import com.example.killteamruleset.ui.model.OperativeSelectionRule


val YaegirsOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1 HERNKYN YAEGIR THEYN operative"
    ),
    OperativeSelectionRule(
        text = "9 HERNKYN YAEGIR operatives selected from the following list:"
    ),

    OperativeSelectionRule(
        text = "BLADEKYN",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "BOMBAST",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "GUNNER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "IRONBRAEK",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "RIFLEKYN",
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
        text = "○ Bolt revolver; plasma knife",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "○ Bolt shotgun; fists",
        indent = 2
    ),

    OperativeSelectionRule(
        text = "Other than WARRIOR operatives, your kill team\n" +
                "can only include each operative on this list once.",
        isFooter = true
    )
)
