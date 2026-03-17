package com.example.killteamruleset.ui.data.Xenos.Kommandos


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
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


val KommandoSlashaBoy = Operative(
    name = "Kommando Slasha Boy",
    imageRes = R.drawable.kommandos_slasha,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 10
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Throwing Knives",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "2/5",
            keywords = listOf(
                Range(6),
                Silent
            )
        ),
        WeaponProfile(
            name = "Twin choppas",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Ceaseless,
                Lethal(5)
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Dat All You Got?",
            usage = R.string.dat_all_you_got_usage,
            description = R.string.dat_all_you_got_description
        )
    ),


    keywords = listOf(
        "KOMMANDO",
        "ORK",
        "SLASHA BOY",
        "32MM"
    )
)