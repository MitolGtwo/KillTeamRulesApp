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

val FellgorMangler : Operative
    get() = Operative(
        name = "Fellgor Mangler",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "5+",
            wounds = 10
        ),
        weapons = listOf(
            WeaponProfile (
                name = "Vicious Claws",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "3+",
                damage = "4/6",
                keywords = listOf(
                    Ceaseless
                ),
                extraRules = listOf("*Tactual Hunter")
            )
        ),

        abilities = listOf(
            Ability(
                title = "Tactual Hunter",
                usage = R.string.tactual_hunter_usage,
                description = R.string.tactual_hunter_description
            ),
            Ability(
                title = "Berserker",
                usage = R.string.berserker_usage,
                description = R.string.berserker_description
            ),
            Ability(
                title = "Savage",
                usage = R.string.savage_usage,
                description = R.string.savage_description
            ),
        ),

        keywords = listOf(
            "FELLGOR RAVAGER",
            "CHAOS",
            "MANGLER",
            "32MM"
        )
    )