package com.example.killteamruleset.ui.data.Empire.list.AngelsOfDeath

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val AssaultIntercessorGrenadier = Operative(
    name = "Assault Intercessor Grenadier",
    imageRes = R.drawable.plague_bombardier,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Heavy Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8),
                Piercing_Crits(1)
            )
        ),
        WeaponProfile(
            name = "Chainsword",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Grenadier",
            usage = R.string.aod_grenadier_usage,
            description = R.string.aod_grenadier_description
        )
    ),
    keywords = listOf(
        "ANGEL OF DEATH",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "ASSAULT INTERCESSOR",
        "GRENADIER",
        "32MM"
    )
)
