package com.example.killteamruleset.ui.data.Chaos.Legionaries


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Hot
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val LegionaryShrivetalon = Operative(
    name = "Legionary Shrivetalon",
    imageRes = R.drawable.aod_captain,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8),
            )
        ),
        WeaponProfile(
            name = "Flensing Blades",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Lethal(5)
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Vicious Reflexes",
            usage = R.string.vicious_reflexes_usage,
            description = R.string.vicious_reflexes_description
        ),
        Ability(
            title = "Horrifying Dismemberment",
            usage = R.string.horrifying_dismemberment_usage,
            description = R.string.horrifying_dismemberment_description
        ),
        Ability(
            title = "Grisly Mark",
            usage = R.string.grisly_mark_usage,
            description = R.string.grisly_mark_description
        ),
        ),
    keywords = listOf(
        "LEGIONARY",
        "CHAOS",
        "HERETIC ASTARTES",
        "SHRIVETALON",
        "32MM"
    )
)
