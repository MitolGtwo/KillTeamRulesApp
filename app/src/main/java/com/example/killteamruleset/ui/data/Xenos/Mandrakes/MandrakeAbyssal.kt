package com.example.killteamruleset.ui.data.Xenos.Mandrakes


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val MandrakeAbyssal = Operative(
    name = "Mandrake Abyssal",
    imageRes = R.drawable.mandrake_abyssal,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "5+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Balesurge (blast)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Blast(2)
            ),
            extraRules = listOf("*Soulstrike")
        ),
        WeaponProfile(
            name = "Balesurge (burn)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Lethal(5)
            ),
            extraRules = listOf("*Soulstrike")
        ),
        WeaponProfile(
            name = "Glimmersteel Blade",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Lethal(5)
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Balefire",
            usage = R.string.balefire_usage,
            description = R.string.balefire_description
        ),
        Ability(
            title = "Wreathe in Balefire",
            usage = R.string.wreathe_balefire_usage,
            description = R.string.wreathe_balefire_description
        ),
    ),


    keywords = listOf(
        "MANDRAKE",
        "AELDARI",
        "DRUKHAR",
        "ABYSSAL",
        "28MM"
    )
)