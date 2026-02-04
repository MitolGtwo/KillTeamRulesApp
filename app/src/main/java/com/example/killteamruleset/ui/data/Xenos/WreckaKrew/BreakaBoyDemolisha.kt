package com.example.killteamruleset.ui.data.Xenos.WreckaKrew

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Limited
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val BreakaBoyDemolisha = Operative(
    name = "Breaka Boy Demolisha",
    imageRes = R.drawable.wrecka_demolisha,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 12
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Tankhammer(Bash)",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Tankhammer(Detonate)",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "*",
            keywords = listOf(
                Lethal(5),
                Limited(1),
            ),
            extraRules = listOf("*Detonate")
        )

    ),

    abilities = listOf(
        Ability(
            title = "Reckless Temperament",
            usage = "Passive",
            description = "If this Operative has a Conceal order, Normal damage of 4 or more inflicts" +
                    " 1 less damage. If this Operative has an Engage order, this rule applies for " +
                    "Normal and Critical damage."
        ),
        Ability(
            title = "Detonate",
            usage = "Special Weapon Rule",
            description = "The first time you would inflict damage on an enemy Operative with this weapon profile" +
                " during the battle, on a normal success, inflict D6+6 damage on that enemy Operative" +
                " and each other Operative within this Operative´s control range (Roll separately for each), " +
                    "on a critical do the same but for 2D6+6. Then the action ends and you gain 1 Wrecka point +1 " +
                    "for each operative that was incapacitated during this action. Damage from this weapon cannot be reduced or ignored."
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