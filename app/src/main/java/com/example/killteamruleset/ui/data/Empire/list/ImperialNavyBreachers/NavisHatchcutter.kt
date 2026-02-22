package com.example.killteamruleset.ui.data.Empire.list.ImperialNavyBreachers

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val NavisHatchcutter = Operative(
    name = "Navis Hatchcutter",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Autopistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Chainfist",
            type = WeaponType.MELEE,
            attacks = 4 ,
            hit = "4+",
            damage = "5/6",
            keywords = listOf(
                Brutal,
                Rending
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Weld Shut",
            usage = R.string.weld_shut_usage,
            description = R.string.weld_shut_description
        ),
        Ability(
            title = "Group Activation",
            usage = R.string.breach_point_usage,
            description = R.string.breach_point_description
        )
    ),


    keywords = listOf(
        "IMPERIAL NAVY BREACHER",
        "IMPERIUM",
        "HATCHCUTTER",
        "25MM"
    )
)