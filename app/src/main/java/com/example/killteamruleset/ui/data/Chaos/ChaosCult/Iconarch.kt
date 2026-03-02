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

val Iconarch: Operative
    get() = Operative(
        name = "Iconarch",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "5+",
            wounds = 8
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Burning Censer",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "2+",
                damage = "4/4",
                keywords = listOf(
                    Range(5),
                    Saturate,
                    Torrent(2)
                )
            ),
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
                attacks = 3,
                hit = "4+",
                damage = "2/3",
                keywords = listOf(
                )
            )
        ),

        abilities = listOf(
            Ability(
                title = "Icon Bearer",
                usage = R.string.chaos_icon_bearer_usage,
                description = R.string.chaos_icon_bearer_description
            ),

            Ability(
                title = "Ruinous Icon",
                usage = R.string.ruinous_icon_usage,
                description = R.string.ruinous_icon_description
            )
        ),

        keywords = listOf(
            "CHAOS CULT",
            "CHAOS",
            "DARK COMMUNE",
            "PSYKER",
            "ICONARCH",
            "32MM"
        )
    )