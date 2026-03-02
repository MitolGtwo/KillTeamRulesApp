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
import com.example.killteamruleset.ui.model.Psychic
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Seek_light
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val FellgorShaman : Operative
    get() = Operative(
        name = "Fellgor Shaman",
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
                name = "Tech-curse",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "3+",
                damage = "1/3",
                keywords = listOf(
                    Psychic,
                    Rending,
                    Saturate,
                    Seek_light
                )
            ),
            WeaponProfile (
                name = "Braystave",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "3+",
                damage = "3/5",
                keywords = listOf(
                    Shock
                )
            )
        ),

        abilities = listOf(
            Ability(
                title = "Apoplectic Rejuvenation",
                usage = R.string.apoplectic_rejuvenation_usage,
                description = R.string.apoplectic_rejuvenation_description
            ),
            Ability(
                title = "Mantle of Darkness",
                usage = R.string.mantle_of_darkness_usage,
                description = R.string.mantle_of_darkness_description
            )
        ),

        keywords = listOf(
            "FELLGOR RAVAGER",
            "CHAOS",
            "PSYKER",
            "SHAMAN",
            "32MM"
        )
    )