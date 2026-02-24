package com.example.killteamruleset.ui.data.Empire.list.Ratlings

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val Bullgryn = Operative(
    name = "Bullgryn",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 16
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Grenadier Gauntlet",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/5",
            keywords = listOf(
                Blast(2)
            )
        ),

        WeaponProfile(
            name = "Power Maul",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Shock
            )
        ),

        WeaponProfile(
            name = "Brute Shield",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),

        WeaponProfile(
            name = "Slabshield",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "2/4",
            keywords = listOf(
            )
        ),


    ),

    abilities = listOf(
        Ability(
            title = "Shield",
            usage = R.string.bullgryn_shield_usage,
            description = R.string.bullgryn_shield_description
        ),
        Ability(
            title = "Brute",
            usage = R.string.brute_usage,
            description = R.string.brute_description
        ),
        Ability(
            title = "Slow-witted",
            usage = R.string.slow_witted_usage,
            description = R.string.slow_witted_description
        ),
    ),


    keywords = listOf(
        "RATLING",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "BULLGRYN",
        "40MM"
    )
)