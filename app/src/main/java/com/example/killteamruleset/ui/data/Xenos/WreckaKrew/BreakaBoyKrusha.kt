package com.example.killteamruleset.ui.data.Xenos.WreckaKrew



import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val BreakaBoyKrusha = Operative(
    name = "Breaka Boy Krusha ",
    imageRes = R.drawable.wrecka_krusha,
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
            ),
            extraRules = listOf("*Smash")
        )

    ),

    abilities = listOf(
        Ability(
            title ="Armoured Up",
            usage = R.string.wrecka_krusha_armoured_usage,
            description = R.string.wrecka_krusha_armoured_description
        ),
        Ability(
            title = "Smash",
            usage = R.string.wrecka_krusha_smash_usage,
            description = R.string.wrecka_krusha_smash_description
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