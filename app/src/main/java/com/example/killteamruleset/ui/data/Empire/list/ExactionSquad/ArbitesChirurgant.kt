package com.example.killteamruleset.ui.data.Empire.list.ExactionSquad

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val ArbiterChirurgant: Operative
    get() = Operative(
        name = "Arbiter Chirurgant",
        imageRes = R.drawable.alpharanger,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "4+",
            wounds = 8
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Combat Shotgun (close range)",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "3+",
                damage = "4/4",
                keywords = listOf(
                    Range(6)
                )
            ),
            WeaponProfile(
                name = "Combat Shotgun (long range)",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "5+",
                damage = "2/2",
                keywords = listOf(
                )
            ),
            WeaponProfile (
                name = "Repression Baton",
                type = WeaponType.MELEE,
                attacks = 3,
                hit = "4+",
                damage = "2/3",
                keywords = listOf(
                )
            )
        ),

        abilities = listOf(
            Ability(
                title = "Medic!",
                usage = R.string.exaction_medic_usage,
                description = R.string.exaction_medic_description
            ),
            Ability(
                title = "Medikit",
                usage = R.string.exaction_medikit_usage,
                description = R.string.exaction_medikit_description
            )
        ),



        keywords = listOf(
            "EXACTION SQUAD",
            "IMPERIUM",
            "ADEPTUS ARBITERS",
            "MEDIC",
            "CHIRUGANT",
            "28MM"
        )
    )

