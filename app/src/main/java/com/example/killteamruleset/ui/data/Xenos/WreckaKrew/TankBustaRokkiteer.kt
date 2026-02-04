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
            title = "Shokkwave",
            usage = "Passive",
            description = "Whenever an operative is within your Pulsa area of effect, subtract 2\"" +
                    "from its Move stat and worsen the hit stat of its weapons by 1. This is " +
                    "Cumulative with being injured.\nIn the Ready step of each Strategy phase, " +
                    "subtract 1 from your Pulsa marker´s points, If it reaches 0 points, remove it.\n" +
                    "(In practice, your Pulsa area of effect is smaller every turning pont.) "
        ),
        Ability(
            title = "Pulsa",
            usage = "Special Weapon Rule",
            description = "Don´t select a valid target, place your Pulsa marker visible to this operative, or" +
                " on Vantage terrain of a terrain feature that is visible to this operative. That marker" +
                " gains 1 Pulsa point, then roll attack dice as normal.\n It gains 1 additional Pulsa" +
                " point for each success(up to 3 additional points). \n This token has an area of effect" +
                " equal to its pulsa points, every point is 1\" of additional distance (To a max of 4\")." +
                "\n Deal D3 damage on each operative wholly within your Pulsa marker range(Roll for each)."
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