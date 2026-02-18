package com.example.killteamruleset.ui.data.Empire.list.AngelsOfDeath


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Seek_light
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val EliminatorSniper = Operative(
    name = "Eliminator Sniper",
    imageRes = R.drawable.plague_bombardier,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "3+",
        wounds = 12
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Bolt Sniper Rifle (Executioner)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "3/4",
            keywords = listOf(
                Heavy("Dash Only"),
                Saturate,
                Seek_light,
                Silent
            )
        ),
        WeaponProfile(
            name = "Bolt Sniper Rifle (Hyperfrag)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Blast(1),
                Heavy("Dash Only"),
                Silent
            )
        ),
        WeaponProfile(
            name = "Bolt Sniper Rifle (Mortis)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Devastating(3),
                Heavy("Dash Only"),
                Piercing(1),
                Silent
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
            title = "Camo Cloak",
            usage = R.string.plaguemarinebombardier_grenadier_usage,
            description = R.string.plaguemarinebombardier_grenadier_description
        ),
        Ability(
            title = "Optics",
            usage = R.string.plaguemarinebombardier_grenadier_usage,
            description = R.string.plaguemarinebombardier_grenadier_description
        )
    ),
    keywords = listOf(
        "ANGEL OF DEATH",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "ELIMINATOR",
        "SNIPER",
        "40MM"
    )
)