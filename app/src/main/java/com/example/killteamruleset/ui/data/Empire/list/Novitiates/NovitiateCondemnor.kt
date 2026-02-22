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

val NovitiateCondemnor: Operative
    get() = Operative(
        name = "Novitiate Condemnor",
        imageRes = R.drawable.alpharanger,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "4+",
            wounds = 7
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Condemnor Stakethrower",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "3+",
                damage = "3/3",
                keywords = listOf(
                    Devastating(2),
                    Piercing_Crits(1),
                    Silent
                ),
                extraRules = listOf("*Anti-PSYKER")
            ),
            WeaponProfile(
                name = "Null Rod",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "4+",
                damage = "3/3",
                keywords = listOf(
                    Shock
                ),
                extraRules = listOf("*Anti-PSYKER")
            ),
        ),

        abilities = listOf(
            Ability(
                title = "Null Rod",
                usage = R.string.novitiate_null_rod_usage,
                description = R.string.novitiate_null_rod_description
            )
        ),



        keywords = listOf(
            "NOVITIATE",
            "IMPERIUM",
            "ADEPTA SORORITAS",
            "CONDEMNOR",
            "28MM"
        )
    )