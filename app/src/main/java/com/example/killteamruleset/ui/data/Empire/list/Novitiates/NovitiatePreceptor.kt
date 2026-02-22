package com.example.killteamruleset.ui.data.Empire.list.Novitiates


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
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val NovitiatePreceptor: Operative
    get() = Operative(
        name = "Novitiate Preceptor",
        imageRes = R.drawable.alpharanger,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "4+",
            wounds = 7
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Mace of the Righteous",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "4+",
                damage = "5/5",
                keywords = listOf(
                    Brutal,
                    Severe
                )
            ),
        ),

        abilities = listOf(
            Ability(
                title = "Unflinching Example",
                usage = R.string.unflinching_example_usage,
                description = R.string.unflinching_example_description
            ),
            Ability(
                title = "Glorious Hymnal",
                usage = R.string.glorious_hymmal_usage,
                description = R.string.glorious_hymmal_description
            ),
        ),
        keywords = listOf(
            "NOVITIATE",
            "IMPERIUM",
            "ADEPTA SORORITAS",
            "PRECEPTOR",
            "28MM"
        )
    )