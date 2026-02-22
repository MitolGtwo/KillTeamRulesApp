package com.example.killteamruleset.ui.data.Empire.list.CelestianInsidiants

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
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val InsidiatCremator: Operative
    get() = Operative(
        name = "Insidiat Cremator",
        imageRes = R.drawable.alpharanger,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "3+",
            wounds = 9
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Hand flamer (standard)",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "2+",
                damage = "3/3",
                keywords = listOf(
                    Range(6),
                    Saturate,
                    Torrent(1)
                )
        ),
           WeaponProfile(
                name = "Hand flamer (deluge)",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "2+",
                damage = "3/3",
                keywords = listOf(
                    Range(4),
                    Saturate,
                    Seek_light,
                    Torrent(0)
                )
        ),
            WeaponProfile(
                name = "Null Mace",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "3+",
                damage = "4/4",
                keywords = listOf(
                    Shock
                ),
                extraRules = listOf("*Anti-PSYKER")
            )
        ),

        abilities = listOf(
            Ability(
                title = "Inspirational Pyre",
                usage = R.string.inspirational_pyre_usage,
                description = R.string.inspirational_pyre_description
            ),

            Ability(
                title = "Note",
                usage = R.string.torrent0_usage,
                description = R.string.torrent0_description
            )
        ),

        keywords = listOf(
            "CELESTIAN INSIDIANT",
            "IMPERIUM",
            "ADEPTA SORORITAS",
            "CREMATOR",
            "32MM"
        )
    )
