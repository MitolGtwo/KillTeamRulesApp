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


val ImmortalDespotek = Operative(
    name = "Immortal Despotek",
    imageRes = R.drawable.hierotek_despotek,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "3+",
        wounds = 11
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
        ),
        Ability(
            title = "Interstitial Command",
            usage = R.string.interstitial_command_usage,
            description = R.string.interstitial_command_description
        ),
    ),


    keywords = listOf(
        "HIEROTEK CIRCLE",
        "NECRON",
        "DESPOTEK",
        "32MM"
    )
)