package com.example.killteamruleset.ui.data.Empire.list.BattleClade

val BattlecladeCombatServitor = Operative(
    name = "Battleclade Combat Servitor",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "4+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Incendine Igniter",
            type = WeaponType.RANGE,
            attacks = 4,
            hit = "2+",
            damage = "4/4",
            keywords = listOf(
                Range(6),
                Saturate,
                Torrent(1)
            )
        ),
      WeaponProfile(
            name = "Meltagun",
            type = WeaponType.RANGE,
            attacks = 4,
            hit = "4+",
            damage = "6/3",
            keywords = listOf(
                Range(6),
                Devastating(4),
                Piercing(2)
            )
        ),
      WeaponProfile(
            name = "Phosphor Blaster",
            type = WeaponType.RANGE,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
                Blast(1),
                Severe
            )
        ),
      WeaponProfile(
            name = "Servo-claw",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "3/4",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
    ),


    keywords = listOf(
        "BATTLE CLADE",
        "IMPERIUM",
        "ADEPTUS MECHANICUS",
        "COMBAT",
        "SERVITOR",
        "25MM"
    )
)
