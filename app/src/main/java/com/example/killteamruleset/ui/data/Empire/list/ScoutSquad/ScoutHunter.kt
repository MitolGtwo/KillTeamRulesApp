package com.example.killteamruleset.ui.data.Empire.list.ScoutSquad


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*
import kotlin.collections.listOf


val ScoutHunter= Operative(
    name = "Scout Hunter",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 10
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Combat Blade",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Grapnel Launcher",
            usage = R.string.grapnel_launcher_usage,
            description = R.string.grapnel_launcher_description
        ),
        Ability(
            title = "Grapnel Assault",
            usage = R.string.grapnel_assault_usage,
            description = R.string.grapnel_assault_description
        ),
    ),


    keywords = listOf(
        "SCOUT SQUAD",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "HUNTER",
        "28MM"
    )
)