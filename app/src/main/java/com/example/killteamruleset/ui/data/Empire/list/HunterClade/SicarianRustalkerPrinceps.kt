package com.example.killteamruleset.ui.data.Empire.list.HunterClade

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Balanced
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val SicarianRuststalkerPrinceps = Operative(
    name = "Sicarian Rustalker Princeps",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 11
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Chordclaw & Transonic Blades",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Balanced,
                Rending
            )
        )

    ),

    abilities = listOf(
        Ability(
            title = R.string.canticle_destruction,
            usage = R.string.canticle_destruction_usage,
            description = R.string.canticle_destruction_description
        ),
        Ability(
            title = R.string.wasteland_stalker,
            usage = R.string.wasteland_stalker_usage,
            description = R.string.wasteland_stalker_description
        ),
        Ability(
            title = R.string.control_protocol,
            usage = R.string.control_protocol_usage,
            description = R.string.control_protocol_description
        )
    ),


    keywords = listOf(
        "HUNTER CLADE",
        "IMPERIUM",
        "ADEPTUS MECHANICUS",
        "LEADER",
        "SICARIAN",
        "RUSTSTALKER",
        "PRINCEPS",
        "40MM"
    )
)
