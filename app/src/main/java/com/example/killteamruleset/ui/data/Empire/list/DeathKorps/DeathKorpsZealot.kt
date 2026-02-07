package com.example.killteamruleset.ui.data.Empire.list.DeathKorps

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathKorpsZealot = Operative(
    name = "Death Korps Zealot ",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Lasgun",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
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
            title = R.string.deathkorps_zealot_theemperor,
            usage =  R.string.deathkorps_zealot_theemperor_usage,
            description =  R.string.deathkorps_zealot_theemperor_description
        ),
        Ability(
            title =  R.string.deathkorps_zealot_uplifting,
            usage = R.string.deathkorps_zealot_uplifting_usage,
            description = R.string.deathkorps_zealot_uplifting_description
        )
        
    ),
    keywords = listOf(
        "DEATH KORP",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "ZEALOT",
        "25MM"

    )
)
