package com.example.killteamruleset.ui.data.Xenos.CanoptekCircle

import com.example.killteamruleset.ui.model.OperativeSelectionRule


val CanoptekOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1 CANOPTEK CIRCLE GEOMANCER operative"
    ),
    OperativeSelectionRule(
        text = "2 CANOPTEK CIRCLE TOMB CRAWLER operatives with one of the following options\n" +
                "(select separately for each):"
    ),
    OperativeSelectionRule(
        text = "Twin Gauss Reapers; Claws",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Transdimensional Isolator; Claws *",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "1 CANOPTEK CIRCLE ACCELERATOR operative"
    ),
    OperativeSelectionRule(
        text = "1 CANOPTEK CIRCLE REANIMATOR operative"
    ),
    OperativeSelectionRule(
        text = "3 CANOPTEK CIRCLE WARRIOR operatives with one of the following options (select\n" +
                "separately for each):"
    ),

    OperativeSelectionRule(
        text = "Gauss Scalpel; Claws & Tail",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "Tesla Caster; Claws & Tail",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "Your kill team can only include up to one * transdimensional isolator.",
        isFooter = true
    )
)
