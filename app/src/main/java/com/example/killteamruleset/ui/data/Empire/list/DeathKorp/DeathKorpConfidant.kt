package com.example.killteamruleset.ui.data.Empire.list

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathKorpConfidant = Operative(
    name = "Death Korp Confidant",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Boltgun",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
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
            name = "Relic Laspistol",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "4+",
            damage = "2/4",
            keywords = listOf(
                Range(8),
                Lethal(5)
            )
        ),
        WeaponProfile(
            name = "Bayonet",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Chainsword",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Second in Command",
            usage = "Passive/Firefight phase",
            description = "If a friendly WATCHMASTER Operative is incapacitated, you can use this rule. If you" +
                          " do, until the end of the battle, this Operative can issue a GUARDSMAN ORDER as a " +
                          "STRATEGIC GAMBIT(even though it´s not a WATCHMASTER operative)."
        ),
        Ability(
            title = "Directive",
            usage = "Strategic Gambit",
            description = "Whenever this Operative is activated, if you haven´t used the Second in Command rule" +
                          " during the battle, you can select one other ready friendly DEATH KORP Operative visible" +
                          " and within 6\" of it. When this operative is expended, activate that other friendly" +
                          " Operative before your opponent activates(if that Operative is a TROOPER, ignore it´s" +
                          " Group Activation rule)."
        )
    ),


    keywords = listOf(
        "DEATH KORP",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "CONFIDANT",
        "25MM"

    )
)
