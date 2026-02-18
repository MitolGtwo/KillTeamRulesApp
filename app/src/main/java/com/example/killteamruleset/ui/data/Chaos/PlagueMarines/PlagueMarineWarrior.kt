package com.example.killteamruleset.ui.data.Chaos.PlagueMarines


import com.example.killteamruleset.ui.model.Poison
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Toxic
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val PlagueMarineWarrior= Operative(
    name = "Plague Marine Warrior",
    imageRes = R.drawable.plague_warrior,
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
                Toxic
            )
        ),

        WeaponProfile(
            name = "Plague Knife",
            type = WeaponType.MELEE,
            attacks = 4,
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
            title = R.string.plaguemarinewarrior,
            usage = R.string.plaguemarinewarrior_usage,
            description = R.string.plaguemarinewarrior_description
        ),
        Ability(
            title = R.string.plaguemarine_toxic,
            usage = R.string.plaguemarine_toxic_usage,
            description = R.string.plaguemarine_toxic_description
        )

    ),
    keywords = listOf(
        "PLAGUE MARINE",
        "CHAOS",
        "HERETIC ASTARTES",
        "WARRIOR",
        "32MM"
    )
)