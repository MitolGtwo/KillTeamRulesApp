package com.example.killteamruleset.ui.data.Xenos.FarstalkerKinband

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Balanced
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val KrootStalker = Operative(
    name = "Kroot Stalker",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 8
    ),
    weapons = listOf(

        WeaponProfile(
            name = "Kroot Scattergun",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/3",
            keywords = listOf(
                Range(6)
            )
        ),
        WeaponProfile(
            name = "Stalker's Blade",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Balanced,
                Rending
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Stalker",
            usage = R.string.kroot_stalker_usage,
            description = R.string.kroot_stalker_description
        ),
        Ability(
            title = "Salvo",
            usage = R.string.kroot_salvo_usage,
            description = R.string.kroot_salvo_description
        )
    ),


    keywords = listOf(
        "FARSTALKER KINBAND",
        "T’AU EMPIRE",
        "KROOT",
        "STALKER",
        "28MM"

    )
)