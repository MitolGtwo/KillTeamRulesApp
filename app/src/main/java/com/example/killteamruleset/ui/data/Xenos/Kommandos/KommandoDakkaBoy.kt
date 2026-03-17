package com.example.killteamruleset.ui.data.Xenos.Kommandos


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Seek_light
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val KommandoDakkaBoy = Operative(
    name = "Kommando Dakka Boy",
    imageRes = R.drawable.kommandos_dakka,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 10
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Dakka Shoota (short range)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Range(9),
                Ceaseless
            )
        ),
        WeaponProfile(
            name = "Dakka Shoota (long range)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
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
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Dakka Dash",
            usage = R.string.dakka_dash_usage,
            description = R.string.dakka_dash_description
        )
        ),


    keywords = listOf(
        "KOMMANDO",
        "ORK",
        "DAKKA BOY",
        "32MM"
    )
)