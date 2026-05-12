package com.example.killteamruleset.ui.data.Empire.list.SpectreSquad

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val SpectreGuide = Operative(
    name = "Spectre Guide",
    imageRes = R.drawable.spectral_guide,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Lascarbine",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "2/3",
            keywords = listOf(
                Rending
            )
        ),
        WeaponProfile(
            name = "Lasrifle",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "2/3",
            keywords = listOf(
                Heavy("Reposition Only"),
                Lethal(5)
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
        Ability(
            title = "Prepared Killzone",
            usage = R.string.prepared_killzone_usage,
            description = R.string.prepared_killzone_description
        ),
        Ability(
            title = "Scout Terrain",
            usage = R.string.scout_terrain_usage,
            description = R.string.scout_terrain_description
        )
    ),

    keywords = listOf(
        "SPECTRE SQUAD",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "GUIDE",
        "28MM"

    )
)
