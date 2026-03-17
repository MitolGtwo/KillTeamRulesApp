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
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val DeathJester = Operative(
    name = "Death Jester",
    imageRes = R.drawable.dancer_jester,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "4+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Shrieker Cannon (focused)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Rending,
                Heavy("Reposition Only"),
            ),
            extraRules = listOf("*Humbling Cruelty")
        ),
        WeaponProfile(
            name = "Shrieker Cannon (sweeping)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Rending,
                Heavy("Dash Only"),
                Torrent(2)
            ),
            extraRules = listOf("*Humbling Cruelty")
        ),

        WeaponProfile(
            name = "Shrieker Blade",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Rending
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Humbling Cruelty",
            usage = R.string.humbling_cruelty_usage,
            description = R.string.humbling_cruelty_description
        )
    ),


    keywords = listOf(
        "VOID-DANCER TROUPE",
        "AELDARI",
        "HARLEQUIN",
        "DEATH JESTER",
        "25MM"
    )
)