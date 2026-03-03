package com.example.killteamruleset.ui.data.Xenos.BroodBrothers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val BroodBrotherCommander = Operative(
    name = "Brood Brother Commander",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Drum-fed Autogun",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "2/3",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Laspistol",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "2/3",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Bayonet",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "3+",
            damage = "2/3",
            keywords = listOf(
            )
        ),

        WeaponProfile(
            name = "Chainsword and Claw",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Balanced,
                Rending
            )
        ),

        WeaponProfile(
            name = "Power Weapon and Claw",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Balanced,
                Lethal(5)
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Coordinate",
            usage = R.string.coordinate_usage,
            description = R.string.coordinate_description
        )
    ),


    keywords = listOf(
        "BROOD BROTHER",
        "TYRANID",
        "GENESTEALER CULT",
        "BROODGUARD",
        "LEADER",
        "COMMANDER",
        "25MM"

    )
)
