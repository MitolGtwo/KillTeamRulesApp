package com.example.killteamruleset.ui.data.Empire.list.ExactionSquad


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val ArbiterGunner: Operative
    get() = Operative(
        name = "Arbiter Gunner",
        imageRes = R.drawable.alpharanger,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "4+",
            wounds = 8
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Grenade Launcher",
                type = WeaponType.RANGED,
                attacks = 5,
                hit = "4+",
                damage = "4/5",
                keywords = listOf(
                    Piercing(1)
                )
            ),
            WeaponProfile(
                name = "Heavy Stubber (focused)",
                type = WeaponType.RANGED,
                attacks = 5,
                hit = "4+",
                damage = "4/5",
                keywords = listOf(
                    Heavy("Dash Only")
                )
            ),
            WeaponProfile(
                name = "Heavy Stubber (sweeping)",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "4+",
                damage = "4/5",
                keywords = listOf(
                    Heavy("Dash Only"),
                    Torrent(1)
                )
            ),
            WeaponProfile(
                name = "Heavy Stubber (sweeping)",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "3+",
                damage = "4/5",
                keywords = listOf(
                    Range(12),
                    Severe,
                    Stun
                )
            ),
            WeaponProfile (
                name = "Repression Baton",
                type = WeaponType.MELEE,
                attacks = 3,
                hit = "4+",
                damage = "2/3",
                keywords = listOf(
                )
            )
        ),

        abilities = listOf(

        ),
        keywords = listOf(
            "EXACTION SQUAD",
            "IMPERIUM",
            "ADEPTUS ARBITERS",
            "GUNNER",
            "28MM"
        )
    )
