package com.example.killteamruleset.ui.data.Xenos.HernkynYaegirs

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Accurate
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val YaegirTheyn = Operative(
    name = "Yaegir Theyn",
    imageRes = R.drawable.yaegir_theyn,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "4+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bolt Revolver",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Bolt Shotgun (short range)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/4",
            keywords = listOf(
                Range(6)
            )
        ),
        WeaponProfile(
            name = "Bolt Shotgun (long range)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "5+",
            damage = "2/2",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Plasma Knife",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Lethal(5)
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Veteran Adventurer",
            usage = R.string.veteran_adventurer_usage,
            description = R.string.veteran_adventurer_description
        ),
        Ability(
            title = "Outright Conviction",
            usage = R.string.outright_conviction_usage,
            description = R.string.outright_conviction_description
        )
    ),


    keywords = listOf(
        "HERNKYN YAEGIR",
        "LEAGUES OF VOTANN",
        "LEADER",
        "THEYN",
        "28MM"
    )
)
