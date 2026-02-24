package com.example.killteamruleset.ui.data.Empire.list.Ratlings


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val RatlingBattlemutt = Operative(
    name = "Ratling Battlemutt",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 4
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "2/4",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Early Warning",
            usage = R.string.early_warning_usage,
            description = R.string.early_warning_description
        ),
        Ability(
            title = "Beast",
            usage = R.string.ratling_beast_usage,
            description = R.string.ratling_beast_description
        ),
    ),


    keywords = listOf(
        "RATLING",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "BATTLEMUTT",
        "25MM"
    )
)