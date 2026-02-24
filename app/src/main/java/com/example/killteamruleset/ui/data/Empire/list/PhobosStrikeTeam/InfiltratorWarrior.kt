package com.example.killteamruleset.ui.data.Empire.list.PhobosStrikeTeam


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val InfiltratorWarrior = Operative(
    name = "Infiltrator Warrior",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "3+",
        wounds = 12
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Marksman Bolt Carbine",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Lethal(5)
            ),
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
            title = "Vanguard",
            usage = R.string.vanguard_usage,
            description = R.string.vanguard_description
        ),
    ),


    keywords = listOf(
        "PHOBOS STRIKE TEAM",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "INFILTRATOR",
        "WARRIOR",
        "32MM"
    )
)