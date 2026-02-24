package com.example.killteamruleset.ui.data.Empire.list.Ratlings


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val RatlingSneak = Operative(
    name = "Ratling Sneak",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "5+",
        wounds = 6
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Suppressed Sniper Rifle (mobile)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Silent
            )
        ),
        WeaponProfile(
            name = "Suppressed Sniper Rifle (stationary)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/3",
            keywords = listOf(
                Devastating(2),
                Heavy(""),
                Silent
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
            title = "Optics",
            usage = R.string.ratlings_optics_usage,
            description = R.string.ratlings_optics_description
        ),
        Ability(
            title = "Evade",
            usage = R.string.evade_usage,
            description = R.string.evade_description
        ),
    ),


    keywords = listOf(
        "RATLING",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "SNEAK",
        "25MM"
    )
)