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
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val KommandoBreachaBoy = Operative(
    name = "Kommando Breacha Boy",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 10
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Slugga",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Breacha Ram",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "5/5",
            keywords = listOf(
                Brutal,
                Severe,
                Shock
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Breach",
            usage = R.string.kommando_breach_usage,
            description = R.string.kommando_breach_description
        )
    ),


    keywords = listOf(
        "KOMMANDO",
        "ORK",
        "BREACHA BOY",
        "32MM"
    )
)