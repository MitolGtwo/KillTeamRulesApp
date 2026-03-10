package com.example.killteamruleset.ui.data.Xenos.HernkynYaegirs


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Accurate
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Concealed_Position
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Limited
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val YaegirTracker = Operative(
    name = "Yaegir Tracker",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "SiNR Handbow",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/5",
            keywords = listOf(
                Silent,
            )
        ),
        WeaponProfile(
            name = "Throwing Hatchet",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Range(6),
                Limited(1),
                Rending,
                Silent
            )
        ),
        WeaponProfile(
            name = "Hatchet",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(

            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Pan Spectral Visor",
            usage = R.string.yaegir_pan_spectral_visor_usage,
            description = R.string.yaegir_pan_spectral_visor_description
        ),
        Ability(
            title = "Tracker",
            usage = R.string.yaegir_tracker_usage,
            description = R.string.yaegir_tracker_description
        ),
    ),


    keywords = listOf(
        "HERNKYN YAEGIR",
        "LEAGUES OF VOTANN",
        "TRACKER",
        "28MM"
    )
)
