package com.example.killteamruleset.ui.data.Xenos.Exodites

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val DragonMasterClanblade = Operative(
    name = "Dragon Master Clanblade",
    imageRes = R.drawable.exodite_clanblade,
    stats = OperativeStats(
        apl = 4,
        move = "12\"",
        save = "3+",
        wounds = 24
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Solar carbine",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/3",
            keywords = listOf(
                Devastating(1),
            )
        ),
        WeaponProfile(
            name = "Drakesteed fangs & talons",
            type = WeaponType.MELEE,
            attacks = 6,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Brutal
            )
        ),
        WeaponProfile(
            name = "Moonblades",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Lethal(5)
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Scaleshield",
            usage = R.string.scaleshield_usage,
            description = R.string.scaleshield_description
        ),
        Ability(
            title = "Clanblade Upgrades",
            usage = R.string.clanblade_upgrades_usage,
            description = R.string.clanblade_upgrades_description
        )

    ),


    keywords = listOf(
        "EXODITE DRAGON MASTER",
        "AELDARI",
        "MOUNTED",
        "CLANBLADE",
        "75x42"

    )
)