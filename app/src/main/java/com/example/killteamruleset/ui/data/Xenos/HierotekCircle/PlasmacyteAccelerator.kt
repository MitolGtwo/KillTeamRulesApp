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
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val PlasmacyteAccelerator = Operative(
    name = "Plasmacyte Accelerator",
    imageRes = R.drawable.hierotek_accelerator,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "5+",
        wounds = 5
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Spark",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
                Range(4),
                Piercing(1)
            )
        ),

        WeaponProfile(
            name = "Claws",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "5+",
            damage = "1/2",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Scuttler",
            usage = R.string.hierotek_scuttler_usage,
            description = R.string.hierotek_scuttler_description
        ),
        Ability(
            title = "Accelerate",
            usage = R.string.hierotek_accelerate_usage,
            description = R.string.hierotek_accelerate_description
        )
    ),


    keywords = listOf(
        "HIEROTEK CIRCLE",
        "NECRON",
        "PLASMACYTE",
        "ACCELERATOR",
        "25MM"
    )
)