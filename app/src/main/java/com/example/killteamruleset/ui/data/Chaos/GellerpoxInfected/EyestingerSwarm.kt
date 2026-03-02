package com.example.killteamruleset.ui.data.Chaos.GellerpoxInfected


import androidx.compose.material3.RangeSlider
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
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Seek_light
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val EyestingerSwarm : Operative
    get() = Operative(
        name = "Eyestinger Swarm",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "6+",
            wounds = 2
        ),
        weapons = listOf(
            WeaponProfile (
                name = "Swarm",
                type = WeaponType.RANGED,
                attacks = 5,
                hit = "6+",
                damage = "0/0",
                keywords = listOf(
                    Range(6),
                    Stun
                )
            ),
            WeaponProfile (
                name = "Sting",
                type = WeaponType.MELEE,
                attacks = 5,
                hit = "5+",
                damage = "1/2",
                keywords = listOf(
                    Shock
                )
            ),
        ),

        abilities = listOf(

            Ability(
                title = "Group Activation",
                usage = R.string.geller_group_activation_vermin_usage,
                description = R.string.geller_group_activation_vermin_description
            ),
        ),

        keywords = listOf(
            "GELLERPOX INFECTED",
            "CHAOS",
            "MUTOID VERMIN",
            "EYESTINGER SWARM",
            "25MM"
        )
    )