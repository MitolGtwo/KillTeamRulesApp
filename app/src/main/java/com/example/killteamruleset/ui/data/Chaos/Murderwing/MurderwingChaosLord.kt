package com.example.killteamruleset.ui.data.Chaos.Murderwing


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
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


val MurderwingChaosLord = Operative(
    name = "Murderwing Chaos Lord",
    imageRes = R.drawable.aod_captain,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 15
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
            name = "Plasma Pistol (supercharge)",
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
            name = "Lightning Claw",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Lethal(5),
                Rending
            )
        ),
        WeaponProfile(
            name = "Power Fist",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "5/7",
            keywords = listOf(
                Brutal,
                Shock
            )
        ),
        WeaponProfile(
            name = "Power Weapon",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Lethal(5)
            )
        ),
        WeaponProfile(
            name = "Relic Lightning Claws",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Ceaseless,
                Lethal(5),
                Rending
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Path to Damnation",
            usage = R.string.path_to_damnation_usage,
            description = R.string.path_to_damnation_description
        ),
        Ability(
            title = "Boons of Damnation",
            usage = R.string.boons_of_damnation_usage,
            description = R.string.boons_of_damnation_description
        ),

        ),
    keywords = listOf(
        "MURDERWING",
        "CHAOS",
        "HERETIC ASTARTES",
        "LEADER",
        "LORD",
        "40MM"
    )
)
