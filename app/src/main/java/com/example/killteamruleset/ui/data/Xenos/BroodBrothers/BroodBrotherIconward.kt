package com.example.killteamruleset.ui.data.Xenos.BroodBrothers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val BroodBrotherIconward = Operative(
    name = "Brood Brother Iconward",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Large knife",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "3/5",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Cult Icon",
            usage = R.string.brood_cult_icon_usage,
            description = R.string.brood_cult_icon_description
        ),
        Ability(
            title = "Broodmind Devotion",
            usage = R.string.broodmind_devotion_usage,
            description = R.string.broodmind_devotion_description
        ),
    ),


    keywords = listOf(
        "BROOD BROTHER",
        "TYRANID",
        "GENESTEALER CULT",
        "BROODGUARD",
        "ICONWARD",
        "25MM"

    )
)