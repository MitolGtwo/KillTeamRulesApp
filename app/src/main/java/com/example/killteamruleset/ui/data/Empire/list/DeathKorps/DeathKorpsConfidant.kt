package com.example.killteamruleset.ui.data.Empire.list.DeathKorps

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathKorpsConfidant = Operative(
    name = "Death Korps Confidant",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Boltgun",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
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
            name = "Relic Laspistol",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "4+",
            damage = "2/4",
            keywords = listOf(
                Range(8),
                Lethal(5)
            )
        ),
        WeaponProfile(
            name = "Bayonet",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Chainsword",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Second in Command",
            usage = R.string.deathkorps_confidant_secondincommand_usage,
            description = R.string.deathkorps_confidant_secondincommand_description
        ),
        Ability(
            title = "Directive",
            usage = R.string.deathkorps_confidant_directive_usage,
            description = R.string.deathkorps_confidant_directive_description
        )
    ),


    keywords = listOf(
        "DEATH KORP",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "CONFIDANT",
        "25MM"

    )
)
