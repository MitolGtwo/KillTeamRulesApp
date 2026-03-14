package com.example.killteamruleset.ui.data.Xenos.Wyrmblade

import com.example.killteamruleset.ui.model.OperativeSelectionRule


val WyrmbladeOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = " 1 WYRMBLADE NEOPHYTE LEADER operative with one of the following options:"
    ),
    OperativeSelectionRule(
        text = "Autogun; gun butt",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Shotgun; gun butt",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Bolt pistol, master-crafted autopistol or web pistol",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Chainsword, power maul or power pick",
        indent = 1
    ),


    OperativeSelectionRule(
        text = " 13 WYRMBLADE operatives selected from the following list:"
    ),
    OperativeSelectionRule(
        text = "KELERMORPH *",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "LOCUS *",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "GUNNER with flamer and gun butt",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "GUNNER with webber and gun butt",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "HEAVY GUNNER with heavy stubber and gun butt",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "HEAVY GUNNER with mining laser and gun butt",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "HEAVY GUNNER with seismic cannon and gun butt",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "CON BEARER with one of the following options:",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Autogun; gun butt",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "Shotgun; gun butt",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "WARRIOR",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "SANCTUS SNIPER *",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "SANCTUS TALON *",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "WARRIOR with one of the following options:",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Autogun; gun butt",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "Shotgun; gun butt",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "Other than WARRIOR operatives, your kill team\n" +
                "can only include each operative on this list once.\n" +
                "Your kill team can only include up to two GUNNER\n" +
                "operatives, up to two HEAVY GUNNER operatives\n" +
                "and up to two CULT AGENT operatives.\n" +
                "\nThese operatives * count as two selections each.",
        isFooter = true
    )
)
