package com.example.killteamruleset.ui.data.Empire.list.HunterClade




import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val SkitariiVanguardDiktat = Operative(
    name = "Skitarii Vanguard Diktat",
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

        Ability(
            title = "Rad-Saturation",
            usage = R.string.rad_saturation_usage,
            description = R.string.rad_saturation_description
        ),
        Ability(
            title = "Vox-Signal",
            usage = R.string.hunterclade_vox_signal_usage,
            description =R.string.hunterclade_vox_signal_description
        )
    ),

    keywords = listOf(
        "HUNTER CLADE",
        "IMPERIUM",
        "ADEPTUS MECHANICUS",
        "SKITARII",
        "VANGUARD",
        "DIKTAT",
        "25MM"
    )
)