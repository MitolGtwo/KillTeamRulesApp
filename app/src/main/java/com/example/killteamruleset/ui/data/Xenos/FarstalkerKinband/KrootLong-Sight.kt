package com.example.killteamruleset.ui.data.Xenos.FarstalkerKinband

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Concealed_Position
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val KrootLongSight = Operative(
    name = "Kroot Long-Sight",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Kroot Hunting Rifle (concealed)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "3/3",
            keywords = listOf(
                Heavy(""),
                Devastating(3),
                Silent,
                Concealed_Position
            )
        ),
        WeaponProfile(
            name = "Kroot Hunting Rifle (mobile)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Kroot Hunting Rifle (stationary)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "3/3",
            keywords = listOf(
                Heavy(""),
                Devastating(3),
            )
        ),
        WeaponProfile(
            name = "Blade",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Long-Sight",
            usage = R.string.long_sight_usage,
            description = R.string.long_sight_description
        )
    ),


    keywords = listOf(
        "FARSTALKER KINBAND",
        "T’AU EMPIRE",
        "KROOT",
        "LONG-SIGHT",
        "28MM"

    )
)
