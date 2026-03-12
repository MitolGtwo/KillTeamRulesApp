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


val VespidShadestrain = Operative(
    name = "Vespid Shadestrain",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "3+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Neutron Sting",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/3",
            keywords = listOf(
                Range(8),
                Devastating(2)
            )
        ),
        WeaponProfile(
            name = "Neutron Grenade",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/3",
            keywords = listOf(
                Range(6),
                Blast(2),
                Devastating(2),
                Limited(1),
                Saturate
            )
        ),
        WeaponProfile(
            name = "Claws",
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
            title = "Ghost Rig",
            usage = R.string.ghost_rig_usage,
            description = R.string.ghost_rig_description
        ),
        Ability(
            title = "Camouflaged",
            usage = R.string.camouflaged_usage,
            description = R.string.camouflaged_description
        ),
    ),


    keywords = listOf(
        "VESPID STINGWING",
        "T'AU EMPIRE",
        "SHADESTRAIN",
        "28MM"
    )
)