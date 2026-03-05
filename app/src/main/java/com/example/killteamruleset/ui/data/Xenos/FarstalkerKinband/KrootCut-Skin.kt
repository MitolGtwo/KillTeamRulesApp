package com.example.killteamruleset.ui.data.Xenos.FarstalkerKinband

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val KrootCutSkin = Operative(
    name = "Kroot Cut-Skin",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Cut-skin's Blades",
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
            title = "Vicious Duellist",
            usage = R.string.vicious_duellist_usage,
            description = R.string.vicious_duellist_description
        ),
        Ability(
            title = "Savage Assault",
            usage = R.string.savage_assault_usage,
            description = R.string.savage_assault_description
        ),
    ),


    keywords = listOf(
        "FARSTALKER KINBAND",
        "T’AU EMPIRE",
        "KROOT",
        "CUT-SKIN",
        "28MM"

    )
)
