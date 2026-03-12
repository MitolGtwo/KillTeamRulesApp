package com.example.killteamruleset.ui.data.Xenos.VespidStingwings


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


val OversightDrone = Operative(
    name = "Oversight Drone",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "8\"",
        save = "2+",
        wounds = 5
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Ram",
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
            title = "Evasive Drone",
            usage = R.string.evasive_drone_usage,
            description = R.string.evasive_drone_description
        ),
        Ability(
            title = "Aerial Guidance",
            usage = R.string.aerial_guidance_usage,
            description = R.string.aerial_guidance_description
        )
    ),


    keywords = listOf(
        "VESPID STINGWING",
        "T'AU EMPIRE",
        "OVERSIGHT",
        "DRONE",
        "25MM"
    )
)