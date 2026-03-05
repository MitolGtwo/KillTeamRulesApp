package com.example.killteamruleset.ui.data.Xenos.FarstalkerKinband

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val KrootColdBlood = Operative(
    name = "Kroot Cold-Blood ",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Kroot Tifle",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
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
            title = "Hardy",
            usage = R.string.kroot_hardy_usage,
            description = R.string.kroot_hardy_description
        ),
        Ability(
            title = "Cold-blooded",
            usage = R.string.cold_blooded_usage,
            description = R.string.cold_blooded_description
        ),
    ),


    keywords = listOf(
        "FARSTALKER KINBAND",
        " T’AU EMPIRE",
        "KROOT",
        "COLD-BLOOD",
        "28MM"

    )
)
