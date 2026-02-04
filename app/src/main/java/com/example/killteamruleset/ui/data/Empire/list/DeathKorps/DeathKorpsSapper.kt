package com.example.killteamruleset.ui.data.Empire.list.DeathKorps

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathKorpsSapper = Operative(
    name = "Death Korps Sapper",
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
            name = "Remote Detonator",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "2+",
            damage = "5/6",
            keywords = listOf(
              Heavy("Dash only"),
              Limited(1),
              Piercing(1),
              Silent,
            ),
           extraRules = listOf("*Detonate")
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
            title = "Mine Layer",
            usage = "Pasive/ Firefight Phase",
            description = "This Operative is carrying your Mine marker. It can perform the" +
                " Pick Up Marker action on that marker, and whenever it performs the Place" +
                " Marker action on that marker, it can perform a free Dash action."
        ),

        Ability(
            title = "Detonate",
            usage = "Special Weapon Rule",
            description = "Don´t select a valid target, shoot against each operative within 2\"" +
                " of your Mine marker, unless heavy terrain is wholly intervening between that" +
                " Operative and that marker. Each valid target cannot be in cover or obscured" +
                ". Roll for each Operative.\nThis weapon cannot be selected if your Mine marker" +
                " is not in the killzone, after shooting this weapon the Mine marker is removed" +
                " from the killzone. In a killzone that use close quarter rule, this weapon has" +
                " Lethal 5+ weapon rule."
        )
        
    ),
    keywords = listOf(
        "DEATH KORP",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "SAPPER",
        "25MM"

    )
)
