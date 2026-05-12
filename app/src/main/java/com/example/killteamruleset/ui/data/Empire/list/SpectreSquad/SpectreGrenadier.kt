package com.example.killteamruleset.ui.data.Empire.list.SpectreSquad

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val SpectreGrenadier = Operative(
    name = "Spectre Grenadier",
    imageRes = R.drawable.spectral_grenadier,
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
            title = "Grenadier",
            usage = R.string.spectre_grenadier_usage,
            description = R.string.spectre_grenadier_description
        ),
        Ability(
            title = "Melta Mine",
            usage = R.string.melta_mine_usage,
            description = R.string.melta_mine_description
        ),
        Ability(
            title = "Proximity Mine",
            usage = R.string.proximity_mine_usage,
            description = R.string.proximity_mine_description
        ),
    ),

    keywords = listOf(
        "SPECTRE SQUAD",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "GRENADIER",
        "28MM"

    )
)
