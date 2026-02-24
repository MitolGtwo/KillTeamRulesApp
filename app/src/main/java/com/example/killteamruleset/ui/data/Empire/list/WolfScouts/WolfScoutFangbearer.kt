package com.example.killteamruleset.ui.data.Empire.list.WolfScouts


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val WolfScoutFangbearer = Operative(
    name = "Wolf Scout Fangbearer",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "3+",
        wounds = 13
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Absolvor bolt pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Range(9),
                Piercing_Crits(1)
            )
        ),
        WeaponProfile(
            name = "Combat Blade",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Spiritual Chirurgy",
            usage = R.string.spiritual_chirurgy_usage,
            description = R.string.spiritual_chirurgy_description
        ),
        Ability(
            title = "Healing Balms",
            usage = R.string.healing_balms_usage,
            description = R.string.healing_balms_description
        ),
    ),


    keywords = listOf(
        "WOLF SCOUT",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "SPACE WOLVES",
        "FANGBEARER",
        "32MM"
    )
)
