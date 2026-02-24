package com.example.killteamruleset.ui.data.Empire.list.PhobosStrikeTeam


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val ReiverWarrior = Operative(
    name = "Reiver Warrior",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "3+",
        wounds = 12
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bolt Carbine",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Accurate(1)
            )
        ),
        WeaponProfile(
            name = "Special Issue Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8),
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Combat Knife",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Grav-chute and Grapnel Launche",
            usage = R.string.phobos_gravchute_usage,
            description = R.string.phobos_gravchute_description
        ),
        Ability(
            title = "Vanguard",
            usage = R.string.vanguard_usage,
            description = R.string.vanguard_description
        )
    ),


    keywords = listOf(
        "PHOBOS STRIKE TEAM",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "REIVER",
        "WARRIOR",
        "32MM"
    )
)