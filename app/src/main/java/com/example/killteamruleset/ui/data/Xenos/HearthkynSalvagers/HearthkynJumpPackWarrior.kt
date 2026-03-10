package com.example.killteamruleset.ui.data.Xenos.HearthkynSalvagers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Accurate
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Devastating
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Limited
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val HearthkynJumpPackWarrior = Operative(
    name = "Hearthkyn Jump Pack Warrior",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "7\"",
        save = "3+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Autoch-pattern Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Range(8),
                Accurate(1)
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
            ),
            extraRules = listOf("*Force Impact")
        )
    ),

    abilities = listOf(
        Ability(
            title = "Jump Pack",
            usage = R.string.salvagers_jumpack_usage,
            description = R.string.salvagers_jumpack_description
        ),
        Ability(
            title = "Force Impact",
            usage = R.string.force_impact_usage,
            description = R.string.force_impact_description
        ),
    ),


    keywords = listOf(
        "HEARTHKYN SALVAGER",
        "LEAGUES OF VOTANN",
        "JUMP PACK WARRIOR",
        "28MM"
    )
)
