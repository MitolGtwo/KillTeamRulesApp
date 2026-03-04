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


val VoidscarredKurnathiHunter = Operative(
    name = "Voidscarred Kurnathi Hunter",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Faolchú",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "1/2",
            keywords = listOf(
                Rending,
                Saturate,
                Seek_light,
                Silent
            )
        ),
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
            name = "Power Weapon",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Lethal(5)
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Faolchú’s Bond",
            usage = R.string.faolchu_bond_usage,
            description = R.string.faolchu_bond_description
        ),
        Ability(
            title = "Erudite Hunter",
            usage = R.string.erudite_hunter_usage,
            description = R.string.erudite_hunter_description
        )
    ),


    keywords = listOf(
        "CORSAIR VOIDSCARRED",
        "AELDARI",
        "ANHRATHE",
        "KURNATHI HUNTER",
        "28MM"

    )
)