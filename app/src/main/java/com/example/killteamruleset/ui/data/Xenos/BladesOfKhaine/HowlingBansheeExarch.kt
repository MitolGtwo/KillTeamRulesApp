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

val HowlingBansheeExarch = Operative(
    name = "Howling Banshee Exarch",
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
            name = "Triskele (throw)",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "3+",
            damage = "2/3",
            keywords = listOf(
                Range(8),
                Rending,
                Torrent(2)
            )
        ),
        WeaponProfile(
            name = "Executioner",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "3/7",
            keywords = listOf(
                Lethal(5)
            )
        ),
        WeaponProfile(
            name = "Mirrorswords",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Ceaseless,
                Lethal(5)

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
            name = "Triskele (slice)",
            type = WeaponType.MELEE,
            attacks = 5,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Rending
            )
        ),

    ),

    abilities = listOf(
        Ability(
            title = "Banshee Mask",
            usage = R.string.banshee_mask_usage,
            description = R.string.banshee_mask_description
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
        "HOWLING BANSHEE",
        "EXARCH",
        "28MM"
    )
)