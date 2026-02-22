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

val ArbiterLeashmaster: Operative
    get() = Operative(
        name = "Arbiter Leashmaster",
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
            WeaponProfile(
                name = "Shotpistol",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "4+",
                damage = "3/3",
                keywords = listOf(
                    Range(8)
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
                title = "Handler",
                usage = R.string.handler_usage,
                description = R.string.handler_description
            ),
            Ability(
                title = "Attack Pattern",
                usage = R.string.attack_pattern_usage,
                description = R.string.attack_pattern_description
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
            "LEASHMASTER",
            "28MM"
        )
    )

