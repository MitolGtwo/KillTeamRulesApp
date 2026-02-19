package com.example.killteamruleset.ui.data.Empire.list.ElucidianStarstriders

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val EluciaVhane = Operative(
    name = "Elucia Vhane",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Heirloom Relic Pistol",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
              Range(8),
              Piercing_Crits(1),
              Seek_Light
            )
        ),
        WeaponProfile(
            name = "Monomolecular Cane-Rapier",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/6",
            keywords = listOf(
                Lethal(5)
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Digital Lasers",
            usage = R.string.digital_lasers_usage,
            description = R.string.digital_lasers_description
        ),
        Ability(
            title = "Merciless",
            usage = R.string.merciless_usage,
            description = R.string.merciless_description
        ),
        Ability(
            title = "Disruption Field",
            usage = R.string.disruption_field_usage,
            description = R.string.disruption_field_description
        ),
        Ability(
            title = "Reputation to Maintain",
            usage = R.string.reputation_to_maintain_usage,
            description = R.string.reputation_to_maintain_description
        )
    ),


    keywords = listOf(
        "ELUCIDIAN STARSTRIDER",
        "IMPERIUM",
        "LEADER",
        "ELUCIA VHANE",
        "25MM"
    )
)
