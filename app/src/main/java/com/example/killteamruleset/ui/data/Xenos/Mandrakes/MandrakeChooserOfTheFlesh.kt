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


val MandrakeChooserOfTheFlesh = Operative(
    name = "Mandrake Chooser Of The Flesh",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "5+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Baleblast",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            ),
            extraRules = listOf("*Soulstrike")
        ),
        WeaponProfile(
            name = "Baleblade",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "5/6",
            keywords = listOf(
                Brutal,
                Lethal(5)
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Soul Harvest",
            usage = R.string.soul_harvest_usage,
            description = R.string.soul_harvest_description
        ),
        Ability(
            title = "Part Collector",
            usage = R.string.part_collector_usage,
            description = R.string.part_collector_description
        ),
    ),


    keywords = listOf(
        "MANDRAKE",
        "AELDARI",
        "DRUKHAR",
        "CHOOSER OF THE FLESH",
        "28MM"
    )
)