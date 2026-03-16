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


val RavenerPrime = Operative(
    name = "Ravener Prime",
    imageRes = R.drawable.ravener_prime,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "5+",
        wounds = 21
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Tail blade",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(3),
                Rending,
                Silent
            )
        ),
        WeaponProfile(
            name = "Scything Talons & Rending Claws",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Rending
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Neuropredatory Crest",
            usage = R.string.neuropredatory_crest_usage,
            description = R.string.neuropredatory_crest_description
        ),
        Ability(
            title = "Synaptic Link",
            usage = R.string.synaptic_link_usage,
            description = R.string.synaptic_link_description
        ),
    ),


    keywords = listOf(
        "RAVENER",
        "GREAT DEVOURER",
        "TYRANID",
        "LEADER",
        "PRIME",
        "40MM"
    )
)