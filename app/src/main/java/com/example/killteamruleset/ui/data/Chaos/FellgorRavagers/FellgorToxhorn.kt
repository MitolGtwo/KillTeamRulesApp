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

val FellgorToxhorn : Operative
    get() = Operative(
        name = "Fellgor Toxhorn",
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
                name = "Cleaver",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "3+",
                damage = "4/5",
                keywords = listOf(
                )
            )
        ),

        abilities = listOf(
            Ability(
                title = "Toxic Blessings",
                usage = R.string.toxic_blessings_usage,
                description = R.string.toxic_blessings_description
            ),
            Ability(
                title = "Pox Bomb",
                usage = R.string.pox_bomb_usage,
                description = R.string.pox_bomb_description
            )
        ),

        keywords = listOf(
            "FELLGOR RAVAGER",
            "CHAOS",
            "TOXHORN",
            "32MM"
        )
    )