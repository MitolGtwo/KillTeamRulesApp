package com.example.killteamruleset.ui.data.Empire.list.Novitiates

import com.example.killteamruleset.ui.model.OperativeSelectionRule

val NovitiatesOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1 NOVITIATE SUPERIOR Operative with one of the following options:"
    ),

    OperativeSelectionRule(
        text = "• Plasma Pistol; Power Weapon",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "• Relic Boltgun; Gun Butt",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "• Relic Bolt Pistol; Power Weapon",
        indent = 1
    ),


    OperativeSelectionRule(
        text = "9 NOVITIATE Operatives selected from the following list:",
    ),
    OperativeSelectionRule(
        text = "CONDEMNOR",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "DIALOGUS",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "DUELLIST",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "EXACTOR",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "HOSPITALLER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "PENITENT",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "PRECEPTOR",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "PRONATUS",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "PURGATUS",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "RELIQUARIUS",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "MILITANT with one of the following options:",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "Autopistol; Novitiate Blade",
        indent = 2
    ),

    OperativeSelectionRule(
        text = "Autogun; Gun Butt",
        indent = 2
    ),


    OperativeSelectionRule(
        text = "Other than MILITANT and PURGATUS Operatives, your kill team can only include each" +
                " Operative on this list once. Your kill team can only include up to two PURGATUS" +
                " Operatives.",
        isFooter = true
    )
)
