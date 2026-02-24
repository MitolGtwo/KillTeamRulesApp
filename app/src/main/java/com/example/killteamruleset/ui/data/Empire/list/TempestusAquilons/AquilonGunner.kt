package com.example.killteamruleset.ui.data.Empire.list.TempestusAquilons


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*
import kotlin.collections.listOf


val AquilonGunner = Operative(
    name = "Aquilon Gunner",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Melta Carbine",
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
            name = "Plasma carbine (standard)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Plasma carbine (supercharge)",
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
            title = "Salvo",
            usage = R.string.tempestus_salvo_usage,
            description = R.string.tempestus_salvo_description
        ),
        Ability(
            title = "Gunfight",
            usage = R.string.gunfight_usage,
            description = R.string.gunfight_description
        ),
    ),


    keywords = listOf(
        "TEMPESTUS AQUILON",
        "IMPERIUM",
        "GUNNER",
        "28MM"
    )
)