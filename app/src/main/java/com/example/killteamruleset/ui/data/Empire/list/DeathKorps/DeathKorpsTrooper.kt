package com.example.killteamruleset.ui.data.Empire.list.DeathKorps

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathKorpTrooper = Operative(
    name = "Death Korp Trooper",
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
            title = "Group Activation",
            usage = "Passive/ Firefight Phase",
            description = "Whenever this Operative is expended, you MUST then activate another" +
                          " ready friendly DEATH KORP TROOPER Operative(if able) before your" +
                          " opponent activates. When that operative is expended, your opponent then" +
                          " activates as normal(you cannot activate more than two Operatives before" +
                          " your opponent with this rule)."
        
    ),
    keywords = listOf(
        "DEATH KORP",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "TROOPER",
        "25MM"

    )
)
