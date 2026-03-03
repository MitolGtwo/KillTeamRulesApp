package com.example.killteamruleset.ui.data.Xenos.BroodBrothers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val Patriarch = Operative(
    name = "Patriarch",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 4,
        move = "6\"",
        save = "6+",
        wounds = 21
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Claws",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "5/6",
            keywords = listOf(
                Relentless,
                Rending
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Alpha Predator",
            usage = R.string.alpha_predator_usage,
            description = R.string.alpha_predator_description
        ),
        Ability(
            title = "Monster",
            usage = R.string.brood_monster_usage,
            description = R.string.brood_monster_description
        ),
        Ability(
            title = "Into Shadow",
            usage = R.string.into_shadow_usage,
            description = R.string.into_shadow_description
        ),
        Ability(
            title = "Mind Control",
            usage = R.string.brood_mind_control_usage,
            description = R.string.brood_mind_control_description
        ),
    ),


    keywords = listOf(
        "BROOD BROTHER",
        "TYRANID",
        "GENESTEALER CULT",
        "BROODCOVEN",
        "PSYKER",
        "LEADER",
        "PATRIARCH",
        "50MM"

    )
)