package com.example.killteamruleset.ui.data.Xenos.HierotekCircle


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val ImmortalGuardian = Operative(
    name = "Immortal Guardian",
    imageRes = R.drawable.hierotek_guardian,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "3+",
        wounds = 10
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Gauss Blaster",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Tesla carbine",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "3/3",
            keywords = listOf(
                Devastating(1,"2\"")
            )
        ),

        WeaponProfile(
            name = "Bayonet",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Steadfast",
            usage = R.string.hierotek_steadfast_usage,
            description = R.string.hierotek_steadfast_description
        )
    ),


    keywords = listOf(
        "HIEROTEK CIRCLE",
        "NECRON",
        "GUARDIAN",
        "32MM"
    )
)