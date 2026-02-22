package com.example.killteamruleset.ui.data.Empire.list.InquisitorialAgents


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val DeathWorldVeteranAgent = Operative(
    name = "Death World Veteran Agent",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Mechanical Appendages",
            type = WeaponType.RANGED,
            attacks = 4 ,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Knife",
            type = WeaponType.MELEE,
            attacks = 1,
            hit = "2+",
            damage = "5/7",
            keywords = listOf(
                Lethal(5)
            )
        ),
        WeaponProfile(
            name = "Polearm",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Hunter",
            usage = R.string.inquisitorial_hunter_usage,
            description = R.string.inquisitorial_hunter_description
        ),
        Ability(
            title = "Weathered",
            usage = R.string.weathered_usage,
            description = R.string.weathered_description
        )
    ),


    keywords = listOf(
        "INQUISITORIAL AGENT",
        "IMPERIUM",
        "INQUISITION",
        "DEATH WORLD VETERAN",
        "25MM"
    )
)
