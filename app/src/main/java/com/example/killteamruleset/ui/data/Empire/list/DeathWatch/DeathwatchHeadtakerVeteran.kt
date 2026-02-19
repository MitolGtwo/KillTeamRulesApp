package com.example.killteamruleset.ui.data.Empire.list.DeathWatch

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathwatchHeadtakerVeteran = Operative(
    name = "Deathwatch Headtaker Veteran",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "3+",
        wounds = 13
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Special Issue Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
               Range(8),
               Piercing(1)
            )
        ),

          WeaponProfile(
            name = "Combat Knives",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
            )
    ),

    abilities = listOf(
        Ability(
            title = "Grav-chute and Grapnel Launcher",
            usage = R.string.gravchute_and_grapnel_launcher_usage,
            description = R.string.gravchute_and_grapnel_launcher_description
        ),
            Ability(
            title = "Clandestine Headtaker",
            usage = R.string.clandestine_headtaker_usage,
            description = R.string.clandestine_headtaker_description
        )
    ),


    keywords = listOf(
        "DEATHWATCH",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "HEADTAKER",
        "32MM"
    )
)
