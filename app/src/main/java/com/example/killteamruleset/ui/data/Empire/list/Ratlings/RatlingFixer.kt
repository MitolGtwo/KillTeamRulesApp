package com.example.killteamruleset.ui.data.Empire.list.Ratlings


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val RatlingFixer = Operative(
    name = "Ratling Fixer",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Battle Rifle",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Sniper Rifle (mobile)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Sniper Rifle (stationary)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "3/3",
            keywords = listOf(
                Devastating(3),
                Heavy("")
            )
        ),

        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "5+",
            damage = "1/2",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Munitorum Contacts",
            usage = R.string.munitorum_contact_usage,
            description = R.string.munitorum_contact_description
        ),
        Ability(
            title = "Target Designation",
            usage = R.string.target_designation_usage,
            description = R.string.target_designation_description
        ),
    ),


    keywords = listOf(
        "RATLING",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "LEADER",
        "FIXER",
        "25MM"
    )
)