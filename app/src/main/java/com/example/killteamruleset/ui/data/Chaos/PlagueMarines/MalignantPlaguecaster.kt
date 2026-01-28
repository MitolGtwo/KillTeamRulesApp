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
    imageRes = R.drawable.alpharanger,
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
            title = "POISONOUS MIASMA",
            usage = "1 AP/Select enemy",
            description = "Psychic Select one enemy operative visible and within 7\" of this operative" +
                    " or one enemy Operative that´s a valid target for this Operative. That enemy" +
                    " Operative gains one of your Poison tokens. If it has one already, inflict 3" +
                    " damage on that enemy instead.\n\nThis operative CANNOT perform this action while" +
                    " within control range of an enemy Operative."
        ),
        Ability(
            title = "PUTRESCENT VITALITY",
            usage = "1 AP/Select ally",
            description = "Psychic select one friendly operative visible and within 3\" of this " +
                    " Operative, then roll 2D6: if the result is 7, the selected Operative regains" +
                    " 7 lost wounds; otherwise, the selected Operative regains wounds equal to the" +
                    " highest result of the 2D6.\n\nThis operative CANNOT perform this action while" +
                    " within control range of an enemy Operative, or more than once per turning point."
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