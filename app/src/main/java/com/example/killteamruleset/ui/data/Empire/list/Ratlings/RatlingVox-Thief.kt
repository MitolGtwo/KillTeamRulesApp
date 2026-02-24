package com.example.killteamruleset.ui.data.Empire.list.Ratlings


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val RatlingVoxThief = Operative(
    name = "Ratling Vox-thief",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "5+",
        wounds = 6
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Sniper Rifle (mobile)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Sniper Rifle (stationary)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
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
            hit = "5+",
            damage = "1/2",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Intercept Communications",
            usage = R.string.intercept_communications_usage,
            description = R.string.intercept_communications_description
        )
    ),


    keywords = listOf(
        "RATLING",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "VOX-THIEF",
        "25MM"
    )
)