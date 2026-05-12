package com.example.killteamruleset.ui.data.Empire.list.SpectreSquad


import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.*


val SpectreVoxRelayBeacon = Operative(
    name = "Spectre Vox-Relay Beacon",
    imageRes = R.drawable.spectral_beacon,
    stats = OperativeStats(
        apl = 1,
        move = "0\"",
        save = "5+",
        wounds = 3
    ),
    weapons = listOf(
        ),

    abilities = listOf(
        Ability(
            title = "Pre-Deploy",
            usage = R.string.predeploy_usage,
            description = R.string.predeploy_description
        ),
        Ability(
            title = "Expendable",
            usage = R.string.spectre_expendable_usage,
            description = R.string.spectre_expendable_description
        ),
        Ability(
            title = "SIGNAL",
            usage = R.string.spectre_vox_signal_usage,
            description = R.string.spectre_vox_signal_description
        )
    ),

    keywords = listOf(
        "SPECTRE SQUAD",
        "IMPERIUM",
        "ASTRA MILITARUM",
        "VOX-RELAY BEACON",
        "25MM"

    )
)
