package com.example.killteamruleset.ui.data.Xenos.WreckaKrew



import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Smash
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val BreakaBoyKrusha = Operative(
    name = "Breaka Boy Krusha ",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 12
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Knucklebustas",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "5/6",
            keywords = listOf(
                Brutal,
                Shock,
                Smash
            )
        )

    ),

    abilities = listOf(
        Ability(
            title = "Armoured Up",
            usage = "Pasive",
            description = "Whenever an enemy Operative is Shooting, or this operative is Fighting or" +
                    " Retaliating, your opponent cannot retain a dice result less than 6 as a Critical" +
                    "success (Ex Severe,Lethal,Rending weapon rules)"
        )
    ),
    keywords = listOf(
        "WRECKA KREW",
        "ORK",
        "BREAKABOY",
        "KRUSHA",
        "32MM"
    )
)