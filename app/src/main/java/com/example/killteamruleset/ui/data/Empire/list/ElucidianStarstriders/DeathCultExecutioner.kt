package com.example.killteamruleset.ui.data.Empire.list.ElucidianStarstriders


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathCultExecutioner = Operative(
    name = "Death Cult Executioner",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "5+",
        wounds = 8
    ),
    weapons = listOf(
          WeaponProfile(
            name = "Dartmask",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "1/1",
            keywords = listOf(
                Range(6),
                Lethal(5),
                Silent,
                Stun
            )
        ),
        WeaponProfile(
            name = "Power Weapon",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Lethal(5)
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Rapid Reflexes",
            usage = R.string.rapid_reflexes_usage,
            description = R.string.rapid_reflexes_description
        ),
        Ability(
            title = "Bladed Stance",
            usage = R.string.elucidian_bladed_stance_usage,
            description = R.string.elucidian_bladed_stance_description
        ),
        Ability(
            title = "Zealot",
            usage = R.string.elucidian_zealot_usage,
            description = R.string.elucidian_zealot_description
        ),
       Ability(
            title = "Trained Assasin",
            usage = R.string.elucidian_trained_assasin_usage,
            description = R.string.elucidian_trained_assasin_description
        )
    ),


    keywords = listOf(
        "ELUCIDIAN STARSTRIDER",
        "IMPERIUM",
        "DEATH CULT EXECUTIONER",
        "25MM"
    )
)
