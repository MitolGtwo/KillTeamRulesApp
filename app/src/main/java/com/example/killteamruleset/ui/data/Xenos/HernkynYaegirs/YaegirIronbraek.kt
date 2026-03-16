package com.example.killteamruleset.ui.data.Xenos.HernkynYaegirs


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Accurate
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Heavy
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Limited
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.Silent
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val YaegirIronbraek = Operative(
    name = "Yaegir Ironbraek",
    imageRes = R.drawable.yaegirs_mine,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bolt revolver",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/5",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Entrencher",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(

            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Minefield",
            usage = R.string.yaegirs_minefield_usage,
            description = R.string.yaegirs_minefield_description
        ),
        Ability(
            title = "HY-Pex Mines",
            usage = R.string.hypex_mines_usage,
            description = R.string.hypex_mines_description
        ),
    ),


    keywords = listOf(
        "HERNKYN YAEGIR",
        "LEAGUES OF VOTANN",
        "IRONBRAEK",
        "28MM"
    )
)
