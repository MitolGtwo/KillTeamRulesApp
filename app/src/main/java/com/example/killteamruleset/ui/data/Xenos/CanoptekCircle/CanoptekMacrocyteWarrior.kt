package com.example.killteamruleset.ui.data.Xenos.CanoptekCircle



import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val CanoptekMacrocyteWarrior = Operative(
    name = "Canoptek Macrocyte Warrior",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "4+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Gauss scalpel",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Tesla Caster (focused)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Tesla Caster (living lightning)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
                Blast(2)
            )
        ),
        WeaponProfile(
            name = "Claws & Tail",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Aggressive Defence",
            usage = R.string.aggressive_defence_usage,
            description = R.string.aggressive_defence_description
        ),
        Ability(
            title = "Expendable Construct",
            usage = R.string.expendable_construct_usage,
            description = R.string.expendable_construct_description
        ),
        Ability(
            title = "A Ceaseless Scuttling",
            usage = R.string.a_ceaseless_scuttling_usage,
            description = R.string.a_ceaseless_scuttling_description
        ),
    ),


    keywords = listOf(
        "CANOPTEK CIRCLE",
        "NECRON",
        "CANOPTEK",
        "MACROCYTE",
        "WARRIOR",
        "28MM"

    )
)
