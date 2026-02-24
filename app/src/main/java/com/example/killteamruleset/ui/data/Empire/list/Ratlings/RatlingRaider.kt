package com.example.killteamruleset.ui.data.Empire.list.Ratlings


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val RatlingRaider = Operative(
    name = "Ratling Raider",
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
            name = "Dagger",
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
            title = "Slingshot",
            usage = R.string.slingshot_usage,
            description = R.string.slingshot_description,
            imageRes = R.drawable.ratling_slingshot
        ),
        Ability(
            title = "Grappling Hook",
            usage = R.string.grappling_hook_usage,
            description = R.string.grappling_hook_description
        ),
    ),


    keywords = listOf(
        "RATLING",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "RAIDER",
        "25MM"
    )
)