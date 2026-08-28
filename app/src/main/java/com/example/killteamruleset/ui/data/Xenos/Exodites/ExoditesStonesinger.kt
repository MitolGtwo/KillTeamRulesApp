package com.example.killteamruleset.ui.data.Xenos.Exodites

import com.example.killteamruleset.ui.model.Psychic
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val DragonMasterStonesinger = Operative(
    name = "Dragon Master Stonesinger",
    imageRes = R.drawable.exodite_stonesinger,
    stats = OperativeStats(
        apl = 4,
        move = "12\"",
        save = "3+",
        wounds = 24
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Solar carbine",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/3",
            keywords = listOf(
                Devastating(1),
            )
        ),
        WeaponProfile(
            name = "Venomcrest spit",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8),
                Severe,
                Torrent(2)
            )
        ),
        WeaponProfile(
            name = "Drakesteed fangs & talons",
            type = WeaponType.MELEE,
            attacks = 6,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Brutal
            )
        ),
        WeaponProfile(
            name = "Stone stave",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Psychic,
                Lethal(5),
                Shock,
                Stun
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "SONG OF RENEWAL",
            usage = R.string.songofrenewal_usage,
            description = R.string.songofrenewal_description
        ),
        Ability(
            title = "Stonesinger Upgrades",
            usage = R.string.stonesinger_upgrades_usage,
            description = R.string.stonesinger_upgrades_description
        )

    ),


    keywords = listOf(
        "EXODITE DRAGON MASTER",
        "AELDARI",
        "MOUNTED",
        "PSYKER",
        "STONESINGER",
        "75x42"

    )
)