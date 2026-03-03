package com.example.killteamruleset.ui.data.Xenos.BladesOfKhaine


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.Torrent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val StrikingScorpionWarrior = Operative(
    name = "Striking Scorpion Warrior",
    imageRes = R.drawable.bossnob,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(

        WeaponProfile(
            name = "Shuriken Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Range(8),
                Rending
            )
        ),
        WeaponProfile(
            name = "Chainsword",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Rending
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Mandiblasters",
            usage = R.string.mandiblasters_usage,
            description = R.string.mandiblasters_description
        )
    ),

    keywords = listOf(
        "BLADES OF KHAINE",
        "AELDARI",
        "ASURYANI",
        "STRIKING SCORPION",
        "28MM"
    )
)