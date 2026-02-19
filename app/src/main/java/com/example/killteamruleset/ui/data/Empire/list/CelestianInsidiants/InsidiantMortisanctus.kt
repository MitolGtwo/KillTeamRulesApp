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

val InsidiatMortisanctus: Operative
    get() = Operative(
        name = "Insidiat Mortisanctus",
        imageRes = R.drawable.alpharanger,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "3+",
            wounds = 9
        ),
        weapons = listOf(
           WeaponProfile(
                name = "Blessed Broadsword",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "3+",
                damage = "4/6",
                keywords = listOf(
                    Lethal(5),
                    Brutal
                )
        ),

        abilities = listOf(
            Ability(
                title = "Zealous Ultimatum",
                usage = R.string.battleclade_divinearcana_usage,
                description = R.string.battleclade_divinearcana_description
            ),

            Ability(
                title = "Bladed Stance",
                usage = R.string.battleclade_omniscanner_usage,
                description = R.string.battleclade_omniscanner_description
            )
        ),

        keywords = listOf(
            "CELESTIAN INSIDIANT",
            "IMPERIUM",
            "ADEPTA SORORITAS",
            "MORTISANCTUS",
            "32MM"
        )
    )
