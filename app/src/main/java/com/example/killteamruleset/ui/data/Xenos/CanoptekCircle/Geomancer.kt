package com.example.killteamruleset.ui.data.Xenos.CanoptekCircle


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val Geomancer = Operative(
    name = "Geomancer",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Tremorglaive (part matter) ",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Piercing(1),
                Piercing_Crits(2)
            )
        ),
        WeaponProfile(
            name = "Tremorglaive (quake)",
            type = WeaponType.RANGED,
            attacks =5,
            hit = "3+",
            damage = "1/2",
            keywords = listOf(
                Blast(2),
                Seek_light,
                Stun
            )
        ),
        WeaponProfile(
            name = "Tremorglaive (sweep)",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Severe,
                Shock,
                Stun
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Obelisk Node Control",
            usage = R.string.obelisk_node_control_usage,
            description = R.string.obelisk_node_control_description
        ),
        Ability(
            title = "Geomantic_Disturbance",
            usage = R.string.geomantic_disturbance_usage,
            description = R.string.geomantic_disturbance_description
        ),
        Ability(
            title = "Canoptek Control",
            usage = R.string.canoptek_control_usage,
            description = R.string.canoptek_control_description
        ),
        Ability(
            title = "Molecular Breach",
            usage = R.string.molecular_breach_usage,
            description = R.string.molecular_breach_description
        ),
    ),


    keywords = listOf(
        "CANOPTEK CIRCLE",
        "NECRON",
        "LEADER",
        "GEOMANCER",
        "50MM"

    )
)
