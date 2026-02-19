package com.example.killteamruleset.ui.data.Empire.list.CelestianInsidiants

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val InsidiatWarrior: Operative
    get() = Operative(
        name = "Insidiat Warrior",
        imageRes = R.drawable.alpharanger,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "3+",
            wounds = 9
        ),
        weapons = listOf(
           WeaponProfile(
                name = "Bolt Pistol",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "3+",
                damage = "3/4",
                keywords = listOf(
                    Range(8)
                )
        ),
           WeaponProfile(
                name = "Condemnor Stakethrower",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "3+",
                damage = "2/2",
                keywords = listOf(
                  Devastating(1),
                  Piercing_Crits(1),
                  Silent
                ),
                
                )
        ),
           WeaponProfile(
                name = "Null Mace",
                type = WeaponType.MELEE,
                attacks =4,
                hit = "3+",
                damage = "4/4",
                keywords = listOf(
                    Shock
                ),

             )
        ),

        abilities = listOf(
            Ability(
                title = "Inspired Strikes",
                usage = R.string.battleclade_divinearcana_usage,
                description = R.string.battleclade_divinearcana_description
            )
        ),

        keywords = listOf(
            "CELESTIAN INSIDIANT",
            "IMPERIUM",
            "ADEPTA SORORITAS",
            "WARRIOR",
            "32MM"
        )
    )
