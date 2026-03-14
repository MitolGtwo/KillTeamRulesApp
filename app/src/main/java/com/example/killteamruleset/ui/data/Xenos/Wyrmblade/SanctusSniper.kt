package com.example.killteamruleset.ui.data.Xenos.Wyrmblade


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Limited
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Seek_light
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val SanctusSniper = Operative(
    name = "Sanctus Sniper",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "4+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Sanctus Sniper Rifle (mobile)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Sanctus Sniper Rifle (stationary)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "3/3",
            keywords = listOf(
                Devastating(3),
                Heavy("Dash Only"),
                Silent
            )
        ),
        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "2/4",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Target Vulnerability",
            usage = R.string.wyrm_tv_usage,
            description = R.string.wyrm_tv_description
        ),
        Ability(
            title = "Familias´s Soulsight",
            usage = R.string.familiar_soul_usage,
            description = R.string.familiar_soul_description
        ),

        ),


    keywords = listOf(
        "WYRMBLADE",
        "TYRANID",
        "GENESTEALER CULT",
        "CULT AGENT",
        "SANCTUS",
        "SNIPER",
        "32MM"
    )
)