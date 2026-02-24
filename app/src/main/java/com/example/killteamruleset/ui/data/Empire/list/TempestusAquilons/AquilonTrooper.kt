package com.example.killteamruleset.ui.data.Empire.list.TempestusAquilons


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*
import kotlin.collections.listOf


val AquilonTrooper = Operative(
    name = "Aquilon Trooper",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Hot‑shot Lascarbine",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
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
        )
    ),

    abilities = listOf(
        Ability(
            title = "Rapid Insertion",
            usage = R.string.rapid_insertion_usage,
            description = R.string.rapid_insertion_description
        ),
        Ability(
            title = "Swift Landing",
            usage = R.string.swift_landing_usage,
            description = R.string.swift_landing_description
        ),
    ),


    keywords = listOf(
        "TEMPESTUS AQUILON",
        "IMPERIUM",
        "TROOPER",
        "28MM"
    )
)