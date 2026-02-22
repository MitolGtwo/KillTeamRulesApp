package com.example.killteamruleset.ui.data.Empire.list.InquisitorialAgents

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val MysticAgent = Operative(
    name = "Mystic Agent",
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
            attacks = 4 ,
            hit = "2+",
            damage = "2/3",
            keywords = listOf(
                Range(8),
                Seek
            )
        ),
        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "5+",
            damage = "2/3",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Icon Bearer",
            usage = R.string.inquisitorial_icon_bearer_usage,
            description = R.string.inquisitorial_icon_bearer_description
        ),
        Ability(
            title = "Lightly Armed",
            usage = R.string.lightly_armed_usage,
            description = R.string.lightly_armed_description
        ),
        Ability(
            title = "Scry",
            usage = R.string.scry_usage,
            description = R.string.scry_description
        )
    ),


    keywords = listOf(
        "INQUISITORIAL AGENT",
        "IMPERIUM",
        "INQUISITION",
        "PSYKER",
        "MYSTIC",
        "25MM"
    )
)