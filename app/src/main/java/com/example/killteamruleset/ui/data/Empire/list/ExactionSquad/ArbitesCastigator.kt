package com.example.killteamruleset.ui.data.Empire.list.ExactionSquad

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val ArbiterCastigator: Operative
    get() = Operative(
        name = "Arbiter Castigator",
        imageRes = R.drawable.alpharanger,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "4+",
            wounds = 8
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Combat Shotgun (close range)",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "3+",
                damage = "4/4",
                keywords = listOf(
                    Range(6)
                )
            ),
            WeaponProfile(
                name = "Combat Shotgun (long range)",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "5+",
                damage = "2/2",
                keywords = listOf(
                )
            ),

            WeaponProfile (
                name = "Excruciator Maul",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "3+",
                damage = "5/5",
                keywords = listOf(
                    Rending,
                    Shock
                )
            )
        ),

        abilities = listOf(
            Ability(
                title = "Engendered Focus",
                usage = R.string.engendered_focus_usage,
                description = R.string.engendered_focus_description
            ),
            Ability(
                title = "Zealous Dedication",
                usage = R.string.zealous_dedication_usage,
                description = R.string.zealous_dedication_description
            ),
            Ability(
                title = "Castigator’s Arrest",
                usage = R.string.castigator_arrest_usage,
                description = R.string.castigator_arrest_description
            )
        ),

        keywords = listOf(
            "EXACTION SQUAD",
            "IMPERIUM",
            "ADEPTUS ARBITERS",
            "CASTIGATOR",
            "28MM"
        )
    )

