package com.example.killteamruleset.ui.data.Empire.list.Sanctifiers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*
import kotlin.collections.listOf


val SanctifierPersecutor = Operative(
    name = "Sanctifier Persecutor",
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
            hit = "3+",
            damage = "3/3",
            keywords = listOf(
                Range(6),
                Saturate,
                Torrent(1)
            ),
            extraRules = listOf("*Blaze")
        ),

        WeaponProfile(
            name = "Eviscerator",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "5/6",
            keywords = listOf(
                Brutal
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Merciless Castigation",
            usage = R.string.merciless_castigation_usage,
            description = R.string.merciless_castigation_description
        ),
        Ability(
            title = "Fanatical Retribution",
            usage = R.string.fanatical_retribution_usage,
            description = R.string.fanatical_retribution_description
        ),
    ),


    keywords = listOf(
        "SANCTIFIER",
        "IMPERIUM",
        "ADEPTUS MINISTORUM",
        "PERSECUTOR",
        "25MM"
    )
)