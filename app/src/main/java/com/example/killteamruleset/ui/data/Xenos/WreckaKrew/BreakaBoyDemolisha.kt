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
            title ="Reckless Temperament",
            usage =R.string.wrecka_demolisha_recklesstemperament_usage,
            description = R.string.wrecka_demolisha_recklesstemperament_description
        ),
        Ability(
            title = "Detonate",
            usage = R.string.wrecka_demolisha_detonate_usage,
            description = R.string.wrecka_demolisha_detonate_description
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