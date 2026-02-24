package com.example.killteamruleset.ui.data.Empire.list.TempestusAquilons


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*
import kotlin.collections.listOf


val AquilonGunfighter = Operative(
    name = "Aquilon Gunfighter",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Hot‑shot Laspistols (focused)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8),
                Ceaseless,
                Rending
            )
        ),
        WeaponProfile(
            name = "Hot‑shot Laspistols (salvo)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "5/3",
            keywords = listOf(
                Range(8),
            ),
            extraRules = listOf("*Salvo")
        ),
        WeaponProfile(
            name = "Hot‑shot Laspistols (point-blank)",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Ceaseless
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
        "GUNFIGHTER",
        "28MM"
    )
)