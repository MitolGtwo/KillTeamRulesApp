package com.example.killteamruleset.ui.data.Xenos.WreckaKrew

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Detonate
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Limited
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val BreakaBoyDemolisha = Operative(
    name = "Breaka Boy Demolisha",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 12
    ),
    weapons = listOf(
        WeaponProfile(
            name = "TankHammer(Bash)",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "TankHammer(Detonate)",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "*",
            keywords = listOf(
                Lethal(5),
                Limited(1),
                Detonate
            )
        )

    ),

    abilities = listOf(
        Ability(
            title = "Reckless Temperament",
            usage = "Passive",
            description = "If this Operative has a Conceal order, Normal damage of 4 or more inflicts" +
                    " 1 less damage. If this Operative has an Engage order, this rule applies for " +
                    "Normal and Critical damage."
        )
    ),
    keywords = listOf(
        "WRECKA KREW",
        "ORK",
        "BREAKABOY",
        "DEMOLISHA",
        "32MM"
    )
)