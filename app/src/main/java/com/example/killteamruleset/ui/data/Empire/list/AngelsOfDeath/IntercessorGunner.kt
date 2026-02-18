package com.example.killteamruleset.ui.data.Empire.list.AngelsOfDeath

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val IntercessorGunner = Operative(
    name = "Intercessor Gunner ",
    imageRes = R.drawable.plague_bombardier,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Auto Bolt Rifle",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Torrent(1)
            )
        ),
        WeaponProfile(
            name = "Auxiliary Grenade Launcher (frag)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "2/4",
            keywords = listOf(
                Blast(2)
            )
        ),
        WeaponProfile(
            name = "Auxiliary Grenade Launcher (krak)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Bolt rifle",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Piercing_Crits(1)
            )
        ),
        WeaponProfile(
            name = "Stalker Bolt rifle (heavy)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Heavy("Dash Only"),
                Lethal(5),
                Piercing_Crits(1)
            )
        ),
        WeaponProfile(
            name = "Stalker Bolt rifle (mobile)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
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
        )
    ),

    abilities = listOf(
    ),
    keywords = listOf(
        "ANGEL OF DEATH",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "INTERCESSOR",
        "GUNNER",
        "32MM"
    )
)