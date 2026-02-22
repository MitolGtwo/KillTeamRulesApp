package com.example.killteamruleset.ui.data.Empire.list

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*

val SkitariiRangerAlpha = Operative(
    name = "Skitarii Ranger Alpha",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Arc Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Range(8),
                Piercing(1),
                Stun
            )
        ),
        WeaponProfile(
            name = "Galvanic Rifle",
            type = WeaponType.RANGED,
            attacks =4 ,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Heavy("Reposition Only"),
                Piercing_Crits(1)
            )
        ),
        WeaponProfile(
            name = "Master-Crafted Radium Pistol",
            type = WeaponType.RANGED,
            attacks =4 ,
            hit = "3+",
            damage = "2/4",
            keywords = listOf(
                Range(8),
                Balanced,
                Rending
            )
        ),
        WeaponProfile(
            name = "Phosphor Blast Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8),
                Blast(1),
                Rending
            )
        ),
        WeaponProfile(
            name = "Arc Maul",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Shock
            )
        ),
        WeaponProfile(
            name = "Gun Butt",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        ),

        WeaponProfile(
            name = "Power Weapon",
            type = WeaponType.MELEE,
            attacks = 4 ,
            hit = "4+",
            damage = "4/6",
            keywords = listOf(
                Lethal(5)
            )
        ),
        WeaponProfile(
            name = "Taser Goad",
            type = WeaponType.MELEE,
            attacks = 4 ,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Lethal(5),
                Shock
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Canticle of Elimination",
            usage = R.string.canticle_elimination_usage,
            description = R.string.canticle_elimination_description
        ),
        Ability(
            title = "Targeting Protocols",
            usage = R.string.targeting_protocols_usage,
            description = R.string.targeting_protocols_description
        ),
        Ability(
            title = "Control Protocol",
            usage = R.string.control_protocol_usage,
            description = R.string.control_protocol_description
        )
    ),


    keywords = listOf(
        "HUNTER CLADE",
        "IMPERIUM",
        "ADEPTUS MECHANICUS",
        "LEADER",
        "SKITARII",
        "RANGER",
        "ALPHA",
        "25MM"

    )
)


