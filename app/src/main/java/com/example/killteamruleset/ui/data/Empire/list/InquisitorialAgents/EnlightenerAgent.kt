package com.example.killteamruleset.ui.data.Empire.list.InquisitorialAgents


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val ElightenerAgent = Operative(
    name = "Elightener Agent",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Autopistol",
            type = WeaponType.RANGED,
            attacks = 4 ,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Paired Blades",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Balanced,
                Rending
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "No Escape",
            usage = R.string.no_escape_usage,
            description = R.string.no_escape_description
        ),
        Ability(
            title = "Extract",
            usage = R.string.extract_usage,
            description = R.string.extract_description
        )
    ),


    keywords = listOf(
        "INQUISITORIAL AGENT",
        "IMPERIUM",
        "INQUISITION",
        "ENLIGHTENER",
        "25MM"
    )
)