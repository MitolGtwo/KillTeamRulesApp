package com.example.killteamruleset.ui.data.Empire.list.DeathWatch

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathwatchHordeslayerVeteran = Operative(
    name = "Deathwatch Horde-Slayer Veteran",
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
            name = "Infernus Heavy Bolter (flame)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "2+",
            damage = "3/3",
            keywords = listOf(
              Range(8),
              Saturate,
              Torrent(2)
            )
        ),
              WeaponProfile(
            name = "Infernus Heavy Bolter (focused bolt)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
              Piercing_Crits(1)
            )
        ),
               WeaponProfile(
            name = "Infernus Heavy Bolter (sweeping bolt)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
              Piercing_Crits(1),
              Torrent(1)
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
          )
    ),

    abilities = listOf(
       
    ),


    keywords = listOf(
        "DEATHWATCH",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "GRAVIS",
        "HORDE-SLAYER",
        "40MM"

    )
)
