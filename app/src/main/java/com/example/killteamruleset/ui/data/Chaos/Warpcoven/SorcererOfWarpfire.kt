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


val SorcererOfWarpfire = Operative(
    name = "Sorcerer Of Warpfire",
    imageRes = R.drawable.plague_plaguecaster,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 15
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Firestorm",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
                Psychic,
                Saturate,
                Seek_light,
                Torrent(2)
            )
        ),
        WeaponProfile(
            name = "Inferno bolt pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8),
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Mindburn",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "4+",
            damage = "1/1",
            keywords = listOf(
                Psychic,
                Lethal(5),
                Saturate,
                Seek_light,
            ),
            extraRules = listOf("*Mindburn")
        ),
        WeaponProfile(
            name = "Warpflame pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "3/3",
            keywords = listOf(
                Range(6),
                Piercing(1),
                Torrent(1),
            )
        ),

        WeaponProfile(
            name = "Force Staff",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Psychic,
                Shock
            )
        ),
        WeaponProfile(
            name = "Prosperine Khopesh",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Lethal(5)
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Mindburn",
            usage = R.string.mindburn_usage,
            description = R.string.mindburn_description
        ),
        Ability(
            title = "Alight",
            usage = R.string.alight_usage,
            description = R.string.alight_description
        )
    ),
    keywords = listOf(
        "WARPCOVEN",
        "CHAOS",
        "HERETIC ASTARTES",
        "PSYKER",
        "SORCERER",
        "WARPFIRE",
        "32MM"
    )
)