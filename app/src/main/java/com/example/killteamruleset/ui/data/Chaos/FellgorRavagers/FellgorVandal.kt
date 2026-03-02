package com.example.killteamruleset.ui.data.Chaos.FellgorRavagers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
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

val FellgorVandal : Operative
    get() = Operative(
        name = "Fellgor Vandal",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "5+",
            wounds = 10
        ),
        weapons = listOf(
            WeaponProfile (
                name = "Mancrusher",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "4+",
                damage = "5/5",
                keywords = listOf(
                    Brutal
                ),
                extraRules = listOf("*Vicious Blows")
            )
        ),

        abilities = listOf(
            Ability(
                title = "Vicious Blows",
                usage = R.string.vicious_blows_usage,
                description = R.string.vicious_blows_description
            ),
            Ability(
                title = "Sweeping Blow",
                usage = R.string.sweeping_blow_usage,
                description = R.string.sweeping_blow_description
            )
        ),

        keywords = listOf(
            "FELLGOR RAVAGER",
            "CHAOS",
            "VANDAL",
            "32MM"
        )
    )