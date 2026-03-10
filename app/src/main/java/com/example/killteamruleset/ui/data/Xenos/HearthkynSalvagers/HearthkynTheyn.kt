package com.example.killteamruleset.ui.data.Xenos.HearthkynSalvagers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Accurate
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val HearthkynTheyn = Operative(
    name = "Hearthkyn Theyn",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "3+",
        wounds = 9
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Autoch-pattern Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8),
                Accurate(1)
            )
        ),
        WeaponProfile(
            name = "Autoch-pattern Bolter",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Accurate(1)
            )
        ),
        WeaponProfile(
            name = "Bolt Revolver",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "EtaCarn Plasma Pistol",
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
            name = "Ion Blaster",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Piercing_Crits(1)
            )
        ),
        WeaponProfile(
            name = "Ion pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Range(8),
                Piercing_Crits(1)
            )
        ),
        WeaponProfile(
            name = "Concussion Gauntlet",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "5/7",
            keywords = listOf(
                Brutal,
                Shock
            )
        ),
        WeaponProfile(
            name = "Plasma Weapon",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Lethal(5)
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Eye of the Ancestors",
            usage = R.string.eye_of_the_ancestors_usage,
            description = R.string.eye_of_the_ancestors_description
        ),
        Ability(
            title = "Weavefield Crest",
            usage = R.string.weavefield_crest_usage,
            description = R.string.weavefield_crest_description
        )
    ),


    keywords = listOf(
        "HEARTHKYN SALVAGER",
        "LEAGUES OF VOTANN",
        "LEADER",
        "THEYN",
        "28MM"
    )
)
