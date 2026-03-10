package com.example.killteamruleset.ui.data.Xenos.HandOfTheArchon

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Seek
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val KabaliteSkysplinterAssassin = Operative(
    name = "Kabalite Skysplinter Assassin",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Razorwing",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "1/2",
            keywords = listOf(
                Saturate,
                Seek,
                Silent
            )
        ),
        WeaponProfile(
            name = "Shardcarbine",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "2/2",
            keywords = listOf(
                Devastating(2),
                Lethal(3),

            )
        ),
        WeaponProfile(
            name = "Array of blades",
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
            title = "Merciless Hunter",
            usage = R.string.merciless_hunter_usage,
            description = R.string.merciless_hunter_description
        ),
        Ability(
            title = "Omen",
            usage = R.string.omen_usage,
            description = R.string.omen_description
        ),
        Ability(
            title = "Mark",
            usage = R.string.hand_mark_usage,
            description = R.string.hand_mark_description
        ),
    ),


    keywords = listOf(
        "HAND OF THE ARCHON",
        "AELDARI",
        "DRUKHARI",
        "SKYSPLINTER ASSASSIN",
        "25MM"
    )
)