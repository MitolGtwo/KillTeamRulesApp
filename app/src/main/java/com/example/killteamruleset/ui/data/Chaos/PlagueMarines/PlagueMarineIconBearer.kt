package com.example.killteamruleset.ui.data.Chaos.PlagueMarines



import com.example.killteamruleset.ui.model.Poison
import com.example.killteamruleset.ui.model.Severe
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val PlagueMarineIconBearer= Operative(
    name = "Plague Marine Icon Bearer",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "5\"",
        save = "3+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Plague Knife",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Severe,
                Poison
            )
        ),

        ),

    abilities = listOf(
        Ability(
            title = "Icon Bearer",
            usage = "Pasive",
            description = "Whenever determining control of a marker, treat this operative’s APL stat" +
                    " as 1 higher. Note this isn’t a change to its APL stat, so any changes are " +
                    "cumulative with this."
        ),
        Ability(
            title = "Icon of Contagion",
            usage = "Strategy Phase",
            description = "Whenever this operative is within your opponent´s territory, the Contagion" +
                    " strategy ploy costs you 0CP."
        )

    ),
    keywords = listOf(
        "PLAGUE MARINE",
        "CHAOS",
        "HERETIC ASTARTES",
        "ICON BEARER",
        "32MM"
    )
)