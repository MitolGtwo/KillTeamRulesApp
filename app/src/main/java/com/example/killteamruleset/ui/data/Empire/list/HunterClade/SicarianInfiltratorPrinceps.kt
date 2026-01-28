package com.example.killteamruleset.ui.data.Empire.list.HunterClade

import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val SicarianInfiltratorPrinceps = Operative(
    name = "Sicarian Infiltrator Princeps",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 11
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Flechette Blaster",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "2/2",
            keywords = listOf(
                Range(8),
                Saturate,
                Silent
            )
        ),
        WeaponProfile(
            name = "Stubcarbine",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Ceaseless
            )
        ),
        WeaponProfile(
            name = "Power Weapon",
            type = WeaponType.MELEE,
            attacks = 4 ,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Lethal(5)
            )
        ),
        WeaponProfile(
            name = "Taser Goad",
            type = WeaponType.MELEE,
            attacks = 4 ,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Lethal(5),
                Shock
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Canticle of Shroudpsalm",
            usage = "Passive",
            description = "Whenever an friendly HUNTER CLADE INFILTRATOR Operative is within 3\" " +
                    "of this operative, has a conceal order and is in cover, that friendly Operative" +
                    " cannot be selected as a valid target, taking precedence over all other rules" +
                    "(Ex Seek, Seek light or Vantage terrain) except being withing 2\""
        ),

        Ability(
            title = "Control Protocol",
            usage = "FireFight Phase, Every Turn",
            description = "You can use the ploy Command Override Firefight ploy for free, if the " +
                    "specified friendly HUNTER CLADE operative is visible to this operative."
        )
    ),


    keywords = listOf(
        "HUNTER CLADE",
        "IMPERIUM",
        "ADEPTUS MECHANICUS",
        "LEADER",
        "SICARIAN",
        "INFILTRATOR",
        "PRINCEPS",
        "40MM"
    )
)
