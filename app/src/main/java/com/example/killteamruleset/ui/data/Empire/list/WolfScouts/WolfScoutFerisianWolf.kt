package com.example.killteamruleset.ui.data.Empire.list.WolfScouts



import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val WolfScoutFenrisianWolf= Operative(
    name = "Wolf Scout Fenrisian Wolf",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "8\"",
        save = "5+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Fangs",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Rending
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Instinctive Predato",
            usage = R.string.instinctive_predato_usage,
            description = R.string.instinctive_predato_description
        ),
        Ability(
            title = "Pounce",
            usage = R.string.pounce_usage,
            description = R.string.pounce_description
        ),

        ),


    keywords = listOf(
        "WOLF SCOUT",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "SPACE WOLVES",
        "FENRISIAN WOLF",
        "60x35MM"
    )
)