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
            usage = "Passive",
            description = "Whenever a friendly HUNTER CLADE RANGER is within 3\" of this operative," +
                    " that friendly operative range weapons have the Severe weapon rule."
        ),
        Ability(
            title = "Targeting Protocol",
            usage = "Passive",
            description = "Whenever this operative is shooting, if it hasn't move before during its " +
                    "activation, or if is a counteraction, all its range weapons have the Lethal 5+ " +
                    "weapon rule. Note this operative can perform a normal move action after the shoot action."
        ),
        Ability(
            title = "Control Protocol",
            usage = "FireFight Phase, Every Turn",
            description = "You can use the ploy Command Override Firefight ploy for free, if the " +
                    "specified friendly HUNTER CLADE operative is visible to this operative."
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


