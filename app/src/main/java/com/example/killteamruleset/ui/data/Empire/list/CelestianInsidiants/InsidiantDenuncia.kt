package com.example.killteamruleset.ui.data.Empire.list.CelestianInsidiants

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Seek
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val InsidiatDenuncia: Operative
    get() = Operative(
        name = "Insidiat Denuncia",
        imageRes = R.drawable.alpharanger,
        stats = OperativeStats(
            apl = 2,
            move = "6\"",
            save = "3+",
            wounds = 9
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Voice of Condemnation",
                type = WeaponType.RANGED,
                attacks = 5,
                hit = "3+",
                damage = "1/1",
                keywords = listOf(
                    Range(6),
                    Seek,
                    Stun
                )
        ),
          
            WeaponProfile(
                name = "Staff of Declamation",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "3+",
                damage = "3/3",
                keywords = listOf(
                    Shock
                )
            )
        ),

        abilities = listOf(
            Ability(
                title = "Accusing Exorcist",
                usage = R.string.accusing_exorcist_usage,
                description = R.string.accusing_exorcist_description
            ),

            Ability(
                title = "Speak of her Deeds",
                usage = R.string.speak_of_her_deeds_usage,
                description = R.string.speak_of_her_deeds_description
            )
        ),

        keywords = listOf(
            "CELESTIAN INSIDIANT",
            "IMPERIUM",
            "ADEPTA SORORITAS",
            "DENUNCIA",
            "32MM"
        )
    )

