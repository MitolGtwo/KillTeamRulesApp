package com.example.killteamruleset.ui.data.Xenos.Kommandos


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Concealed_Position
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Seek_light
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val KommandoSnipaBoy = Operative(
    name = "Kommando Snipa Boy",
    imageRes = R.drawable.kommandos_snipa,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 10
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Scoped Big Shoota (concealed)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "3/3",
            keywords = listOf(
                Devastating(2),
                Heavy(""),
                Silent,
                Concealed_Position,
            )
        ),
        WeaponProfile(
            name = "Scoped Big Shoota (stationary)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "3/3",
            keywords = listOf(
                Devastating(2),
                Heavy(""),
            )
        ),
        WeaponProfile(
            name = "Scoped Big Shoota (sweeping)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Heavy("Dash Only"),
                Torrent(1)
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

    ),


    keywords = listOf(
        "KOMMANDO",
        "ORK",
        "SNIPA BOY",
        "32MM"
    )
)