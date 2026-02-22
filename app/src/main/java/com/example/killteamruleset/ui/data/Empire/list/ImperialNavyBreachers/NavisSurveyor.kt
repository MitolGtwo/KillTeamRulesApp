package com.example.killteamruleset.ui.data.Empire.list.ImperialNavyBreachers

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val NavisSurveyor = Operative(
    name = "Navis Surveyor",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
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
            title = "Wayfind",
            usage = R.string.wayfind_usage,
            description = R.string.wayfind_description
        ),
        Ability(
            title = "Remote Control",
            usage = R.string.remote_control_usage,
            description = R.string.remote_control_description
        ),
    ),


    keywords = listOf(
        "IMPERIAL NAVY BREACHER",
        "IMPERIUM",
        "SURVEYOR",
        "25MM"
    )
)