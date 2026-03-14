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
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val Kelemorph = Operative(
    name = "Kelemorph",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "4+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Liberator Autostubs (hypersense)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(6),
                Saturate,
                Seek_light
            ),
            extraRules = listOf("*Hypersense")
        ),

        WeaponProfile(
            name = "Liberator Autostubs (long range)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Piercing_Crits(1),
                Rending
            )
        ),

        WeaponProfile(
            name = "Liberator Autostubs (short range)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8),
                Piercing(1),
                Rending
            )
        ),
        WeaponProfile(
            name = "Kelermorph Knife",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Rending
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Hypersense",
            usage = R.string.wyrm_sense_usage,
            description = R.string.wyrm_sense_description
        ),
        Ability(
            title = "Expert Gunslinger",
            usage = R.string.expert_gunslinger_usage,
            description = R.string.expert_gunslinger_description
        ),
        Ability(
            title = "Heroic Inspiration",
            usage = R.string.wyrm_inspiration_usage,
            description = R.string.wyrm_inspiration_description
        ),
    ),


    keywords = listOf(
        "WYRMBLADE",
        "TYRANID",
        "GENESTEALER CULT",
        "CULT AGENT",
        "KELERMORPH",
        "32MM"
    )
)