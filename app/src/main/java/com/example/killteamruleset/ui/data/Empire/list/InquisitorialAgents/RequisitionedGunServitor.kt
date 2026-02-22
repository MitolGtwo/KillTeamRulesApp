package com.example.killteamruleset.ui.data.Empire.list.InquisitorialAgents

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val RequisionedGunServitor = Operative(
    name = "Requisioned Gun Servitor",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 1,
        move = "5\"",
        save = "4+",
        wounds = 11
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Heavy Bolter (focused)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Heavy("Dash Only"),
                Piercing_Crits(1),
            )
        ),
        WeaponProfile(
            name = "Heavy Bolter (sweeping)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Heavy("Dash Only"),
                Piercing_Crits(1),
                Torrent(1)
            )
        ),
        WeaponProfile(
            name = "Multi-melta",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "6/3",
            keywords = listOf(
                Devastating(4),
                Heavy("Dash Only"),
                Piercing(2)
            )
        ),
        WeaponProfile(
            name = "Plasma Cannon (standard)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "4/6",
            keywords = listOf(
                Blast(2),
                Heavy("Dash Only"),
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Plasma Cannon (supercharge)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "5/6",
            keywords = listOf(
                Blast(2),
                Heavy("Dash Only"),
                Hot,
                Lethal(5),
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Servo Claw",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Lobotomised",
            usage = R.string.lobotomised_usage,
            description = R.string.lobotomised_description
        )
    ),


    keywords = listOf(
        "INQUISITORIAL AGENT",
        "IMPERIUM",
        "INQUISITION",
        "GUN SERVITOR",
        "32MM"
    )
)