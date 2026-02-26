package com.example.killteamruleset.ui.data.Chaos.Blooded


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val TraitorSharpshooter = Operative(
    name = "Traitor Sharpshooter",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Long-las (mobile)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(

            )
        ),
        WeaponProfile(
            name = "Long-las (stationary)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "3/3",
            keywords = listOf(
                Devastating(1),
                Heavy("Dash Only"),
                Silent
            )
        ),
        WeaponProfile(
            name = "Bayonet",
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
            title = "Camo Cloak",
            usage = R.string.blooded_camo_cloak_usage,
            description = R.string.blooded_camo_cloak_description
        ),
        Ability(
            title = "A Name Whispered In Blood",
            usage = R.string.a_name_whispered_in_blood_usage,
            description = R.string.a_name_whispered_in_blood_description
        ),
    ),
    keywords = listOf(
        "BLOODED",
        "CHAOS",
        "SHARPSHOOTER",
        "25MM"
    )
)