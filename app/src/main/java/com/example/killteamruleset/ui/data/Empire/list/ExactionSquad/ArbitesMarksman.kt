package com.example.killteamruleset.ui.data.Empire.list.ExactionSquad


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Concealed_Position
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val ArbiterMarksman: Operative
    get() = Operative(
        name = "Arbiter Marksman",
        imageRes = R.drawable.alpharanger,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "4+",
            wounds = 8
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Executioner Shotgun (concealed)",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "2+",
                damage = "4/0",
                keywords = listOf(
                    Devastating(4),
                    Heavy(""),
                    Silent,
                    Concealed_Position
                )
            ),
            WeaponProfile(
                name = "Executioner Shotgun (mobile)",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "3+",
                damage = "4/4",
                keywords = listOf(
                )
            ),
            WeaponProfile(
                name = "Executioner Shotgun (stationary)",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "2+",
                damage = "4/0",
                keywords = listOf(
                    Devastating(4),
                    Heavy("")
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
                title = "Optics",
                usage = R.string.exaction_optics_usage,
                description = R.string.exaction_optics_description
            )
        ),
        keywords = listOf(
            "EXACTION SQUAD",
            "IMPERIUM",
            "ADEPTUS ARBITERS",
            "MARKSMAN",
            "28MM"
        )
    )

