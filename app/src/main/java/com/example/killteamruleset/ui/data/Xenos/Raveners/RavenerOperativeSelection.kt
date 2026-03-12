package com.example.killteamruleset.ui.data.Xenos.Raveners

import com.example.killteamruleset.ui.model.OperativeSelectionRule


val RavenersOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1 RAVENER PRIME operative"
    ),
    OperativeSelectionRule(
        text = " 4 RAVENER operatives selected from the following list:"
    ),

    OperativeSelectionRule(
        text = "FELLTALON",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "TREMORSCYTHE",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "VENOMSPITTER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "WARRIOR",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "WRECKER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Other than WARRIOR operatives, your kill team\n" +
                "can only include each operative on this list once..",
        isFooter = true
    )
)
