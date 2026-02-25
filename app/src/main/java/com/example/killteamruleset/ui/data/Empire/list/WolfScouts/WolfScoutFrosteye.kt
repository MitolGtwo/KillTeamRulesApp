package com.example.killteamruleset.ui.data.Empire.list.WolfScouts



import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val WolfScoutFrostEye = Operative(
    name = "Wolf Scout Frosteye",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "3+",
        wounds = 13
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Instigator Bolt Carbine (heavy)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "3/4",
            keywords = listOf(
                Heavy("Dash Only"),
                Piercing_Crits(1),
                Silent
            )
        ),
        WeaponProfile(
            name = "Instigator Bolt Carbine (mobile)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Piercing_Crits(1),
                Silent
            )
        ),
        WeaponProfile(
            name = "Combat Blade",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Storm-veiled Execution",
            usage = R.string.storm_eilede_execution_usage,
            description = R.string.storm_eilede_execution_description
        ),
        Ability(
            title = "Hunter´s Senses",
            usage = R.string.hunter_sense_usage,
            description = R.string.hunter_sense_description
        ),
    ),


    keywords = listOf(
        "WOLF SCOUT",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "SPACE WOLVES",
        "FROSTEYE",
        "32MM"
    )
)
