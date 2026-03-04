package com.example.killteamruleset.ui.data.Xenos.CorsairVoidscarred

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val VoidscarredFelarch = Operative(
    name = "Voidscarred Felarch",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "4+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Neuro disruptor",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Range(8),
                Piercing(1),
                Stun
            )
        ),
        WeaponProfile(
            name = "Shuriken pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8),
                Rending
            )
        ),
        WeaponProfile(
            name = "Shuriken Rifle",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Rending
            )
        ),
        WeaponProfile(
            name = "Power Weapon",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Lethal(5)
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Veteran Raider",
            usage = R.string.veteran_rider_usage,
            description = R.string.veteran_rider_description
        ),
        Ability(
            title = "One Step Ahead",
            usage = R.string.one_step_ahead_usage,
            description = R.string.one_step_ahead_description
        )
    ),


    keywords = listOf(
        "CORSAIR VOIDSCARRED",
        "AELDARI",
        "ANHRATHE",
        "LEADER",
        "FELARCH",
        "28MM"

    )
)
