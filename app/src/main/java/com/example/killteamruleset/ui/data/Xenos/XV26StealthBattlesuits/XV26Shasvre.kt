package com.example.killteamruleset.ui.data.Xenos.XV26StealthBattlesuits


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Accurate
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Limited
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Seek_light
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val XV26Shasvre = Operative(
    name = "XV26 Shas´vre",
    imageRes = R.drawable.xv26_shas,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 13
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Burst Cannon (focused)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Ceaseless
            )
        ),
        WeaponProfile(
            name = "Burst Cannon (sweeping)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Ceaseless,
                Torrent(1)
            )
        ),
        WeaponProfile(
            name = "Fusion Blaster (short range)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "6/3",
            keywords = listOf(
                Range(6),
                Devastating(4),
                Piercing(2)
            )
        ),
        WeaponProfile(
            name = "Fusion Blaster (long range)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Range(12),
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Pulse Pistol (ranged)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Pulse Pistol (point-blank)",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Accurate(1)
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "XV26 Drone Controller",
            usage = R.string.xv26_drone_controller_usage,
            description = R.string.xv26_drone_controller_description
        ),
        Ability(
            title = "For the Greater Good",
            usage = R.string.xv_greater_good_usage,
            description = R.string.xv_greater_good_description
        )
    ),


    keywords = listOf(
        "XV26 STEALTH BATTLESUIT",
        "T'AU EMPIRE",
        "LEADER",
        "SHAS’VRE",
        "32MM"
    )
)