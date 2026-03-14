package com.example.killteamruleset.ui.data.Xenos.Wyrmblade


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
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
import com.example.killteamruleset.ui.model.Seek_light
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val Locus = Operative(
    name = "Locus",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "4+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Barbed Tail",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(3),
                Silent
            )
        ),
        WeaponProfile(
            name = "Locus blades",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Lethal(5)
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Expert Swordsman",
            usage = R.string.wyrm_swordman_usage,
            description = R.string.wyrm_swordman_description
        ),
        Ability(
            title = "Quicksilver Strike",
            usage = R.string.quicksilver_strike_usage,
            description = R.string.quicksilver_strike_description
        ),
        Ability(
            title = "Bladed Stance",
            usage = R.string.wyrm_bladestance_usage,
            description = R.string.wyrm_bladestance_description
        ),
    ),


    keywords = listOf(
        "WYRMBLADE",
        "TYRANID",
        "GENESTEALER CULT",
        "CULT AGENT",
        "LOCUS",
        "32MM"
    )
)