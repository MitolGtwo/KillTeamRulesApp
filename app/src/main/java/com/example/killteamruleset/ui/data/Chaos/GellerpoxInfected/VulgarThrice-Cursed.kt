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

val VulgrarThricecursed: Operative
    get() = Operative(
        name = "Vulgrar Thrice-Cursed",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "5\"",
            save = "5+",
            wounds = 21
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Pyregut (standard)",
                type = WeaponType.RANGED,
                attacks = 5,
                hit = "2+",
                damage = "3/3",
                keywords = listOf(
                    Range(6),
                    Saturate,
                    Torrent(2)
                )
            ),
            WeaponProfile(
                name = "Pyregut (deluge)",
                type = WeaponType.RANGED,
                attacks = 5,
                hit = "2+",
                damage = "3/3",
                keywords = listOf(
                    Range(4),
                    Saturate,
                    Seek_light
                )
            ),
            WeaponProfile (
                name = "Fleshmelded Weapons",
                type = WeaponType.MELEE,
                attacks = 5,
                hit = "3+",
                damage = "4/5",
                keywords = listOf(
                ),
                extraRules = listOf("*Engineered")
            )
        ),

        abilities = listOf(
            Ability(
                title = "Spread the Glorious Gifts",
                usage = R.string.spread_glorious_gifts_usage,
                description = R.string.spread_glorious_gifts_description
            ),
            Ability(
                title = "Engineered",
                usage = R.string.engineered_usage,
                description = R.string.engineered_description
            )
        ),

        keywords = listOf(
            "GELLERPOX INFECTED",
            "CHAOS",
            "NIGHTMARE HULK",
            "LEADER",
            "VULGRAR THRICE-CURSED",
            "40MM"
        )
    )