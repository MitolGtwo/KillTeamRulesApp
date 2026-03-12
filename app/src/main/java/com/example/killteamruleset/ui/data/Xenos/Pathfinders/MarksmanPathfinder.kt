package com.example.killteamruleset.ui.data.Xenos.Pathfinders


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Limited
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val MarksmanPathfinder = Operative(
    name = "Marksman Pathfinder",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Marksman Rail Rifle (standard",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/4",
            keywords = listOf(
                Devastating(2),
                Lethal(5),
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Marksman Rail Rifle (dart round)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Piercing(1),
                Silent
            )
        ),
        WeaponProfile(
            name = "Gun butt",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "5+",
            damage = "2/3",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Inertial Dampener",
            usage = R.string.inertial_dampener_usage,
            description = R.string.inertial_dampener_description
        ),

    ),


    keywords = listOf(
        "PATHFINDER",
        "T'AU EMPIRE",
        "MARKSMAN",
        "25MM"
    )
)