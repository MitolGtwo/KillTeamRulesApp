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

val ArbiterSubductor: Operative
    get() = Operative(
        name = "Arbiter Subductor",
        imageRes = R.drawable.alpharanger,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "3+",
            wounds = 8
        ),
        weapons = listOf(
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
                name = "Shock Maul & Assault Shield",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "4+",
                damage = "4/4",
                keywords = listOf(
                    Shock
                ),
                extraRules = listOf("*Repress")
            )
        ),

        abilities = listOf(
            Ability(
                title = "Stubborn Subjugator",
                usage = R.string.stubborn_subjugator_usage,
                description = R.string.stubborn_subjugator_description
            )
        ),
        keywords = listOf(
            "EXACTION SQUAD",
            "IMPERIUM",
            "ADEPTUS ARBITERS",
            "SUBDUCTOR",
            "28MM"
        )
    )

