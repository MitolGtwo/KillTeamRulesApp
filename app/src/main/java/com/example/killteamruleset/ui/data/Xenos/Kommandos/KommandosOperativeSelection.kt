package com.example.killteamruleset.ui.data.Xenos.Kommandos

import com.example.killteamruleset.ui.model.OperativeSelectionRule


val KommandosOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = " 1 KOMMANDO BOSS NOB operative with one of the following options:"
    ),
    OperativeSelectionRule(
        text = "Slugga; big choppa",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Slugga; power klaw",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "9 KOMMANDO operatives selected from the following list:"
    ),

    OperativeSelectionRule(
        text = "BOMB SQUIG *",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "BOY",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "BREACHA BOY",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "BURNA BOY",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "COMMS BOY",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "DAKKA BOY",
        indent = 1
    ),    OperativeSelectionRule(
        text = "GROT *",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "ROKKIT BOY",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "SLASHA BOY",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "SNIPA BOY",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "Other than BOY operatives, your kill team can\n" +
                "only include each operative on this list once.\n" +
                "\nThese operatives * count as half a selection each,\n" +
                "meaning you can select both of them and it’s\n" +
                "treated as one selection in total.",
        isFooter = true
    )
)
