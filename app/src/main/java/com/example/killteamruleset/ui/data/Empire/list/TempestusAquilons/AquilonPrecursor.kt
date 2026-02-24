package com.example.killteamruleset.ui.data.Empire.list.TempestusAquilons


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*
import kotlin.collections.listOf


val AquilonPrecursor = Operative(
    name = "Aquilon Precursor",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Hot‑shot laspistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Tempestus Dagger",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Ceaseless,
                Lethal(5)
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Vicious Knife Fighter",
            usage = R.string.knife_fighter_usage,
            description = R.string.knife_fighter_description
        ),
        Ability(
            title = "Dynamic",
            usage = R.string.dynamic_usage,
            description = R.string.dynamic_description
        ),
    ),


    keywords = listOf(
        "TEMPESTUS AQUILON",
        "IMPERIUM",
        "PRECURSOR",
        "28MM"
    )
)