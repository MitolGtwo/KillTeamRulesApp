package com.example.killteamruleset.ui.data.Empire.list.DeathKorps

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathKorpVoxZealot = Operative(
    name = "Death Korp Zealot ",
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
            title = "The Emperor Protects!!",
            usage = "Passive/Firefight Phase",
            description = "Whenever an Operative is shooting this Operative, you can re-roll any of" +
                          " your defence dice."
        ),
        Ability(
            title = "Uplofting Primer",
            usage = "Passive/ Firefight Phase",
            description = "SUPPPORT. Whenever a friendly DEATH KORPS Operative is within 3\"" +
                          " os this Operative, that friendly Operative´s weapons have the" +
                          " Severe weapon rule." 
        )
        
    ),
    keywords = listOf(
        "DEATH KORP",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "ZEALOT",
        "25MM"

    )
)
