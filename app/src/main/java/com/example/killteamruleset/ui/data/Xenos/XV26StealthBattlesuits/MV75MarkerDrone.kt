package com.example.killteamruleset.ui.data.Xenos.XV26StealthBattlesuits



import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Accurate
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Limited
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Seek_light
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val MV75MarkerDrone = Operative(
    name = "MV75 Marker Drone",
    imageRes = R.drawable.drone_marker,
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
            title = "Drone",
            usage = R.string.xvdrone_usage,
            description = R.string.xvdrone_description
        ),
        Ability(
            title = "Markerlight",
            usage = R.string.xv26_markerlight_usage,
            description = R.string.xv26_markerlight_description
        )
    ),


    keywords = listOf(
        "XV26 STEALTH BATTLESUIT",
        "T'AU EMPIRE",
        "MV75 MARKER",
        "DRONE",
        "28MM"
    )
)