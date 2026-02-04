package com.example.killteamruleset.ui.data.Empire.list.BattleClade

val BattlecladeGunServitor = Operative(
    name = "Battleclade Gun Servitor",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 3,
        move = "6\"",
        save = "3+",
        wounds = 9
    ),
    weapons = listOf(
       WeaponProfile(
            name = "Master-crafter Radium Pistol",
            type = WeaponType.RANGE,
            attacks = 4,
            hit = "3+",
            damage = "2/4",
            keywords = listOf(
                Range(8),
                Balanced,
                Rending
            )
        ),
      WeaponProfile(
            name = "Dataspikes",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "5+",
            damage = "2/3",
            keywords = listOf(
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "DATACORONAL ACCUMULATOR",
            usage = "1 AP/Firefight phase",
            description = "**SUPPORT**. Determine the friendly **BATTLECLADE** Operative within 6\" of this Operative and/or" +
                    " a friendly **BATTLECLADE AUTO-PROXY** Operative, then roll one D3. If the result is equal or less than the" +
                    " the number of objective markers those Operatives contest, you gain 1CP. For the purpose of the Comms Deviceaaaaa.\n\n" +
                    "This Operative **cannot** perform this action while within control range of an enemy Operative, or if" +
                    " a terrain feature isn´t within its control range."
        ),
      Ability(
            title = "BREACH",
            usage = "1 AP/Firefight phase",
            description = "Place one of your Breach markers within this Operative´s control range as close as possible to a" +
                    " terrain feature within control range of it. Whenever an Operative is within 1\" of that marker," +
                    " it treats parts of that terrain feature that are no more than 1\" thick as Accessible terrain.\n\n" +
                    "This Operative **cannot** perform this action while within control range of an enemy Operative, or if" +
                    " a terrain feature isn´t within its control range."
    ),


    keywords = listOf(
        "BATTLE CLADE",
        "IMPERIUM",
        "ADEPTUS MECHANICUS",
        "TECH-PRIEST",
        "SERVITOR UNDERSEER",
        "32MM"
    )
)
