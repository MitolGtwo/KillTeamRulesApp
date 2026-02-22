package com.example.killteamruleset.ui.data.Empire.list.DeathWatch

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathwatchBlademasterVeteran = Operative(
    name = "Deathwatch Blademaster Veteran",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 15
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Special Issue Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
               Range(8),
              Piercing(1)
            )
        ),
       WeaponProfile(
            name = "Xenophase blade (duel)",
            type = WeaponType.MELEE,
            attacks =5,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
               Brutal,
              Lethal(5)
            )
        ),
  
        WeaponProfile(
            name = "Xenophase blade (phase sweep)",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
              Brutal,
              Lethal(5)
            ),
            extraRules = listOf("*Phase Sweep")

        )
    ),

    abilities = listOf(
        Ability(
            title = "*Phase Sweep",
            usage = R.string.phase_sweep_usage,
            description = R.string.phase_sweep_description
        ),
        Ability(
            title = "Adaptive Swordmanship",
            usage = R.string.adaptive_swordmanship_usage,
            description = R.string.adaptive_swordmanship_description
        )
    ),


    keywords = listOf(
        "DEATHWATCH",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "BLADEMASTER",
        "32MM"

    )
)
