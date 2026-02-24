package com.example.killteamruleset.ui.data.Empire.list.TempestusAquilons


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*
import kotlin.collections.listOf


val AquilonServoSentry = Operative(
    name = "Aquilon Servo-Sentry",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "4\"",
        save = "3+",
        wounds = 10
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Flamer",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "3/3",
            keywords = listOf(
                Range(8),
                Saturate,
                Torrent(2)
            )
        ),
        WeaponProfile(
            name = "Grenade Launcher (frag)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "2/4",
            keywords = listOf(
                Blast(2)
            )
        ),
        WeaponProfile(
            name = "Grenade Launcher (krak)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Hot‑shot Volley Gun (focused)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Piercing_Crits(1)
            )
        ),
        WeaponProfile(
            name = "Hot‑shot Volley Gun (sweeping)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "6/3",
            keywords = listOf(
                Piercing_Crits(1),
                Torrent(1)
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Machine",
            usage = R.string.tempestus_machine_usage,
            description = R.string.tempestus_machine_description
        ),
        Ability(
            title = "Turret",
            usage = R.string.turret_usage,
            description = R.string.turret_description
        ),
    ),


    keywords = listOf(
        "TEMPESTUS AQUILON",
        "IMPERIUM",
        "SERVO-SENTRY",
        "40MM"
    )
)