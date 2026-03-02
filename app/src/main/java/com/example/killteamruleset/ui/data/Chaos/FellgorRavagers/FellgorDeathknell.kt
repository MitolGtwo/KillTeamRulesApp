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

val FellgorDeathknell: Operative
    get() = Operative(
        name = "Fellgor Deathknell",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "4+",
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
                name = "Bludgeon",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "3+",
                damage = "4/4",
                keywords = listOf(
                    Brutal
                )
            )
        ),

        abilities = listOf(
            Ability(
                title = "Icon Bearer",
                usage = R.string.fellgor_icon_bearer_usage,
                description = R.string.fellgor_icon_bearer_description
            ),
            Ability(
                title = "War Gong",
                usage = R.string.war_gong_usage,
                description = R.string.war_gong_description
            ),
            Ability(
                title = "Gong Knell",
                usage = R.string.gong_knell_usage,
                description = R.string.gong_knell_description
            ),
        ),

        keywords = listOf(
            "FELLGOR RAVAGER",
            "CHAOS",
            "DEATHKNELL",
            "32MM"
        )
    )