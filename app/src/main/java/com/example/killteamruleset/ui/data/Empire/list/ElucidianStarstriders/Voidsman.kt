package com.example.killteamruleset.ui.data.Empire.list.ElucidianStarstriders


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val Voidsman = Operative(
    name = "Voidsman",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
          WeaponProfile(
            name = "Lasgun",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "2/3",
            keywords = listOf()
            ),
          WeaponProfile(
            name = "Rotor Cannon (focused)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Heavy("Dash Only"),
                Rending
            )
        ),
          WeaponProfile(
            name = "Rotor Cannon (sweeping)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Heavy("Dash Only"),
                Rending,
                Torrent(1)
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
        )

    ),

    abilities = listOf(
        Ability(
            title = "Crewmen",
            usage = R.string.crewmen_usage,
            description = R.string.crewmen_description
        )
    ),


    keywords = listOf(
        "ELUCIDIAN STARSTRIDER",
        "IMPERIUM",
        "NAVIS",
        "VOIDMAN",
        "25MM"
    )
)
