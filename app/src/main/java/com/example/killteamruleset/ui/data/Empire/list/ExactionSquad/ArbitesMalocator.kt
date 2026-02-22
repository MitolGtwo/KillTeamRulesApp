package com.example.killteamruleset.ui.data.Empire.list.ExactionSquad

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

val ArbiterMalocator: Operative
    get() = Operative(
        name = "Arbiter Malocator",
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
                name = "Repression Baton",
                type = WeaponType.MELEE,
                attacks = 3,
                hit = "4+",
                damage = "2/3",
                keywords = listOf(
                )
            )
        ),

        abilities = listOf(
            Ability(
                title = "Acute Focus",
                usage = R.string.acute_focus_usage,
                description = R.string.acute_focus_description
            ),
            Ability(
                title = "Veriscant",
                usage = R.string.veriscant_usage,
                description = R.string.veriscant_description
            ),
            Ability(
                title = "R-VR Command",
                usage = R.string.rvr_command_usage,
                description = R.string.rvr_command_description
            )
        ),
        keywords = listOf(
            "EXACTION SQUAD",
            "IMPERIUM",
            "ADEPTUS ARBITERS",
            "MALOCATOR",
            "28MM"
        )
    )

