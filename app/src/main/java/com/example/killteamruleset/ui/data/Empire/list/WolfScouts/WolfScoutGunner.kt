package com.example.killteamruleset.ui.data.Empire.list.WolfScouts


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val WolfScoutGunner= Operative(
    name = "Wolf Scout Gunner",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "3+",
        wounds = 13
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Plasma Gun (standard)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Piercing(1),
            )
        ),
        WeaponProfile(
            name = "Plasma gun (supercharge)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "5/6",
            keywords = listOf(
                Hot,
                Lethal(5),
                Piercing(1),
            )
        ),
        WeaponProfile(
            name = "Combat Blade",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Tempest’s Fury",
            usage = R.string.tempest_fury_usage,
            description = R.string.tempest_fury_description
        ),

    ),


    keywords = listOf(
        "WOLF SCOUT",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "SPACE WOLVES",
        "GUNNER",
        "32MM"
    )
)
