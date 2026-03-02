package com.example.killteamruleset.ui.data.Chaos.GellerpoxInfected

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val SludgeGrub : Operative
    get() = Operative(
        name = "Sludge-Grub",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "6+",
            wounds = 2
        ),
        weapons = listOf(
            WeaponProfile (
                name = "Acid Spit",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "4+",
                damage = "2/2",
                keywords = listOf(
                    Range(6),
                    Devastating(1,"1\""),
                    Piercing(1)
                )
            ),
            WeaponProfile (
                name = "Fanged Maw",
                type = WeaponType.MELEE,
                attacks = 2,
                hit = "4+",
                damage = "1/3",
                keywords = listOf(
                )
            ),
        ),

        abilities = listOf(

            Ability(
                title = "Group Activation",
                usage = R.string.geller_group_activation_vermin_usage,
                description = R.string.geller_group_activation_vermin_description
            ),
            Ability(
                title = "Caustic Demise",
                usage = R.string.caustic_demise_usage,
                description = R.string.caustic_demise_description
            ),
        ),

        keywords = listOf(
            "GELLERPOX INFECTED",
            "CHAOS",
            "MUTOID VERMIN",
            "SLUDGE-GRUB",
            "25MM"
        )
    )