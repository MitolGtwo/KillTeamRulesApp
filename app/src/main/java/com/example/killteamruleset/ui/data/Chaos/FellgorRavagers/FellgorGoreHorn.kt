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

val FellgorGorehorn : Operative
    get() = Operative(
        name = "Fellgor Gorehorn",
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
                name = "Skullcleaver",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "3+",
                damage = "4/5",
                keywords = listOf(
                    Lethal(5)
                ),
                extraRules = listOf("*Headtaker")
            )
        ),

        abilities = listOf(
            Ability(
                title = "Champion",
                usage = R.string.fellgor_champion_usage,
                description = R.string.fellgor_champion_description
            ),
            Ability(
                title = "Headtaker",
                usage = R.string.headtaker_usage,
                description = R.string.headtaker_description
            )
        ),

        keywords = listOf(
            "FELLGOR RAVAGER",
            "CHAOS",
            "GOREHORN",
            "32MM"
        )
    )