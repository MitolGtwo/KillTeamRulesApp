package com.example.killteamruleset.ui.data.Chaos.PlagueMarines

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Hot
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Poison
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Toxic
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val PlagueMarineChampion = Operative(
    name = "Plague Marine Champion",
    imageRes = R.drawable.plague_champion,
    stats = OperativeStats(
        apl = 3,
        move = "5\"",
        save = "3+",
        wounds = 15
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Plasma Pistol(standard)",
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
            name = "Plasma Pistol(Supercharge)",
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
            name = "Plague Sword",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Severe,
                Poison,
                Toxic
            )
        )

    ),

    abilities = listOf(
        Ability(
            title = R.string.plaguemarinechambion_gfblessing,
            usage = R.string.plaguemarinechambion_gfblessing_usage,
            description = R.string.plaguemarinechambion_gfblessing_description
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
        "LEADER",
        "CHAMPION",
        "32MM"
    )
)