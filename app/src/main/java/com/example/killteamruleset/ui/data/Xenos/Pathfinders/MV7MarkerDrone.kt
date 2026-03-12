package com.example.killteamruleset.ui.data.Xenos.Pathfinders


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Hot
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Limited
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Punishing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val Mv7MarkerDrone = Operative(
    name = "Mv7 Marker Drone",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Ram",
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
            title = "High-intensity Markerligh",
            usage = R.string.high_markerlight_usage,
            description = R.string.high_markerlight_description
        ),
        Ability(
            title = "Drone",
            usage = R.string.path_drone_usage,
            description = R.string.path_drone_description
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
        "MV7 MARKER",
        "DRONE",
        "32MM"
    )
)