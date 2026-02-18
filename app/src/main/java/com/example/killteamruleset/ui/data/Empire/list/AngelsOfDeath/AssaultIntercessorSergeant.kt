package com.example.killteamruleset.ui.data.Empire.list.AngelsOfDeath

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Hot
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Saturate
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Stun
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val AssaultIntercessorSergeant = Operative(
    name = "Assault Intercessor Sergeant",
    imageRes = R.drawable.plague_bombardier,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 15
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Hand Flamer",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "2+",
            damage = "3/3",
            keywords = listOf(
                Range(6),
                Saturate,
                Torrent(1)
            )
        ),
        WeaponProfile(
            name = "Heavy Bolt Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8),
                Piercing_Crits(1)
            )
        ),
        WeaponProfile(
            name = "Plasma Pistol (standard)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/5",
            keywords = listOf(
                Range(8),
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Plasma Pistol (supercharge)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Range(8),
                Hot,
                Lethal(5),
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Chainsword",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
            )
        ),
        WeaponProfile(
            name = "Power Fist",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "4+",
            damage = "5/7",
            keywords = listOf(
                Brutal
            )
        ),
        WeaponProfile(
            name = "Power Weapon",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Lethal(5)
            )
        ),
        WeaponProfile(
            name = "Thunder Hammer",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "4+",
            damage = "5/6",
            keywords = listOf(
                Shock,
                Stun
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Doctrine Warfare",
            usage = R.string.assault_doctrine_warfare_usage,
            description = R.string.assault_doctrine_warfare_description
        ),
        Ability(
            title = "Chapter Veteran",
            usage = R.string.chapter_veteran_usage,
            description = R.string.chapter_veteran_description
        )
    ),
    keywords = listOf(
        "ANGEL OF DEATH",
        "IMPERIUM",
        "ADEPTUS ASTARTES",
        "LEADER",
        "ASSAULT INTERCESSOR",
        "SERGEANT",
        "32MM"
    )
)
