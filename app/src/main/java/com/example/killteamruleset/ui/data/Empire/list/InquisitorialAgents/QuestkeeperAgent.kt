package com.example.killteamruleset.ui.data.Empire.list.InquisitorialAgents

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val QuestkeeperAgent = Operative(
    name = "Questkeeper Agent",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Autopistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Eviscerator",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "5/6",
            keywords = listOf(
                Brutal
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Irrepressible Purpose",
            usage = R.string.irrepressible_purpose_usage,
            description = R.string.irrepressible_purpose_description
        ),
        Ability(
            title = "Zealot",
            usage = R.string.inquisitorial_zealot_usage,
            description = R.string.inquisitorial_zealot_description
        )
    ),


    keywords = listOf(
        "INQUISITORIAL AGENT",
        "IMPERIUM",
        "INQUISITION",
        "QUESTKEEPER",
        "25MM"
    )
)