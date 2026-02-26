package com.example.killteamruleset.ui.data.Chaos.Blooded


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val TraitorThug = Operative(
    name = "Traitor Thug",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 7
    ),
    weapons = listOf(

        WeaponProfile(
            name = "Heavy Club",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/4",
            keywords = listOf(
                Brutal
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Tough",
            usage = R.string.tough_usage,
            description = R.string.tough_description
        )
    ),
    keywords = listOf(
        "BLOODED",
        "CHAOS",
        "THUG",
        "25MM"
    )
)