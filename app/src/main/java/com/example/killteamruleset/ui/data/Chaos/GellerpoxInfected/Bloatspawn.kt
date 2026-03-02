package com.example.killteamruleset.ui.data.Chaos.GellerpoxInfected


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
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

val Bloatspawn : Operative
    get() = Operative(
        name = "Bloatspawn",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "5\"",
            save = "5+",
            wounds = 20
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Mutant Tentacles",
                type = WeaponType.RANGED,
                attacks = 5,
                hit = "4",
                damage = "3/4",
                keywords = listOf(
                    Range(3),
                    Torrent(1)
                )
            ),

            WeaponProfile (
                name = "Mutant Claw & Tentacles (slashing)",
                type = WeaponType.MELEE,
                attacks = 6,
                hit = "4+",
                damage = "3/4",
                keywords = listOf(
                )
            ),
            WeaponProfile (
                name = "Mutant Claw & Tentacles (swiping",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "4+",
                damage = "3/4",
                keywords = listOf(
                ),
                extraRules = listOf("*Engineered")
            )
        ),

        abilities = listOf(
            Ability(
                title = "Swipe",
                usage = R.string.geller_swipe_usage,
                description = R.string.geller_swipe_description
            ),
            Ability(
                title = "Tentacled Grasp",
                usage = R.string.tentacled_grasp_usage,
                description = R.string.tentacled_grasp_description
            )
        ),

        keywords = listOf(
            "GELLERPOX INFECTED",
            "CHAOS",
            "NIGHTMARE HULK",
            "BLOATSPAWN",
            "40MM"
        )
    )