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


val KabaliteCrimsonDuellist = Operative(
    name = "Kabalite Crimson Duellist",
    imageRes = R.drawable.hand_crisom,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Splinter Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "2/4",
            keywords = listOf(
                Range(8),
                Lethal(5)
            )
        ),
        WeaponProfile(
            name = "Razorflail",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "2+",
            damage = "4/5",
            keywords = listOf(
                Brutal
            ),
            extraRules = listOf("*Tangle")
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Brutal Display",
            usage = R.string.brutal_display_usage,
            description = R.string.brutal_display_description
        ),
        Ability(
            title = "Crimson Duellist",
            usage = R.string.crimson_duellist_usage,
            description = R.string.crimson_duellist_description
        ),
        Ability(
            title = "Tangle",
            usage = R.string.tangle_usage,
            description = R.string.tangle_description
        ),
    ),


    keywords = listOf(
        "HAND OF THE ARCHON",
        "AELDARI",
        "DRUKHARI",
        "CRIMSON DUELLIST",
        "25MM"
    )
)
