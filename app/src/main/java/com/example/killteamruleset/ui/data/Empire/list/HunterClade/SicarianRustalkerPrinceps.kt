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
            title = "Canticle of Destruction",
            usage = "Passive",
            description = "Whenever an friendly HUNTER CLADE RUSTALKER operative within 3\" of this" +
                    " operative is Fighting, the first time you strike with a critical success during" +
                    " that sequence, inflict 1 additional damage"
        ),
        Ability(
            title = "Wasteland Stalker",
            usage = "Passive",
            description = "Whenever an Operative is Shooting this operative, if you can retain any" +
                    " cover saves, you can retain one additional cover save, or you can retain one " +
                    "cover save as Critical sucess instead. This isn´t cumulative with improved cover" +
                    " saves from Vantage terrain"
        ),
        Ability(
            title = "Control Protocol",
            usage = "FireFight Phase, Every Turn",
            description = "You can use the ploy Command Override Firefight ploy for free, if the " +
                    "specified friendly HUNTER CLADE operative is visible to this operative."
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
