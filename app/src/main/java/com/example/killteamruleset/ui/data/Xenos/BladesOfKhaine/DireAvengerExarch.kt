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

val DireAvengerExarch = Operative(
    name = "Dire Avenger Exarch ",
    imageRes = R.drawable.bossnob,
    stats = OperativeStats(
        apl = 3,
        move = "7\"",
        save = "3+",
        wounds = 9
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
            name = "Twin shuriken catapult",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "3/4",
            keywords = listOf(
                Ceaseless,
                Rending
            )
        ),
        WeaponProfile(
            name = "Diresword",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Lethal(5),
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
        WeaponProfile(
            name = "Gun Butts",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(

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
        )

    ),

    abilities = listOf(
        Ability(
            title = "Defence Tactics",
            usage = R.string.defence_tactics_usage,
            description = R.string.defence_tactics_description
        ),
        Ability(
            title ="Exarch",
            usage = R.string.exarch_usage,
            description = R.string.exarch_description
        ),
        Ability(
            title ="Shimmershield",
            usage = R.string.shimmershield_usage,
            description = R.string.shimmershield_description
        )
    ),

    keywords = listOf(
        "BLADES OF KHAINE",
        "AELDARI",
        "ASURYANI",
        "LEADER",
        "DIRE AVENGER",
        "EXARCH",
        "28MM"
    )
)