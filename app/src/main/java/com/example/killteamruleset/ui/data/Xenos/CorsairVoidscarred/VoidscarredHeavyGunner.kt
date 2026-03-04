package com.example.killteamruleset.ui.data.Xenos.CorsairVoidscarred

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val VoidscarredHeavyGunner = Operative(
    name = "Voidscarred Heavy Gunner",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Shuriken Cannon (focused)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Heavy("Dash Only"),
                Rending
            )
        ),
        WeaponProfile(
            name = "Shuriken Cannon (sweeping)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Heavy("Dash Only"),
                Rending,
                Torrent(1)
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
            name = "Wraithcannon",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "6/3",
            keywords = listOf(
                Devastating(4),
                Heavy("Dash Only"),
                Piercing(2)
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

    ),


    keywords = listOf(
        "CORSAIR VOIDSCARRED",
        "AELDARI",
        "ANHRATHE",
        "HEAVY GUNNER",
        "28MM"

    )
)