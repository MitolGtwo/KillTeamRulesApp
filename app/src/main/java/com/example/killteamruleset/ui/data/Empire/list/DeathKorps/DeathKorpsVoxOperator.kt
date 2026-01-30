package com.example.killteamruleset.ui.data.Empire.list.DeathKorps

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathKorpVoxOperator = Operative(
    name = "Death Korp Vox-Operator ",
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
            title = "Relay Orders",
            usage = "Passive/1 APL",
            description = "Once per turning point, when this operative receives a GUARDSMAN ORDER" +
                          ", if it´s not within control range of an enemy Operative, it can relay that" +
                          " order. All friendly DEATH KORPS Operatives in the killzone receive that order," +
                          " this Operative then loses 1 APL until the end of its next activation." +

        ),
        Ability(
            title = "Signal",
            usage = "1 APL/ Firefight Phase",
            description = "SUPPPORT. Select one other friendly DEATH KORPS Operative visible" +
                          " and within 6\" of this Operative. Until the end of that Operative´s" +
                          " next activation, add 1 to its APL stat.\n\nThis Operative CANNOT perform" +
                          " this action while within control range of an enemy Operative."
        )
        
    ),
    keywords = listOf(
        "DEATH KORP",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "VOX-OPERATOR",
        "25MM"

    )
)
