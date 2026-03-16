package com.example.killteamruleset.ui.data.Xenos.HearthkynSalvagers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Accurate
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Heavy
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
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val HearthkynLugger = Operative(
    name = "Hearthkyn Lugger",
    imageRes = R.drawable.salvager_lugger,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "3+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Autoch-pattern Bolter",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Accurate(1)
            )
        ),
        WeaponProfile(
            name = "Ion Blaster",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Piercing_Crits(1)
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
            title = "Well Supplied",
            usage = R.string.salvagers_well_supplied_usage,
            description = R.string.salvagers_well_supplied_description
        ),
        Ability(
            title = "I’ve Got It",
            usage = R.string.got_it_usage,
            description = R.string.got_it_description
        ),
    ),


    keywords = listOf(
        "HEARTHKYN SALVAGER",
        "LEAGUES OF VOTANN",
        "LUGGER",
        "28MM"
    )
)