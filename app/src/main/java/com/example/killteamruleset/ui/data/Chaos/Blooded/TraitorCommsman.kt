package com.example.killteamruleset.ui.data.Chaos.Blooded


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val TraitorCommsman = Operative(
    name = "Traitor Commsman",
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
            title = "Signal",
            usage = R.string.blooded_signal_usage,
            description = R.string.blooded_signal_description
        ),
        Ability(
            title = "Sacrilegious Actuation",
            usage = R.string.sacrilegious_actuation_usage,
            description = R.string.sacrilegious_actuation_description
        ),
    ),
    keywords = listOf(
        "BLOODED",
        "CHAOS",
        "COMMSMAN",
        "25MM"

    )
)