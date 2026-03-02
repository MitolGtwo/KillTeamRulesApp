package com.example.killteamruleset.ui.data.Chaos.Goremongers



import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Seek_light
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val GoremongerSkullclaimer : Operative
    get() = Operative(
        name = "Goremonger Skullclaimer",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "7\"",
            save = "5+",
            wounds = 10
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Autopistol",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "4+",
                damage = "2/3",
                keywords = listOf(
                    Range(8)
                )
            ),
            WeaponProfile(
                name = "Great Chainaxe",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "3+",
                damage = "5/6",
                keywords = listOf(
                    Brutal
                )
            ),
        ),

        abilities = listOf(
            Ability(
                title = "Brutish",
                usage = R.string.brutish_usage,
                description = R.string.brutish_description
            ),
            Ability(
                title = "Claim Skull",
                usage = R.string.claim_skull_usage,
                description = R.string.claim_skull_description
            ),
        ),

        keywords = listOf(
            "GOREMONGER",
            "CHAOS",
            "SKULLCLAIMER",
            "32MM"
        )
    )