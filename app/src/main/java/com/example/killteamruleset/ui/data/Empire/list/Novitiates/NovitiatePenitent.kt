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

val NovitiatePenitent: Operative
    get() = Operative(
        name = "Novitiate Penitent",
        imageRes = R.drawable.alpharanger,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "4+",
            wounds = 7
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Autopistol",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "4+",
                damage = "2/3",
                keywords = listOf(
                    Range(8)
                )
            ),
            WeaponProfile(
                name = "Penitent Eviscerator",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "4+",
                damage = "5/6",
                keywords = listOf(
                    Brutal
                ),
                extraRules = listOf("*Zealous Rage")
            ),
        ),

        abilities = listOf(
            Ability(
                title = "Zealous Rage",
                usage = R.string.zealous_rage_usage,
                description = R.string.zealous_rage_description
            ),
            Ability(
                title = "Absolution Through Destruction",
                usage = R.string.absolution_through_destruction_usage,
                description = R.string.absolution_through_destruction_description
            ),
        ),



        keywords = listOf(
            "NOVITIATE",
            "IMPERIUM",
            "ADEPTA SORORITAS",
            "PENITENT",
            "28MM"
        )
    )