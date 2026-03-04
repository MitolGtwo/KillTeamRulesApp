package com.example.killteamruleset.ui.data.Xenos.CanoptekCircle



import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val CanoptekMacrocyteAccelerator= Operative(
    name = "Canoptek Macrocyte Accelerator",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "4+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Spark",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
                Range(4),
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Claws & Spark",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Lethal(5),
                Stun
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Overcharge",
            usage = R.string.overcharge_usage,
            description = R.string.overcharge_description
        ),
        Ability(
            title = "Cranial Overload",
            usage = R.string.cranial_overload_usage,
            description = R.string.cranial_overload_description
        ),
    ),


    keywords = listOf(
        "CANOPTEK CIRCLE",
        "NECRON",
        "CANOPTEK",
        "MACROCYTE",
        "ACCELERATOR",
        "28MM"

    )
)
