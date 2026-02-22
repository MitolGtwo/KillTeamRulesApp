package com.example.killteamruleset.ui.data.Empire.list.Novitiates


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Ceaseless
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
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val NovitiateExactor: Operative
    get() = Operative(
        name = "Novitiate Exactor",
        imageRes = R.drawable.alpharanger,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "4+",
            wounds = 7
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Neural Whips (ranged)",
                type = WeaponType.RANGED,
                attacks = 5,
                hit = "3+",
                damage = "2/3",
                keywords = listOf(
                    Range(3),
                    Lethal(5),
                    Stun
                )
            ),
            WeaponProfile(
                name = "Neural Whips (melee)",
                type = WeaponType.MELEE,
                attacks = 5,
                hit = "3+",
                damage = "2/3",
                keywords = listOf(
                    Lethal(5),
                    Shock
                )
            ),
        ),

        abilities = listOf(
            Ability(
                title = "Whip Into Frenzy",
                usage = R.string.whip_into_frenzy_usage,
                description = R.string.whip_into_frenzy_description
            )
        ),



        keywords = listOf(
            "NOVITIATE",
            "IMPERIUM",
            "ADEPTA SORORITAS",
            "EXACTOR",
            "28MM"
        )
    )