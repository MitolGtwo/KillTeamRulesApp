package com.example.killteamruleset.ui.data.Empire.list.WolfScouts


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val WolfScoutTrapmaster= Operative(
    name = "Wolf Scout Trapmaster",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "3+",
        wounds = 13
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Plasma Pistol (standard)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Range(8),
                Piercing(1),
            )
        ),
        WeaponProfile(
            name = "Plasma Pistol (supercharge)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Range(8),
                Hot,
                Lethal(5),
                Piercing(1),
            )
        ),
        WeaponProfile(
            name = "Combat Blade",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Haywire Mine",
            usage = R.string.wolf_haywire_mine_usage,
            description = R.string.wolf_haywire_mine_description
        ),
        Ability(
            title = "Proximity Mine",
            usage = R.string.wolf_proximity_mine_usage,
            description = R.string.wolf_proximity_mine_description
        ),

        ),


    keywords = listOf(
        "WOLF SCOUT",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "SPACE WOLVES",
        "TRAPMASTER",
        "32MM"
    )
)