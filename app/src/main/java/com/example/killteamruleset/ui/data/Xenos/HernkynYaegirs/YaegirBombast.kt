package com.example.killteamruleset.ui.data.Xenos.HernkynYaegirs


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Accurate
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Limited
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val YaegirBombast = Operative(
    name = "Yaegir Bombast",
    imageRes = R.drawable.yaegir_bombast,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Wroughtlock revolvers",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Range(9),
                Ceaseless,
                Lethal(5)
            )
        ),
        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(

            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Wroughtlock Negotiation",
            usage = R.string.wroughtlock_revolvers_usage,
            description = R.string.wroughtlock_revolvers_description
        ),
        Ability(
            title = "Brazen Killer",
            usage = R.string.brazen_killer_usage,
            description = R.string.brazen_killer_description
        )
    ),


    keywords = listOf(
        "HERNKYN YAEGIR",
        "LEAGUES OF VOTANN",
        "BOMBAST",
        "28MM"
    )
)
