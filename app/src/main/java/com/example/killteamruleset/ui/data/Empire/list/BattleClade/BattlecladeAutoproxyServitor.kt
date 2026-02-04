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
            title = "Achillan Eye",
            usage = "Passive",
            description = "Whenever a friendly **BATTLECLADE** Operative is shooting an enemy Operative visible" +
                    " to this Operative, that friendly Operative's ranged weapons have the **Saturate** weapon rule." +
                    " This rule has no effect if this Operative is within control range of an enemy Operative."
        ),

        Ability(
            title = "GAZE OF THE OMNISSIAH",
            usage = "1AP/Firefight Phase",
            description = "Select one enemy Operative visible to this Operative. Until the end of the turning point, whenever" +
                    " a friendly **BATTLECLADE** Operative is shooting that enemy Operative, you can use this rule. If you do:\n" +
                    "*That friendly Operative's ranger weapons have the Seek Light weapon rule.\n*That enemy Operative cannot be obscured." +
                    " \n\nThis Operative **CANNOT** perform this action while within control range of an enemy Operative."
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
