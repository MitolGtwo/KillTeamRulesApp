package com.example.killteamruleset.ui.data.Chaos.PlagueMarines

import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Poison
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val PlagueMarineFighter = Operative(
    name = "Plague Marine Figher",
    imageRes = R.drawable.plague_fighter,
    stats = OperativeStats(
        apl = 3,
        move = "5\"",
        save = "3+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Flail of corruption",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Brutal,
                Severe,
                Shock,
                Poison
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Flail",
            usage = R.string.plaguemarinefighter_flail_usage,
            description = R.string.plaguemarinefighter_flail_description
        )
    ),
    keywords = listOf(
        "PLAGUE MARINE",
        "CHAOS",
        "HERETIC ASTARTES",
        "FIGHTER",
        "32MM"
    )
)