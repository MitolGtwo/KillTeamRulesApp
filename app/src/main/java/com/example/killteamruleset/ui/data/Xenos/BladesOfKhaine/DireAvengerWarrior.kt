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
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType

val DireAvengerWarrior = Operative(
    name = "Dire Avenger Warrior",
    imageRes = R.drawable.bossnob,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Shuriken Catapult",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Rending
            )
        ),
        WeaponProfile(
            name = "Fists",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "2/4",
            keywords = listOf(

            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Defence Tactics",
            usage = R.string.defence_tactics_usage,
            description = R.string.defence_tactics_description
        )
    ),

    keywords = listOf(
        "BLADES OF KHAINE",
        "AELDARI",
        "ASURYANI",
        "DIRE AVENGER",
        "WARRIOR",
        "28MM"
    )
)