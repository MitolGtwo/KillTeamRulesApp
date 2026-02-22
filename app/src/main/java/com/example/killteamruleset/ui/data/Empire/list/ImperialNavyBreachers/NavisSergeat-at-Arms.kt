package com.example.killteamruleset.ui.data.Empire.list.ImperialNavyBreachers

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val NavisSergeantAtArms = Operative(
    name = "Navis Sergeant-At-Arms",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Heirloom Autopistol",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "2/4",
            keywords = listOf(
                Range(6),
                Lethal(5)

            )
        ),
        WeaponProfile(
            name = "Navis Shotgun (short range)",
            type = WeaponType.RANGED,
            attacks =4 ,
            hit = "3+",
            damage = "3/3",
            keywords = listOf(
                Range(6),
            )
        ),
        WeaponProfile(
            name = "Navis Shotgun (long range)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "5+",
            damage = "1/2",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Chainsword",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
            )
        ),

        WeaponProfile(
            name = "Navis Hatchet",
            type = WeaponType.MELEE,
            attacks = 3 ,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Power Weapon",
            type = WeaponType.MELEE,
            attacks = 4 ,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Lethal(5)
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Command Breach",
            usage = R.string.command_breach_usage,
            description = R.string.command_breach_description
        )
    ),


    keywords = listOf(
        "IMPERIAL NAVY BREACHER",
        "IMPERIUM",
        "LEADER",
        "SERGEANT-AT-ARMS",
        "25MM"
    )
)
