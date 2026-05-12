package com.example.killteamruleset.ui.data.Empire.list.SpectreSquad

import com.example.killteamruleset.ui.model.OperativeSelectionRule

val SpectreSquadOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1 SPECTRE SQUAD VETERAN SERGEANT"
    ),

    OperativeSelectionRule(
        text = " 1 SPECTRE SQUAD VOX-RELAY BEACON"
    ),

    OperativeSelectionRule(
        text = "9 SPECTRE SQUAD Operatives selected from the following list:",
    ),
    OperativeSelectionRule(
        text = "FIELD MEDICAE *",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "GRENADIER *",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "GUIDE *",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "GUNNER with one of the following options:",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Meltagun; fists",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "Plasma gun; fists",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "HEAVY GUNNER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "LOADER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "SHARPSHOOTER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "STUB-GUNNER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "VOX-TROOPER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "TROOPER *",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "VOX-OPERATOR *",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "Other than TROOPER operatives, your kill team can only include each operative on this " +
                "list once.\n" +
                "Operatives with * have one of the following options:\n" +
                "\n• Lasrifle; gun butt\n" +
                "\n• Lascarbine; gun butt",
        isFooter = true
    )
)
