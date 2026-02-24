package com.example.killteamruleset.ui.data.Empire.list.Sanctifiers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*
import kotlin.collections.listOf


val SanctifierSalvationist = Operative(
    name = "Sanctifier Salvationist",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Soulstave",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "5+",
            damage = "2/3",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Conversion Field",
            usage = R.string.conversion_field_usage,
            description = R.string.conversion_field_description
        ),
        Ability(
            title = "Medikit",
            usage = R.string.sanctifier_medikit_usage,
            description = R.string.sanctifier_medikit_description
        ),
    ),


    keywords = listOf(
        "SANCTIFIER",
        "IMPERIUM",
        "ADEPTUS MINISTORUM",
        "MEDIC",
        "SALVATIONIST",
        "25MM"
    )
)