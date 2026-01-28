package com.example.killteamruleset.ui.data.Empire.list.HunterClade



import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val SkitariiVanguardSurveyor = Operative(
    name = "Skitarii Vanguard Surveyor",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 7
    ),

    weapons = listOf(
        WeaponProfile(name = "Radium Carbine",
            type = WeaponType.RANGED,
            attacks =4 ,
            hit = "3+",
            damage = "2/4",
            keywords = listOf(
                Rending
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

        Ability(title = "Rad-Saturation",
            usage = "Passive",
            description = "Whenever an enemy Operative is within 2\" of friendly HUNTER CLADE VANGUARD" +
                    " operatives, worsen the Hit stat of that enemy operative´s weapons by 1." +
                    "This isn´t cumulative with being injured"
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
        "VANGUARD",
        "SURVEYOR",
        "25MM"
    )
)
