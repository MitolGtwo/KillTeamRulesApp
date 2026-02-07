package com.example.killteamruleset.ui.data.Chaos.PlagueMarines


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Toxic
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val PlagueMarineBombardier = Operative(
    name = "Plague Marine Bombardier",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "5\"",
        save = "3+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Boltgun",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Fist",
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
            title = R.string.plaguemarinebombardier_grenadier,
            usage = R.string.plaguemarinebombardier_grenadier_usage,
            description = R.string.plaguemarinebombardier_grenadier_description
        )
    ),
    keywords = listOf(
        "PLAGUE MARINE",
        "CHAOS",
        "HERETIC ASTARTES",
        "BOMBARDIER",
        "32MM"
    )
)