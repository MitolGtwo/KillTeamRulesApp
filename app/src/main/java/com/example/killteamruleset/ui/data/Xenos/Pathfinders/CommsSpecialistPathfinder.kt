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
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val CommsSpecialistPathfinder = Operative(
    name = "Comms Specialist Pathfinder",
    imageRes = R.drawable.path_comms,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Pulse carbine",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
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
            title = "Signal",
            usage = R.string.path_signal_usage,
            description = R.string.path_signal_description
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
        "COMMS SPECIALIST",
        "25MM"
    )
)