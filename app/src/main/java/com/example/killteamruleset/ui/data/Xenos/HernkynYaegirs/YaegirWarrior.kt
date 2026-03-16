package com.example.killteamruleset.ui.data.Xenos.HernkynYaegirs


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Accurate
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Concealed_Position
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Limited
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val YaegirWarrior = Operative(
    name = "Yaegir Warrior",
    imageRes = R.drawable.yaegir_warrior,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bolt Revolver",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/5",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Bolt Shotgun (short range)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/4",
            keywords = listOf(
                Range(6)
            )
        ),
        WeaponProfile(
            name = "Bolt Shotgun (long range)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "5+",
            damage = "2/2",
            keywords = listOf(
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
        ),
        WeaponProfile(
            name = "Plasma Knife",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "3/5",
            keywords = listOf(
                Lethal(5)
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Intrepid",
            usage = R.string.intrepid_usage,
            description = R.string.intrepid_description
        ),
    ),


    keywords = listOf(
        "HERNKYN YAEGIR",
        "LEAGUES OF VOTANN",
        "WARRIOR",
        "28MM"
    )
)
