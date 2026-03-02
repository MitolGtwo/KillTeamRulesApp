package com.example.killteamruleset.ui.data.Chaos.Murderwing


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Hot
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val MurderwingWarpTalon = Operative(
    name = "Murderwing Warp Talon",
    imageRes = R.drawable.aod_captain,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Lightning Claws",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Ceaseless,
                Lethal(5),
                Rending

            )
        ),

        ),

    abilities = listOf(
        Ability(
            title = "Slice the Veil",
            usage = R.string.slice_the_veil_usage,
            description = R.string.slice_the_veil_description
        )

        ),
    keywords = listOf(
        "MURDERWING",
        "CHAOS",
        "HERETIC ASTARTES",
        "WARP TALON",
        "32MM"
    )
)
