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

val InsidiatCensor: Operative
    get() = Operative(
        name = "Insidiat Censor",
        imageRes = R.drawable.alpharanger,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "3+",
            wounds = 9
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Virge of Admonition",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "4+",
                damage = "5/5",
                keywords = listOf(
                    Brutal,
                    Shock,
                    Anti-PSYKER

                )
            )
        ),

        abilities = listOf(
            Ability(
                title = "Virge of Admonition Icon Bearer",
                usage = R.string.battleclade_divinearcana_usage,
                description = R.string.battleclade_divinearcana_description
            ),

            Ability(
                title = "Null Field",
                usage = R.string.battleclade_omniscanner_usage,
                description = R.string.battleclade_omniscanner_description
            )
        ),
       Ability(
                title = "Nullifying Ritual",
                usage = R.string.battleclade_omniscanner_usage,
                description = R.string.battleclade_omniscanner_description
            )
        ),



        keywords = listOf(
            "CELESTIAN INSIDIANT",
            "IMPERIUM",
            "ADEPTA SORORITAS",
            "CENSOR",
            "32MM"
        )
    )
