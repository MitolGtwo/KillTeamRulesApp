package com.example.killteamruleset.ui.data.Xenos.HearthkynSalvagers


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
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val HearthkynGunner = Operative(
    name = "Hearthkyn Gunner",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "3+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "EtaCarn Plasma Beamer",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "5/6",
            keywords = listOf(
                Piercing(1)
            ),
            extraRules = listOf("*Beam")
        ),
        WeaponProfile(
            name = "HYLas Auto Rifle",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Ceaseless,
                Rending
            )
        ),
        WeaponProfile(
            name = "HYLas Rotary Cannon (focused)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Ceaseless,
                Heavy("Reposition Only"),
                Saturate
            )
        ),
        WeaponProfile(
            name = "HYLas Rotary Cannon (sweeping)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Ceaseless,
                Heavy("Reposition Only"),
                Saturate,
                Torrent(1)
            )
        ),
        WeaponProfile(
            name = "L7 Missile Launcher (blast)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/5",
            keywords = listOf(
                Blast(2)
            )
        ),
        WeaponProfile(
            name = "L7 Missile Launcher (focused)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "5/6",
            keywords = listOf(
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Magna Rail Rifle",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "4/2",
            keywords = listOf(
                Devastating(3),
                Heavy("Dash only"),
                Piercing(2)
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
        )
    ),

    abilities = listOf(
        Ability(
            title = "Beam",
            usage = R.string.salvagers_beam_usage,
            description = R.string.salvagers_beam_description,
            imageRes = R.drawable.mikumikubeam
        )
    ),


    keywords = listOf(
        "HEARTHKYN SALVAGER",
        "LEAGUES OF VOTANN",
        "GUNNER",
        "28MM"
    )
)
