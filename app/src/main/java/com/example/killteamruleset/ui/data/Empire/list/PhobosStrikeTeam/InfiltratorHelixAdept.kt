package com.example.killteamruleset.ui.data.Empire.list.PhobosStrikeTeam

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val InfiltratorHelixAdept = Operative(
    name = "Infiltrator Helix Adept",
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
            title = "Medic!",
            usage = R.string.phobos_medic_usage,
            description = R.string.phobos_medic_description
        ),
        Ability(
            title = "Helix Gauntlet",
            usage = R.string.helix_gauntlet_usage,
            description = R.string.helix_gauntlet_description
        ),
    ),


    keywords = listOf(
        "PHOBOS STRIKE TEAM",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "MEDIC",
        "INFILTRATOR",
        "HELIX ADEPT",
        "32MM"
    )
)
