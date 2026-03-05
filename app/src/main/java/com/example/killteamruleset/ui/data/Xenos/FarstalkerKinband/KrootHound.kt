package com.example.killteamruleset.ui.data.Xenos.FarstalkerKinband

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val KrootHound = Operative(
    name = "Kroot Hound",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "8\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Ripping Fangs",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Rending
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Beast",
            usage = R.string.kroot_beast_usage,
            description = R.string.kroot_beast_description
        ),
        Ability(
            title = "Bad-tempered",
            usage = R.string.bad_tempered_usage,
            description = R.string.bad_tempered_description
        ),
        Ability(
            title = "Gather",
            usage = R.string.kroot_gather_usage,
            description = R.string.kroot_gather_description
        ),
    ),


    keywords = listOf(
        "FARSTALKER KINBAND",
        "T’AU EMPIRE",
        "KROOT",
        "HOUND",
        "28MM"

    )
)