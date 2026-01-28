package com.example.killteamruleset.ui.data.Xenos.WreckaKrew

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Blast
import com.example.killteamruleset.ui.model.Explosive
import com.example.killteamruleset.ui.model.Limited
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val WreckaBombSquig = Operative(
    name = "Wrecka Bomb Squig",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 5
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Explosives",
            type = WeaponType.RANGED,
            attacks = 6,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
                Blast(1),
                Limited(1),
                Explosive
            )
        ),
        WeaponProfile(
            name = "Bite",
            type = WeaponType.MELEE,
            attacks = 3,
            hit = "4+",
            damage = "4/5",
            keywords = listOf(
            )
        )

    ),

    abilities = listOf(
        Ability(
            title = "Stoopid",
            usage = "Passive",
            description = "In the Firefight phase, whenever you determine this operative´s order" +
                    ", you cannot select Conceal. This operative cannot perform any action other than" +
                    " CHARGE, DASH, FIGHT, REPOSITION and SHOOT. It cannot use any weapons that " +
                    "aren´t on its datacard."
        ),
        Ability(
            title = "Boom!",
            usage = "Pasive, when this operative is incapacitated",
            description = "If this Operative is incapacitated during the battle in which it hasn´t " +
                    "used its explosives, roll one D6, or two D6 if you wish. If any result is 4+," +
                    "this Operative performs a free Shoot action with its explosives before is removed" +
                    " from the game."
        ),
        Ability(
            title = "Expendable",
            usage = "Passive",
            description = "This operative is ignored for your opponent´s kill op,(Making this team a" +
                    " 6 Operatives Kill team) It´s also ignored for victory conditions and scoring VPs" +
                    " if either require operatives to \"escape\" or \"survive\" or be incapacitated by" +
                    " enemy operatives."
        )
    ),


    keywords = listOf(
        "WRECKA KREW",
        "ORK",
        "BOMB SQUIG",
        "25MM"
    )
)