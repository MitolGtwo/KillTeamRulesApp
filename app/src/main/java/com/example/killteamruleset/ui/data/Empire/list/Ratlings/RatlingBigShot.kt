package com.example.killteamruleset.ui.data.Empire.list.Ratlings


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val RatlingBigShot = Operative(
    name = "Ratling Big Shot",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "5+",
        wounds = 6
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Tankstopper Rifle (mobile)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/4",
            keywords = listOf(
                Devastating(1),
                Heavy("Dash Only"),
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Sniper Rifle (stationary)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "4/2",
            keywords = listOf(
                Devastating(4),
                Heavy(""),
                Piercing(1),
                Severe
            )
        ),

        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "5+",
            damage = "1/2",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
    ),


    keywords = listOf(
        "RATLING",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "BIG SHOT",
        "28MM"
    )
)