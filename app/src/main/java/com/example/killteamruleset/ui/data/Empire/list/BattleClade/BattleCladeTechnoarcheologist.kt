package com.example.killteamruleset.ui.data.Empire.list.BattleClade

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val BattleCladeTechnoarcheologist: Operative
    get() = Operative(
        name = "Battleclade Technoarcheologist",
        imageRes = R.drawable.alpharanger,
        stats = OperativeStats(
            apl = 3,
            move = "6\"",
            save = "3+",
            wounds = 9
        ),
        weapons = listOf(
            WeaponProfile(
                name = "Eradication Pistol",
                type = WeaponType.RANGED,
                attacks = 4,
                hit = "3+",
                damage = "4/2",
                keywords = listOf(
                    Range(8),
                    Devastating(3),
                    Lethal(5)

                )
            ),
            WeaponProfile (
                name = "Servo-arc Claw",
                type = WeaponType.MELEE,
                attacks = 4,
                hit = "4+",
                damage = "3/4",
                keywords = listOf(
                    Severe,
                    Shock
                )
            )
        ),

        abilities = listOf(
            Ability(
                title = "Searcher of the Divine Arcana",
                usage = R.string.battleclade_divinearcana_usage,
                description = R.string.battleclade_divinearcana_description
            ),

            Ability(
                title = "Omniscanner",
                usage = R.string.battleclade_omniscanner_usage,
                description = R.string.battleclade_omniscanner_description
            )
        ),



        keywords = listOf(
            "BATTLE CLADE",
            "IMPERIUM",
            "ADEPTUS MECHANICUS",
            "TECH-PRIEST",
            "LEADER",
            "TECNHOARCHEOLOGIST",
            "32MM"
        )
    )

