package com.example.killteamruleset.ui.data.Empire.list.BattleClade

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val BattlecladeCombatServitor = Operative(
    name = "Battleclade Combat Servitor",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Incendine Igniter",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "4/4",
            keywords = listOf(
                Range(6),
                Saturate,
                Torrent(1)
            )
        ),
      WeaponProfile(
            name = "Meltagun",
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
            name = "Phosphor Blaster",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Blast(1),
                Severe
            )
        ),
      WeaponProfile(
            name = "Servo-claw",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
    ),


    keywords = listOf(
        "BATTLE CLADE",
        "IMPERIUM",
        "ADEPTUS MECHANICUS",
        "COMBAT",
        "SERVITOR",
        "25MM"
    )
)
