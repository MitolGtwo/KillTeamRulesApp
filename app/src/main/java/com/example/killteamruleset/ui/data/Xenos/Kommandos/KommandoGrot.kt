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


val KommandoGrot = Operative(
    name = "Kommando Grot",
    imageRes = R.drawable.kommandos_grot,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 5
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Grot Choppa",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "5+",
            damage = "1/4",
            keywords = listOf(
                Devastating(2),
                Heavy(""),
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Sneaky Zogger",
            usage = R.string.sneaky_zogger_usage,
            description = R.string.sneaky_zogger_description
        ),
        Ability(
            title = "Grappling Hook_",
            usage = R.string.kommando_grappling_hook_usage,
            description = R.string.kommando_grappling_hook_description
        ),
    ),


    keywords = listOf(
        "KOMMANDO",
        "ORK",
        "GROT",
        "25MM"
    )
)