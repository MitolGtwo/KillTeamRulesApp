package com.example.killteamruleset.ui.data.Empire.list.CelestianInsidiants

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val InsidiatReliquarius: Operative
    get() = Operative(
        name = "Insidiat Reliquarius",
        imageRes = R.drawable.alpharanger,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "3+",
            wounds = 9
        ),
        weapons = listOf(
           WeaponProfile(
                name = "Bolt Pistol",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "3+",
                damage = "3/4",
                keywords = listOf(
                    Range(8)
                )
        ),
           WeaponProfile(
                name = "Condemnor Stakethrower",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "3+",
                damage = "2/2",
                keywords = listOf(
                  Devastating(1),
                    Piercing_Crits(1),
                    Silent
                ),
                extraRules = listOf("*Anti-PSYKER")
        ),
           WeaponProfile(
                name = "Gun butt",
                type = WeaponType.MELEE,
                attacks =3,
                hit = "3+",
                damage = "2/3",
                keywords = listOf(
                    Lethal(5),
                    Brutal
                )
           )
        ),

        abilities = listOf(
            Ability(
                title = "Simulacrum Nullificatus Icon Bearer",
                usage = R.string.simulacrum_nullificatus_usage,
                description = R.string.simulacrum_nullificatus_description
            ),

            Ability(
                title = "Devotion",
                usage = R.string.devotion_usage,
                description = R.string.devotion_description
            )
        ),

        keywords = listOf(
            "CELESTIAN INSIDIANT",
            "IMPERIUM",
            "ADEPTA SORORITAS",
            "RELIQUARIUS",
            "32MM"
        )
    )
