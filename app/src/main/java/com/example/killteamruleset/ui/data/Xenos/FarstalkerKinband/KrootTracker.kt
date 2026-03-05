package com.example.killteamruleset.ui.data.Xenos.FarstalkerKinband

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Balanced
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val KrootTracker = Operative(
    name = "Kroot Tracker",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 8
    ),
    weapons = listOf(

        WeaponProfile(
            name = "Kroot Rifle",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Blade",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Marked for the Hunt",
            usage = R.string.marked_for_the_hunt_usage,
            description = R.string.marked_for_the_hunt_description
        ),
        Ability(
            title = "From the Eye Above",
            usage = R.string.from_the_eye_above_usage,
            description = R.string.from_the_eye_above_description
        )
    ),


    keywords = listOf(
        "FARSTALKER KINBAND",
        "T’AU EMPIRE",
        "KROOT",
        "TRACKER",
        "28MM"

    )
)