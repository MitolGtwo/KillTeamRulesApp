package com.example.killteamruleset.ui.data.Chaos.GellerpoxInfected

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Seek_light
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val Lumberghast : Operative
    get() = Operative(
        name = "Lumberghast",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "5\"",
            save = "5+",
            wounds = 20
        ),
        weapons = listOf(
            WeaponProfile (
                name = "Mutant claw",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "4+",
                damage = "6/7",
                keywords = listOf(
                    Brutal
                )
            ),
        ),

        abilities = listOf(
            Ability(
                title = "Spiked Charger",
                usage = R.string.spiked_charger_usage,
                description = R.string.spiked_charger_description
            )
        ),

        keywords = listOf(
            "GELLERPOX INFECTED",
            "CHAOS",
            "NIGHTMARE HULK",
            "LUMBERGHAST",
            "40MM"
        )
    )