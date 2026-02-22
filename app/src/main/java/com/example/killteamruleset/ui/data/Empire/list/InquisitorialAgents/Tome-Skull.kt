package com.example.killteamruleset.ui.data.Empire.list.InquisitorialAgents

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val TomeSkull = Operative(
    name = "Tome-Skull ",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "8\"",
        save = "5+",
        wounds = 5
    ),
    weapons = listOf(


    ),

    abilities = listOf(
        Ability(
            title = "Consecrated Tome",
            usage = R.string.consecrated_tome_usage,
            description = R.string.consecrated_tome_description
        ),

        Ability(
            title = "Machine",
            usage = R.string.navy_machine_usage,
            description = R.string.navy_machine_description
        ),
        Ability(
            title = "Expendable",
            usage = R.string.navy_expendable_usage,
            description = R.string.navy_expendable_description
        ),
        Ability(
            title = "Group Activation",
            usage = R.string.inquisitorial_group_activation_usage,
            description = R.string.inquisitorial_group_activation_description
        )
    ),


    keywords = listOf(
        "INQUISITORIAL AGENT",
        "IMPERIUM",
        "INQUISITION",
        "TOME-SKULL",
        "25MM"
    )
)