package com.example.killteamruleset.ui.data.Empire.list.PhobosStrikeTeam


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val InfiltratorVeteran = Operative(
    name = "Infiltrator Veteran",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "3+",
        wounds = 12
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Custom Bolt Carbine",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            ),
            extraRules = listOf("*Custom")
        ),
        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Custom",
            usage = R.string.custom_usage,
            description = R.string.custom_description
        ),
    ),


    keywords = listOf(
        "PHOBOS STRIKE TEAM",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "INFILTRATOR",
        "VETERAN",
        "32MM"
    )
)