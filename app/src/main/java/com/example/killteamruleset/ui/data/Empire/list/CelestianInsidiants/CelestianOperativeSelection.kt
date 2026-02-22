package com.example.killteamruleset.ui.data.Empire.list.CelestianInsidiants

import com.example.killteamruleset.ui.model.OperativeSelectionRule

val CelestianOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1 CELESTIAN INSIDIANT SUPERIOR Operative with one of the following options:"
    ),

    OperativeSelectionRule(
        text = "• Relic Condemnor Stakethrower; Relic Bolt Pistol ; Null Mace",
        indent = 1
    ),

      OperativeSelectionRule(
        text = "• Inferno Pistol; Null Mace",
        indent = 1
    ),


    OperativeSelectionRule(
        text = "8 CELESTIAN INSIDIANT Operatives selected from the following list:",
    ),
    OperativeSelectionRule(
        text = "ABJUROR",
        indent = 1
    ),
      OperativeSelectionRule(
        text = "CENSOR",
        indent = 1
    ),
      OperativeSelectionRule(
        text = "CREMATOR",
        indent = 1
    ),
      OperativeSelectionRule(
        text = "DENUNCIA",
        indent = 1
    ),
      OperativeSelectionRule(
        text = "MORTISANCTUS",
        indent = 1
    ),
      OperativeSelectionRule(
        text = "RELIQUARIUS",
        indent = 1
    ),
      OperativeSelectionRule(
        text = "WARRIOR",
        indent = 1
    ),


    OperativeSelectionRule(
        text = "Other than CREMATOR and WARRIOR Operatives, your kill team can only include each Operative on this list once." +
                "Your kill team can only include up two CREMATOR Operatives.",
        isFooter = true
    )
)
