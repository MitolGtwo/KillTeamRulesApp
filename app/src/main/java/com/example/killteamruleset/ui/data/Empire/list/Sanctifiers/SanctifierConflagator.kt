package com.example.killteamruleset.ui.data.Empire.list.Sanctifiers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*
import kotlin.collections.listOf


val SanctifierConflagrator = Operative(
    name = "Sanctifier Conflagrator",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Twin Hand Flamers (focused)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "3/3",
            keywords = listOf(
                Range(6),
                Saturate,
                Torrent(2)
            ),
            extraRules = listOf("*Blaze")
        ),
        WeaponProfile(
            name = "Twin Hand Flamers (twin torrent)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "3/3",
            keywords = listOf(
                Range(6),
                Saturate,
                Torrent(0)
            ),
            extraRules = listOf(
                "*Blaze",
                "*Twin Torrent"
            )
        ),
        WeaponProfile(
            name = "Gun Butts",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Twin Torrent",
            usage = R.string.twin_torrent_usage,
            description = R.string.twin_torrent_description
        ),
        Ability(
            title = "Sanctification Rack",
            usage = R.string.sanctification_rack_usage,
            description = R.string.sanctification_rack_description
        ),
    ),


    keywords = listOf(
        "SANCTIFIER",
        "IMPERIUM",
        "ADEPTUS MINISTORUM",
        "CONGLAGRATOR",
        "25MM"
    )
)