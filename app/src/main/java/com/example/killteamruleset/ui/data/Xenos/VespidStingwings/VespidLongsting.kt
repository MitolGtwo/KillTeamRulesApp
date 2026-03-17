package com.example.killteamruleset.ui.data.Xenos.VespidStingwings


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
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val VespidLongsting = Operative(
    name = "Vespid Longsting",
    imageRes = R.drawable.vespid_longsting,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Neutron Rail Rifle (standard)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "4/4",
            keywords = listOf(
                Devastating(2)
            ),
            extraRules = listOf("*Neutron Fragment")
        ),
        WeaponProfile(
            name = "Neutron Rail Rifle (aimed)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/4",
            keywords = listOf(
                Devastating(2),
                Heavy("Dash Only"),
                Lethal(5)
            ),
            extraRules = listOf("*Neutron Fragment")
        ),
        WeaponProfile(
            name = "Claws",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Neutron Fragment",
            usage = R.string.neutron_fragment_usage,
            description = R.string.neutron_fragment_description
        )
    ),


    keywords = listOf(
        "VESPID STINGWING",
        "T'AU EMPIRE",
        "LONGSTING",
        "28MM"
    )
)