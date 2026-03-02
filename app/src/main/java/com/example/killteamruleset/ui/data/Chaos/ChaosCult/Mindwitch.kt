package com.example.killteamruleset.ui.data.Chaos.ChaosCult



import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Psychic
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val Mindwitch: Operative
    get() = Operative(
        name = "Mindwitch",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "5+",
            wounds = 8
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Infernal Gaze",
                type = WeaponType.RANGED,
                attacks = 5,
                hit = "3+",
                damage = "0/0",
                keywords = listOf(
                    Psychic,
                    Range(6),
                    Devastating(2),
                    Lethal(3)
                )
            ),
            WeaponProfile (
                name = "Fists",
                type = WeaponType.MELEE,
                attacks = 3,
                hit = "5+",
                damage = "1/2",
                keywords = listOf(
                )
            )
        ),

        abilities = listOf(
            Ability(
                title = "Heinous Deluge",
                usage = R.string.heinous_deluge_usage,
                description = R.string.heinous_deluge_description
            ),

            Ability(
                title = "Malefic Vortex",
                usage = R.string.malefic_vortex_usage,
                description = R.string.malefic_vortex_description
            )
        ),

        keywords = listOf(
            "CHAOS CULT",
            "CHAOS",
            "DARK COMMUNE",
            "PSYKER",
            "MINDWITCH",
            "32MM"
        )
    )