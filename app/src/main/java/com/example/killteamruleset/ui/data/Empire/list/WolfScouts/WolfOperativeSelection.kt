package com.example.killteamruleset.ui.data.Empire.list.WolfScouts

import com.example.killteamruleset.ui.model.OperativeSelectionRule

val WolfOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1 WOLF SCOUT FENRISIAN WOLF "
    ),

    OperativeSelectionRule(
        text = "5 WOLF SCOUT Operatives selected from the following list:",
    ),
    OperativeSelectionRule(
        text = "PACK LEADER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = " FANGBEARER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "FROSTEYE",
        indent = 1
    ),
    OperativeSelectionRule(
        text = " GUNNER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "TRAPMASTER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = " RUNE PRIEST SKJALD",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "HUNTER",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "Other than HUNTER Operatives, your kill team can only include each Operative" +
                " on this list once.",
        isFooter = true
    )
)