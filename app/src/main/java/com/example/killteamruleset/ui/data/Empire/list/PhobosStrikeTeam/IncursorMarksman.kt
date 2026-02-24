package com.example.killteamruleset.ui.data.Empire.list.PhobosStrikeTeam


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val IncursorMarksman = Operative(
    name = "Incursor Marksman",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "3+",
        wounds = 12
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Stalker Marksman Bolt Carbine",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "3/4",
            keywords = listOf(
                Lethal(5),
                Piercing(1)
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
            title = "Track Target",
            usage = R.string.track_target_usage,
            description = R.string.track_target_description
        )
    ),


    keywords = listOf(
        "PHOBOS STRIKE TEAM",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "INCURSOR",
        "MARKSMAN",
        "32MM"
    )
)