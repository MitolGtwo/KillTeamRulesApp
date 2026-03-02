package com.example.killteamruleset.ui.data.Chaos.Legionaries



import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Hot
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Psychic
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val LegionaryBalefireAcolyte = Operative(
    name = "Legionary Balefire Acolyte",
    imageRes = R.drawable.aod_captain,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8),
            )
        ),
        WeaponProfile(
            name = "Fireblast",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Psychic,
                Blast(2),
                Devastating(1,"1\""),
                Saturate
            )
        ),
        WeaponProfile(
            name = "Life Siphon",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "3/3",
            keywords = listOf(
                Psychic,
                Saturate
            ),
            extraRules = listOf("*Siphon Life")
        ),
        WeaponProfile(
            name = "Fell dagger",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Psychic,
                Rending,
            ),
            extraRules = listOf("*Siphon Life")
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Siphon Life",
            usage = R.string.siphon_life_usage,
            description = R.string.siphon_life_description
        ),
        ),
    keywords = listOf(
        "LEGIONARY",
        "CHAOS",
        "HERETIC ASTARTES",
        "PSYKER",
        "BALEFIRE ACOLYTE",
        "32MM"
    )
)
