package com.example.killteamruleset.ui.data.Empire.list.Ratlings


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val Ogryn = Operative(
    name = "Ogryn",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 16
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Ripper Gun",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Range(8),
                Punishing
            )
        ),
        WeaponProfile(
            name = "Bayonet",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
            )
        ),


        ),

    abilities = listOf(
        Ability(
            title = "Bayonet Charge",
            usage = R.string.bayonet_charge_usage,
            description = R.string.bayonet_charge_description
        ),
        Ability(
            title = "Brute",
            usage = R.string.brute_usage,
            description = R.string.brute_description
        ),
        Ability(
            title = "Slow-witted",
            usage = R.string.slow_witted_usage,
            description = R.string.slow_witted_description
        ),
    ),


    keywords = listOf(
        "RATLING",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "OGRYN",
        "40MM"
    )
)