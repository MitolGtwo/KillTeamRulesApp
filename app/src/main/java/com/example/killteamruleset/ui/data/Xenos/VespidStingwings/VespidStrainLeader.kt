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


val VespidStrainLeader = Operative(
    name = "Vespid Strain Leader",
    imageRes = R.drawable.vespid_leader,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 10
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Neutron Blaster",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/3",
            keywords = listOf(
                Devastating(2)
            )
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
            title = "Communion Helm",
            usage = R.string.communion_helm_usage,
            description = R.string.communion_helm_description
        ),
        Ability(
            title = "Commune",
            usage = R.string.vespid_commune_usage,
            description = R.string.vespid_commune_description
        )
    ),


    keywords = listOf(
        "VESPID STINGWING",
        "T'AU EMPIRE",
        "STRAIN",
        "LEADER",
        "28MM"
    )
)