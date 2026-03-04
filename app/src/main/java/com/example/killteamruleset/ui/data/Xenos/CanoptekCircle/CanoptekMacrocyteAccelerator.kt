package com.example.killteamruleset.ui.data.Xenos.CanoptekCircle



import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val CanoptekMacrocyteReanimator = Operative(
    name = "Canoptek Macrocyte Reanimator",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "4+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Atomiser beam",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Range(6),
                Lethal(5)
            )
        ),
        WeaponProfile(
            name = "Claws & Tail",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Reanimate",
            usage = R.string.reanimate_usage,
            description = R.string.reanimate_description
        ),
        Ability(
            title = "Nanoscarab Beam",
            usage = R.string.nanoscarab_beam_usage,
            description = R.string.nanoscarab_beam_description
        ),
    ),


    keywords = listOf(
        "CANOPTEK CIRCLE",
        "NECRON",
        "CANOPTEK",
        "MACROCYTE",
        "REANIMATOR",
        "28MM"

    )
)
