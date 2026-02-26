package com.example.killteamruleset.ui.data.Chaos.Blooded

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val TraitorBrimstoneGrenadier = Operative(
    name = "Traitor Brimstone Grenadier",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Diabolyk Bomb",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "4/3",
            keywords = listOf(
                Range(6),
                Blast(2),
                Devastating(2),
                Limited(1),
                Heavy("Reposition Only"),
                Piercing(1),
                Saturate
            )
        ),
        WeaponProfile(
            name = "Lasgun",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Bayonet",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Grenadier",
            usage = R.string.blooded_grenadier_usage,
            description = R.string.blooded_grenadier_description
        ),
        Ability(
            title = "Explosive Demise",
            usage = R.string.explosive_demise_usage,
            description = R.string.explosive_demise_description
        ),
    ),
    keywords = listOf(
        "BLOODED",
        "CHAOS",
        "BRIMSTONE GRENADIER",
        "25MM"

    )
)

