package com.example.killteamruleset.ui.data.Empire.list.DeathKorps

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathKorpsWatchMaster = Operative(
    name = "Death Korps Watch Master",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 8
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
            name = "Boltgun",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Plasma Pistol(standard)",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "4+",
            damage = "3/5",
            keywords = listOf(
                Range(8),
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Plasma Pistol(supercharge)",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "4+",
            damage = "4/6",
            keywords = listOf(
                Range(8),
                Piercing(1),
                Hot,
                Lethal(5)
            )
        ),
      WeaponProfile(
            name = "Relic Laspistol",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "4+",
            damage = "2/4",
            keywords = listOf(
                Range(8),
                Lethal(5)
            )
        ),
        WeaponProfile(
            name = "Bayonet",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "2/3",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Chainsword",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
            )
        ),

        WeaponProfile(
            name = "Power Weapon",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Lethal(5)
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = R.string.deathkorps_watchmaster_adaptive,
            usage = R.string.deathkorps_watchmaster_adaptive_usage,
            description = R.string.deathkorps_watchmaster_adaptive_description
        ),
        Ability(
            title = R.string.deathkorps_watchmaster_bring,
            usage = R.string.deathkorps_watchmaster_bring_usage,
            description = R.string.deathkorps_watchmaster_bring_description
        )
    ),


    keywords = listOf(
        "DEATH KORP",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "LEADER",
        "WATCHMASTER",
        "25MM"

    )
)
