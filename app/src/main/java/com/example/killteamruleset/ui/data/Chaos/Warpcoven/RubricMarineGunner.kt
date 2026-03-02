package com.example.killteamruleset.ui.data.Chaos.Warpcoven


import com.example.killteamruleset.ui.model.Poison
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Psychic
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Seek_light
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val RubricMarineGunner = Operative(
    name = "Rubric Marine Gunner",
    imageRes = R.drawable.plague_plaguecaster,
    stats = OperativeStats(
        apl = 3,
        move = "5\"",
        save = "3+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Soulreaper Cannon (focused)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Soulreaper Cannon (sweeping)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Piercing(1),
                Torrent(1)
            )
        ),
        WeaponProfile(
            name = "Warpflamer",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "4/4",
            keywords = listOf(
                Range(8),
                Saturate,
                Piercing(1),
                Torrent(2),
            )
        ),
        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Sorcerous Automata",
            usage = R.string.sorcerous_automata_usage,
            description = R.string.sorcerous_automata_description
        )
    ),
    keywords = listOf(
        "WARPCOVEN",
        "CHAOS",
        "HERETIC ASTARTES",
        "RUBRIC MARINE",
        "GUNNER",
        "32MM"
    )
)