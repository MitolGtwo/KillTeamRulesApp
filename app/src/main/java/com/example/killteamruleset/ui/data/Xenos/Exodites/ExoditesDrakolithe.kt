package com.example.killteamruleset.ui.data.Xenos.Exodites
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Rending
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val Drakolithe = Operative(
    name = "Drakolithe",
    imageRes = R.drawable.exodite_drakolithe,
    stats = OperativeStats(
        apl = 2,
        move = "8\"",
        save = "5+",
        wounds = 7
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Fangs & talons",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Rending
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Preternatural Evasion",
            usage = R.string.prenaturalevasion_usage,
            description = R.string.prenaturalevasion_description
        ),
        Ability(
            title = "Beast",
            usage = R.string.exoditesbeast_usage,
            description = R.string.exoditesbeast_description
        )

    ),


    keywords = listOf(
        "EXODITE DRAGON MASTER",
        "AELDARI",
        "DRAKOLITHE",
        "32"

    )
)