package com.example.killteamruleset.ui.data.Xenos.CorsairVoidscarred

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Psychic
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val VoidscarredWaySeeker = Operative(
    name = "Voidscarred Way Seeker",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Freezing grasp",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "1/2",
            keywords = listOf(
                Psychic,
                Severe,
                Silent,
                Stun
            )
        ),
        WeaponProfile(
            name = "Lightning Strike",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/3",
            keywords = listOf(
                Psychic,
                Devastating(2,"2\"")
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
            name = "Witch Staff",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Psychic,
                Shock
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Warp Fold",
            usage = R.string.warp_fold_usage,
            description = R.string.warp_fold_description
        ),
        Ability(
            title = "Warding Shield",
            usage = R.string.warding_shield_usage,
            description = R.string.warding_shield_description
        ),
    ),


    keywords = listOf(
        "CORSAIR VOIDSCARRED",
        "AELDARI",
        "ANHRATHE",
        "PSYKER",
        "WAY SEEKER",
        "28MM"

    )
)