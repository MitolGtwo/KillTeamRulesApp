package com.example.killteamruleset.ui.data.Chaos.Goremongers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Devastating
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

val GoremongerImpaler : Operative
    get() = Operative(
        name = "Goremonger Impaler",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "7\"",
            save = "5+",
            wounds = 10
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Autopistol",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "4+",
                damage = "2/3",
                keywords = listOf(
                    Range(8)
                )
            ),
            WeaponProfile(
                name = "Fleshskewer (ranged)",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "3+",
                damage = "4/5",
                keywords = listOf(
                    Range(8),
                    Stun
                ),
                extraRules = listOf(
                    "*Drag",
                    "*Prey")
            ),
            WeaponProfile(
                name = "Fleshskewer (stab)",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "3+",
                damage = "3/4",
                keywords = listOf(
                )
            ),
        ),

        abilities = listOf(
            Ability(
                title = "Drag",
                usage = R.string.drag_usage,
                description = R.string.drag_description
            ),
            Ability(
                title = "Prey",
                usage = R.string.prey_usage,
                description = R.string.prey_description
            ),
        ),

        keywords = listOf(
            "GOREMONGER",
            "CHAOS",
            "IMPALER",
            "32MM"
        )
    )