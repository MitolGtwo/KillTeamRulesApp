package com.example.killteamruleset.ui.data.Empire.list.DeathKorps

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathKorpsBruiser = Operative(
    name = "Death Korps Bruiser",
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
            name = "Trench Club",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/3",
            keywords = listOf(
                Shock
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = R.string.deathkorps_bruiser,
            usage = R.string.deathkorps_bruiser_usage,
            description = R.string.deathkorps_bruiser_description
        )
    ),


    keywords = listOf(
        "DEATH KORP",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "BRUISER",
        "25MM"

    )
)
