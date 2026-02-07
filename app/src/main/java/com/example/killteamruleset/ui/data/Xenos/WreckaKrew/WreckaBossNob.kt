package com.example.killteamruleset.ui.data.Xenos.WreckaKrew



import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val WreckaBossNob = Operative(
    name = "Wrecka Boss Nob ",
    imageRes = R.drawable.bossnob,
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
            ),
            extraRules = listOf("*Salvo")
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
            title = R.string.wreckaboss,
            usage = R.string.wreckaboss_usage,
            description = R.string.wreckaboss_description
        ),
        Ability(
            title =R.string.wrecka_salvo,
            usage = R.string.wrecka_salvo_usage,
            description = R.string.wrecka_salvo_description
        )


    ),

/*"Select up to Two different valid targets that aren´t within control range of friendly" +
                " Operatives. Shoot with this weapon against both primary targets in an order of your" +
                " choice, then against all remaining secondary targets if any. Each target (primary " +
                "and secondary) cannot be shot more than once during the action."*/
    keywords = listOf(
        "WRECKA KREW",
        "ORK",
        "LEADER",
        "BOSS NOB",
        "40MM"
    )
)