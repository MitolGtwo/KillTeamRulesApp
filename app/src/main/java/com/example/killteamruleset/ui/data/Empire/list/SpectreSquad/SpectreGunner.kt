package com.example.killteamruleset.ui.data.Empire.list.SpectreSquad

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Hot
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val SpectreGunner = Operative(
    name = "Spectre Gunner",
    imageRes = R.drawable.spectral_gunner,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Meltagun",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "6/3",
            keywords = listOf(
                Range(6),
                Devastating(4),
                Piercing(2)
            )
        ),
        WeaponProfile(
            name = "Plasma gun (standard)",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Plasma gun (supercharge)",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "5/6",
            keywords = listOf(
                Hot,
                Lethal(5),
                Piercing(1),
            )
        ),

        WeaponProfile(
            name = "Gun butt",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
    ),

    keywords = listOf(
        "SPECTRE SQUAD",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "GUNNER",
        "28MM"

    )
)
