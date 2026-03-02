package com.example.killteamruleset.ui.data.Chaos.Warpcoven


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
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


val TzaangorChampion = Operative(
    name = "Tzaangor Champion",
    imageRes = R.drawable.plague_plaguecaster,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 10
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Greataxe",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Brutal,
                Lethal(5)
            )
        ),
        WeaponProfile(
            name = "Greatblade",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Lethal(5),
                Rending
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Savage Brutality",
            usage = R.string.savage_brutality_usage,
            description = R.string.savage_brutality_description
        )
    ),
    keywords = listOf(
        "WARPCOVEN",
        "CHAOS",
        "TZAANGOR",
        "CHAMPION",
        "32MM"
    )
)