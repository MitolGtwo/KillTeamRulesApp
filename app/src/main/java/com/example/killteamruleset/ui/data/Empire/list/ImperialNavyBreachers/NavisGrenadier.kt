package com.example.killteamruleset.ui.data.Empire.list.ImperialNavyBreachers

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val NavisGrenadier = Operative(
    name = "Navis Grenadier",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Demolition Charge",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Range(3),
                Blast(2),
                Heavy("Reposition Only"),
                Limited(1),
                Piercing(1),
                Saturate
            )
        ),
        WeaponProfile(
            name = "Navis Shotgun (short range)",
            type = WeaponType.RANGED,
            attacks =4 ,
            hit = "3+",
            damage = "3/3",
            keywords = listOf(
                Range(6),
            )
        ),
        WeaponProfile(
            name = "Navis Shotgun (long range)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "5+",
            damage = "1/2",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Navis Hatchet",
            type = WeaponType.MELEE,
            attacks = 3 ,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Grenadier",
            usage = R.string.navy_grenadier_usage,
            description = R.string.navy_grenadier_description
        )
    ),


    keywords = listOf(
        "IMPERIAL NAVY BREACHER",
        "IMPERIUM",
        "GRENADIER",
        "25MM"
    )
)