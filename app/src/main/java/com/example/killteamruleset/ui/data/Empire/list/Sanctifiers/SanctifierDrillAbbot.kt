package com.example.killteamruleset.ui.data.Empire.list.Sanctifiers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*
import kotlin.collections.listOf


val SanctifierDrillAbbot = Operative(
    name = "Sanctifier Drill Abbot",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Great Hammer",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "4/4",
            keywords = listOf(
                Brutal,
                Shock
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Schola Progenium Disciplinarian",
            usage = R.string.schola_progenium_disciplinarian_usage,
            description = R.string.schola_progenium_disciplinarian_description
        ),
        Ability(
            title = "Null Skull",
            usage = R.string.null_skull_usage,
            description = R.string.null_skull_description
        ),
    ),


    keywords = listOf(
        "SANCTIFIER",
        "IMPERIUM",
        "ADEPTUS MINISTORUM",
        "DRILL ABBOT",
        "25MM"
    )
)