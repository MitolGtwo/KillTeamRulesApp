package com.example.killteamruleset.ui.data.Xenos.VoidDancers



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


val Shadowseer = Operative(
    name = "Shadowseer",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "4+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Hallucinogen Grenade",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "1/1",
            keywords = listOf(
                Range(6),
                Blast(2),
                Lethal(5),
                Seek_light,
                Silent,
                Stun
            )
        ),
        WeaponProfile(
            name = "Neuro disruptor",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Range(8),
                Piercing(2),
                Stun
            )
        ),
        WeaponProfile(
            name = "Shuriken pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8),
                Rending
            )
        ),
        WeaponProfile(
            name = "Miststave",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/4",
            keywords = listOf(
                Shock
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Mirror of Minds",
            usage = R.string.mirror_minds_usage,
            description = R.string.mirror_minds_description
        ),
        Ability(
            title = "Fog of Dreams",
            usage = R.string.fog_dreams_usage,
            description = R.string.fog_dreams_description
        ),
    ),


    keywords = listOf(
        "VOID-DANCER TROUPE",
        "AELDARI",
        "HARLEQUIN",
        "PSYKER",
        "SHADOWSEER",
        "25MM"
    )
)