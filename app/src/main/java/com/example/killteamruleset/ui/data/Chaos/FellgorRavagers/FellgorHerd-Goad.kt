package com.example.killteamruleset.ui.data.Chaos.FellgorRavagers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Hot
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val FellgorHerdgoad : Operative
    get() = Operative(
        name = "Fellgor Herd-Goad",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "5+",
            wounds = 10
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Autoistol",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "4+",
                damage = "2/3",
                keywords = listOf(
                    Range(8)
                )
            ),
            WeaponProfile (
                name = "Crackthorn Whip (ranged)",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "2+",
                damage = "2/3",
                keywords = listOf(
                    Range(3),
                    Lethal(4),
                    Stun
                )
            ),
            WeaponProfile (
                name = "Crackthorn Whip (melee)",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "3+",
                damage = "2/3",
                keywords = listOf(
                    Lethal(4),
                    Shock
                )
            )
        ),

        abilities = listOf(
            Ability(
                title = "Whip Control",
                usage = R.string.whip_control_usage,
                description = R.string.whip_control_description
            ),
            Ability(
                title = "Incite Fury",
                usage = R.string.incite_fury_usage,
                description = R.string.incite_fury_description
            )
        ),

        keywords = listOf(
            "FELLGOR RAVAGER",
            "CHAOS",
            "HERD-GOAD",
            "32MM"
        )
    )