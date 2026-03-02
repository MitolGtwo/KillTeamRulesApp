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
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val SorcererOfTempyrion = Operative(
    name = "Sorcerer Of Tempyrion",
    imageRes = R.drawable.plague_plaguecaster,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 15
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Fluxblast",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Psychic,
                Blast(2),
                Rending
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
            title = "Reconstitution Ritual",
            usage = R.string.reconstitution_ritual_usage,
            description = R.string.reconstitution_ritual_description
        ),
        Ability(
            title = "Temporal Flux",
            usage = R.string.temporal_flux_usage,
            description = R.string.temporal_flux_description
        )
    ),
    keywords = listOf(
        "WARPCOVEN",
        "CHAOS",
        "HERETIC ASTARTES",
        "PSYKER",
        "SORCERER",
        "TEMPYRION",
        "32MM"
    )
)