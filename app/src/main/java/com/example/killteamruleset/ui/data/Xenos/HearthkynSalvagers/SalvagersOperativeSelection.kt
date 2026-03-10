package com.example.killteamruleset.ui.data.Xenos.HearthkynSalvagers


import com.example.killteamruleset.ui.model.OperativeSelectionRule


val SalvagersOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1 HEARTHKYN SALVAGER THEYN operative with one option from each of the following:"
    ),
    OperativeSelectionRule(
        text = " Autoch-pattern bolt pistol, Autoch-pattern\n" +
                "bolter, bolt revolver, EtaCarn plasma pistol,\n" +
                "ion blaster or ion pistol",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Concussion gauntlet or Plasma weapon",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "9 HEARTHKYN SALVAGER operatives selected from the following list:"
    ),

    OperativeSelectionRule(
        text = "DÔZR",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "FIELD MEDIC",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "GRENADIER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "GUNNER with one of the following options:",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "EtaCarn plasma beamer; fists",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "HYLas auto rifle; fists",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "HYLas rotary cannon; fists",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "L7 missile launcher; fists",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "Magna rail rifle; fists",
        indent = 2
    ),

    OperativeSelectionRule(
        text = "JUMP PACK WARRIOR",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "KINLYNK *",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "KOGNITÂAR *",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "LOKÂTR *",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "LUGGER *",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "WARRIOR *",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "Other than GUNNER and WARRIOR operatives,\n" +
                "your kill team can only include each operative on\n" +
                "this list once. Your kill team can only include up\n" +
                "to three GUNNER operatives (each must have a\n" +
                "different option).\n" +
                "\nOperatives with his * have to select one the the following options:\n" +
                "• Autoch-pattern bolter; fists\n" +
                "• Ion blaster; fists",
        isFooter = true
    )
)
