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

val ArbiterRevelatum: Operative
    get() = Operative(
        name = "Arbiter Revelatum",
        imageRes = R.drawable.alpharanger,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "4+",
            wounds = 8
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Scoped Shotpistol (short range)",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "3+",
                damage = "3/3",
                keywords = listOf(
                    Range(8),
                    Lethal(5)
                )
            ),
            WeaponProfile(
                name = "Scoped Shotpistol (long range)",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "3+",
                damage = "3/3",
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
                title = "First in the Field",
                usage = R.string.first_in_the_field_usage,
                description = R.string.first_in_the_field_description
            ),
            Ability(
                title = "Spot",
                usage = R.string.exaction_spot_usage,
                description = R.string.exaction_spot_description
            ),
        ),
        keywords = listOf(
            "EXACTION SQUAD",
            "IMPERIUM",
            "ADEPTUS ARBITERS",
            "REVELATUM",
            "28MM"
        )
    )

