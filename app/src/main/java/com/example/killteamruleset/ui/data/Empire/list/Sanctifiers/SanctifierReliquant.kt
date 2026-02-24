package com.example.killteamruleset.ui.data.Empire.list.Sanctifiers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*
import kotlin.collections.listOf


val SanctifierReliquant = Operative(
    name = "Sanctifier Reliquant",
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
            name = "Gun Butt",
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
            title = "Cult Icon",
            usage = R.string.sanctifier_cult_icon_usage,
            description = R.string.sanctifier_cult_icon_description
        ),
        Ability(
            title = "Imperial Cult Devotion",
            usage = R.string.imperial_cult_devotion_usage,
            description = R.string.imperial_cult_devotion_description
        ),
    ),


    keywords = listOf(
        "SANCTIFIER",
        "IMPERIUM",
        "ADEPTUS MINISTORUM",
        "RELIQUANT",
        "25MM"
    )
)