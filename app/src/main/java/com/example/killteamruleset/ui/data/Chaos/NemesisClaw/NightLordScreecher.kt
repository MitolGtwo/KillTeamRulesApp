package com.example.killteamruleset.ui.data.Chaos.NemesisClaw


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Hot
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Limited
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val NightLordScreecher = Operative(
    name = "Night Lord Screecher",
    imageRes = R.drawable.aod_captain,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Lightning Claws",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Ceaseless,
                Lethal(5)
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Screecher",
            usage = R.string.screecher_usage,
            description = R.string.screecher_description
        ),
        Ability(
            title = "Appetite for Cruelty",
            usage = R.string.appetite_for_cruelty_usage,
            description = R.string.appetite_for_cruelty_description
        ),

    ),
    keywords = listOf(
        "NEMESIS CLAW",
        "CHAOS",
        "HERETIC ASTARTES",
        "SCREECHER",
        "32MM"
    )
)
