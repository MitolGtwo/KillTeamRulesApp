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
            title = "Adaptive Orders",
            usage = "Passive/Firefight phase",
            description = "If this Operative doesn't issue a Guardsman Order as a Strategic Gambit," +
                          " you can use the Inspirational Leadership Firefight ploy for 0CP during this" +
                          " Operative´s activation."
        ),
        Ability(
            title = "Bring it Down!",
            usage = "Strategic Gambit",
            description = "If this Operative is in the killzone. Select one enemy operative. Whenever a friendly" +
                          " DEATH KORP Operative is shooting, fighting or retaliating against that enemy Operative" +
                          ", that friendly Operative´s weapons have the Punishing weapon rule."
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
