package com.example.killteamruleset.ui.data.Xenos.HierotekCircle



import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Accurate
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val PlasmacyteReanimator = Operative(
    name = "Plasmacyte Reanimator",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "5+",
        wounds = 5
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Atomiser beam",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Range(6),
                Lethal(5)
            )
        ),

        WeaponProfile(
            name = "Claws",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "5+",
            damage = "1/2",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Scuttler",
            usage = R.string.hierotek_scuttler_usage,
            description = R.string.hierotek_scuttler_description
        ),
        Ability(
            title = "Reanimate",
            usage = R.string.hierotek_reanimate_usage,
            description = R.string.hierotek_reanimate_description
        )
    ),


    keywords = listOf(
        "HIEROTEK CIRCLE",
        "NECRON",
        "PLASMACYTE",
        "REANIMATOR",
        "25MM"
    )
)