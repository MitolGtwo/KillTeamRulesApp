package com.example.killteamruleset.ui.data.Empire.list.DeathKorps

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathKorpsVoxOperator = Operative(
    name = "Death Korps Vox-Operator ",
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
            title = R.string.deathkorps_vox_relayorders,
            usage = R.string.deathkorps_vox_relayorders_usage,
            description = R.string.deathkorps_vox_relayorders_description

        ),
        Ability(
            title = R.string.deathkorps_vox_signal,
            usage = R.string.deathkorps_vox_signal_usage,
            description = R.string.deathkorps_vox_signal_description
        )
        
    ),
    keywords = listOf(
        "DEATH KORP",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "VOX-OPERATOR",
        "25MM"

    )
)
