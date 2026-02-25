package com.example.killteamruleset.ui.data.Empire.list.WolfScouts


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val WolfScoutRunePriestSkjald= Operative(
    name = "Wolf Scout Rune Priest Skjald",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "3+",
        wounds = 13
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bolt pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Jaws of the World Wolf",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Psychic,
                Blast(2),
                Severe

            )
        ),
        WeaponProfile(
            name = "Thunderclap",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "2+",
            damage = "2/2",
            keywords = listOf(
                Psychic,
                Range(6),
                Saturate,
                Seek_light,
                Stun,
                Torrent(2)
            )
        ),
        WeaponProfile(
            name = "Runic Stave",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Psychic,
                Shock
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Cast the Runes",
            usage = R.string.cast_the_runes_usage,
            description = R.string.cast_the_runes_description
        ),
        Ability(
            title = "Call the Storm",
            usage = R.string.call_the_storm_usage,
            description = R.string.call_the_storm_description
        ),

        ),


    keywords = listOf(
        "WOLF SCOUT",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "SPACE WOLVES",
        "PSYKER",
        "RUNE PRIEST SKJALD",
        "32MM"
    )
)