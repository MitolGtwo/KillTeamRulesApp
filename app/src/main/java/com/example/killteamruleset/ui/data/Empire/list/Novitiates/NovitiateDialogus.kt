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

val NovitiateDialogus: Operative
    get() = Operative(
        name = "Novitiate Dialogus",
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
                name = "Dialogus Stave",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "4+",
                damage = "3/3",
                keywords = listOf(
                    Shock
                )
            ),
        ),

        abilities = listOf(
            Ability(
                title = "Stirring Rhetoric",
                usage = R.string.stirring_rhetoric_usage,
                description = R.string.stirring_rhetoric_description
            ),
            Ability(
                title = "Auto-Broadcaster",
                usage = R.string.auto_broadcaster_usage,
                description = R.string.auto_broadcaster_description
            ),
        ),



        keywords = listOf(
            "NOVITIATE",
            "IMPERIUM",
            "ADEPTA SORORITAS",
            "DIALOGUS",
            "28MM"
        )
    )