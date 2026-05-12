package com.example.killteamruleset.ui.data.Empire.list.SpectreSquad

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val SpectreVeteranSergeant = Operative(
    name = "Spectre Veteran Sergeant",
    imageRes = R.drawable.spectral_sergeant,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Scoped lascarbine",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "2/3",
            keywords = listOf(
                Lethal(5),
                Rending
            )
        ),
        WeaponProfile(
            name = "Bionic arm",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),

        ),

    abilities = listOf(
        Ability(
            title = "ISSUE MISSION",
            usage = R.string.issue_mission_usage,
            description = R.string.issue_mission_description
        )
    ),

    keywords = listOf(
        "SPECTRE SQUAD",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "LEADER",
        "VETERAN SERGEANT",
        "28MM"

    )
)
