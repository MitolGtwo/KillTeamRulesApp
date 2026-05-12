package com.example.killteamruleset.ui.data.Empire.list.SpectreSquad

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val SpectreTrooper = Operative(
    name = "Spectre Trooper",
    imageRes = R.drawable.spectral_trooper,
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
            title = "Cool-Headed",
            usage = R.string.coolheaded_usage,
            description = R.string.coolheaded_description
        )
    ),

    keywords = listOf(
        "SPECTRE SQUAD",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "TROOPER",
        "28MM"

    )
)
