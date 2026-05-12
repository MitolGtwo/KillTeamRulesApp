package com.example.killteamruleset.ui.data.Empire.list.SpectreSquad


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val SpectreLoader = Operative(
    name = "Spectre Loader",
    imageRes = R.drawable.spectral_loader,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Laspistol",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "2/3",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Weapon Assist",
            usage = R.string.weapon_assist_usage,
            description = R.string.weapon_assist_description
        ),
        Ability(
            title = "LOAD WEAPON",
            usage = R.string.load_weapon_usage,
            description = R.string.load_weapon_description
        )
    ),

    keywords = listOf(
        "SPECTRE SQUAD",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "LOADER",
        "28MM"

    )
)
