package com.example.killteamruleset.ui.data.Empire.list.InquisitorialAgents


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val PenalLegionnaireAgent = Operative(
    name = "Penal Legionnaire Agent",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Hand Flamer",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "3/3",
            keywords = listOf(
                Range(6),
                Saturate,
                Torrent(1)
            )
        ),
        WeaponProfile(
            name = "Chainsword",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Chem-mask",
            usage = R.string.chem_mask_usage,
            description = R.string.chem_mask_description
        ),
        Ability(
            title = "Cruel",
            usage = R.string.cruel_usage,
            description = R.string.cruel_description
        )
    ),


    keywords = listOf(
        "INQUISITORIAL AGENT",
        "IMPERIUM",
        "INQUISITION",
        "PENAL LEGIONNAIRE",
        "25MM"
    )
)