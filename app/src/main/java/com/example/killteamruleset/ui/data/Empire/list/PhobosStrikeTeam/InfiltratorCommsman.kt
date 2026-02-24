package com.example.killteamruleset.ui.data.Empire.list.PhobosStrikeTeam

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val InfiltratorCommsman = Operative(
    name = "Infiltrator Commsman ",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "3+",
        wounds = 12
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Marksman Bolt Carbine",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Lethal(5)
            )
        ),

        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Strategic Oversight",
            usage = R.string.strategic_oversight_usage,
            description = R.string.strategic_oversight_description
        ),
        Ability(
            title = "Comms Array",
            usage = R.string.comms_array_usage,
            description = R.string.comms_array_description
        ),
    ),


    keywords = listOf(
        "PHOBOS STRIKE TEAM",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "INFILTRATOR",
        "COMMSMAN",
        "32MM"
    )
)
