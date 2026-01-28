package com.example.killteamruleset.ui.data.Chaos.PlagueMarines


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Toxic
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val PlagueMarineBombardier = Operative(
    name = "Plague Marine Bombardier",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "5\"",
        save = "3+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Boltgun",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Fist",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Grenadier",
            usage = "Passive",
            description = "This operative can use blight and krak grenades ignoring the limit of uses" +
                    "you have per universal equipment(It doesn´t count toward the number of grenades" +
                    "the rest of the team can use), whenever this operative uses a grenade, improve the" +
                    " Hit stat of that weapon by 1 and blight grenades have the Toxic weapon rule."
        )
    ),
    keywords = listOf(
        "PLAGUE MARINE",
        "CHAOS",
        "HERETIC ASTARTES",
        "BOMBARDIER",
        "32MM"
    )
)