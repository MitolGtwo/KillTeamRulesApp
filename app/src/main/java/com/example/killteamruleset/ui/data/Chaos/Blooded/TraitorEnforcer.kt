package com.example.killteamruleset.ui.data.Chaos.Blooded


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val TraitorEnforcer = Operative(
    name = "Traitor Enforcer",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bolt Pistol",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Power Fist",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "5/7",
            keywords = listOf(
                Brutal
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Gruelling Disciplinarian",
            usage = R.string.gruelling_disciplinarian_usage,
            description = R.string.gruelling_disciplinarian_description
        ),
        Ability(
            title = "Enforce",
            usage = R.string.enforce_usage,
            description = R.string.enforce_description
        ),
    ),
    keywords = listOf(
        "BLOODED",
        "CHAOS",
        "ENFORCER",
        "25MM"

    )
)