package com.example.killteamruleset.ui.data.Empire.list.ScoutSquad


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*
import kotlin.collections.listOf


val ScoutWarrior = Operative(
    name = "Scout Warrior",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 10
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Astartes Shotgun",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "4/4",
            keywords = listOf(
                Range(6),
            )
        ),
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
            name = "Boltgun",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Chainsword",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Adaptive Equipment",
            usage = R.string.scout_adaptive_equipment_usage,
            description = R.string.scout_adaptive_equipment_description
        )
    ),


    keywords = listOf(
        "SCOUT SQUAD",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "WARRIOR",
        "28MM"
    )
)