package com.example.killteamruleset.ui.data.Chaos.ChaosCult


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val BlessedBlade: Operative
    get() = Operative(
        name = "Blessed Blade",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "5+",
            wounds = 8
        ),
        weapons = listOf(
            WeaponProfile (
                name = "Commune Blade",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "4+",
                damage = "4/6",
                keywords = listOf(
                    Lethal(5)
                )
            )
        ),

        abilities = listOf(
            Ability(
                title = "Attuned In Purpose",
                usage = R.string.cut_them_down_usage,
                description = R.string.cut_them_down_description
            ),

            Ability(
                title = "Incite Urgency",
                usage = R.string.attune_in_purpose_usage,
                description = R.string.attune_in_purpose_description
            )
        ),

        keywords = listOf(
            "CHAOS CULT",
            "CHAOS",
            "DARK COMMUNE",
            "BLESSED BLADE",
            "28MM"
        )
    )