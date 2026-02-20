package com.example.killteamruleset.ui.data.Empire.list.ElucidianStarstriders


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val RejuvenatAdept = Operative(
    name = "Rejuvenat Adept",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
          WeaponProfile(
            name = "Laspistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
                Range(8),
            )
        ),
        WeaponProfile(
            name = "Scalpel Claw",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
              Rending
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Medic!",
            usage = R.string.elucidian_medic_usage,
            description = R.string.elucidian_medic_description
        ),
        Ability(
            title = "Normaliser Helm",
            usage = R.string.normaliser_helm_usage,
            description = R.string.normaliser_helm_description
        ),
              Ability(
            title = "Healing Serum",
            usage = R.string.healing_serum_usage,
            description = R.string.healing_serum_description
        )
    ),


    keywords = listOf(
        "ELUCIDIAN STARSTRIDER",
        "IMPERIUM",
        "MEDIC",
        "REJUVENAT ADEPT",
        "25MM"
    )
)
