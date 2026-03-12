package com.example.killteamruleset.ui.data.Xenos.Mandrakes

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val MandrakeNightfiend = Operative(
    name = "Mandrake Nightfiend",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "5+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Baleblast",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            ),
            extraRules = listOf("*Soulstrike")
        ),
        WeaponProfile(
            name = "Huskblade",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Lethal(5),
                Shock
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Harrowing Whispers",
            usage = R.string.harrowing_whispers_usage,
            description = R.string.harrowing_whispers_description
        ),
        Ability(
            title = "Oubliex",
            usage = R.string.oubliex_usage,
            description = R.string.oubliex_description
        ),
    ),


    keywords = listOf(
        "MANDRAKE",
        "AELDARI",
        "DRUKHAR",
        "LEADER",
        "NIGHTFIEND",
        "28MM"
    )
)