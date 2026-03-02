package com.example.killteamruleset.ui.data.Chaos.Legionaries


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Hot
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val LegionaryAnointed = Operative(
    name = "Legionary Anointed",
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
            name = "Daemonic Claw",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Rending
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Unleash Daemon",
            usage = R.string.unleash_daemon_usage,
            description = R.string.unleash_daemon_description
        ),


        ),
    keywords = listOf(
        "LEGIONARY",
        "CHAOS",
        "HERETIC ASTARTES",
        "ANOINTED",
        "32MM"
    )
)
