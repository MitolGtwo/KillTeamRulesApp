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


val KommandoBossNob = Operative(
    name = "Kommando Boss Nob",
    imageRes = R.drawable.kommandos_boss,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "5+",
        wounds = 14
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
            name = "Big Choppa",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "5/6",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Power klaw",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "5/7",
            keywords = listOf(
                Brutal,
                Shock
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Krumpin’ Time",
            usage = R.string.krumping_time_usage,
            description = R.string.krumping_time_description
        ),
        Ability(
            title = "Get It Dun!",
            usage = R.string.get_it_dun_usage,
            description = R.string.get_it_dun_description
        ),
    ),


    keywords = listOf(
        "KOMMANDO",
        "ORK",
        "LEADER",
        "BOSS NOB",
        "32MM"
    )
)