package com.example.killteamruleset.ui.data.Empire.list.BattleClade

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val BattlecladeGunServitor = Operative(
    name = "Battleclade Gun Servitor",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "4+",
        wounds = 11
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Heavy Arc Rifle",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Heavy("Dash only"),
                Stun,
                Piercing(1)
            )
        ),
      WeaponProfile(
            name = "Heavy Bolter(Focused)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Heavy("Dash only"),
                Piercing_Crits(1)
            )
        ),
       WeaponProfile(
            name = "Heavy Bolter(Focused)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Heavy("Dash only"),
                Piercing_Crits(1),
                Torrent(1)
            )
        ),
      WeaponProfile(
            name = "Augmetic Claw",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Brutal
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "BREACH",
            usage = "1 AP/Firefight phase",
            description = "Place one of your Breach markers within this Operative´s control range as close as possible to a" +
                    " terrain feature within control range of it. Whenever an Operative is within 1\" of that marker," +
                    " it treats parts of that terrain feature that are no more than 1\" thick as Accessible terrain.\n\n" +
                    "This Operative **cannot** perform this action while within control range of an enemy Operative, or if" +
                    " a terrain feature isn´t within its control range."
        )
    ),


    keywords = listOf(
        "BATTLE CLADE",
        "IMPERIUM",
        "ADEPTUS MECHANICUS",
        "GUN",
        "SERVITOR",
        "25MM"
    )
)
