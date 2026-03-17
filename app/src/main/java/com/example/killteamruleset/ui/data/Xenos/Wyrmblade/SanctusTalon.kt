package com.example.killteamruleset.ui.data.Xenos.Wyrmblade


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Limited
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Seek_light
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val SanctusTalon = Operative(
    name = "Sanctus Talon",
    imageRes = R.drawable.wyrm_sanctustalon,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "4+",
        wounds = 9
    ),
    weapons = listOf(

        WeaponProfile(
            name = "Sanctus bio-dagger",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/6",
            keywords = listOf(
                Lethal(4),
                Shock
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Creeping Shadow",
            usage = R.string.creeping_shadow_usage,
            description = R.string.creeping_shadow_description
        ),
        Ability(
            title = "Assassinate",
            usage = R.string.mesatsu_usage,
            description = R.string.mesatsu_description
        ),
        Ability(
            title = "Familias´s Soulsight",
            usage = R.string.familiar_melee_usage,
            description = R.string.familiar_melee_description
        ),

        ),


    keywords = listOf(
        "WYRMBLADE",
        "TYRANID",
        "GENESTEALER CULT",
        "CULT AGENT",
        "SANCTUS",
        "SNIPER",
        "32MM"
    )
)