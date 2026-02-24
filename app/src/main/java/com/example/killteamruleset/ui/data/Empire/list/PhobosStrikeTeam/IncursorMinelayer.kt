package com.example.killteamruleset.ui.data.Empire.list.PhobosStrikeTeam


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val IncursorMinelayer = Operative(
    name = "Incursor Minelayer",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "3+",
        wounds = 12
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Occulus Bolt Carbine",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Saturate
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
            title = "Haywire Mine",
            usage = R.string.haywire_mine_usage,
            description = R.string.haywire_mine_description
        ),
        Ability(
            title = "Proximity Mine",
            usage = R.string.phobos_proximity_mine_usage,
            description = R.string.phobos_proximity_mine_description
        ),
    ),


    keywords = listOf(
        "PHOBOS STRIKE TEAM",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "INCURSOR",
        "MINELAYER",
        "32MM"
    )
)