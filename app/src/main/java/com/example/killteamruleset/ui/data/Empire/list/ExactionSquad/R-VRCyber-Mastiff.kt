package com.example.killteamruleset.ui.data.Empire.list.ExactionSquad


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val RvrCybermastiff: Operative
    get() = Operative(
        name = "R-VR Cyber-Mastiff",
        imageRes = R.drawable.alpharanger,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "4+",
            wounds = 8
        ),
        weapons = listOf(
            WeaponProfile (
                name = "Mechanical Bite",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "4+",
                damage = "3/5",
                keywords = listOf(
                    Lethal(5)
                )
            )
        ),

        abilities = listOf(
            Ability(
                title = "Beast",
                usage = R.string.exaction_beast_usage,
                description = R.string.exaction_beast_description
            ),
            Ability(
                title = "Apprehend",
                usage = R.string.apprehend_usage,
                description = R.string.apprehend_description
            )
        ),



        keywords = listOf(
            "EXACTION SQUAD",
            "IMPERIUM",
            "ADEPTUS ARBITERS",
            "R-VR CYBER MASTIFF",
            "28MM"
        )
    )