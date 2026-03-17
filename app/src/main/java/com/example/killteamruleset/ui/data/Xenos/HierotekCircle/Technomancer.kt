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


val Technomancer = Operative(
    name = "Technomancer",
    imageRes = R.drawable.hierotek_tecnomancer,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Staff of Light (ranged)",
            type = WeaponType.RANGED,
            attacks = 6,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Rending
            ),
            extraRules = listOf("*Magnify")
        ),

        WeaponProfile(
            name = "Staff of Light (melee)",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "3/5",
            keywords = listOf(
                Rending
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Interstitial Command",
            usage = R.string.interstitial_command_usage,
            description = R.string.interstitial_command_description
        ),
        Ability(
            title = "Canoptek Repair",
            usage = R.string.canoptek_repair_usage,
            description = R.string.canoptek_repair_description
        ),
        Ability(
            title = "Augment Weapon",
            usage = R.string.augment_weapon_usage,
            description = R.string.augment_weapon_description
        ),
        Ability(
            title = "Reinforce Metal",
            usage = R.string.reinforce_metal_usage,
            description = R.string.reinforce_metal_description
        ),
    ),


    keywords = listOf(
        "HIEROTEK CIRCLE",
        "NECRON",
        "LEADER",
        "CRYPTEK",
        "TECHNOMANCER",
        "50MM"
    )
)