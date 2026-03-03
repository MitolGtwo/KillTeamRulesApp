package com.example.killteamruleset.ui.data.Xenos.BroodBrothers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val BroodBrotherSapper = Operative(
    name = "Brood Brother Sapper",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Demolition Charge",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "4/6",
            keywords = listOf(
                Range(3),
                Blast(2),
                Heavy("Reposition Only"),
                Limited(1),
                Piercing(1),
                Saturate
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
            title = "Final Defiance",
            usage = R.string.final_defiance_usage,
            description = R.string.final_defiance_description
        ),
        Ability(
            title = "Grenadier",
            usage = R.string.brood_grenadier_usage,
            description = R.string.brood_grenadier_description
        ),
        Ability(
            title = "Explosives",
            usage = R.string.brood_explosives_usage,
            description = R.string.brood_explosives_description
        ),
    ),


    keywords = listOf(
        "BROOD BROTHER",
        "TYRANID",
        "GENESTEALER CULT",
        "BROODGUARD",
        "SAPPER",
        "25MM"

    )
)