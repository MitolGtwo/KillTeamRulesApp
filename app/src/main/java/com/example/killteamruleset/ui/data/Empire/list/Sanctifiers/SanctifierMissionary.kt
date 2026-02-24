package com.example.killteamruleset.ui.data.Empire.list.Sanctifiers



import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*
import kotlin.collections.listOf


val SanctifierMissionary = Operative(
    name = "Sanctifier Missionary",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Brazier of Holy Fire",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "4/4",
            keywords = listOf(
                Range(4),
                Saturate,
                Torrent(1)
            ),
            extraRules = listOf(
                "*Blaze"
            )
        ),
        WeaponProfile(
            name = "Meltagun",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "6/4",
            keywords = listOf(
                Range(6),
                Devastating(4),
                Piercing(2)
            ),
        ),
        WeaponProfile(
            name = "Ministorum Flamer",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "4/4",
            keywords = listOf(
                Range(8),
                Saturate,
                Torrent(2)
            ),
            extraRules = listOf(
                "*Blaze"
            )
        ),
        WeaponProfile(
            name = "Plasma gun (standard)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "4/6",
            keywords = listOf(
                Piercing(1)
            ),
        ),
        WeaponProfile(
            name = "Plasma gun (supercharge)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "5/6",
            keywords = listOf(
                Hot,
                Lethal(5),
                Piercing(1)
            ),
        ),

        WeaponProfile(
            name = "Brazier of Holy Fire",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "4/4",
            keywords = listOf(
                Shock
            ),
            extraRules = listOf("*Blaze")
        ),
        WeaponProfile(
            name = "Chainsword",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
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
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Holy Relic",
            usage = R.string.holy_relic_usage,
            description = R.string.holy_relic_description
        ),
        Ability(
            title = "Spread the Word of the God-Emperor",
            usage = R.string.spread_the_word_usage,
            description = R.string.spread_the_word_description
        ),
    ),


    keywords = listOf(
        "SANCTIFIER",
        "IMPERIUM",
        "ADEPTUS MINISTORUM",
        "MISSIONARY",
        "25MM"
    )
)