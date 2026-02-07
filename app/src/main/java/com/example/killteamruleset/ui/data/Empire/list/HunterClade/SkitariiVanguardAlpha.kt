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
            title = R.string.canticle_glow,
            usage = R.string.canticle_glow_usage,
            description = R.string.canticle_glow_description
        ),
        Ability(
            title = R.string.rad_saturation,
            usage = R.string.rad_saturation_usage,
            description = R.string.rad_saturation_description
        ),
        Ability(
            title = R.string.control_protocol,
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
        "VANGUARD",
        "25MM"

    )
)

