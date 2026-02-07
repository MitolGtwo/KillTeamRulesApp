package com.example.killteamruleset.ui.data.Empire.list.DeathKorps

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathKorpsSapper = Operative(
    name = "Death Korps Sapper",
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
            name = "Remote Detonator",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "2+",
            damage = "5/6",
            keywords = listOf(
              Heavy("Dash only"),
              Limited(1),
              Piercing(1),
              Silent,
            ),
           extraRules = listOf("*Detonate")
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
            title = R.string.deathkorps_sapper_mine,
            usage = R.string.deathkorps_sapper_mine_usage,
            description = R.string.deathkorps_sapper_mine_description
        ),

        Ability(
            title = R.string.deathkorps_sapper_detonate,
            usage = R.string.deathkorps_sapper_detonate_usage,
            description = R.string.deathkorps_sapper_detonate_description
        )
        
    ),
    keywords = listOf(
        "DEATH KORP",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "SAPPER",
        "25MM"

    )
)
