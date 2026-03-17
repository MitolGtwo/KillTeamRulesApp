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


val Deathmark = Operative(
    name = "Deathmark",
    imageRes = R.drawable.hierotek_deathmark,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "3+",
        wounds = 10
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Synaptic disintegrator",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "4/3",
            keywords = listOf(
                Devastating(2),
                Heavy("Dash Only"),
                Piercing(1),
                Severe
            )
        ),

        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Deathmarked",
            usage = R.string.apprentek_assistance_usage,
            description = R.string.apprentek_assistance_description
        ),
        Ability(
            title = "Multi-Dimensional Vision",
            usage = R.string.multi_dimensional_vision_usage,
            description = R.string.multi_dimensional_vision_description
        ),
    ),


    keywords = listOf(
        "HIEROTEK CIRCLE",
        "NECRON",
        "DEATHMARK",
        "32MM"
    )
)