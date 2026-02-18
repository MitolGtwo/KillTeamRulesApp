package com.example.killteamruleset.ui.data.Empire.list.AngelsOfDeath

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Hot
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val SpaceMarineCaptain = Operative(
    name = "Space Marine Captain",
    imageRes = R.drawable.plague_bombardier,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 15
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Plasma Pistol (standard)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Range(8),
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Plasma Pistol (Supercharge)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Range(8),
                Hot,
                Lethal(5),
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Power Fist",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "5/7",
            keywords = listOf(
                Brutal
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Heroic Leader",
            usage = R.string.plaguemarinebombardier_grenadier_usage,
            description = R.string.plaguemarinebombardier_grenadier_description
        ),
        Ability(
            title = "Iron Halo",
            usage = R.string.plaguemarinebombardier_grenadier_usage,
            description = R.string.plaguemarinebombardier_grenadier_description
        )
    ),
    keywords = listOf(
        "ANGEL OF DEATH",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "LEADER",
        "SPACE MARINE CAPTAIN",
        "40MM"
    )
)