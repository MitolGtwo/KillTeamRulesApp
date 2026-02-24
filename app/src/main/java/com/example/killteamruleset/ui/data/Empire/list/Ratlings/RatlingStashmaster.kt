package com.example.killteamruleset.ui.data.Empire.list.Ratlings


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val RatlingStashmaster = Operative(
    name = "Ratling Stashmaster",
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
            title = "Light-fingered",
            usage = R.string.light_fingered_usage,
            description = R.string.light_fingered_description
        ),
        Ability(
            title = "Well Stocked",
            usage = R.string.well_stocked_usage,
            description = R.string.well_stocked_description
        ),
    ),


    keywords = listOf(
        "RATLING",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "STASHMASTER",
        "25MM"
    )
)