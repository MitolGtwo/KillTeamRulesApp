package com.example.killteamruleset.ui.data.Empire.list.ImperialNavyBreachers

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val NavisEndurant = Operative(
    name = "Navis Endurant",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "4\"",
        save = "2+",
        wounds = 11
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Navis Shotgun (short range)",
            type = WeaponType.RANGED,
            attacks =4 ,
            hit = "3+",
            damage = "3/3",
            keywords = listOf(
                Range(6),
                Relentless
            )
        ),
        WeaponProfile(
            name = "Navis Shotgun (long range)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "5+",
            damage = "1/2",
            keywords = listOf(
                Relentless
            )
        ),
        WeaponProfile(
            name = "Shield Bash",
            type = WeaponType.MELEE,
            attacks = 3 ,
            hit = "4+",
            damage = "1/2",
            keywords = listOf(
                Brutal
            ),
        extraRules = listOf("*Shield")
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Breachwall",
            usage = R.string.breachwall_usage,
            description = R.string.emboldened_description
        ),
        Ability(
            title = "Shield",
            usage = R.string.navy_shield_usage,
            description = R.string.navy_shield_description
        ),
        Ability(
            title = "Disengage",
            usage = R.string.disengage_usage,
            description = R.string.disengage_description
        )
    ),


    keywords = listOf(
        "IMPERIAL NAVY BREACHER",
        "IMPERIUM",
        "ENDURANT",
        "25MM"
    )
)