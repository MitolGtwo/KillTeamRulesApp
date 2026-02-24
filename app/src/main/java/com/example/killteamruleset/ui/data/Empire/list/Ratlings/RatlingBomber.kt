package com.example.killteamruleset.ui.data.Empire.list.Ratlings


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val RatlingBomber = Operative(
    name = "Ratling Bomber",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "4+",
        wounds = 6
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Explosive Arsenal",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Range(3),
                Blast(1),
                Heavy("Reposition Only"),
                Limited(1),
                Piercing(1),
                Saturate
            )
        ),
        WeaponProfile(
            name = "Sniper Rifle (mobile)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Sniper Rifle (stationary)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/3",
            keywords = listOf(
                Devastating(3),
                Heavy("")
            )
        ),

        WeaponProfile(
            name = "Bionic Arm",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "5+",
            damage = "3/4",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Tripwire",
            usage = R.string.tripwire_usage,
            description = R.string.tripwire_description
        ),
        Ability(
            title = "Mine",
            usage = R.string.ratling_mine_usage,
            description = R.string.ratling_mine_description
        ),
    ),


    keywords = listOf(
        "RATLING",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "BOMBER",
        "25MM"
    )
)