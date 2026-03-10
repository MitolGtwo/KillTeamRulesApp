package com.example.killteamruleset.ui.data.Xenos.HearthkynSalvagers

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Accurate
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val HearthkynDozr = Operative(
    name = "Hearthkyn Theyn",
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
            name = "Concussion Knux",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/4",
            keywords = listOf(
                Ceaseless,
                Lethal(5),
                Shock
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Brawler",
            usage = R.string.salvagers_brawler_usage,
            description = R.string.salvagers_brawler_description
        ),
        Ability(
            title = "Knux Smash",
            usage = R.string.knux_smash_usage,
            description = R.string.knux_smash_description
        )
    ),


    keywords = listOf(
        "HEARTHKYN SALVAGER",
        "LEAGUES OF VOTANN",
        "DÔZR",
        "28MM"
    )
)
