package com.example.killteamruleset.ui.data.Empire.list.BattleClade

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val BattlecladeGunServitor = Operative(
    name = "Battleclade Gun Servitor",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "4+",
        wounds = 11
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Heavy Arc Rifle",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Heavy("Dash only"),
                Stun,
                Piercing(1)
            )
        ),
      WeaponProfile(
            name = "Heavy Bolter(Focused)",
            type = WeaponType.RANGED,
            attacks = 5,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Heavy("Dash only"),
                Piercing_Crits(1)
            )
        ),
       WeaponProfile(
            name = "Heavy Bolter(Sweeping)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Heavy("Dash only"),
                Piercing_Crits(1),
                Torrent(1)
            )
        ),
      WeaponProfile(
            name = "Augmetic Claw",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Brutal
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = null,
            usage = null,
            description = null
        )
    ),


    keywords = listOf(
        "BATTLE CLADE",
        "IMPERIUM",
        "ADEPTUS MECHANICUS",
        "GUN",
        "SERVITOR",
        "25MM"
    )
)
