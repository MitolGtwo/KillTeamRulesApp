package com.example.killteamruleset.ui.data.Xenos.FarstalkerKinband

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val KrootWarrior = Operative(
    name = "Kroot Warrior",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Kroot Rifle",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
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
            title = "Ready for Anything",
            usage = R.string.kroot_ready_for_anything_usage,
            description = R.string.kroot_ready_for_anything_description
        )
    ),


    keywords = listOf(
        "FARSTALKER KINBAND",
        "T’AU EMPIRE",
        "KROOT",
        "WARRIOR",
        "28MM"

    )
)