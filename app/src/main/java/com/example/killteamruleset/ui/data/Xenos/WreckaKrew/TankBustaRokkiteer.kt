package com.example.killteamruleset.ui.data.Xenos.WreckaKrew

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Limited
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Relentless
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val TankbustaRokkiteer= Operative(
    name = "Tankbusta Rokkiteer",
    imageRes = R.drawable.wrecka_rokkiter,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 12
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Pulsa Rokkit",
            type = WeaponType.RANGED,
            attacks = 6,
            hit = "5+",
            damage = "4/5",
            keywords = listOf(
                Heavy("Reposition Only"),
                Limited(1),
            ),
            extraRules = listOf("*Pulsa")
        ),
        WeaponProfile(
            name = "Rokkit Rack",
            type = WeaponType.RANGED,
            attacks = 6,
            hit = "5+",
            damage = "4/5",
            keywords = listOf(
                Blast(2),
                Heavy("Reposition Only"),
                Limited(1),
                Relentless
            )
        ),
        WeaponProfile(
            name = "Rokkit launcha",
            type = WeaponType.RANGED,
            attacks = 6,
            hit = "5+",
            damage = "4/5",
            keywords = listOf(
                Blast(1)
            )
        ),
        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        )

    ),

    abilities = listOf(
        Ability(
            title = R.string.wrecka_rokkiteer_shock,
            usage = R.string.wrecka_rokkiteer_shock_usage,
            description = R.string.wrecka_rokkiteer_shock_description
        ),
        Ability(
            title = R.string.wrecka_pulsa,
            usage = R.string.wrecka_pulsa_usage,
            description = R.string.wrecka_pulsa_description
        )
    ),
    keywords = listOf(
        "WRECKA KREW",
        "ORK",
        "TANKBUSTA",
        "ROKKITEER",
        "32MM"
    )
)