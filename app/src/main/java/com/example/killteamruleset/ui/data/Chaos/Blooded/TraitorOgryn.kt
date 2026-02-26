package com.example.killteamruleset.ui.data.Chaos.Blooded


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val TraitorOgryn = Operative(
    name = "Traitor Ogryn",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 16
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Power Maul & Mutant Claw",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "5/6",
            keywords = listOf(
                Rending,
                Shock
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Avalanche of Muscle",
            usage = R.string.avalanche_muscle_usage,
            description = R.string.avalanche_muscle_description
        ),
        Ability(
            title = "Chem-enhance",
            usage = R.string.chem_enhance_usage,
            description = R.string.chem_enhance_description
        ),
        Ability(
            title = "Brute",
            usage = R.string.brute_usage,
            description = R.string.brute_description
        ),
        Ability(
            title = "Slow-witted",
            usage = R.string.slow_witted_usage,
            description = R.string.slow_witted_description
        ),
    ),
    keywords = listOf(
        "BLOODED",
        "CHAOS",
        "OGRYN",
        "40MM"
    )
)