package com.example.killteamruleset.ui.data.Empire.list.Karskin


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val KasrkinVoxTrooper = Operative(
    name = "Kasrkin Vox-Trooper",
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
            title = "Battle Comms",
            usage = R.string.battle_comms_usage,
            description = R.string.battle_comms_description
        ),
    ),

    keywords = listOf(
        "KASRKIN",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "VOX-TROOPER",
        "28MM"

    )
)