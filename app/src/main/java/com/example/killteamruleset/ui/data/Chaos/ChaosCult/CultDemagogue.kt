package com.example.killteamruleset.ui.data.Chaos.ChaosCult

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val CultDemagogue: Operative
    get() = Operative(
        name = "Cult Demagogue",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "5+",
            wounds = 8
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Diabolical Stave (ranged)",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "4+",
                damage = "3/6",
                keywords = listOf(
                    Range(2),
                    Stun
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
                name = "Diabolical Stave (melee)",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "4+",
                damage = "3/6",
                keywords = listOf(
                    Severe,
                    Shock
                )
            )
        ),

        abilities = listOf(
            Ability(
                title = "Incite Slaughter",
                usage = R.string.incite_slaughter_usage,
                description = R.string.incite_slaughter_description
            ),

            Ability(
                title = "Incite Urgency",
                usage = R.string.incite_urgency_usage,
                description = R.string.incite_urgency_description
            )
        ),

        keywords = listOf(
            "CHAOS CULT",
            "CHAOS",
            "LEADER",
            "DARK COMMUNE",
            "CULT DEMAGOGUE",
            "32MM"
        )
    )