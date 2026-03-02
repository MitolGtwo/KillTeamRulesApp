package com.example.killteamruleset.ui.data.Chaos.NemesisClaw


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Hot
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Limited
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val NightLordSkinthief = Operative(
    name = "Night Lord Skinthief ",
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
            name = "Nostraman Chainglaive",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Rending
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Flay Them Alive",
            usage = R.string.flay_them_alive_usage,
            description = R.string.flay_them_alive_description
        ),
        Ability(
            title = "Tyrant of the Skinning Pits",
            usage = R.string.tyrant_skinning_pits_usage,
            description = R.string.tyrant_skinning_pits_description
        ),

        ),
    keywords = listOf(
        "NEMESIS CLAW",
        "CHAOS",
        "HERETIC ASTARTES",
        "SKINTHIEF",
        "32MM"
    )
)
