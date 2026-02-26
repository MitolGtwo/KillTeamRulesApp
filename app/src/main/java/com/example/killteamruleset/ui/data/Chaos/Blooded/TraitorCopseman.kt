package com.example.killteamruleset.ui.data.Chaos.Blooded


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val TraitorCorpseman = Operative(
    name = "Traitor Corpseman",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Lasgun",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Bayonet",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Stimm Needle",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "5+",
            damage = "1/4",
            keywords = listOf(
                Lethal(5)
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Regular Dosage",
            usage = R.string.regular_dosage_usage,
            description = R.string.regular_dosage_description
        ),
        Ability(
            title = "Stimms",
            usage = R.string.stimms_usage,
            description = R.string.stimms_description
        ),
    ),
    keywords = listOf(
        "BLOODED",
        "CHAOS",
        "CORPSEMAN",
        "25MM"

    )
)

