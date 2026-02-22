package com.example.killteamruleset.ui.data.Empire.list.DeathWatch


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathwatchWatchSergeant = Operative(
    name = "Deathwatch Watch Sergeant",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 15
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Plasma Pistol (standard)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Range(8),
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Plasma Pistol (supercharge)",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
               Range(8),
                Hot,
                Lethal(5),
                Piercing(1)
            )
        ),
  
        WeaponProfile(
            name = "Power Weapon",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
              Lethal(5)
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Adaptable Armoury",
            usage = R.string.adaptive_armoury_usage,
            description = R.string.adaptive_armoury_description
        ),
        Ability(
            title = "Strategic Command",
            usage = R.string.strategic_command_usage,
            description = R.string.strategic_command_description
        )
    ),


    keywords = listOf(
        "DEATHWATCH",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "LEADER",
        "WATCH SERGEANT",
        "32MM"

    )
)
