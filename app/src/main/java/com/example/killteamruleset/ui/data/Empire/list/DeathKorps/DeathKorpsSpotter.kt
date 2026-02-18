package com.example.killteamruleset.ui.data.Empire.list.DeathKorps

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathKorpsSpotter = Operative(
    name = "Death Korps Spotter",
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
            name = "Mortar Barrage",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "4+",
            damage = "3/5",
            keywords = listOf(
              Blast(2),
              Heavy("Dash only"),
              Silent
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
            title = "Spot",
            usage = R.string.deathkorps_spotter_usage,
            description = R.string.deathkorps_spotter_description
        )
        
    ),
    keywords = listOf(
        "DEATH KORP",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "SPOTTER",
        "25MM"

    )
)
