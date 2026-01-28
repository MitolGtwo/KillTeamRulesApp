package com.example.killteamruleset.ui.data.Empire.list.HunterClade




import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val SkitariiRangerSurveyor = Operative(
    name = "Skitarii Ranger Surveyor",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 7
    ),

    weapons = listOf(
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
            name = "Gun Butt",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(

        Ability(
            title = "Targeting Protocol",
            usage = "Passive",
            description = "Whenever this operative is shooting, if it hasn't move before during its " +
                    "activation, or if is a counteraction, all its range weapons have the Lethal 5+ " +
                    "weapon rule. Note this operative can perform a normal move action after the shoot action."
        ),
        Ability(title = "SPOT",
            usage = "1 APL Action",
            description = "SUPPORT. Select one enemy Operative visible to this operative, until the" +
                    " end of the turning point, whenever a friendly Operative HUNTER CLADE within 3\"" +
                    " of this operative is shooting that selected enemy Operative, that friendly Operative" +
                    "performing the Shoot actions has the rules \n *Seek light\n *That enemy Operative" +
                    " cannot be obscured\n \n *This operative CANNOT perform this action while within" +
                    " control range of an enemy Operative"
        )
    ),

    keywords = listOf(
        "HUNTER CLADE",
        "IMPERIUM",
        "ADEPTUS MECHANICUS",
        "SKITARII",
        "RANGER",
        "SURVEYOR",
        "25MM"
    )
)