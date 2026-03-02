package com.example.killteamruleset.ui.data.Chaos.Warpcoven


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val RubricMarineWarrior = Operative(
    name = "Rubric Marine Warrior",
    imageRes = R.drawable.plague_plaguecaster,
    stats = OperativeStats(
        apl = 3,
        move = "5\"",
        save = "3+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Inferno Boltgun",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Sorcerous Automata",
            usage = R.string.sorcerous_automata_usage,
            description = R.string.sorcerous_automata_description
        ),
        Ability(
            title = "Slow and Purposeful",
            usage = R.string.slow_and_purposeful_usage,
            description = R.string.slow_and_purposeful_description
        ),
    ),
    keywords = listOf(
        "WARPCOVEN",
        "CHAOS",
        "HERETIC ASTARTES",
        "RUBRIC MARINE",
        "WARRIOR",
        "32MM"
    )
)