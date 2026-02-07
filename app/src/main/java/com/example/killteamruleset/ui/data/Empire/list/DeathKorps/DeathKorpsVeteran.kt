package com.example.killteamruleset.ui.data.Empire.list.DeathKorps

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathKorpsVeteran = Operative(
    name = "Death Korps Veteran",
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
            name = "Bionic Arm",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title =R.string.deathkorps_veteranguardsmen,
            usage = R.string.deathkorps_veteranguardsmen_usage,
            description = R.string.deathkorps_veteranguardsmen_description
      ),
        Ability(
            title = R.string.deathkorps_veteran_bionics,
            usage = R.string.deathkorps_veteran_bionics_usage,
            description = R.string.deathkorps_veteran_bionics_description
      )
    ),
    keywords = listOf(
        "DEATH KORP",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "VETERAN",
        "25MM"

    )
)
