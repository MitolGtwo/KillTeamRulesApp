package com.example.killteamruleset.ui.data.Xenos.HernkynYaegirs


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Accurate
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Limited
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val YaegirGunner = Operative(
    name = "Yaegir Gunner",
    imageRes = R.drawable.yaegirs_gunner,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "APM Launcher (armour piercing)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Heavy("Reposition Only"),
                Piercing(1)
            ),
            extraRules = listOf("*Bipod")
        ),
        WeaponProfile(
            name = "APM Launcher (breaching)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "4+",
            damage = "3/5",
            keywords = listOf(
                Blast(2),
                Heavy("Reposition Only")
            ),
            extraRules = listOf("*Bipod")
        ),
        WeaponProfile(
            name = "APM Launcher ((high explosive)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "4+",
            damage = "2/4",
            keywords = listOf(
                Blast(3),
                Heavy("Reposition Only")
            ),
            extraRules = listOf("*Bipod")
        ),
        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(

            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Bipod",
            usage = R.string.yaegirs_bipod_usage,
            description = R.string.yaegirs_bipod_description
        )
    ),


    keywords = listOf(
        "HERNKYN YAEGIR",
        "LEAGUES OF VOTANN",
        "GUNNER",
        "28MM"
    )
)
