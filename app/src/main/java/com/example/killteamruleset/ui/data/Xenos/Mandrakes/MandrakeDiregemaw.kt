package com.example.killteamruleset.ui.data.Xenos.Mandrakes


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Seek_light
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val MandrakeDirgemaw = Operative(
    name = "Mandrake Dirgemaw",
    imageRes = R.drawable.mandrake_diremaw,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "5+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Baleblast",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
            ),
            extraRules = listOf("*Soulstrike")
        ),
        WeaponProfile(
            name = "Horrifying Scream",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "2+",
            damage = "2/2",
            keywords = listOf(
                Range(6),
                Devastating(2),
                Seek_light,
                Stun
            ),
            extraRules = listOf("*Soulstrike")
        ),
        WeaponProfile(
            name = "Glimmersteel Blade",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Lethal(5)
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Haunting Focus",
            usage = R.string.haunting_focus_usage,
            description = R.string.haunting_focus_description
        ),
        Ability(
            title = "Pareidolic Projection",
            usage = R.string.pareidolic_projection_usage,
            description = R.string.pareidolic_projection_description
        ),
    ),


    keywords = listOf(
        "MANDRAKE",
        "AELDARI",
        "DRUKHAR",
        "DIRGEMAW",
        "28MM"
    )
)