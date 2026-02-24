package com.example.killteamruleset.ui.data.Empire.list.PhobosStrikeTeam


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val InfiltratorSaboteur = Operative(
    name = "Infiltrator Saboteur",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "3+",
        wounds = 12
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Marksman Bolt Carbine",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Lethal(5)
            )
        ),
        WeaponProfile(
            name = "Remote Detonator",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "5/6",
            keywords = listOf(
                Heavy("Dash only"),
                Limited(1),
                Piercing(1),
                Silent
            ),
            extraRules = listOf("*Detonate")
        ),

        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Plant Explosives",
            usage = R.string.plant_explosives_usage,
            description = R.string.plant_explosives_description
        ),
        Ability(
            title = "Detonate",
            usage = R.string.phobos_detonate_usage,
            description = R.string.phobos_detonate_description
        ),
    ),


    keywords = listOf(
        "PHOBOS STRIKE TEAM",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "INFILTRATOR",
        "SABOTEUR",
        "32MM"
    )
)