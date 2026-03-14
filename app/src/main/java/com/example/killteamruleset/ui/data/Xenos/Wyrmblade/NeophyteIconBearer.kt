package com.example.killteamruleset.ui.data.Xenos.Wyrmblade


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val NeophyteIconBearer = Operative(
    name = "Neophyte Icon Bearer",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Autogun",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Shotgun",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/3",
            keywords = listOf(
                Range(6),
            )
        ),
        WeaponProfile(
            name = "Gun butt",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Icon Bearer",
            usage = R.string.wyrm_iconbearer_usage,
            description = R.string.wyrm_iconbearer_description
        ),
        Ability(
            title = "Overthrow the Oppressors",
            usage = R.string.throw_oppresor_usage,
            description = R.string.throw_oppresor_description
        ),
    ),


    keywords = listOf(
        "WYRMBLADE ",
        "TYRANID",
        "GENESTEALER CULT",
        "NEOPHYTE",
        "ICON BEARER",
        "25MM"
    )
)