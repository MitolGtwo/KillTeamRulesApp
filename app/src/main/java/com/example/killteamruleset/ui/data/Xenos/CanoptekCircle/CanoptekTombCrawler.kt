package com.example.killteamruleset.ui.data.Xenos.CanoptekCircle

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val CanoptekTombCrawler = Operative(
    name = "Canoptek Tomb Crawler",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "4+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Transdimensional isolator",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "4+",
            damage = "5/6",
            keywords = listOf(
            ),
            extraRules = listOf("*Dimensional Banishment")
        ),
        WeaponProfile(
            name = "Twin Gauss Reapers (focused)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Piercing(1),
                Severe
            )
        ),
        WeaponProfile(
            name = "Twin Gauss Reapers (sweeping)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Piercing(1),
                Severe,
                Torrent(1)
            )
        ),
        WeaponProfile(
            name = "Claws",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "4/4",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Dimensional Banishment",
            usage = R.string.dimensional_banishment_usage,
            description = R.string.dimensional_banishment_description
        ),
        Ability(
            title = "Weapon Sentinel",
            usage = R.string.weapon_sentinel_usage,
            description = R.string.weapon_sentinel_description
        ),
        Ability(
            title = "Steadfast",
            usage = R.string.canoptek_steadfast_usage,
            description = R.string.canoptek_steadfast_description
        ),
    ),


    keywords = listOf(
        "CANOPTEK CIRCLE",
        "NECRON",
        "CANOPTEK",
        "TOMB CRAWLER",
        "50MM"

    )
)
