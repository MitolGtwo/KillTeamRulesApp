package com.example.killteamruleset.ui.data.Empire.list.DeathWatch


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathwatchDemolisherVeteran = Operative(
    name = "Deathwatch Demolisher Veteran",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 15
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
               Range(8)
            )
        ),

              WeaponProfile(
            name = "Heavy Thunder Hammer",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "4+",
            damage = "6/7",
            keywords = listOf(
              Shock,
              Stun
            )
    ),

    abilities = listOf(
       
    ),


    keywords = listOf(
        "DEATHWATCH",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "DEMOLISHER",
        "32MM"
    )
)
