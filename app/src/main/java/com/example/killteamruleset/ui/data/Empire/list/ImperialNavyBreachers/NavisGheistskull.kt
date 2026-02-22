package com.example.killteamruleset.ui.data.Empire.list.ImperialNavyBreachers

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val NavisGheistskull = Operative(
    name = "Navis Gheistskull",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "8\"",
        save = "5+",
        wounds = 5
    ),
    weapons = listOf(


    ),

    abilities = listOf(
        Ability(
            title = "Machine",
            usage = R.string.navy_machine_usage,
            description = R.string.navy_machine_description
        ),
        Ability(
            title = "Expendable",
            usage = R.string.navy_expendable_usage,
            description = R.string.navy_expendable_description
        ),
        Ability(
            title = "Boost",
            usage = R.string.navy_boost_usage,
            description = R.string.navy_boost_description
        ),
    ),


    keywords = listOf(
        "IMPERIAL NAVY BREACHER",
        "IMPERIUM",
        "GHEISTSKULL",
        "25MM"
    )
)

