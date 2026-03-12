package com.example.killteamruleset.ui.data.Xenos.HierotekCircle


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Accurate
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val Psychomancer = Operative(
    name = "Psychomancer",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Abyssal Lance (ranged)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "2/2",
            keywords = listOf(
                Blast(2),
                Devastating(1,"2\""),
                Piercing(2)
            ),
            extraRules = listOf("*Magnify")
        ),

        WeaponProfile(
            name = "Abyssal Lance (melee)",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "4/4",
            keywords = listOf(
                Devastating(1)
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Interstitial Command",
            usage = R.string.interstitial_command_usage,
            description = R.string.interstitial_command_description
        ),
        Ability(
            title = "Harbinger of Despair",
            usage = R.string.harbinger_of_despair_usage,
            description = R.string.harbinger_of_despair_description
        ),
        Ability(
            title = "Nightmare Shroud",
            usage = R.string.nightmare_shroud_usage,
            description = R.string.nightmare_shroud_description
        ),
        Ability(
            title = "Vision of Madness",
            usage = R.string.vision_of_madness_usage,
            description = R.string.vision_of_madness_description
        ),
    ),


    keywords = listOf(
        "HIEROTEK CIRCLE",
        "NECRON",
        "LEADER",
        "CRYPTEK",
        "PSYCHOMANCER",
        "40MM"
    )
)
