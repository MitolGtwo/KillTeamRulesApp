package com.example.killteamruleset.ui.data.Empire.list.InquisitorialAgents


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val AutosavantAgent = Operative(
    name = "Autosavant Agent",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Mechanical Appendages",
            type = WeaponType.MELEE,
            attacks = 3 ,
            hit = "5+",
            damage = "1/2",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Scrivener",
            usage = R.string.scrivener_usage,
            description = R.string.scrivener_description
        ),
        Ability(
            title = "Irrefutable Report",
            usage = R.string.irrefutable_report_usage,
            description = R.string.irrefutable_report_description
        ),
        Ability(
            title = "Lightly Armed",
            usage = R.string.lightly_armed_usage,
            description = R.string.lightly_armed_description
        ),
    ),


    keywords = listOf(
        "INQUISITORIAL AGENT",
        "IMPERIUM",
        "INQUISITION",
        "AUTOSAVANT",
        "25MM"
    )
)
