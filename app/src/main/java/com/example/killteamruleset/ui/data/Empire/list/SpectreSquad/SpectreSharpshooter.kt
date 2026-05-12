package com.example.killteamruleset.ui.data.Empire.list.SpectreSquad

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val SpectreSharpshooter = Operative(
    name = "Spectre Sharpshooter",
    imageRes = R.drawable.spectral_sharpshooter,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Long-las (concealed)",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "2+",
            damage = "3/3",
            keywords = listOf(
                Devastating(3),
                Heavy(""),
                Silent,
                Concealed_Position
            )
        ),
        WeaponProfile(
            name = "Long-las (mobile)",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Long-las (stationary)",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "2+",
            damage = "3/3",
            keywords = listOf(
                Devastating(3),
                Heavy(""),
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
        ),
    ),

    abilities = listOf(
    ),

    keywords = listOf(
        "SPECTRE SQUAD",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "SHARPSHOOTER",
        "28MM"

    )
)
