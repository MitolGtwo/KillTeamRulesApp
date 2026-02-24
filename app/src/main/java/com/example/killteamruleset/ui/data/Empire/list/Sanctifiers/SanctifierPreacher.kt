package com.example.killteamruleset.ui.data.Empire.list.Sanctifiers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*
import kotlin.collections.listOf


val SanctifierPreacher = Operative(
    name = "Sanctifier Preacher",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Hand Flamer",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "3/3",
            keywords = listOf(
                Range(6),
                Saturate,
                Torrent(1)
            ),
            extraRules = listOf(
                "*Blaze"
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
            title = "Defend the Faith",
            usage = R.string.defend_the_faith_usage,
            description = R.string.defend_the_faith_description
        )
    ),


    keywords = listOf(
        "SANCTIFIER",
        "IMPERIUM",
        "ADEPTUS MINISTORUM",
        "PREACHER",
        "25MM"
    )
)