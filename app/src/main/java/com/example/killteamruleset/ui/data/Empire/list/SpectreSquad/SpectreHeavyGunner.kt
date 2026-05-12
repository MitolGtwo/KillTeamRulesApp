package com.example.killteamruleset.ui.data.Empire.list.SpectreSquad

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val SpectreHeavyGunner = Operative(
    name = "Spectre Heavy Gunner",
    imageRes = R.drawable.spectral_heavygunner,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Laspistol",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "2/3",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Missile launcher (frag)",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Blast(2),
                Heavy("")
            )
        ),
        WeaponProfile(
            name = "Missile launcher (krak)",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "5/7",
            keywords = listOf(
                Piercing(1),
                Heavy("")
            )
        ),

        WeaponProfile(
            name = "Fists",
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
            title = "Weapon Team",
            usage = R.string.weapon_team_usage,
            description = R.string.weapon_team_description
        )
    ),

    keywords = listOf(
        "SPECTRE SQUAD",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "HEAVY GUNNER",
        "28MM"

    )
)
