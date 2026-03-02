package com.example.killteamruleset.ui.data.Chaos.Goremongers


import com.example.killteamruleset.ui.model.OperativeSelectionRule

val GoremongersOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1 GOREMONGER BLOOD HERALD operative"
    ),
    OperativeSelectionRule(
        text = "7 GOREMONGER operatives selected from the following list:"
    ),
    OperativeSelectionRule(
        text = "ASPIRANT",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "BLOODTAKER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "IMPALER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "INCITER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "SKULLCLAIMER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "STALKER",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "Other than ASPIRANT operatives, your kill team\n" +
                "can only include each operative on this list once.",
        isFooter = true
    )
)

