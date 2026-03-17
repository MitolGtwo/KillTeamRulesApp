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


val Apprentek = Operative(
    name = "Apprentek",
    imageRes = R.drawable.hierotek_apprentek,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 11
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Arcane Conduit (ranged)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Piercing(1)
            ),
            extraRules = listOf("*Magnify")
        ),

        WeaponProfile(
            name = "Arcane Conduit (melee)",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "3/5",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Apprentek Assistance",
            usage = R.string.apprentek_assistance_usage,
            description = R.string.apprentek_assistance_description
        )
    ),


    keywords = listOf(
        "HIEROTEK CIRCLE",
        "NECRON",
        "APPRENTEK",
        "32MM"
    )
)