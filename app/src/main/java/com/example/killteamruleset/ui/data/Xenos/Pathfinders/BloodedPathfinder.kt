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


val BloodedPathfinder = Operative(
    name = "Blooded Pathfinder",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Suppressed Pulse carbine",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Silent
            )
        ),
        WeaponProfile(
            name = "Bionic arm",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Veteran",
            usage = R.string.path_veteran_usage,
            description = R.string.path_veteran_description
        ),
        Ability(
            title = "Markerlight",
            usage = R.string.markerlight_usage,
            description = R.string.markerlight_description
        ),
    ),


    keywords = listOf(
        "PATHFINDER",
        "T'AU EMPIRE",
        "BLOODED",
        "25MM"
    )
)