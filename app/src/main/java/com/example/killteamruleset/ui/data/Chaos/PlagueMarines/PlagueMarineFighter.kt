package com.example.killteamruleset.ui.data.Chaos.PlagueMarines

import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Poison
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val PlagueMarineFighter = Operative(
    name = "Plague Marine Figher",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "5\"",
        save = "3+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Flail of corruption",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Brutal,
                Severe,
                Shock,
                Poison
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Flail",
            usage = "1 APL",
            description = "Inflict D3+2 damage on each other operative that´s visible and within 2\"" +
                    " of this operative. Roll separately foe each: if it´s an enemy operative, if the D3" +
                    " result is a 3, that enemy operative also gains one of your Poison tokens(if it" +
                    " doesn´t have already one).\nThis action is treated as a Fight action, and this" +
                    " operative cannot perform it while having a Conceal order"
        )
    ),
    keywords = listOf(
        "PLAGUE MARINE",
        "CHAOS",
        "HERETIC ASTARTES",
        "FIGHTER",
        "32MM"
    )
)