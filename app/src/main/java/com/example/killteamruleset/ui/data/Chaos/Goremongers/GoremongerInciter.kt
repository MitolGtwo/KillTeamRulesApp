package com.example.killteamruleset.ui.data.Chaos.Goremongers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.DevastatingBase
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Seek_light
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val GoremongerInciter : Operative
    get() = Operative(
        name = "Goremonger Inciter",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "7\"",
            save = "5+",
            wounds = 10
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Dual Autopistols (focused)",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "3+",
                damage = "2/2",
                keywords = listOf(
                    Range(8),
                    Ceaseless,
                    Devastating(1),
                    Rending
                )
            ),
            WeaponProfile(
                name = "Dual Autopistols (point-blank)",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "3+",
                damage = "3/4",
                keywords = listOf(
                    Ceaseless,
                    Rending
                )
            ),
        ),

        abilities = listOf(
            Ability(
                title = "Dash and Spray",
                usage = R.string.dash_and_spray_usage,
                description = R.string.dash_and_spray_description
            ),
            Ability(
                title = "Incite the Hunt",
                usage = R.string.incite_the_hunt_usage,
                description = R.string.incite_the_hunt_description
            ),
        ),

        keywords = listOf(
            "GOREMONGER",
            "CHAOS",
            "INCITER",
            "32MM"
        )
    )