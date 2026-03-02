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


val LegionaryAspiringChampion = Operative(
    name = "Legionary Aspiring Champion",
    imageRes = R.drawable.aod_captain,
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
            name = "Tainted Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Range(8),
                Rending
            )
        ),
        WeaponProfile(
            name = "Power Fist",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "4+",
            damage = "5/7",
            keywords = listOf(
                Brutal
            )
        ),
        WeaponProfile(
            name = "Power Maul",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
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
            name = "Tainted Chainsword",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Rending
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "In the Eyes of the Gods",
            usage = R.string.in_the_eye_of_the_gods_usage,
            description = R.string.in_the_eye_of_the_gods_description
        )
    ),
    keywords = listOf(
        "LEGIONARY",
        "CHAOS",
        "HERETIC ASTARTES",
        "LEADER",
        "ASPIRING CHAMPION",
        "32MM"
    )
)
