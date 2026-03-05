package com.example.killteamruleset.ui.data.Xenos.FarstalkerKinband

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val KrootKillBroker = Operative(
    name = "Kroot Kill-Broker",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Kroot Rifle",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Pulse Weapon",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Ritual Blade",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Call The Kill",
            usage = R.string.call_the_kill_usage,
            description = R.string.call_the_kill_description
        ),
        Ability(
            title = "Victory Shriek",
            usage = R.string.victory_shriek_usage,
            description = R.string.victory_shriek_description
        )
    ),


    keywords = listOf(
        "FARSTALKER KINBAND",
        " T’AU EMPIRE",
        "LEADER",
        "KROOT",
        "KILL-BROKER",
        "32MM"

    )
)
