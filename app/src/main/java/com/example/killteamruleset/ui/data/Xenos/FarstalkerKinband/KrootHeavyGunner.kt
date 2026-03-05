package com.example.killteamruleset.ui.data.Xenos.FarstalkerKinband

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val KrootHeavyGunner = Operative(
    name = "Kroot Heavy Gunner",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Dvorgite skinner",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "2+",
            damage = "3/3",
            keywords = listOf(
                Range(6),
                Heavy("Reposition Only"),
                Piercing(2),
                Torrent(2)
            )
        ),
        WeaponProfile(
            name = "Londaxi tribalest",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Heavy("Reposition Only"),
                Piercing(1),
                Rending
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

    ),


    keywords = listOf(
        "FARSTALKER KINBAND",
        "T’AU EMPIRE",
        "KROOT",
        "HEAVY GUNNER",
        "28MM"

    )
)
