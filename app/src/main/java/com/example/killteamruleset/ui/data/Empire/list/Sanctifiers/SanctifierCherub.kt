package com.example.killteamruleset.ui.data.Empire.list.Sanctifiers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val SanctifierCherub = Operative(
    name = "Sanctifier Cherub",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "5+",
        wounds = 5
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Incentiviser",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "5+",
            damage = "1/3",
            keywords = listOf(
                Shock
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Cherub",
            usage = R.string.cherub_usage,
            description = R.string.cherub_description
        ),
        Ability(
            title = "Fly",
            usage = R.string.sanctifier_fly_usage,
            description = R.string.sanctifier_fly_description
        ),
        Ability(
            title = "Incentivise",
            usage = R.string.incentivise_usage,
            description = R.string.incentivise_description
        ),
    ),


    keywords = listOf(
        "SANCTIFIER",
        "IMPERIUM",
        "ADEPTUS MINISTORUM",
        "CHERUB",
        "25MM"
    )
)