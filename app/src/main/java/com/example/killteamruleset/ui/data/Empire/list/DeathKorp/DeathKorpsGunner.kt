

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val DeathKorpsGunner = Operative(
    name = "Death Korps Gunner",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 7
    ),

    weapons = listOf(
        WeaponProfile(name = "Arc Rifle¹",
            type = WeaponType.RANGED,
            attacks =4 ,
            hit = "3+",
            damage = "4/5",
            keywords = listOf(
                Piercing(1),
                Stun
            )
        ),
        WeaponProfile(name = "Plasma Caliver (Standard)¹",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "4/6",
            keywords = listOf(
                Piercing(1)
            )
        ),
        WeaponProfile(name = "Plasma Caliver (Supercharge)¹",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "5/6",
            keywords = listOf(
                Hot,
                Lethal(5),
                Piercing(1)
            )
        ),
        WeaponProfile(name = "Transuranic Arquebus (Mobile)²",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "3+",
            damage = "4/3",
            keywords = listOf(
                Devastating(2),
                Heavy("Dash Only"),
                Piercing(1)
            )
        ),
        WeaponProfile(name = "Transuranic Arquebus (Stationary)²",
            type = WeaponType.RANGED,
            attacks =4,
            hit = "2+",
            damage = "4/3",
            keywords = listOf(
                Devastating(3),
                Heavy(""),
                Piercing(1)
            )
        ),
        WeaponProfile(
            name = "Gun Butt",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "2/3",
            keywords = listOf(
            )
        ),
    ),

    abilities = listOf(

        Ability(title = "",
            usage = "",
            description = ""
        )
    ),

    keywords = listOf(
        "HUNTER CLADE",
        "IMPERIUM",
        "ADEPTUS MECHANICUS",
        "SKITARII",
        "VANGUARD",
        "GUNNER",
        "25MM¹",
        "60x35MM²"
    )
)
