package com.example.killteamruleset.ui.data.Chaos.Blooded


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val TraitorButcher= Operative(
    name = "Traitor Butcher",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Power Weapon & Cleaver",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Ceaseless,
                Lethal(5)
            ),
            extraRules = listOf("*Blood Offering")
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Unholy Sustenance",
            usage = R.string.unholy_sustenance_usage,
            description = R.string.unholy_sustenance_description
        ),
        Ability(
            title = "Blood Offering",
            usage = R.string.blood_offering_usage,
            description = R.string.blood_offering_description
        ),
    ),
    keywords = listOf(
        "BLOODED",
        "CHAOS",
        "BUTCHER",
        "25MM"

    )
)

