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


val RavenerWrecker = Operative(
    name = "Ravener Wrecker",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "4+",
        wounds = 20
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bone Mace",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(3),
                Piercing(1),
                Silent
            )
        ),
        WeaponProfile(
            name = "Scything Talons & Crushing Claws",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
            ),
            extraRules = listOf("*Crush")
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Reinforced Carapace",
            usage = R.string.reinforced_carapace_usage,
            description = R.string.reinforced_carapace_description
        ),
        Ability(
            title = "Crush",
            usage = R.string.ravener_crush_usage,
            description = R.string.ravener_crush_description
        ),
    ),


    keywords = listOf(
        "RAVENER",
        "GREAT DEVOURER",
        "TYRANID",
        "WRECKER",
        "40MM"
    )
)