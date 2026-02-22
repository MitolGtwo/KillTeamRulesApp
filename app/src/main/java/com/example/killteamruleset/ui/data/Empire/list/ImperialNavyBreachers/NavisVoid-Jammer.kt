package com.example.killteamruleset.ui.data.Empire.list.ImperialNavyBreachers

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val NavisVoidjammer = Operative(
    name = "Navis Void-Jammer",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Gheistskull Detonator",
            type = WeaponType.RANGED,
            attacks =4 ,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Blast(1),
                Lethal(4),
                Limited(1),
                Silent,
                Stun
            ),
            extraRules = listOf("*Detonate")
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
            title = "Detonate",
            usage = R.string.navy_detonate_usage,
            description = R.string.navy_detonate_description
        ),
        Ability(
            title = "Interference Pulse",
            usage = R.string.interference_pulse_usage,
            description = R.string.interference_pulse_description
        ),
    ),


    keywords = listOf(
        "IMPERIAL NAVY BREACHER",
        "IMPERIUM",
        "VOID-JAMMER",
        "25MM"
    )
)