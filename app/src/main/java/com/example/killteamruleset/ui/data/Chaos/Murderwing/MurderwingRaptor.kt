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


val MurderwingRaptor = Operative(
    name = "Murderwing Raptor",
    imageRes = R.drawable.aod_captain,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8),
            )
        ),
        WeaponProfile(
            name = "Plasma Pistol (standard)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Range(8),
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Plasma Pistol (supercharge)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Range(8),
                Hot,
                Lethal(5),
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Chainsword",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(

            )
        ),

        ),

    abilities = listOf(
        Ability(
            title = "Thrill of Flight",
            usage = R.string.thrill_of_flight_usage,
            description = R.string.thrill_of_flight_description
        )

        ),
    keywords = listOf(
        "MURDERWING",
        "CHAOS",
        "HERETIC ASTARTES",
        "RAPTOR",
        "32MM"
    )
)
