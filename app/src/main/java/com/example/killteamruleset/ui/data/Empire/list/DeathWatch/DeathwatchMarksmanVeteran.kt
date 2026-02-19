package com.example.killteamruleset.ui.data.Empire.list.DeathWatch


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathwatchMarksmanVeteran = Operative(
    name = "Deathwatch Marksman Veteran",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 15
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Stalker Bolt Rifle (mobile)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Stalker Bolt Rifle (mobile)",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "2+",
            damage = "3/5",
            keywords = listOf(
              Heavy("Dash Only"),
              Lethal(5),
              Piecing_Crits(1)

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
        Ability(
            title = "Vigilant Marksman",
            usage = R.string.vigilant_marksman_usage,
            description = R.string.vigilant_marksman_description
        ),
    ),


    keywords = listOf(
        "DEATHWATCH",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "MARKSMAN"
        "32MM"

    )
)
