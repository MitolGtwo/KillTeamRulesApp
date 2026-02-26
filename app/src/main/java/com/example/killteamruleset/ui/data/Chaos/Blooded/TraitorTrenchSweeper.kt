package com.example.killteamruleset.ui.data.Chaos.Blooded


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val TraitorTrenchSweeper = Operative(
    name = "Traitor Trench Sweeper",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Shotgun",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/3",
            keywords = listOf(
                Range(6)
            )
        ),
        WeaponProfile(
            name = "Bayonet & Shield",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "3+",
            damage = "2/3",
            keywords = listOf(
            ),
            extraRules = listOf("*Shield")
        )
    ),

    abilities = listOf(
        Ability(
            title = "Shield",
            usage = R.string.blooded_shield_usage,
            description = R.string.blooded_shield_description
        ),
        Ability(
            title = "Shielding",
            usage = R.string.shielding_usage,
            description = R.string.shielding_description
        ),
    ),
    keywords = listOf(
        "BLOODED",
        "CHAOS",
        "TRENCH SWEEPER",
        "25MM"
    )
)