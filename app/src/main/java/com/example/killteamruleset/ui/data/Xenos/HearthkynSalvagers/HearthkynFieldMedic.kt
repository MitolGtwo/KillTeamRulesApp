package com.example.killteamruleset.ui.data.Xenos.HearthkynSalvagers

import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.Accurate
import com.example.killteamruleset.ui.model.Brutal
import com.example.killteamruleset.ui.model.Ceaseless
import com.example.killteamruleset.ui.model.Lethal
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.OperativeStats
import com.example.killteamruleset.ui.model.Piercing
import com.example.killteamruleset.ui.model.Piercing_Crits
import com.example.killteamruleset.ui.model.Range
import com.example.killteamruleset.ui.model.Shock
import com.example.killteamruleset.ui.model.WeaponProfile
import com.example.killteamruleset.ui.model.WeaponType


val HearthkynFieldMedic = Operative(
    name = "Hearthkyn Field Medic",
    imageRes = R.drawable.dk_watch,
    stats = OperativeStats(
        apl = 2,
        move = "5\"",
        save = "3+",
        wounds = 8
    ),
    weapons = listOf(
        WeaponProfile(
            name = "Bolt Revolver",
            type = WeaponType.RANGED,
            attacks = 4,
            hit = "4+",
            damage = "3/5",
            keywords = listOf(
                Range(8)
            )
        ),
        WeaponProfile(
            name = "Plasma Knife",
            type = WeaponType.MELEE,
            attacks = 4,
            hit = "4+",
            damage = "3/5",
            keywords = listOf(
                Lethal(5)
            )
        )
    ),

    abilities = listOf(
        Ability(
            title = "Medic!",
            usage = R.string.salvagers_medic_usage,
            description = R.string.salvagers_medic_description
        ),
        Ability(
            title = "Medikit",
            usage = R.string.salvagers_medikit_usage,
            description = R.string.salvagers_medikit_description
        )
    ),


    keywords = listOf(
        "HEARTHKYN SALVAGER",
        "LEAGUES OF VOTANN",
        "MEDIC",
        "FIELD MEDIC",
        "28MM"
    )
)
