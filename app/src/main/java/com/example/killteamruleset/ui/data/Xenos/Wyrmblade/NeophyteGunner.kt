package com.example.killteamruleset.ui.data.Xenos.Wyrmblade

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val NeophyteGunner = Operative(
    name = "Neophyte Gunner",
    imageRes = R.drawable.wyrm_gunner,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Flamer",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "3/3",
            keywords = listOf(
                Range(8),
                Saturate,
                Torrent(2)
            )
        ),

        WeaponProfile(
            name = "Grenade Launcher (frag)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "2/4",
            keywords = listOf(
                Blast(2)
            )
        ),
        WeaponProfile(
            name = "Grenade Launcher (krak)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "4/6",
            keywords = listOf(
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Webber",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Range(12),
                Severe,
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

    ),


    keywords = listOf(
        "WYRMBLADE ",
        "TYRANID",
        "GENESTEALER CULT",
        "NEOPHYTE",
        "GUNNER",
        "25MM"
    )
)