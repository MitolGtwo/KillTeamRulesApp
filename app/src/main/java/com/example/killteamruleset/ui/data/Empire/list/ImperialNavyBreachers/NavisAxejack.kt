package com.example.killteamruleset.ui.data.Empire.list.ImperialNavyBreachers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val NavisAxejack = Operative(
    name = "Navis Axejack",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Autopistol",
            type = WeaponType.RANGED,
            attacks =4 ,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
                Range(8),
            )
        ),
        WeaponProfile(
            name = "Power Weapon",
            type = WeaponType.MELEE,
            attacks = 4 ,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Lethal(5)
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Emboldened",
            usage = R.string.emboldened_usage,
            description = R.string.emboldened_description
        )
    ),


    keywords = listOf(
        "IMPERIAL NAVY BREACHER",
        "IMPERIUM",
        "AXEJACK",
        "25MM"
    )
)