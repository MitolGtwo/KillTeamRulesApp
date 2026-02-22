package com.example.killteamruleset.ui.data.Empire.list.InquisitorialAgents

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val SisterOfSilenceVigilator = Operative(
    name = "Sister Of Silence Prosecutor",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "3+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Executioner Greatblade",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Lethal(5)
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Psychic Null",
            usage = R.string.psychic_null_usage,
            description = R.string.psychic_null_description
        )
    ),


    keywords = listOf(
        "INQUISITORIAL AGENT",
        "IMPERIUM",
        "ANATHEMA PSYKANA",
        "SISTER OF SILENCE",
        "VIGILATOR",
        "32MM"
    )
)