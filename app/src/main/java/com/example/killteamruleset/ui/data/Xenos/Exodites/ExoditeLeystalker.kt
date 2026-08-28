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


val DragonMasterLeystalker = Operative(
    name = "Dragon Master Leystalker",
    imageRes = R.drawable.exodite_leystalker,
    stats = OperativeStats(
        apl = 4,
        move = "12\"",
        save = "3+",
        wounds = 24
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Long rifle (mobile)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/3",
            keywords = listOf(
                Devastating(1),
            )
        ),
        WeaponProfile(
            name = "Long rifle (Stationary)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "3/3",
            keywords = listOf(
                Devastating(3),
            ),
            extraRules = listOf("*Aimed")
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
            name = "Hunting Blade",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Lethal(5)
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "*Aimed",
            usage = R.string.aimed_usage,
            description = R.string.aimed_description
        ),
        Ability(
            title = "Implacable Darkscale",
            usage = R.string.implacabledark_usage,
            description = R.string.implacabledark_description
        ),
        Ability(
            title = "Leystalker Upgrades",
            usage = R.string.leystalker_upgrades_usage,
            description = R.string.leystalker_upgrades_description
        )

    ),


    keywords = listOf(
        "EXODITE DRAGON MASTER",
        "AELDARI",
        "MOUNTED",
        "LEYSTALKER",
        "75x42"

    )
)