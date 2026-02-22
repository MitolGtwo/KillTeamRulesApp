package com.example.killteamruleset.ui.data.Empire.list.InquisitorialAgents

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val TempestusScionTrooper = Operative(
    name = "Tempestus Scion Trooper",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Hot-shot Lasgun",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
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
            title = "Adaptive Equipment",
            usage = R.string.adaptive_equipment_usage,
            description = R.string.adaptive_equipment_description
        )
    ),


    keywords = listOf(
        "INQUISITORIAL AGENT",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "TEMPESTUS SCION",
        "TROOPER",
        "25MM"
    )
)