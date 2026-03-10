package com.example.killteamruleset.ui.data.Xenos.HandOfTheArchon

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val KabaliteFlayer = Operative(
    name = "Kabalite Flayer",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Pain Sculptors",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Ceaseless
            ),
            extraRules = listOf("*Flay")
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Insensible to Pain",
            usage = R.string.insensible_to_pain_usage,
            description = R.string.insensible_to_pain_description
        ),
        Ability(
            title = "Flay",
            usage = R.string.hand_flay_usage,
            description = R.string.hand_flay_description
        )
    ),


    keywords = listOf(
        "HAND OF THE ARCHON",
        "AELDARI",
        "DRUKHARI",
        "FLAYER",
        "25MM"
    )
)