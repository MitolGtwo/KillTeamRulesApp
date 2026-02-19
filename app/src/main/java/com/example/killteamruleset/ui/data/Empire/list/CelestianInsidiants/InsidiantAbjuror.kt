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

val InsidiatAbjuror: Operative
    get() = Operative(
        name = "Insidiat Abjuror",
        imageRes = R.drawable.alpharanger,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "2+",
            wounds = 11
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Blessed sword & Praesidium protectiva (defensive)",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "3+",
                damage = "4/6",
                keywords = listOf(
                    Shield

                )
            ),
            WeaponProfile (
                name = "Blessed sword & Praesidium protectiva (offensive)",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "3+",
                damage = "4/6",
                keywords = listOf(
                    Lethal(5)
                )
            )
        ),

        abilities = listOf(
            Ability(
                title = "Shield",
                usage = R.string.battleclade_divinearcana_usage,
                description = R.string.battleclade_divinearcana_description
            ),

            Ability(
                title = "Holy Defender",
                usage = R.string.battleclade_omniscanner_usage,
                description = R.string.battleclade_omniscanner_description
            )
        ),



        keywords = listOf(
            "CELESTIAN INSIDIANT",
            "IMPERIUM",
            "ADEPTA SORORITAS",
            "ABJUROR",
            "32MM"
        )
    )
