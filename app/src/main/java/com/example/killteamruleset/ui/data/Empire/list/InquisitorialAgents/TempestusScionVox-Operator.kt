package com.example.killteamruleset.ui.data.Empire.list.InquisitorialAgents

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val TempestusScionVoxOperator = Operative(
    name = "Tempestus Scion Vox-Operator",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Hot-shot Lasgun",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Gun Butt",
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
            title = "Signal",
            usage = R.string.inquisitorial_signal_usage,
            description = R.string.inquisitorial_signal_description
        )
    ),


    keywords = listOf(
        "INQUISITORIAL AGENT",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "TEMPESTUS SCION",
        "VOX-OPERATOR",
        "25MM"
    )
)