package com.example.killteamruleset.ui.data.Empire.list.DeathKorps

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathKorpsMedic = Operative(
    name = "Death Korps Medic",
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
        )
    ),

    abilities = listOf(
        Ability(
            title ="Medic!",
            usage = R.string.deathkorps_medic_usage,
            description = R.string.deathkorps_medic_description
        ),
        Ability(
            title = "Medikit",
            usage = R.string.deathkorps_medikit_usage,
            description = R.string.deathkorps_medikit_description
        )
    ),
    keywords = listOf(
        "DEATH KORP",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "MEDIC",
        "25MM"

    )
)
