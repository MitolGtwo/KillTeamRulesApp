package com.example.killteamruleset.ui.data.Chaos.Blooded


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val TraitorFlenser = Operative(
    name = "Traitor Flenser",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Skinning Blades",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Ceaseless
            ),
            extraRules = listOf("*Stalk")
        )
    ),

    abilities = listOf(
        Ability(
            title = "Stalk",
            usage = R.string.stalk_usage,
            description = R.string.stalk_description
        ),
        Ability(
            title = "Wretched",
            usage = R.string.wretched_usage,
            description = R.string.wretched_description
        ),
    ),
    keywords = listOf(
        "BLOODED",
        "CHAOS",
        "FLENSER",
        "25MM"
    )
)