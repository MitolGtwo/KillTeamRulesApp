package com.example.killteamruleset.ui.data.Empire.list.CelestianInsidiants

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val InsidiatSuperior: Operative
    get() = Operative(
        name = "Insidiat Superior",
        imageRes = R.drawable.alpharanger,
        stats = OperativeStats(
            apl = 3,
            move = "6\"",
            save = "3+",
            wounds = 10
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Inferno Pistol",
                type = WeaponType.RANGE,
                attacks = 4,
                hit = "3+",
                damage = "4/2",
                keywords = listOf(
                    Range(3),
                    Devastating(3),
                    Piercing(2)

                )
            ),
           WeaponProfile(
                name = "Relic Bolt Pistol",
                type = WeaponType.RANGE,
                attacks = 4,
                hit = "3+",
                damage = "3/5",
                keywords = listOf(
                     Range(8),
                      Lethal(5)
                )
            )
            WeaponProfile(
                name = "Relic Condemmor Stakethrower",
                type = WeaponType.RANGE,
                attacks = 4,
                hit = "3+",
                damage = "2/2",
                keywords = listOf(
                    Devastating(2),
                    Lethal(5),
                    Piercing_Crits(1),
                    Silent,
                    Anti-PSYKER

                )
            )
             WeaponProfile(
                name = "Null Mace",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "3+",
                damage = "4/4",
                keywords = listOf(
                    Shock,
                    Anti-PSYKER

                )
            )
        ),

        abilities = listOf(
            Ability(
                title = "Holy Example",
                usage = R.string.battleclade_divinearcana_usage,
                description = R.string.battleclade_divinearcana_description
            ),

       Ability(
                title = "Spiritual Mentor",
                usage = R.string.battleclade_omniscanner_usage,
                description = R.string.battleclade_omniscanner_description
            )
        ),



        keywords = listOf(
            "CELESTIAN INSIDIANT",
            "IMPERIUM",
            "ADEPTA SORORITAS",
            "LEADER"
            "SUPERIOR",
            "32MM"
        )
    )
