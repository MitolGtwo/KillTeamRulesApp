package com.example.killteamruleset.ui.data.Empire.list.BattleClade

import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Balanced
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending

import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType



val BattlecladeServitorUnderseer: Operative
    get() = Operative(
        name = "Battleclade Gun Servitor",
        imageRes = R.drawable.alpharanger,
        stats = OperativeStats(
            apl = 3,
            move = "6\"",
            save = "3+",
            wounds = 9
        ),
        weapons = listOf(
           WeaponProfile(
                name = "Master-crafter Radium Pistol",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "3+",
                damage = "2/4",
                keywords = listOf(
                    Range(8),
                    Balanced,
                    Rending
                )
            ),
          WeaponProfile(
                name = "Dataspikes",
                type = WeaponType.MELEE,
                attacks = 3,
                hit = "5+",
                damage = "2/3",
                keywords = listOf(
                )
            )
        ),

        abilities = listOf(
            Ability(
                title = "Seeker of Divine Arcana",
                usage = "Strategic Gambit",
                description = "You can inmediatly change this Operative´s order and/or can inmediatly perform" +
                        "any of these actions for free:\nOmniscanner\nFall Back\nPlace Marker\nPick Up Marker" +
                        "\nMission Action\nReposition.\nWhen doing a Reposition or Fall back action with this rule" +
                        " and this Operative is not carrying a marker, it must end that move either within your drop" +
                        " zone(or as close as possible), or with control of a mission marker or objective marker."
            ),

            Ability(
                title = "OMNISCANNER",
                usage = "1AP/Firefight Phase or Strategic Gambit",
                description = "Select one enemy Operative visible or within 8\" of this operative to gain one of your" +
                        "Omniscanner tokens. Whenever a friendly BATTLECLADE Operative is shooting, fighting, or retaliating" +
                        " an enemy Operative with one of your Omniscanner tokens, that friendly Operative´s weapons have" +
                        " the Ceasless weapon rule.\n\nThis Operative CANNOT perform this action while within control range" +
                        " of an enemy Operative."
            )
        ),


        keywords = listOf(
            "BATTLE CLADE",
            "IMPERIUM",
            "ADEPTUS MECHANICUS",
            "TECH-PRIEST",
            "SERVITOR UNDERSEER",
            "32MM"
        )
    )