package com.example.killteamruleset.ui.data.Chaos.ChaosCult



import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val ChaosMutant: Operative
    get() = Operative(
        name = "Chaos Mutant",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "5+",
            wounds = 7
        ),
        weapons = listOf(
            WeaponProfile (
                name = "Blasphemous Appendages",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "4+",
                damage = "3/4",
                keywords = listOf(
                    Ceaseless,
                    Rending
                )
            )
        ),

        abilities = listOf(
            Ability(
                title = "Accursed Mutant",
                usage = R.string.accursed_mutant_usage,
                description = R.string.accursed_mutant_description
            ),
            Ability(
                title = "Unnatural Regeneration",
                usage = R.string.unnatural_regeneration_usage,
                description = R.string.unnatural_regeneration_description
            )
        ),

        keywords = listOf(
            "CHAOS CULT",
            "CHAOS",
            "MUTANT",
            "25MM"
        )
    )