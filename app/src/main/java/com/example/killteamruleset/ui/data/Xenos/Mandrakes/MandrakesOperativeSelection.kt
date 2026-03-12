package com.example.killteamruleset.ui.data.Xenos.Mandrakes

import com.example.killteamruleset.ui.model.OperativeSelectionRule


val MandrakeOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1 MANDRAKE NIGHTFIEND operative"
    ),
    OperativeSelectionRule(
        text = "8 MANDRAKE operatives selected from the following list:"
    ),

    OperativeSelectionRule(
        text = "ABYSSAL",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "CHOOSER OF THE FLESH",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "DIRGEMAW",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "SHADEWEAVER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "WARRIOR",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Other than WARRIOR operatives, your kill team\n" +
                "can only include each operative on this list once.",
        isFooter = true
    )
)
