package com.example.killteamruleset.ui.data.Chaos.GellerpoxInfected


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
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

val Fleshscreamer : Operative
    get() = Operative(
        name = "Fleshscreamer",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "5\"",
            save = "5+",
            wounds = 20
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Mutant fist and Cleaver (lopping blow)",
                type = WeaponType.MELEE,
                attacks = 1,
                hit = "3",
                damage = "8/9",
                keywords = listOf(
                    Lethal(5)
                )
            ),

            WeaponProfile (
                name = "Mutant fist and Cleaver (slashing)",
                type = WeaponType.MELEE,
                attacks = 5,
                hit = "4+",
                damage = "5/6",
                keywords = listOf(
                )
            ),
        ),

        abilities = listOf(
            Ability(
                title = "Horrifying Shrieking",
                usage = R.string.horrifying_shrieking_usage,
                description = R.string.horrifying_shrieking_description
            )
        ),

        keywords = listOf(
            "GELLERPOX INFECTED",
            "CHAOS",
            "NIGHTMARE HULK",
            "FLESHSCREAMER",
            "40MM"
        )
    )