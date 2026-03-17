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
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val LeadPlayer = Operative(
    name = "Lead Player",
    imageRes = R.drawable.dancer_lead,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "4+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Fusion pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "5/3",
            keywords = listOf(
                Range(3),
                Devastating(3),
                Piercing(2)
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
            name = "Blade",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Caress",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Rending
            )
        ),
        WeaponProfile(
            name = "Embrace",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Brutal
            )
        ),
        WeaponProfile(
            name = "Kiss",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "3/7",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Power Weapon",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Lethal(5)
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Lead the Performance",
            usage = R.string.lead_performance_usage,
            description = R.string.lead_performance_description
        )
    ),


    keywords = listOf(
        "VOID-DANCER TROUPE",
        "AELDARI",
        "HARLEQUIN",
        "LEADER",
        "LEAD PLAYER",
        "25MM"
    )
)