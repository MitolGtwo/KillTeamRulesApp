package com.example.killteamruleset.ui.data.Xenos.CorsairVoidscarred

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val VoidscarredStarstormDuellist = Operative(
    name = "Voidscarred Starstorm Duellist",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Fusion Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "5/3",
            keywords = listOf(
                Range(3),
                Devastating(3),
                Piercing(2)
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
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "3+",
            damage = "2/3",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Quick on the Trigger",
            usage = R.string.quick_trigger_usage,
            description = R.string.quick_trigger_description
        ),
        Ability(
            title = "Pistol Barrage",
            usage = R.string.corsair_pistol_barrage_usage,
            description = R.string.corsair_pistol_barrage_description
        )
    ),


    keywords = listOf(
        "CORSAIR VOIDSCARRED",
        "AELDARI",
        "ANHRATHE",
        "STARSTORM DUELLIST",
        "28MM"

    )
)