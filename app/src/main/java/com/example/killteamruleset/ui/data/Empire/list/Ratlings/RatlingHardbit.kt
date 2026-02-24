package com.example.killteamruleset.ui.data.Empire.list.Ratlings


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val RatlingHardbit = Operative(
    name = "Ratling Hardbit",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "5+",
        wounds = 6
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Battle Rifle",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Combat Knife",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Balanced
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Hunter",
            usage = R.string.ratling_hunter_usage,
            description = R.string.ratling_hunter_description
        ),
        Ability(
            title = "Lie in Wait",
            usage = R.string.lie_in_wait_usage,
            description = R.string.lie_in_wait_description
        ),
    ),


    keywords = listOf(
        "RATLING",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "HARDBIT",
        "25MM"
    )
)