package com.example.killteamruleset.ui.data.Chaos.PlagueMarines


import com.example.killteamruleset.ui.model.Poison
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val PlagueMarineHeavyGunner = Operative(
    name = "Plague Marine Heavy Gunner",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "5\"",
        save = "3+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Plague Spewer",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "2+",
            damage = "3/3",
            keywords = listOf(
                Range(7),
                Saturate,
                Severe,
                Torrent(2),
                Poison
            )
        ),
        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),

    ),

    abilities = listOf(
        Ability(
            title = "",
            usage = "",
            description = ""
        )
    ),
    keywords = listOf(
        "PLAGUE MARINE",
        "CHAOS",
        "HERETIC ASTARTES",
        "HEAVY GUNNER",
        "32MM"
    )
)