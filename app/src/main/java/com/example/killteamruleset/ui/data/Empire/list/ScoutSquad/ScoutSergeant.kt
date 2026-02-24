package com.example.killteamruleset.ui.data.Empire.list.ScoutSquad


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*
import kotlin.collections.listOf


val ScoutSergeant = Operative(
    name = "Scout Sergeant",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "4+",
        wounds = 11
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
            title = "Guidance and Experience",
            usage = R.string.guidance_and_experience_usage,
            description = R.string.guidance_and_experience_description
        ),
        Ability(
            title = "Astartes",
            usage = R.string.scout_astartes_usage,
            description = R.string.scout_astartes_description
        ),
    ),


    keywords = listOf(
        "SCOUT SQUAD",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "LEADER",
        "SERGEANT",
        "28MM"
    )
)