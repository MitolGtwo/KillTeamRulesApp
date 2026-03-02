package com.example.killteamruleset.ui.data.Chaos.FellgorRavagers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Hot
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val FellgorIronhorn: Operative
    get() = Operative(
        name = "Fellgor Ironhorn",
        imageRes = R.drawable.technoarqueologist,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "5+",
            wounds = 11
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Corrupted Pistol",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "4+",
                damage = "3/5",
                keywords = listOf(
                    Range(8),
                    Rending
                )
            ),
            WeaponProfile(
                name = "Plasma Pistol (standard)",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "4+",
                damage = "3/5",
                keywords = listOf(
                    Range(8),
                    Piercing(1)
                )
            ),
            WeaponProfile(
                name = "Plasma Pistol (supercharge)",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "4+",
                damage = "4/5",
                keywords = listOf(
                    Range(8),
                    Hot,
                    Lethal(5),
                    Piercing(1)
                )
            ),
            WeaponProfile (
                name = "Bludgeon",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "3+",
                damage = "4/4",
                keywords = listOf(
                    Brutal
                )
            ),
            WeaponProfile (
                name = "Corrupted Chainsword",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "3+",
                damage = "4/5",
                keywords = listOf(
                    Rending
                )
            ),
        ),

        abilities = listOf(
            Ability(
                title = "Call the Attack",
                usage = R.string.call_the_attack_usage,
                description = R.string.call_the_attack_description
            )
        ),

        keywords = listOf(
            "FELLGOR RAVAGER",
            "CHAOS",
            "LEADER",
            "IRONHORN",
            "32MM"
        )
    )