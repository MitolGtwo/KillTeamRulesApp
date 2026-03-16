package com.example.killteamruleset.ui.data.Xenos.HandOfTheArchon


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val KabaliteDiscipleOfYaelindra = Operative(
    name = "Kabalite Disciple Of Yaelindra",
    imageRes = R.drawable.hand_discipline,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Stinger Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Range(8),
                Lethal(5)
            ),
            extraRules = listOf("*Stinger")
        ),
        WeaponProfile(
            name = "Array of blades",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Stinger",
            usage = R.string.stinger_usage,
            description = R.string.stinger_description
        ),
        Ability(
            title = "Torment Grenade",
            usage = R.string.torment_grenade_usage,
            description = R.string.torment_grenade_description
        )
    ),


    keywords = listOf(
        "HAND OF THE ARCHON",
        "AELDARI",
        "DRUKHARI",
        "DISCIPLE OF YAELINDRA",
        "25MM"
    )
)