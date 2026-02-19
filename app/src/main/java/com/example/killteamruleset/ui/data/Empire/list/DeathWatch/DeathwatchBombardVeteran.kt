package com.example.killteamruleset.ui.data.Empire.list.DeathWatch

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathwatchBombardVeteran = Operative(
    name = "Deathwatch Bombard Veteran",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "5\"",
        save = "3+",
        wounds = 18
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
               Range(8)
            )
        ),
              WeaponProfile(
            name = "Frag Cannon (shell)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "5/7",
            keywords = listOf(
              Piercing(1)
            )
        ),
              WeaponProfile(
            name = "Frag Cannon (shrapnel)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
              Torrent(2)
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
        "BOMBARD",
        "40MM"

    )
)
