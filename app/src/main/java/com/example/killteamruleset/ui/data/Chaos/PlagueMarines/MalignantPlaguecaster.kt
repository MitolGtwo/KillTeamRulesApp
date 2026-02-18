package com.example.killteamruleset.ui.data.Chaos.PlagueMarines

import com.example.killteamruleset.ui.model.Poison
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Psychic
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val MalignantPlaguecaster= Operative(
    name = "Malignant Plaguecaster",
    imageRes = R.drawable.plague_plaguecaster,
    stats = OperativeStats(
        apl = 3,
        move = "5\"",
        save = "3+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Entropy",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/7",
            keywords = listOf(
                Psychic,
                Range(7),
                Saturate,
                Severe,
                Poison
            )
        ),
        WeaponProfile(
            name = "Plague Wind",
            type = WeaponType.RANGED,
            attacks = 6,
            hit = "3+",
            damage = "2/3",
            keywords = listOf(
                Psychic,
                Saturate,
                Severe,
                Torrent(1),
                Poison
            )
        ),

        WeaponProfile(
            name = "Corrupted Staff",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Psychic,
                Severe,
                Shock,
                Stun,
                Poison
            )
        ),

        ),

    abilities = listOf(
        Ability(
            title = R.string.malignantplaguecaster_poisonus_miasma,
            usage = R.string.malignantplaguecaster_poisonus_miasma_usage,
            description = R.string.malignantplaguecaster_poisonus_miasma_description
        ),
        Ability(
            title = R.string.malignantplaguecaster_putrescent_vitality,
            usage = R.string.malignantplaguecaster_putrescent_vitality_usage,
            description = R.string.malignantplaguecaster_putrescent_vitality_description
        )
    ),
    keywords = listOf(
        "PLAGUE MARINE",
        "CHAOS",
        "HERETIC ASTARTES",
        "PSYKER",
        "MALIGNANT PLAGUECASTER",
        "32MM"
    )
)