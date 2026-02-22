package com.example.killteamruleset.ui.data.Empire.list.InquisitorialAgents

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val PistolierAgent = Operative(
    name = "Pistolier Agent",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Scoped Plasma Pistol (standard)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Range(12),
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Scoped Plasma Pistol (supercharge)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Range(12),
                Hot,
                Lethal(5),
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Suppressed Autopistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "2/3",
            keywords = listOf(
                Range(8),
                Silent
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
            title = "Pistolier",
            usage = R.string.inquisitorial_pistolier_usage,
            description = R.string.inquisitorial_pistolier_description
        ),
        Ability(
            title = "Pistol Barrage",
            usage = R.string.pistol_barrage_usage,
            description = R.string.pistol_barrage_description
        )
    ),


    keywords = listOf(
        "INQUISITORIAL AGENT",
        "IMPERIUM",
        "INQUISITION",
        "PISTOLIER",
        "25MM"
    )
)