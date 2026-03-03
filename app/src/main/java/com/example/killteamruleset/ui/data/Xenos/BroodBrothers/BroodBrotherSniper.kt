package com.example.killteamruleset.ui.data.Xenos.BroodBrothers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val BroodBrotherSniper = Operative(
    name = "Brood Brother Sniper",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Sniper Rifle (concealed)",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "2+",
            damage = "3/3",
            keywords = listOf(
                Devastating(3),
                Heavy(""),
                Silent,
                Concealed_Position
            )
        ),
        WeaponProfile(
            name = "Sniper Rifle (mobile)",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Sniper Rifle (stationary)",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "2+",
            damage = "3/3",
            keywords = listOf(
                Devastating(3),
                Heavy("")
            )
        ),
        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
    ),


    keywords = listOf(
        "BROOD BROTHER",
        "TYRANID",
        "GENESTEALER CULT",
        "BROODGUARD",
        "SNIPER",
        "25MM"

    )
)