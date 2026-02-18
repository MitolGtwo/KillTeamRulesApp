package com.example.killteamruleset.ui.data.Empire.list.AngelsOfDeath

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val HeavyIntercessorGunner = Operative(
    name = "Heavy Intercessor Gunner",
    imageRes = R.drawable.plague_bombardier,
    stats = OperativeStats(
        apl = 3,
        move = "5\"",
        save = "3+",
        wounds = 18
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Heavy Bolter (Focused)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Piercing_Crits(1)
            )
        ),
        WeaponProfile(
            name = "Heavy Bolter (Focused)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Piercing_Crits(1),
                Torrent(1)
            )
        ),
        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(

    ),
    keywords = listOf(
        "ANGEL OF DEATH",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "HEAVY INTERCESSOR",
        "GUNNER",
        "40MM"
    )
)