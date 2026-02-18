package com.example.killteamruleset.ui.data.Empire.list.BattleClade

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val BattlecladeBreacherServitor = Operative(
    name = "Battleclade Breacher Servitor",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Lascutter(close range)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Range(2),
                Lethal(5),
                Piercing(2)
            )
        ),
      WeaponProfile(
            name = "Lascutter(short range)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Range(6),
                Lethal(5)
            )
        ),
      WeaponProfile(
            name = "Hydraulic Pincer & Lascutter",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "4/6",
            keywords = listOf(
                Lethal(5)
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Breach",
            usage = R.string.battleclade_breach_usage,
            description = R.string.battleclade_breach_description
        )
    ),


    keywords = listOf(
        "BATTLE CLADE",
        "IMPERIUM",
        "ADEPTUS MECHANICUS",
        "BREACHER",
        "SERVITOR",
        "25MM"
    )
)
