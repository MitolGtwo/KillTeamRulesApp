package com.example.killteamruleset.ui.data.Empire.list.BattleClade

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val BattleCladeAutoProxyServitor = Operative(
    name = "Battleclade Auto-Proxy Servitor",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Taser Goad",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Lethal(5),
                Shock
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = R.string.battleclade_autoproxy_eye,
            usage = R.string.battleclade_autoproxy_eye_usage,
            description = R.string.battleclade_autoproxy_eye_description
        ),

        Ability(
            title = R.string.battleclade_autoproxy_gaze,
            usage = R.string.battleclade_autoproxy_gaze_usage,
            description = R.string.battleclade_autoproxy_gaze_description
        )
    ),


    keywords = listOf(
        "BATTLE CLADE",
        "IMPERIUM",
        "ADEPTUS MECHANICUS",
        "AUTO-PROXY",
        "SERVITOR",
        "25MM"
    )
)
