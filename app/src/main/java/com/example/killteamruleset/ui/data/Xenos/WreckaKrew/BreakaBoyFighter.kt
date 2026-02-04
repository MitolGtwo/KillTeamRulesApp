package com.example.killteamruleset.ui.data.Xenos.WreckaKrew


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val BreakaBoyFighter = Operative(
    name = "Breaka Boy Fighter",
    imageRes = R.drawable.wrecka_figther,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 12
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Smash Hammah",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "5/6",
            keywords = listOf(
                Brutal
            )
        )

    ),

    abilities = listOf(
        Ability(
            title = "BREAK STUFF",
            usage = "1 AP/Firefight Phase",
            description = "Select a terrain feature within the control range of this Operative. If is an" +
                    " equipment terrain, remove it. Otherwise, place one of your Breach markers within" +
                    " this Operative´s control range as close as possible to that terrain feature." +
                    " Whenever an Operative is within 1\" of that marker, it treats parts of that terrain" +
                    " feature that are no more than 1\" thick as Accessible terrain\n\nThis " +
                    "operative CANNOT perform this action while within control range of an enemy " +
                    "Operative, or if a terrain feature isn´t within its control range."
        )
    ),
    keywords = listOf(
        "WRECKA KREW",
        "ORK",
        "BREAKABOY",
        "FIGHTER",
        "32MM"
    )
)