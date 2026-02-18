package com.example.killteamruleset.ui.data.Xenos.WreckaKrew

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Limited
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val WreckaBombSquig = Operative(
    name = "Wrecka Bomb Squig",
    imageRes = R.drawable.bombsquig,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 5
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Explosives",
            type = WeaponType.RANGED,
            attacks = 6,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Blast(1),
                Limited(1)
            ),
            extraRules = listOf("*Explosive")
        ),
        WeaponProfile(
            name = "Bite",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
            )
        )

    ),

    abilities = listOf(
        Ability(
            title = "Explosive",
            usage = R.string.squig_explosive_usage,
            description = R.string.squig_explosive_description
        ),
        Ability(
            title = "Stoopid",
            usage = R.string.squig_stoopid_usage,
            description = R.string.squig_stoopid_description
        ),
        Ability(
            title = "Boom",
            usage = R.string.squig_boom_usage,
            description = R.string.squig_boom_description
        ),
        Ability(
            title = "Expendable",
            usage = R.string.squig_expendable_usage,
            description = R.string.squig_expendable_description
        )
    ),


    keywords = listOf(
        "WRECKA KREW",
        "ORK",
        "BOMB SQUIG",
        "25MM"
    )
)