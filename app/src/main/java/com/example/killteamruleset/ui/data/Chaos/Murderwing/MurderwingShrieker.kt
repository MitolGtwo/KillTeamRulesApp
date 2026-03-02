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


val MurderwingShrieker = Operative(
    name = "Murderwing Shrieker",
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
            title = "Modified Vox-casters",
            usage = R.string.modified_vox_caster_usage,
            description = R.string.modified_vox_caster_description
        ),
        Ability(
            title = "Shriek",
            usage = R.string.shriek_usage,
            description = R.string.shriek_description
        ),

    ),
    keywords = listOf(
        "MURDERWING",
        "CHAOS",
        "HERETIC ASTARTES",
        "SHRIEKER",
        "32MM"
    )
)
