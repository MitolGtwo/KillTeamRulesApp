package com.example.killteamruleset.ui.data.Empire.list.DeathWatch

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathwatchAegisVeteran = Operative(
    name = "Deathwatch Aegis Veteran",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "2+",
        wounds = 15
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bolt Pistol",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
               Range(8)
            )
        ),
  
        WeaponProfile(
            name = "Power Maul & Storm Shield",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
             Shock
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Shield",
            usage = R.string.deathwatch_shield_usage,
            description = R.string.deathwatch_shield_description
        ),
        Ability(
            title = "Storm Shield",
            usage = R.string.storm_shield_usage,
            description = R.string.storm_shield_description
        )
    ),


    keywords = listOf(
        "DEATHWATCH",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "AEGIS"
        "32MM"

    )
)
