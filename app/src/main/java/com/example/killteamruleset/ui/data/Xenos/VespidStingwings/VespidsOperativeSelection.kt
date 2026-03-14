package com.example.killteamruleset.ui.data.Xenos.VespidStingwings

import com.example.killteamruleset.ui.model.OperativeSelectionRule


val VespidsOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1 VESPID STINGWING STRAIN LEADER operative"
    ),
    OperativeSelectionRule(
        text = "1 VESPID STINGWING OVERSIGHT DRONE operative"
    ),

    OperativeSelectionRule(
        text = "9 VESPID STINGWING operatives selected from the following list:"
    ),
    OperativeSelectionRule(
        text = "LONGSTING",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "SHADESTRAIN",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "SKYBLAST",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "SWARMGUARD",
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
