package com.example.killteamruleset.ui.data.Xenos.Raveners

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
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val RavenerVenomspitter = Operative(
    name = "Ravener Venomspitter",
    imageRes = R.drawable.ravener_venomsplit,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "5+",
        wounds = 18
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Pincer Tail",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(3),
                Silent
            )
        ),
        WeaponProfile(
            name = "Venom Bolt (blast)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Range(8),
                Blast(2)
            ),
            extraRules = listOf("*Poison")
        ),
        WeaponProfile(
            name = "Venom Bolt (focused)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Range(8),
                Piercing(1)
            ),
            extraRules = listOf("*Poison")
        ),
        WeaponProfile(
            name = "Scything Talons",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Poison",
            usage = R.string.ravener_poison_usage,
            description = R.string.ravener_poison_description
        ),
        Ability(
            title = "Distend Dorsal Sac",
            usage = R.string.dorsal_sac_usage,
            description = R.string.dorsal_sac_description
        ),
    ),


    keywords = listOf(
        "RAVENER",
        "GREAT DEVOURER",
        "TYRANID",
        "VENOMSPITTER",
        "40MM"
    )
)