package com.example.killteamruleset.ui.data.Chaos.Legionaries


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
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val LegionaryButcher = Operative(
    name = "Legionary Butcher",
    imageRes = R.drawable.aod_captain,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8),
            )
        ),
        WeaponProfile(
            name = "Double-handed Chainaxe",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "4+",
            damage = "5/7",
            keywords = listOf(
                Brutal
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Devastating Onslaught",
            usage = R.string.devastating_onslaught_usage,
            description = R.string.devastating_onslaught_description
        ),


        ),
    keywords = listOf(
        "LEGIONARY",
        "CHAOS",
        "HERETIC ASTARTES",
        "BUTCHER",
        "32MM"
    )
)
