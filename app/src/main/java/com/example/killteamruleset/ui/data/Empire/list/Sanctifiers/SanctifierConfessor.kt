package com.example.killteamruleset.ui.data.Empire.list.Sanctifiers


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val SanctifierConfessor = Operative(
    name = "Sanctifier Confessor",
    imageRes = R.drawable.alpharanger,
    stats = OperativeStats(
        apl = 2,
        move = "6\"",
        save = "5+",
        wounds = 10
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Mace of Censure",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "3+",
            damage = "5/5",
            keywords = listOf(
                Brutal,
                Shock
            )
        ),
    ),

    abilities = listOf(
        Ability(
            title = "Lead the Procession",
            usage = R.string.lead_the_procession_usage,
            description = R.string.lead_the_procession_description
        ),
        Ability(
            title = "Commanding Declamation",
            usage = R.string.commanding_declamation_usage,
            description = R.string.commanding_declamation_description
        ),
    ),


    keywords = listOf(
        "SANCTIFIER",
        "IMPERIUM",
        "ADEPTUS MINISTORUM",
        "LEADER",
        "CONFESSOR",
        "32MM"
    )
)