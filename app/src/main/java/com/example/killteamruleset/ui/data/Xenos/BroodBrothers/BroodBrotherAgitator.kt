package com.example.killteamruleset.ui.data.Xenos.BroodBrothers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val BroodBrotherAgitator = Operative(
    name = "Brood Brother Agitator",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Shock maul",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "4/4",
            keywords = listOf(
                Shock
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Devoted",
            usage = R.string.devoted_usage,
            description = R.string.devoted_description
        ),
        Ability(
            title = "Psiren Caster",
            usage = R.string.psiren_caster_usage,
            description = R.string.psiren_caster_description
        ),
    ),


    keywords = listOf(
        "BROOD BROTHER",
        "TYRANID",
        "GENESTEALER CULT",
        "BROODGUARD",
        "AGITATOR",
        "25MM"

    )
)
