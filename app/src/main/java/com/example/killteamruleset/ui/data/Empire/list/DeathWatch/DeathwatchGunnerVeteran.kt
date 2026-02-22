package com.example.killteamruleset.ui.data.Empire.list.DeathWatch

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathwatchGunnerVeteran = Operative(
    name = "Deathwatch Gunner Veteran",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 15
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
            name = "Heavy Plasma Incinerator (standard)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
               Piercing(1)
            )
        ),
              WeaponProfile(
            name = "Heavy Plasma Incinerator (supercharge)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "5/6",
            keywords = listOf(
               Hot,
               Lethal(5),
               Piercing(1)
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
        "GUNNER",
        "32MM"
    )
)
