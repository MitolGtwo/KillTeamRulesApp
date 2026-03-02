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


val NightLordFearmonger = Operative(
    name = "Night Lord Fearmonger",
    imageRes = R.drawable.aod_captain,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Scoped Bolt Pistol (short range)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8),
                Lethal(5)
            )
        ),
        WeaponProfile(
            name = "Scoped Bolt Pistol (long range)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(

            )
        ),
        WeaponProfile(
            name = "Terrorchem Vial",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "2/0",
            keywords = listOf(
                Range(6),
                Blast(2),
                Devastating(3),
                Limited(1),
                Saturate,
            ),
            extraRules = listOf("*Terrochem")
        ),
        WeaponProfile(
            name = "Tainted Blade",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
            ),
            extraRules = listOf("*Terrochem")
        )
    ),

    abilities = listOf(
        Ability(
            title = "Terrorchem",
            usage = R.string.terrochem_usage,
            description = R.string.terrochem_description
        ),
        Ability(
            title = "Terrorchem Poison",
            usage = R.string.terrochem_poison_usage,
            description = R.string.terrochem_poison_description
        ),
        Ability(
            title = "Poison Objective",
            usage = R.string.poison_objective_usage,
            description = R.string.poison_objective_description
        ),

        ),
    keywords = listOf(
        "NEMESIS CLAW",
        "CHAOS",
        "HERETIC ASTARTES",
        "FEARMONGER",
        "32MM"
    )
)
