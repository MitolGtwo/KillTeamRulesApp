package com.example.killteamruleset.ui.data.Empire.list.DeathKorps

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathKorpsMedic = Operative(
    name = "Death Korps Medic",
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
            name = "Bayonet",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Medic!",
            usage = "Pasive/ Firefight Phase",
            description = "The first time during each turning point, when another friendly DEATHKORPS Operative" +
                " would be incapacitated while visible and within 3\" of this operative, you can use this rule if" +
                " neither this nor the other friendly Operative is within control range of an enemy Operative" +
                ".If you do, that friendly operative isn´t incapacitated, has 1 wound remaining and cannot be" +
                " incapacitated for the remainder of the action.\nAfter that action, that friendly Operative can" +
                " inmediately perfrom a free Dash action, but must end that move within this Operative´s control range" +
                ". Substract 1 from this and the other Operative´s APL stats until the end of their next activations" +
                ", if this rule is used during that other Operative activation, it´s activation ends.\n" +
                "You cannot use this rule if this operative is incapacitated, or if it´s a Shoot action and this" +
                " Operative would be a primary or secondary target."
        ),
        Ability(
            title = "MEDKIT",
            usage = "1 APL",
            description = "Select one friendly DEATHKORPS Operative within this Operative´s control range" +
                " to regain up to 2D3 lost wounds. It cannot be used on an Operative which benefit from the" +
                " rule Medic! this turning point.\n\nThis Operative Cannot perform this action while within" +
                "control range of an enemy Operative."
        )
    ),
    keywords = listOf(
        "DEATH KORP",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "MEDIC",
        "25MM"

    )
)
