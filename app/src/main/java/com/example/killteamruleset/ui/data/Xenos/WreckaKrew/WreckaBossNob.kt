package com.example.killteamruleset.ui.data.Xenos.WreckaKrew



import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Salvo
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val WreckaBossNob = Operative(
    name = "Wrecka Boss Nob ",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "4+",
        wounds = 14
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Rokkit Pistol",
            type = WeaponType.RANGED,
            attacks = 6,
            hit = "5+",
            damage = "4/5",
            keywords = listOf(
                Range(8),
                Blast(1)
            )
        ),
        WeaponProfile(
            name = "Two Rokkit Pistol(Focused)",
            type = WeaponType.RANGED,
            attacks = 6,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Range(8),
                Blast(1),
                Ceaseless
            )
        ),
        WeaponProfile(
            name = "Two Rokkit Pistol(Salvo)",
            type = WeaponType.RANGED,
            attacks = 6,
            hit = "5+",
            damage = "4/5",
            keywords = listOf(
                Range(8),
                Blast(1),
                Salvo
            )
        ),
        WeaponProfile(
            name = "The good ´ol Choppa",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(

            )
        ),
        WeaponProfile(
            name = "Smash Hammah",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "5/6",
            keywords = listOf(
                Brutal
            )
        )

    ),

    abilities = listOf(
        Ability(
            title = "Wrecka Boss",
            usage = "Passive",
            description = "Whenever this operative performs the Shoot or Fight action (Excluding " +
                    "Guard), you gain 1 Wrecka point"
        )
    ),


    keywords = listOf(
        "WRECKA KREW",
        "ORK",
        "LEADER",
        "BOSS NOB",
        "40MM"
    )
)