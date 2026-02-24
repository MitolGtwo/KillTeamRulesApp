package com.example.killteamruleset.ui.data.Empire.list.Sanctifiers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*
import kotlin.collections.listOf


val SanctifierDeathCultAssassin = Operative(
    name = "Sanctifier DeathCult Assassin ",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "5+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Throwing Knives",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "2/5",
            keywords = listOf(
                Range(6),
                Silent
            )
        ),

        WeaponProfile(
            name = "Ritual Blades",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "2+",
            damage = "4/6",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Blade Stance",
            usage = R.string.sanctifier_blade_stance_usage,
            description = R.string.sanctifier_blade_stance_description
        ),
        Ability(
            title = "Trained Assasin",
            usage = R.string.trained_assasin_usage,
            description = R.string.trained_assasin_description
        ),
    ),


    keywords = listOf(
        "SANCTIFIER",
        "IMPERIUM",
        "ADEPTUS MINISTORUM",
        "DEATH CULT ASSASSIN",
        "25MM"
    )
)