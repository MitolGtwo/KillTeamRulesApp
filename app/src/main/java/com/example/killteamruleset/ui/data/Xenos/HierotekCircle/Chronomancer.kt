package com.example.killteamruleset.ui.data.Xenos.HierotekCircle


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Accurate
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val Chronomancer = Operative(
    name = "Chronomancer",
    imageRes = R.drawable.hierotek_chronomancer,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Aeonstave (ranged)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "3/3",
            keywords = listOf(
                Blast(2),
                Lethal(5),
                Stun
            ),
            extraRules = listOf("*Magnify")
        ),        WeaponProfile(
            name = "Entropic Lance (ranged)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "5/3",
            keywords = listOf(
                Devastating(3),
                Piercing(1)
            ),
            extraRules = listOf("*Magnify")
        ),
        WeaponProfile(
            name = "Aeonstave (melee)",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Lethal(5),
                Shock
            )
        ),
        WeaponProfile(
            name = "Entropic lance (melee)",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "3/6",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Interstitial Command",
            usage = R.string.interstitial_command_usage,
            description = R.string.interstitial_command_description
        ),
        Ability(
            title = "Timesplinter",
            usage = R.string.timesplinter_usage,
            description = R.string.timesplinter_description
        ),
        Ability(
            title = "Countertemporal Nanomine",
            usage = R.string.countertemporal_nanomine_usage,
            description = R.string.countertemporal_nanomine_description
        ),
        Ability(
            title = "Chronometron",
            usage = R.string.hierotek_chronometron_usage,
            description = R.string.hierotek_chronometron_description
        ),
    ),


    keywords = listOf(
        "HIEROTEK CIRCLE",
        "NECRON",
        "LEADER",
        "CRYPTEK",
        "CHRONOMANCER",
        "40MM"
    )
)
