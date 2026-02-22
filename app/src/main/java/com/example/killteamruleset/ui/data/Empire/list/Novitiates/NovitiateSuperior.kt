package com.example.killteamruleset.ui.data.Empire.list.Novitiates


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Hot
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val NovitiateSuperior: Operative
    get() = Operative(
        name = "Novitiate Superior",
        imageRes = R.drawable.alpharanger,
        stats = OperativeStats(
            apl = 3,
            move = "6\"",
            save = "3+",
            wounds = 9
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Plasma Pistol (standard)",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "3+",
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
                hit = "3+",
                damage = "4/5",
                keywords = listOf(
                    Range(8),
                    Hot,
                    Lethal(5),
                    Piercing(1)

                )
            ),
            WeaponProfile(
                name = "Relic Bolt Pistol",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "3+",
                damage = "3/5",
                keywords = listOf(
                    Range(8),
                    Lethal(5)
                )
            ),
            WeaponProfile(
                name = "Relic Boltgun",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "3+",
                damage = "3/5",
                keywords = listOf(
                    Lethal(5)
                )
            ),
            WeaponProfile(
                name = "Gun Butt",
                type = WeaponType.MELEE,
                attacks = 3,
                hit = "3+",
                damage = "2/3",
                keywords = listOf(
                )
            ),
            WeaponProfile(
                name = "Power Weapon",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "3+",
                damage = "4/6",
                keywords = listOf(
                    Lethal(5)
                )
            ),
        ),

        abilities = listOf(
            Ability(
                title = "Inspirational Example",
                usage = R.string.inspirational_example_usage,
                description = R.string.inspirational_example_description
            ),

        ),



        keywords = listOf(
            "NOVITIATE",
            "IMPERIUM",
            "ADEPTA SORORITAS",
            "LEADER",
            "SUPERIOR",
            "32MM"
        )
    )
