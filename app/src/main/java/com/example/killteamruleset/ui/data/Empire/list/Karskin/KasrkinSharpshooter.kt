package com.example.killteamruleset.ui.data.Empire.list.Karskin

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val KasrkinSharpshooter = Operative(
    name = "Kasrkin Sharpshooter",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Hot-shot Marksman Rifle (concealed)",
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
            name = "Hot-shot Marksman Rifle (mobile)",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Hot-shot Marksman Rifle (stationary)",
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
            hit = "3+",
            damage = "2/3",
            keywords = listOf(
            )
        ),

        ),

    abilities = listOf(
        Ability(
            title = "Camo Cloak",
            usage = R.string.camo_cloak_usage,
            description = R.string.camo_cloak_description
        ),
        Ability(
            title = "Auspex Scan",
            usage = R.string.kasrkin_auspex_scan_usage,
            description = R.string.kasrkin_auspex_scan_description
        )
    ),

    keywords = listOf(
        "KASRKIN",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "SHARPSHOOTER",
        "28MM"

    )
)