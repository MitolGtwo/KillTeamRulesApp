package com.example.killteamruleset.ui.data.Empire.list.InquisitorialAgents


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val HexorcistAgent = Operative(
    name = "Hexorcist Agent",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Shotgun",
            type = WeaponType.RANGED,
            attacks = 4 ,
            hit = "3+",
            damage = "3/3",
            keywords = listOf(
                Range(6)
            )
        ),
        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Hexorcise",
            usage = R.string.hexorcise_usage,
            description = R.string.hexorcise_description
        ),
        Ability(
            title = "Chasten",
            usage = R.string.chasten_usage,
            description = R.string.chasten_description
        )
    ),


    keywords = listOf(
        "INQUISITORIAL AGENT",
        "IMPERIUM",
        "INQUISITION",
        "HEXORCIST",
        "25MM"
    )
)