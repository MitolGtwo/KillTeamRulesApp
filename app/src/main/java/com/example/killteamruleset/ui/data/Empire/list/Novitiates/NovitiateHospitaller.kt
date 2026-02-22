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
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val NovitiateHospitaller: Operative
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
                name = "Surgical Saw",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "4+",
                damage = "2/3",
                keywords = listOf(
                    Lethal(5),
                    Rending
                )
            ),
        ),

        abilities = listOf(
            Ability(
                title = "Medic!",
                usage = R.string.novitiate_medic_usage,
                description = R.string.novitiate_medic_description
            ),
            Ability(
                title = "Chirugeon´s Tools",
                usage = R.string.chirugeons_tools_usage,
                description = R.string.chirugeons_tools_description
            ),
        ),



        keywords = listOf(
            "NOVITIATE",
            "IMPERIUM",
            "ADEPTA SORORITAS",
            "MEDIC",
            "HOSPITALLER",
            "28MM"
        )
    )