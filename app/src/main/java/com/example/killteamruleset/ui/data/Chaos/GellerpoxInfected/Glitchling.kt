package com.example.killteamruleset.ui.data.Chaos.GellerpoxInfected


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Limited
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Seek_light
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val Glitching : Operative
    get() = Operative(
        name = "Glitching",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "6+",
            wounds = 3
        ),
        weapons = listOf(
            WeaponProfile (
                name = "Diseased Effluence",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "4+",
                damage = "2/2",
                keywords = listOf(
                    Range(6),

                )
            ),
            WeaponProfile (
                name = "Diseased nippers",
                type = WeaponType.MELEE,
                attacks = 3,
                hit = "4+",
                damage = "1/2",
                keywords = listOf(
                )
            ),

            ),

        abilities = listOf(
            Ability(
                title = "Daemonic",
                usage = R.string.daemonic_usage,
                description = R.string.daemonic_description
            ),
            Ability(
                title = "Small",
                usage = R.string.small_usage,
                description = R.string.small_description
            ),
            Ability(
                title = "Group Activation",
                usage = R.string.geller_group_activation_glitch_usage,
                description = R.string.geller_group_activation_glitch_description
            ),
        ),

        keywords = listOf(
            "GELLERPOX INFECTED",
            "CHAOS",
            "GLITCHLING",
            "25MM"
        )
    )