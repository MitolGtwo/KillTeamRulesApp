package com.example.killteamruleset.ui.data.Empire.list.HunterClade

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val SkitariiRangerWarrior = Operative(
    name = "Skitarii Ranger Warrior",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 7
    ),

    weapons = listOf(
        WeaponProfile(
            name = "Galvanic Rifle",
            type = WeaponType.RANGED,
            attacks =4 ,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Heavy("Reposition Only"),
                Piercing_Crits(1)
            )
        ),
        WeaponProfile(
            name = "Gun Butt",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        ),
    ),

        abilities = listOf(

            Ability(
                title = "Targeting Protocol",
                usage = "Passive",
                description = "Whenever this operative is shooting, if it hasn't move before during its " +
                        "activation, or if is a counteraction, all its range weapons have the Lethal 5+" +
                        "weapon rule. Note this operative can perform a normal move action after the shoot action."
            )
        ),

        keywords = listOf(
            "HUNTER CLADE",
            "IMPERIUM",
            "ADEPTUS MECHANICUS",
            "SKITARII",
            "RANGER",
            "WARRIOR",
            "25MM"
        )
)
