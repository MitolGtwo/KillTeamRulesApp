package com.example.killteamruleset.ui.data.Empire.list.PhobosStrikeTeam


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val InfiltratorVoxbreaker = Operative(
    name = "Infiltrator Voxbreaker",
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
            ),
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
            title = "Voxbreak",
            usage = R.string.voxbreak_usage,
            description = R.string.voxbreak_description
        ),
        Ability(
            title = "Auspex Scan",
            usage = R.string.phobos_auspex_scan_usage,
            description = R.string.phobos_auspex_scan_description
        ),
    ),


    keywords = listOf(
        "PHOBOS STRIKE TEAM",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "INFILTRATOR",
        "VOXBREAKER",
        "32MM"
    )
)