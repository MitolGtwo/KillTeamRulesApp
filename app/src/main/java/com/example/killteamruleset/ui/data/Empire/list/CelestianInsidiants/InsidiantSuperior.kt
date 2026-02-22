package com.example.killteamruleset.ui.data.Empire.list.CelestianInsidiants

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Silent
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
                type = WeaponType.RANGED,
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
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "3+",
                damage = "3/5",
                keywords = listOf(
                     Range(8),
                      Lethal(5)
                )
            ),
            WeaponProfile(
                name = "Relic Condemmor Stakethrower",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "3+",
                damage = "2/2",
                keywords = listOf(
                    Devastating(2),
                    Lethal(5),
                    Piercing_Crits(1),
                    Silent,
                ),
                extraRules = listOf("*Anti-PSYKER")
            ),
             WeaponProfile(
                name = "Null Mace",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "3+",
                damage = "4/4",
                keywords = listOf(
                    Shock
                ),
                 extraRules = listOf("*Anti-PSYKER")
            )
        ),

        abilities = listOf(
            Ability(
                title = "Holy Example",
                usage = R.string.holy_example_usage,
                description = R.string.holy_example_description
            ),

       Ability(
                title = "Spiritual Mentor",
                usage = R.string.spiritual_mentor_usage,
                description = R.string.spiritual_mentor_description
            )
        ),



        keywords = listOf(
            "CELESTIAN INSIDIANT",
            "IMPERIUM",
            "ADEPTA SORORITAS",
            "LEADER",
            "SUPERIOR",
            "32MM"
        )
    )
