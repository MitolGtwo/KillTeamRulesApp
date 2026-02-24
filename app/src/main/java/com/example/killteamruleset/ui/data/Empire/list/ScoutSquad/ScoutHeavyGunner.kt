package com.example.killteamruleset.ui.data.Empire.list.ScoutSquad


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*
import kotlin.collections.listOf


val ScoutHeavyGunner = Operative(
    name = "Scout Heavy Gunner",
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
            name = "Heavy Bolter (focused)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Heavy("Dash Only"),
                Piercing_Crits(1)
            )
        ),

        WeaponProfile(
            name = "Heavy Bolter (sweeping)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Heavy("Dash Only"),
                Piercing_Crits(1),
                Torrent(1)
            )

        ),

        WeaponProfile(
            name = "Missile launcher (frag)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Blast(2),
                Heavy("Dash Only"),
            )
        ),

        WeaponProfile(
            name = "Missile launcher (krak)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Heavy("Dash Only"),
                Piercing(1)
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
    ),


    keywords = listOf(
        "SCOUT SQUAD",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "HEAVY GUNNER",
        "28MM"
    )
)