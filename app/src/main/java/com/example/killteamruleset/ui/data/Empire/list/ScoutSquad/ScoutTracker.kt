package com.example.killteamruleset.ui.data.Empire.list.ScoutSquad


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*
import kotlin.collections.listOf


val ScoutTracker = Operative(
    name = "Scout Tracker",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 10
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Boltgun",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Track Enemy",
            usage = R.string.track_enemy_usage,
            description = R.string.track_enemy_description
        ),
        Ability(
            title = "Auspex Scan",
            usage = R.string.scout_auspex_scan_usage,
            description = R.string.scout_auspex_scan_description
        ),
    ),


    keywords = listOf(
        "SCOUT SQUAD",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "TRACKER",
        "28MM"
    )
)