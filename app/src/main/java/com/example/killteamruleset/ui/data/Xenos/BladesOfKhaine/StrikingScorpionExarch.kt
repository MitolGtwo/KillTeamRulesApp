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

val StrikingScorpionExarch = Operative(
    name = "Striking Scorpion Exarch",
    imageRes = R.drawable.bossnob,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "3+",
        wounds = 9
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
            name = "Twin Shuriken Pistol",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Range(8),
                Ceaseless,
                Rending
            )
        ),
        WeaponProfile(
            name = "Biting Blade",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "5/6",
            keywords = listOf(
                Rending
            )
        ),
        WeaponProfile(
            name = "Scorpion’s Claw and Chainsword",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Brutal,
                Lethal(5)

            )
        ),
        WeaponProfile(
            name = "Twin chainswords",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Ceaseless,
                Rending
            )
        ),
        ),

    abilities = listOf(
        Ability(
            title = "Mandiblasters",
            usage = R.string.mandiblasters_usage,
            description = R.string.mandiblasters_description
        ),
        Ability(
            title ="Exarch",
            usage = R.string.exarch_usage,
            description = R.string.exarch_description
        )
    ),

    keywords = listOf(
        "BLADES OF KHAINE",
        "AELDARI",
        "ASURYANI",
        "LEADER",
        "STRIKING SCORPION",
        "EXARCH",
        "28MM"
    )
)