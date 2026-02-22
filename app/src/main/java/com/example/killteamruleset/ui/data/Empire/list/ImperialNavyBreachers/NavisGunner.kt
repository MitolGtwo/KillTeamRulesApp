package com.example.killteamruleset.ui.data.Empire.list.ImperialNavyBreachers

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val NavisGunner = Operative(
    name = "Navis Gunner",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Meltagun",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "6/3",
            keywords = listOf(
                Range(6),
                Devastating(4),
                Piercing(1),
            )
        ),
        WeaponProfile(
            name = "Navis las-volley (focused)",
            type = WeaponType.RANGED,
            attacks =5 ,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Heavy("Dash Only"),
                Rending
            )
        ),
        WeaponProfile(
            name = "Navis las-volley (sweeping)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Heavy("Dash Only"),
                Rending,
                Torrent(1)
            )
        ),
        WeaponProfile(
            name = "Plasma gun (standard)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "4/6",
            keywords = listOf(
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Plasma Gun (supercharge)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "5/6",
            keywords = listOf(
                Hot,
                Lethal(5),
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Gun Butt",
            type = WeaponType.MELEE,
            attacks = 3 ,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(

    ),


    keywords = listOf(
        "IMPERIAL NAVY BREACHER",
        "IMPERIUM",
        "GUNNER",
        "25MM"
    )
)