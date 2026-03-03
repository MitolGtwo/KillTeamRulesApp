package com.example.killteamruleset.ui.data.Xenos.BroodBrothers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val Magus = Operative(
    name = "Magus",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "4+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Autopistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
                Range(8),
            )
        ),
        WeaponProfile(
            name = "Bio Dagger",
            type = WeaponType.MELEE,
            attacks = 2,
            hit = "4+",
            damage = "3/6",
            keywords = listOf(
                Lethal(4)
            )
        ),
        WeaponProfile(
            name = "Force Stave",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "4/6",
            keywords = listOf(
                Psychic,
                Shock
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Spiritual Leader",
            usage = R.string.spiritual_leader_usage,
            description = R.string.spiritual_leader_description
        ),
        Ability(
            title = "telepathic_overload",
            usage = R.string.telepathic_overload_usage,
            description = R.string.telepathic_overload_description
        ),
        Ability(
            title = "Mental Onslaught",
            usage = R.string.brood_mental_onslaught_usage,
            description = R.string.brood_mental_onslaught_description
        ),
    ),


    keywords = listOf(
        "BROOD BROTHER",
        "TYRANID",
        "GENESTEALER CULT",
        "BROODCOVEN",
        "PSYKER",
        "LEADER",
        "MAGUS",
        "32MM"

    )
)