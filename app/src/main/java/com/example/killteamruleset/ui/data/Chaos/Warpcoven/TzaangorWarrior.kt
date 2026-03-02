package com.example.killteamruleset.ui.data.Chaos.Warpcoven


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Balanced
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val TzaangorWarrior = Operative(
    name = "Tzaangor Warrior",
    imageRes = R.drawable.plague_plaguecaster,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Autopistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Chainsword",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
            )
        ),

        WeaponProfile(
            name = "Tzaangor Blade & Shield",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
            ),
            extraRules = listOf("*Shield")
        ),

        WeaponProfile(
            name = "Tzaangor Blades",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Balanced
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Relic Hunters",
            usage = R.string.relic_hunters_usage,
            description = R.string.relic_hunters_description
        ),
        Ability(
            title = "Shield",
            usage = R.string.warpcoven_shield_usage,
            description = R.string.warpcoven_shield_description
        ),
    ),
    keywords = listOf(
        "WARPCOVEN",
        "CHAOS",
        "TZAANGOR",
        "WARRIOR",
        "32MM"
    )
)