package com.example.killteamruleset.ui.data.Xenos.Wyrmblade


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
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val NeophyteHeavyGunner = Operative(
    name = "Neophyte Heavy Gunner",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Heavy stubber (focused)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Heavy("Dash Only")
            )
        ),
        WeaponProfile(
            name = "Heavy stubber (sweeping)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Heavy("Dash Only"),
                Torrent(1)
            )
        ),

        WeaponProfile(
            name = "Mining Laser",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "4+",
            damage = "5/6",
            keywords = listOf(
                Heavy("Dash Only"),
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Seismic Cannon (long-wave)",
            type = WeaponType.RANGED,
            attacks = 6,
            hit = "4+",
            damage = "2/2",
            keywords = listOf(
                Blast(1),
                Heavy("Dash Only"),
                Stun

            )
        ),
        WeaponProfile(
            name = "Seismic Cannon (short-wave)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/4",
            keywords = listOf(
                Range(6),
                Heavy("Dash Only"),
                Piercing_Crits(1),
                Stun
            )
        ),
        WeaponProfile(
            name = "Gun butt",
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
            title = "Heavy Weapon Bipod",
            usage = R.string.wyrm_bipod_usage,
            description = R.string.wyrm_bipod_description
        ),
    ),


    keywords = listOf(
        "WYRMBLADE ",
        "TYRANID",
        "GENESTEALER CULT",
        "NEOPHYTE",
        "HEAVY GUNNER",
        "32MM"
    )
)