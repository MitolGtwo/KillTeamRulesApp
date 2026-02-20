package com.example.killteamruleset.ui.data.Empire.list.ElucidianStarstriders


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val VoidMaster = Operative(
    name = "Void Master",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 8
    ),
    weapons = listOf(
          WeaponProfile(
            name = "Artificer Shotgun (close range)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/4",
            keywords = listOf(
                Range(6),
            )
        ),
          WeaponProfile(
            name = "Artificer Shotgun (long range)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "5+",
            damage = "2/2",
            keywords = listOf(
            )
        ),
          WeaponProfile(
            name = "Relic Laspistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "2/4",
            keywords = listOf(
                Range(8),
                Lethal(5)
            )
        ),
        WeaponProfile(
            name = "Gun Butt",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Disciplinarian",
            usage = R.string.disciplinarian_usage,
            description = R.string.disciplinarian_description
        ),
        Ability(
            title = "Hardy",
            usage = R.string.elucidian_hardy_usage,
            description = R.string.elucidian_hardy_description
        ),
              Ability(
            title = "Uncompromising Fire",
            usage = R.string.uncompromising_fire_usage,
            description = R.string.uncompromising_fire_description
        )
    ),


    keywords = listOf(
        "ELUCIDIAN STARSTRIDER",
        "IMPERIUM",
        "NAVIS",
        "VOIDMASTER",
        "25MM"
    )
)
