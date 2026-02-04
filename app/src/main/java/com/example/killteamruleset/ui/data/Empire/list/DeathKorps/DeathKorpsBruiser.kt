package com.example.killteamruleset.ui.data.Empire.list.DeathKorps

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathKorpsBruiser = Operative(
    name = "Death Korps Bruiser",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Lasgun",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Trench Club",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/3",
            keywords = listOf(
                Shock
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Bruiser",
            usage = "Pasive/ Firefight Phase",
            description = "Once per turning point, when this Operative is fighting or" +
                " retaliating, in the Resolve Attack Dice step, you can ignore the damage" +
                " inflicted on it from one normal success.\nIf this Operative is incapacitated" +
                " during the FIGHT action, you can strike the enemy Operative in that sequence" +
                " with one of your unresolved successes before this Operative is removed from the" +
                "killzone."
        )
    ),


    keywords = listOf(
        "DEATH KORP",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "BRUISER",
        "25MM"

    )
)
