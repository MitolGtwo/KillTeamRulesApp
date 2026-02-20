package com.example.killteamruleset.ui.data.Empire.list.ElucidianStarstriders

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val Canid = Operative(
    name = "Canid",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "8\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Vicious Bite",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Rending
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Beast",
            usage = R.string.elucidian_beast_usage,
            description = R.string.elucidian_beast_description
        ),
        Ability(
            title = "Loyal Companion",
            usage = R.string.loyal_companion_usage,
            description = R.string.loyal_companion_description
        ),
        Ability(
            title = "Gather",
            usage = R.string.gather_usage,
            description = R.string.gather_description
        ),
    ),


    keywords = listOf(
        "ELUCIDIAN STARSTRIDER",
        "IMPERIUM",
        "CANID",
        "25MM"
    )
)
