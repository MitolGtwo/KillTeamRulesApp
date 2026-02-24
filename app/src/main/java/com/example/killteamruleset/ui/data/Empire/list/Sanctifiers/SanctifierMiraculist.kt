package com.example.killteamruleset.ui.data.Empire.list.Sanctifiers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*
import kotlin.collections.listOf


val SanctifierMiraculist = Operative(
    name = "Sanctifier Miraculist",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Holy Light",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "4/3",
            keywords = listOf(
                Range(8),
                Devastating(3),
                Limited(1),
                Piercing(1),
                Saturate
            ),
            extraRules = listOf(
                "*Blaze"
            )
        ),
        WeaponProfile(
            name = "Hand Flamer",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/3",
            keywords = listOf(
                Blast(1),
                Limited(1)
            ),
            extraRules = listOf(
                "Wreathed",
                "*Blaze"
            )
        ),

        WeaponProfile(
            name = "Burning Hands",
            type = WeaponType.MELEE,
            attacks = 1,
            hit = "2+",
            damage = "7/8",
            keywords = listOf(
                Brutal,
                Limited(1)
            ),
            extraRules = listOf("*Blaze")
        ),
        WeaponProfile(
            name = "Fist",
            type = WeaponType.MELEE,
            attacks = 2,
            hit = "5+",
            damage = "1/2",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Wreathed",
            usage = R.string.wreathed_usage,
            description = R.string.wreathed_description
        ),
        Ability(
            title = "Miracle",
            usage = R.string.miracle_usage,
            description = R.string.miracle_description
        ),
    ),


    keywords = listOf(
        "SANCTIFIER",
        "IMPERIUM",
        "ADEPTUS MINISTORUM",
        "MIRACULIST",
        "25MM"
    )
)