package com.example.killteamruleset.ui.data.Empire.list.BattleClade

import com.example.killteamruleset.ui.model.OperativeSelectionRule


val BattlecladeOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1 BATTLECLADE Technoarcheologist Operative"
    ),

    OperativeSelectionRule(
        text = "1 BATTLECLADE Servitor Underseer Operative"
    ),


    OperativeSelectionRule(
        text = "8 BATTLECLADE Operatives selected from the following list:",
    ),
    OperativeSelectionRule(
        text = "AUTO-PROXY SERVITOR",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "BREACHER SERVITOR",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "COMBAT SERVITOR with one of the following options",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Servo-Claw; Incendine Ignited",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "Servo-Claw; Meltagun",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "Servo-Claw; Phosphor blaster",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "GUN SERVITOR with Heavy Arc Rifle and Augmetic Claw",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "GUN SERVITOR with Heavy Bolter and Augmetic Claw",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "TECHNOMEDIC SERVITOR ",
        indent = 1
    ),



    OperativeSelectionRule(
        text = "Other than COMBAT SERVITOR Operatives, your kill team can only include each Operative on this list once." +
                "Your kill team can only include up to one COMBAT SERVITOR with Meltagun and up to three with" +
                "Incendine Igniter.",
        isFooter = true
    )
)
