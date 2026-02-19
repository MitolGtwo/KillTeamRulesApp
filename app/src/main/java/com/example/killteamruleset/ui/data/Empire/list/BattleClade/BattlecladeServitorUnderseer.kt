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
        name = "Battleclade Servitor Underseer",
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
                title = "Datacoronal Accumulator",
                usage = R.string.battleclade_datacoronal_usage,
                description = R.string.battleclade_datacoronal_description
            ),

            Ability(
                title = "Network Override",
                usage = R.string.battleclade_network_usage,
                description = R.string.battleclade_network_description
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