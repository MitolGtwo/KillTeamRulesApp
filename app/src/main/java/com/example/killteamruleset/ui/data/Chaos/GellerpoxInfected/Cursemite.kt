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
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Seek_light
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val Cursemite : Operative
    get() = Operative(
        name = "Cursemite",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "6+",
            wounds = 2
        ),
        weapons = listOf(
            WeaponProfile (
                name = "Bloodsucking Proboscis",
                type = WeaponType.MELEE,
                attacks = 2,
                hit = "4+",
                damage = "2/3",
                keywords = listOf(
                    Rending
                ),
                extraRules = listOf("*Feast")
            ),

            ),

        abilities = listOf(
            Ability(
                title = "Feast",
                usage = R.string.feast_usage,
                description = R.string.feast_description
            ),
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
            "CURSEMITE",
            "25MM"
        )
    )