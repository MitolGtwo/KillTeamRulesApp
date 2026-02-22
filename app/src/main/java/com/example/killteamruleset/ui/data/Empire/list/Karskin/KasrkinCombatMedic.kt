package com.example.killteamruleset.ui.data.Empire.list.Karskin

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val KasrkinCombatMedic = Operative(
    name = "Kasrkin Combat Medic",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
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
            name = "Gun Butt",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "3+",
            damage = "2/3",
            keywords = listOf(
            )
        ),

    ),

    abilities = listOf(
        Ability(
            title = "Medic!",
            usage = R.string.kasrkin_medic_usage,
            description = R.string.kasrkin_medic_description
        ),
        Ability(
            title = "Medikit",
            usage = R.string.kasrkin_medikit_usage,
            description = R.string.kasrkin_medikit_description
        )
    ),


    keywords = listOf(
        "KASRKIN",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "MEDIC",
        "COMBAT MEDIC",
        "28MM"

    )
)
