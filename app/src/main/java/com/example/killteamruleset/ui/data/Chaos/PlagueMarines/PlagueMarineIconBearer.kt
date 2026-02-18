package com.example.killteamruleset.ui.data.Chaos.PlagueMarines



import com.example.killteamruleset.ui.model.Poison
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val PlagueMarineIconBearer= Operative(
    name = "Plague Marine Icon Bearer",
    imageRes = R.drawable.plague_iconbearer,
    stats = OperativeStats(
        apl = 3,
        move = "5\"",
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
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Plague Knife",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Severe,
                Poison
            )
        ),

        ),

    abilities = listOf(
        Ability(
            title = R.string.plaguemarine_iconbearer,
            usage = R.string.plaguemarine_iconbearer_usage,
            description = R.string.plaguemarine_iconbearer_description
        ),
        Ability(
            title = R.string.plaguemarine_icon_of_contagion,
            usage = R.string.plaguemarine_icon_of_contagionr_usage,
            description = R.string.plaguemarine_icon_of_contagionr_description
        )

    ),
    keywords = listOf(
        "PLAGUE MARINE",
        "CHAOS",
        "HERETIC ASTARTES",
        "ICON BEARER",
        "32MM"
    )
)