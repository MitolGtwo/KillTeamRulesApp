package com.example.killteamruleset.ui.data.Xenos.CorsairVoidscarred

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Seek_light
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val VoidscarredShadeRunner = Operative(
    name = "Voidscarred Shade Runner",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(

        WeaponProfile(
            name = "Shuriken pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8),
                Rending
            )
        ),
        WeaponProfile(
            name = "Throwing Blades",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "2/4",
            keywords = listOf(
                Range(6),
                Silent
            )
        ),
        WeaponProfile(
            name = "Hekatarii blades",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Ceaseless,
                Lethal(5)
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Blink Pack",
            usage = R.string.blink_pack_usage,
            description = R.string.blink_pack_description
        ),
        Ability(
            title = "Slicing Attack",
            usage = R.string.slicing_attack_usage,
            description = R.string.slicing_attack_description,
            imageRes = R.drawable.slicing_attack
        )
    ),


    keywords = listOf(
        "CORSAIR VOIDSCARRED",
        "AELDARI",
        "ANHRATHE",
        "SHADE RUNNER",
        "28MM"

    )
)