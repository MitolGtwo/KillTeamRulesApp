package com.example.killteamruleset.ui.data.Empire.list.InquisitorialAgents

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val InterrogatorAgent = Operative(
    name = "Interrogator Agent",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Extended Stock Relic Autopistol",
            type = WeaponType.RANGED,
            attacks = 4 ,
            hit = "3+",
            damage = "2/4",
            keywords = listOf(
                Range(12),
                Lethal(5)
            )
        ),
        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Inquisitorial Tomes",
            usage = R.string.inquisitorial_tomes_usage,
            description = R.string.inquisitorial_tomes_description
        )
    ),


    keywords = listOf(
        "INQUISITORIAL AGENT",
        "IMPERIUM",
        "INQUISITION",
        "LEADER",
        "INTERROGATOR",
        "25MM"
    )
)