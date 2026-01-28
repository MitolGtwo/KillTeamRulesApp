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
    imageRes = R.drawable.alpharanger,
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
            title = "Kompetitive Streak",
            usage = "Passive",
            description = "Once per Shoot action, if this operative shoots an enemy Operative that" +
                    " another friendly operative has already shot during this turning point, you" +
                    " gain 1 Wrecka point. Determine this when you select a valid target, but you can" +
                    "include any secondary targets when doing so (Ex from the Blast weapon rule)."
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