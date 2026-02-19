package com.example.killteamruleset.ui.data.Empire.list.DeathWatch

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathwatchBreacherVeteran = Operative(
    name = "Deathwatch Breacher Veteran",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "5\"",
        save = "3+",
        wounds = 18
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Auxiliary Grenade Launcher (frag)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "2/4",
            keywords = listOf(
               Blast(2)
            )
        ),
              WeaponProfile(
            name = "Auxiliary Grenade Launcher (krak)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
              Piercing(1)
            )
        ),
              WeaponProfile(
            name = "Hellstorm Bolt Rifle",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
              Torrent(1)
            )
        ),
               WeaponProfile(
            name = "Melta Bomb",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "5/3",
            keywords = listOf(
              Range(3),
              Devastating(3),
              Heavy("Reposition Only"),
              Limited(1),
              Piercing(2)
            )
        ),
              WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
    ),

    abilities = listOf(
       
    ),


    keywords = listOf(
        "DEATHWATCH",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "GRAVIS",
        "BREACHER",
        "40MM"

    )
)
