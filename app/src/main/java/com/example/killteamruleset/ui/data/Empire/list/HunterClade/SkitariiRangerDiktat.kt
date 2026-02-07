package com.example.killteamruleset.ui.data.Empire.list.HunterClade





import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val SkitariiRangerDiktat = Operative(
    name = "Skitarii Ranger Diktat",
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
            title = R.string.targeting_protocols,
            usage = R.string.targeting_protocols_usage,
            description = R.string.targeting_protocols_description
        ),
        Ability(
            title = R.string.hunterclade_vox_signal,
            usage = R.string.hunterclade_vox_signal_usage,
            description =R.string.hunterclade_vox_signal_description
        )
    ),

    keywords = listOf(
        "HUNTER CLADE",
        "IMPERIUM",
        "ADEPTUS MECHANICUS",
        "SKITARII",
        "RANGER",
        "DIKTAT",
        "25MM"
    )
)