package com.example.killteamruleset.ui.data.Empire.list.Karskin


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val KasrkinDemoTrooper = Operative(
    name = "Kasrkin Demo-Trooper",
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
            title = "Melta Mine",
            usage = R.string.melta_mine_usage,
            description = R.string.melta_mine_description
        ),
        Ability(
            title = "Proximity Mine",
            usage = R.string.proximity_mine_usage,
            description = R.string.proximity_mine_description
        ),
        Ability(
            title = "Blast Padding",
            usage = R.string.blast_padding_usage,
            description = R.string.blast_padding_description
        )
    ),


    keywords = listOf(
        "KASRKIN",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "DEMO-TROOPER",
        "28MM"

    )
)