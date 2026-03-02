package com.example.killteamruleset.ui.data.Chaos.ChaosCult


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val ChaosDevotee: Operative
    get() = Operative(
        name = "Chaos Devotee",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "5+",
            wounds = 7
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Pistol",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "4+",
                damage = "2/3",
                keywords = listOf(
                    Range(8)
                )
            ),
            WeaponProfile (
                name = "Crude Melee Weapon",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "4+",
                damage = "2/3",
                keywords = listOf(
                )
            )
        ),

        abilities = listOf(
            Ability(
                title = "Group Activation",
                usage = R.string.chaos_group_activacion_usage,
                description = R.string.chaos_group_activacion_description
            ),
        ),

        keywords = listOf(
            "CHAOS CULT",
            "CHAOS",
            "DEVOTEE",
            "25MM"
        )
    )