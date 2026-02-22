package com.example.killteamruleset.ui.data.Empire.list.Karskin

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val KasrkinSergeant = Operative(
    name = "Kasrkin Sergeant",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "4+",
        wounds = 9
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
            name = "Hot-shot Lasgun",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Hot-shot Laspistol",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Plasma Pistol(standard)",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Range(8),
                Piercing(1),

            )
        ),
        WeaponProfile(
            name = "Plasma Pistol(supercharge)",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Range(8),
                Piercing(1),
                Hot,
                Lethal(5)
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
            name = "Gun Butt",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "3+",
            damage = "2/3",
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
            title = "Tactical Command",
            usage = R.string.tactical_command_usage,
            description = R.string.tactical_command_description
        ),
        Ability(
            title = "Veteran Leadership",
            usage = R.string.veteran_leadership_usage,
            description = R.string.veteran_leadership_description
        )
    ),


    keywords = listOf(
        "KASRKIN",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "LEADER",
        "SERGEANT",
        "28MM"

    )
)
