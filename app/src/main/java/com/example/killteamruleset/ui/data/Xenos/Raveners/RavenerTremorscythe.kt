package com.example.killteamruleset.ui.data.Xenos.Raveners


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
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val RavenerTremorscythe = Operative(
    name = "Ravener Tremorscythe",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "5+",
        wounds = 20
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Pincer Tail",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(3),
                Silent
            )
        ),
        WeaponProfile(
            name = "Scything Talons & Rending Claws",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Rending
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Subterranean Ambush",
            usage = R.string.subterrean_ambush_usage,
            description = R.string.subterrean_ambush_description
        ),
        Ability(
            title = "Hypersensory Hunter",
            usage = R.string.hypersensory_hunter_usage,
            description = R.string.hypersensory_hunter_description
        ),
    ),


    keywords = listOf(
        "RAVENER",
        "GREAT DEVOURER",
        "TYRANID",
        "TREMORSCYTHE",
        "40MM"
    )
)