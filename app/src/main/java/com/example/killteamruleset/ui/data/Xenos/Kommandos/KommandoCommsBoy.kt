package com.example.killteamruleset.ui.data.Xenos.Kommandos

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
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


val KommandoCommsBoy = Operative(
    name = "Kommando Comms Boy",
    imageRes = R.drawable.kommandos_vox,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 10
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Shokka Pistol",
            type = WeaponType.RANGED,
            attacks = 6,
            hit = "4+",
            damage = "1/0",
            keywords = listOf(
                Range(8),
                Devastating(2),
                Severe,
                Stun
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
            title = "I Got a Plan, Ladz",
            usage = R.string.plan_ladz_usage,
            description = R.string.plan_ladz_description
        ),
        Ability(
            title = "Listen In",
            usage = R.string.listen_in_usage,
            description = R.string.listen_in_description
        ),

    ),


    keywords = listOf(
        "KOMMANDO",
        "ORK",
        "COMMS BOY",
        "32MM"
    )
)