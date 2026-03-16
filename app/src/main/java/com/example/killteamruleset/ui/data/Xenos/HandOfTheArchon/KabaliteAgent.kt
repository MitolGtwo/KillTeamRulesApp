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
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val KabaliteAgent = Operative(
    name = "Kabalite Agent",
    imageRes = R.drawable.hand_agent,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Splinter Rifle",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "2/4",
            keywords = listOf(
                Lethal(5)
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
            title = "Sadistic Competition",
            usage = R.string.sadistic_competition_usage,
            description = R.string.sadistic_competition_description
        )
    ),


    keywords = listOf(
        "HAND OF THE ARCHON",
        "AELDARI",
        "DRUKHARI",
        "AGENT",
        "25MM"
    )
)
