package com.example.killteamruleset.ui.data.Xenos.HernkynYaegirs


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Accurate
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Limited
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val YaegirBladekyn = Operative(
    name = "Yaegir Bladekyn",
    imageRes = R.drawable.yaegirs_blade,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Throwing Plasma Knife",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Range(6),
                Lethal(5),
                Limited(1),
                Silent
            )
        ),
        WeaponProfile(
            name = "Dual Plasma Knives",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Ceaseless,
                Lethal(5)
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Stalker",
            usage = R.string.yaegir_stalker_usage,
            description = R.string.yaegir_stalker_description
        ),
        Ability(
            title = "Irrepressible Hardiness",
            usage = R.string.irrepressible_hardiness_usage,
            description = R.string.irrepressible_hardiness_description
        )
    ),


    keywords = listOf(
        "HERNKYN YAEGIR",
        "LEAGUES OF VOTANN",
        "BLADEKYN",
        "28MM"
    )
)
