package com.example.killteamruleset.ui.data.Xenos.WreckaKrew


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val BreakaBoyFighter = Operative(
    name = "Breaka Boy Fighter",
    imageRes = R.drawable.wrecka_figther,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 12
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Smash Hammah",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "5/6",
            keywords = listOf(
                Brutal
            )
        )

    ),

    abilities = listOf(
        Ability(
            title = R.string.wrecka_fighter,
            usage = R.string.wrecka_fighter_usage,
            description = R.string.wrecka_fighter_description
        )
    ),
    keywords = listOf(
        "WRECKA KREW",
        "ORK",
        "BREAKABOY",
        "FIGHTER",
        "32MM"
    )
)