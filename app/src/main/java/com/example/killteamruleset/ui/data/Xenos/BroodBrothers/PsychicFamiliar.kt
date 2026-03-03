package com.example.killteamruleset.ui.data.Xenos.BroodBrothers



import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val PsychicFamiliar = Operative(
    name = "Psychic Familiar",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 3
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Claws",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
                Rending
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Small",
            usage = R.string.brood_small_usage,
            description = R.string.brood_small_description
        ),
        Ability(
            title = "Group Activation",
            usage = R.string.brood_familiar_group_usage,
            description = R.string.brood_familiar_group_description
        ),
        Ability(
            title = "Elusive",
            usage = R.string.brood_elusive_usage,
            description = R.string.brood_elusive_description
        )
    ),


    keywords = listOf(
        "BROOD BROTHER",
        "TYRANID",
        "GENESTEALER CULT",
        "PSYCHIC FAMILIAR",
        "25MM"

    )
)