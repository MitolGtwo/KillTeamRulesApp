package com.example.killteamruleset.ui.data.Xenos.HandOfTheArchon

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val KabaliteHeavyGunner = Operative(
    name = "Kabalite Heavy Gunner",
    imageRes = R.drawable.hand_hgunner,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Dark Lance",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "6/7",
            keywords = listOf(
                Heavy("Dash Only"),
                Piercing(2)
            )
        ),
        WeaponProfile(
            name = "Splinter Cannon (focused)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Heavy("Dash Only"),
                Lethal(5)
            )
        ),
        WeaponProfile(
            name = "Splinter Cannon (sweeping",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Heavy("Dash Only"),
                Lethal(5),
                Torrent(1)
            )
        ),
        WeaponProfile(
            name = "Array of blades",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(

    ),


    keywords = listOf(
        "HAND OF THE ARCHON",
        "AELDARI",
        "DRUKHARI",
        "HEAVY GUNNER",
        "25MM"
    )
)