package com.example.killteamruleset.ui.data.Xenos.BroodBrothers



import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val BroodBrotherKnifeFighter = Operative(
    name = "Brood Brother Knife Fighter",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Poisoned Fighting Knives",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Ceaseless,
                Lethal(5)
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Assassin",
            usage = R.string.brood_assassin_usage,
            description = R.string.brood_assassin_description
        ),
        Ability(
            title = "Counterattack",
            usage = R.string.brood_counterattack_usage,
            description = R.string.brood_counterattack_description
        ),
    ),


    keywords = listOf(
        "BROOD BROTHER",
        "TYRANID",
        "GENESTEALER CULT",
        "BROODGUARD",
        "KNIFE FIGHTER",
        "25MM"

    )
)