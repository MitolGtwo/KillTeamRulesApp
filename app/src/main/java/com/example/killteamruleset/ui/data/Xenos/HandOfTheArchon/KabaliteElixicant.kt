package com.example.killteamruleset.ui.data.Xenos.HandOfTheArchon

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val KabaliteElixicant = Operative(
    name = "Kabalite Elixicant",
    imageRes = R.drawable.hand_medic,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Splinter rifle",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "2/4",
            keywords = listOf(
                Lethal(5)
            )
        ),
        WeaponProfile(
            name = "Stim-needler",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "0/0",
            keywords = listOf(
                Range(3),
                Lethal(3),
                Stun
            )
        ),
        WeaponProfile(
            name = "Array of blades",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Combat Drugs",
            usage = R.string.combat_drugs_usage,
            description = R.string.combat_drugs_description
        ),
        Ability(
            title = "Administre Drugs",
            usage = R.string.administre_drugs_usage,
            description = R.string.administre_drugs_description
        )
    ),


    keywords = listOf(
        "HAND OF THE ARCHON",
        "AELDARI",
        "DRUKHARI",
        "ELIXICANT",
        "25MM"
    )
)