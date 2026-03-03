package com.example.killteamruleset.ui.data.Xenos.BroodBrothers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val Primus = Operative(
    name = "Primus",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "4+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Scoped Needle Pistol (short range)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "2/4",
            keywords = listOf(
                Range(8),
                Lethal(5),
                Silent
            )
        ),
        WeaponProfile(
            name = "Scoped Needle Pistol (long range)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "2/4",
            keywords = listOf(
                Silent
            )
        ),
        WeaponProfile(
            name = "Bonesword and Toxin Injector Claw",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Lethal(5),
                Rending
            )
        )

    ),

    abilities = listOf(
        Ability(
            title = "Fist of the Patriarch",
            usage = R.string.first_of_the_patriarch_usage,
            description = R.string.first_of_the_patriarch_description
        ),
        Ability(
            title = "Mastermind",
            usage = R.string.mastermind_usage,
            description = R.string.mastermind_description
        ),
        Ability(
            title = "Conspire",
            usage = R.string.conspire_usage,
            description = R.string.conspire_description
        ),
    ),


    keywords = listOf(
        "BROOD BROTHER",
        "TYRANID",
        "GENESTEALER CULT",
        "BROODCOVEN",
        "LEADER",
        "PRIMUS",
        "32MM"

    )
)