package com.example.killteamruleset.ui.data.Empire.list.DeathWatch

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val DeathwatchDisruptorVeteran = Operative(
    name = "Deathwatch Disruptor Veteran",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "3+",
        wounds = 13
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Marksman Bolt Carbine",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
               Lethal(5)
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
        Ability(
            title = "Advance Omni-Scrambler",
            usage = R.string.advance_omniscrambler_usage,
            description = R.string.advance_omniscrambler_description
        ),
        Ability(
            title = "Auspex Triangulation",
            usage = R.string.auspex_triangulation_usage,
            description = R.string.auspex_triangulation_description
        )
    ),


    keywords = listOf(
        "DEATHWATCH",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "DISRUPTOR",
        "32MM"
    )
)
