package com.example.killteamruleset.ui.data.Chaos.Legionaries


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Hot
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Punishing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val LegionaryHeavyGunner = Operative(
    name = "Legionary Heavy Gunner",
    imageRes = R.drawable.aod_captain,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8),
            )
        ),
        WeaponProfile(
            name = "Heavy Bolter (focused)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Heavy("Reposition"),
                Piercing_Crits(1)
            )
        ),
        WeaponProfile(
            name = "Heavy Bolter (sweeping)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Heavy("Reposition"),
                Piercing_Crits(1),
                Torrent(1)
            )
        ),
        WeaponProfile(
            name = "Missile Launcher (frag)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Blast(2),
                Heavy("Reposition")
            )
        ),
        WeaponProfile(
            name = "Missile Launcher (krak)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "5/7",
            keywords = listOf(
                Heavy("Reposition"),
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Reaper Chaincannon (focused)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Ceaseless,
                Heavy("Reposition"),
                Punishing
            )
        ),
        WeaponProfile(
            name = "Reaper Chaincannon (focused)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Ceaseless,
                Heavy("Reposition"),
                Punishing,
                Torrent(2)
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

    ),
    keywords = listOf(
        "LEGIONARY",
        "CHAOS",
        "HERETIC ASTARTES",
        "HEAVY GUNNER",
        "32MM"
    )
)
