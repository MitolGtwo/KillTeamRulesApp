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


val TzaangorIconBearer = Operative(
    name = "Tzaangor Icon Bearer",
    imageRes = R.drawable.plague_plaguecaster,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Dagger",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "3/5",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Herd Banner",
            usage = R.string.herd_banner_usage,
            description = R.string.herd_banner_description
        ),
        Ability(
            title = "Icon Bearer",
            usage = R.string.warpcoven_icon_bearer_usage,
            description = R.string.warpcoven_icon_bearer_description
        ),
    ),
    keywords = listOf(
        "WARPCOVEN",
        "CHAOS",
        "TZAANGOR",
        "ICON BEARER",
        "32MM"
    )
)