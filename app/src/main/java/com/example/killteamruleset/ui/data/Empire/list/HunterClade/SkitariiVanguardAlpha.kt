package com.example.killteamruleset.ui.data.Empire.list.HunterClade

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Balanced
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val SkitariiVanguardAlpha = Operative(
    name = "Skitarii Vanguard Alpha",
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
            name = "Radium Carbine",
            type = WeaponType.RANGED,
            attacks =4 ,
            hit = "3+",
            damage = "2/4",
            keywords = listOf(
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
            title = "Canticle of the Glow",
            usage = "Passive",
            description = "Whenever an enemy Operative is within 3\" of this Operative, if it´s under" +
                    " the effects of Rad-Saturation(see below), also subtract 1 from the Atk stat" +
                    " of that enemy operative´s weapons"
        ),
        Ability(
            title = "Rad-Saturation",
            usage = "Passive",
            description = "Whenever an enemy Operative is within 2\" of friendly HUNTER CLADE VANGUARD" +
                    " operatives, worsen the Hit stat of that enemy operative´s weapons by 1." +
                    "This isn´t cumulative with being injured"
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
        "VANGUARD",
        "25MM"

    )
)

