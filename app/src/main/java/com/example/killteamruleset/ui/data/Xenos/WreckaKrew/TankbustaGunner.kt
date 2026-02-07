package com.example.killteamruleset.ui.data.Xenos.WreckaKrew


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val TankbustaGunner= Operative(
    name = "Tank busta Gunner",
    imageRes = R.drawable.wrecka_gunner,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 12
    ),
    weapons = listOf(
        WeaponProfile(
            name = "´Eavy rokkit launcha",
            type = WeaponType.RANGED,
            attacks = 6,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Blast(1)
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
            title = R.string.wrecka_gunner,
            usage = R.string.wrecka_gunner_usage,
            description = R.string.wrecka_gunner_description
        )
    ),
    keywords = listOf(
        "WRECKA KREW",
        "ORK",
        "TANKBUSTA",
        "GUNNER",
        "32MM"
    )
)