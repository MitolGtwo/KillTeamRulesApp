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


val MandrakeShadeweaver = Operative(
    name = "Mandrake Shadeweaver",
    imageRes = R.drawable.mandrake_shadeweaver,
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
            title = "Shadow Portal",
            usage = R.string.shadow_portal_usage,
            description = R.string.shadow_portal_description
        ),
        Ability(
            title = "Weave Darkness",
            usage = R.string.weave_darkness_usage,
            description = R.string.weave_darkness_description
        ),
    ),


    keywords = listOf(
        "MANDRAKE",
        "AELDARI",
        "DRUKHAR",
        "SHADEWEAVER",
        "28MM"
    )
)