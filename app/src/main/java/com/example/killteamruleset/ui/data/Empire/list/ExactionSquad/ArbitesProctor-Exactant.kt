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

val ArbiterProctorExactant: Operative
    get() = Operative(
        name = "Arbiter Proctor-Exactant",
        imageRes = R.drawable.alpharanger,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "4+",
            wounds = 9
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Combat Shotgun (close range)",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "2+",
                damage = "4/4",
                keywords = listOf(
                    Range(6)
                )
            ),
            WeaponProfile(
                name = "Combat Shotgun (long range)",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "4+",
                damage = "2/2",
                keywords = listOf(
                )
            ),
            WeaponProfile(
                name = "Shotpistol",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "3+",
                damage = "3/3",
                keywords = listOf(
                    Range(8)
                )
            ),
            WeaponProfile (
                name = "Dominator maul & assault shield",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "3+",
                damage = "4/4",
                keywords = listOf(
                    Lethal(5),
                    Shock
                ),
                extraRules = listOf("*Repress")
            ),
            WeaponProfile (
                name = "Repression Baton",
                type = WeaponType.MELEE,
                attacks = 3,
                hit = "3+",
                damage = "2/3",
                keywords = listOf(
                )
            )
        ),

        abilities = listOf(
            Ability(
                title = "Assault Shield",
                usage = R.string.exaction_assault_shield_usage,
                description = R.string.exaction_assault_shield_description
            ),
            Ability(
                title = "Nuncio-aquila",
                usage = R.string.nuncio_aquila_usage,
                description = R.string.nuncio_aquila_description
            ),
            Ability(
                title = "Deploy Nuncio-aquila",
                usage = R.string.deploy_nuncio_aquila_usage,
                description = R.string.deploy_nuncio_aquila_description
            )
        ),

        keywords = listOf(
            "EXACTION SQUAD",
            "IMPERIUM",
            "ADEPTUS ARBITERS",
            "LEADER",
            "PROCTOR-EXACTANT",
            "28MM"
        )
    )

