package com.example.killteamruleset.ui.data.Empire.list.DeathKorps

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathKorpSpotter = Operative(
    name = "Death Korp Spotter",
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
            name = "Mortar Barrage",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "4+",
            damage = "3/5",
            keywords = listOf(
              Blast(2),
              Heavy("Dash only"),
              Silent
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
            title = "SPOT",
            usage = "1 APL/ Firefight Phase",
            description = "SUPPPORT. Select one  enemy Operative visible to this Operative. Once" +
                          " during this turning point, when a friendly DEATH KORPS Operative within" +
                          " 3\" of this operative is shooting that enemy Operative, you can use this effect" +
                          ". If you do:\nThat friendly operative´s range weapons have the Seek Light weapon rule." +
                          "\nThat enemy operative cannot be obscured.\n\nThis Operative CANNOT perform" +
                          " this action while within control range of an enemy Operative."
        )
        
    ),
    keywords = listOf(
        "DEATH KORP",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "SPOTTER",
        "25MM"

    )
)
