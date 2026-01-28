package com.example.killteamruleset.ui.data.Empire.list.HunterClade


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Balanced
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val SicarianRuststalkerWarrior = Operative(
    name = "Sicarian Rustalker Warrior",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 11
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Chordclaw & Transonic Razor",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Balanced
            )
        ),
        WeaponProfile(
            name = "Transonic Blades",
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
            title = "Wasteland Stalker",
            usage = "Passive",
            description = "Whenever an Operative is Shooting this operative, if you can retain any" +
                    " cover saves, you can retain one additional cover save, or you can retain one " +
                    "cover save as Critical sucess instead. This isn´t cumulative with improved cover" +
                    " saves from Vantage terrain"
        )
    ),


    keywords = listOf(
        "HUNTER CLADE",
        "IMPERIUM",
        "ADEPTUS MECHANICUS",
        "SICARIAN",
        "RUSTSTALKER",
        "WARRIOR",
        "40MM"
    )
)
