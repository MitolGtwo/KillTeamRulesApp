package com.example.killteamruleset.ui.data.Chaos.Warpcoven

import com.example.killteamruleset.ui.model.Poison
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Psychic
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val SorcererOfDestiny = Operative(
    name = "Sorcerer Of Destiny",
    imageRes = R.drawable.plague_plaguecaster,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 15
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Doombolt",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/2",
            keywords = listOf(
                Psychic,
                Devastating(2),
                Lethal(5)
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
            title = "Protected by Fate",
            usage = R.string.protected_by_fate_usage,
            description = R.string.protected_by_fate_description
        ),
        Ability(
            title = "Ravage Destiny",
            usage = R.string.ravage_destiny_usage,
            description = R.string.ravage_destiny_description
        )
    ),
    keywords = listOf(
        "WARPCOVEN",
        "CHAOS",
        "HERETIC ASTARTES",
        "PSYKER",
        "SORCERER",
        "DESTINY",
        "32MM"
    )
)