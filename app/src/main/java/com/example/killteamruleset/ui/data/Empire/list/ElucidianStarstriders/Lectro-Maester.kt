package com.example.killteamruleset.ui.data.Empire.list.ElucidianStarstriders

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val LectroMaester = Operative(
    name = "Lectro-Maester",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
          WeaponProfile(
            name = "Voltaic Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/4",
            keywords = listOf(
                Range(8),
                Devastating(1),
                Rending
            )
        ),
        WeaponProfile(
            name = "Gun Butt",
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
            title = "Missionary of the Martian Creed",
            usage = R.string.missionary_martian_creed_usage,
            description = R.string.missionary_martian_creed_description
        ),
        Ability(
            title = "Voltaghiest Array",
            usage = R.string.voltaghiest_array_usage,
            description = R.string.voltaghiest_array_description
        ),
              Ability(
            title = "Calibrate Voltagheist",
            usage = R.string.calibrate_voltagheist_usage,
            description = R.string.calibrate_voltagheist_description
        )
    ),


    keywords = listOf(
        "ELUCIDIAN STARSTRIDER",
        "IMPERIUM",
        "LECTRO-MAESTER",
        "25MM"
    )
)
