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

val Mutant : Operative
    get() = Operative(
        name = "Mutant",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "5\"",
            save = "5+",
            wounds = 7
        ),
        weapons = listOf(
            WeaponProfile (
                name = "Frag Grenade",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "4+",
                damage = "2/4",
                keywords = listOf(
                    Range(6),
                    Blast(2),
                    Limited(1),
                    Saturate
                )
            ),
            WeaponProfile (
                name = "Heavy Axe",
                type = WeaponType.MELEE,
                attacks = 3,
                hit = "4+",
                damage = "4/5",
                keywords = listOf(
                    Brutal
                )
            ),
            WeaponProfile (
                name = "Improvised weapon",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "4+",
                damage = "3/4",
                keywords = listOf(
                    Ceaseless
                )
            ),

        ),

        abilities = listOf(
            Ability(
                title = "Group Activation",
                usage = R.string.geller_group_activation_usage,
                description = R.string.geller_group_activation_description
            ),
            Ability(
                title = "Gellercaust Masks",
                usage = R.string.gellercaust_masks_usage,
                description = R.string.gellercaust_masks_description
            ),
        ),

        keywords = listOf(
            "GELLERPOX INFECTED",
            "CHAOS",
            "MUTANT",
            "25MM"
        )
    )