package com.example.killteamruleset.ui.data.Empire.list.SpectreSquad

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val SpectreStubGunner = Operative(
    name = "Spectre Stub-Gunner",
    imageRes = R.drawable.karskin_recon,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Autostubber (focused)",
            type = WeaponType.RANGED,
            attacks =5,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Heavy("Dash Only")
            )
        ),
        WeaponProfile(
            name = "Autostubber (suppressive)",
            type = WeaponType.RANGED,
            attacks =5,
            hit = "5+",
            damage = "0/0",
            keywords = listOf(
                Heavy(""),
                Lethal(5),
                Seek_light,
                Torrent(1)
            )
        ),
        WeaponProfile(
            name = "Autostubber (sweeping)",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Heavy("Dash Only"),
                Torrent(1)
            )
        ),

        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        ),
        ),

    abilities = listOf(
        Ability(
            title = "Suppressive Fire",
            usage = R.string.suppresive_fire_usage,
            description = R.string.suppresive_fire_description
        )
    ),

    keywords = listOf(
        "SPECTRE SQUAD",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "STUB-GUNNER",
        "28MM"

    )
)
