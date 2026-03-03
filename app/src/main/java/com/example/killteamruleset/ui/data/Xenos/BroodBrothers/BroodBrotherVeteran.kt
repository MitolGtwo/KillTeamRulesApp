package com.example.killteamruleset.ui.data.Xenos.BroodBrothers



import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val BroodBrotherVeteran = Operative(
    name = "Brood Brother Veteran",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Combat Shotgun (close range)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/4",
            keywords = listOf(
                Range(6)
            )
        ),
        WeaponProfile(
            name = "Combat Shotgun (long range)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "5+",
            damage = "2/2",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Bayonet & Claw",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
                Balanced
            )
        )

    ),

    abilities = listOf(
        Ability(
            title = "Resilient",
            usage = R.string.resilient_usage,
            description = R.string.resilient_description
        ),
        Ability(
            title = "Bodyguard",
            usage = R.string.brood_bodyguard_usage,
            description = R.string.brood_bodyguard_description
        ),
    ),


    keywords = listOf(
        "BROOD BROTHER",
        "TYRANID",
        "GENESTEALER CULT",
        "BROODGUARD",
        "VETERAN",
        "25MM"

    )
)