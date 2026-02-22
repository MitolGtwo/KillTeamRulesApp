package com.example.killteamruleset.ui.data.Empire.list.InquisitorialAgents


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val TempestusScionGunner = Operative(
    name = "Tempestus Scion Gunner",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Flamer",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "3/3",
            keywords = listOf(
                Range(8),
                Saturate,
                Torrent(2)
            )
        ),
        WeaponProfile(
            name = "Grenade Launcher (frag)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "2/4",
            keywords = listOf(
                Blast(2)
            )
        ),
        WeaponProfile(
            name = "Grenade Launcher (krak)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Hot-shot Volley Gun (focused)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Piercing_Crits(1)
            )
        ),
        WeaponProfile(
            name = "Hot-shot Volley Gun (sweeping)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Piercing_Crits(1),
                Torrent(1)
            )
        ),
        WeaponProfile(
            name = "Meltagun",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "6/3",
            keywords = listOf(
                Range(6),
                Devastating(4),
                Piercing(2)
            )
        ),
        WeaponProfile(
            name = "Plasma Gun (standard)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Plasma Gun (supercharge)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
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
            attacks = 3,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(

    ),


    keywords = listOf(
        "INQUISITORIAL AGENT",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "TEMPESTUS SCION",
        "GUNNER",
        "25MM"
    )
)