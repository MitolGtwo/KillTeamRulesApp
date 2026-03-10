package com.example.killteamruleset.ui.data.Xenos.HearthkynSalvagers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Accurate
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Limited
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val HearthkynGrenadier = Operative(
    name = "Hearthkyn Grenadier",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "3+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Autoch-pattern Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Range(8),
                Accurate(1)
            )
        ),
        WeaponProfile(
            name = "C8 HX Charge",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Range(4),
                Blast(1),
                Heavy("Reposition Only"),
                Limited(1),
                Piercing(1),
                Saturate
            )
        ),
        WeaponProfile(
            name = "Fists",
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
            title = "Grenadier",
            usage = R.string.salvagers_grenadier_usage,
            description = R.string.salvagers_grenadier_description
        ),
        Ability(
            title = "VÂYR-3 UTILITY GRENADE",
            usage = R.string.vayr3_usage,
            description = R.string.vayr3_description
        )
    ),


    keywords = listOf(
        "HEARTHKYN SALVAGER",
        "LEAGUES OF VOTANN",
        "GRENADIER",
        "28MM"
    )
)
