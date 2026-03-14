package com.example.killteamruleset.ui.data.Xenos.XV26StealthBattlesuits

import com.example.killteamruleset.ui.model.OperativeSelectionRule


val XV26OperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = " 1 XV26 STEALTH BATTLESUIT SHAS’VRE with pulse pistol and one of the following options:"
    ),
    OperativeSelectionRule(
        text = "Burst cannon or fusion blaster",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "1 XV26 STEALTH BATTLESUIT MV75 MARKER DRONE"
    ),
    OperativeSelectionRule(
        text = "1 XV26 STEALTH BATTLESUIT MV15 GUN DRONE"
    ),

    OperativeSelectionRule(
        text = "4 XV26 STEALTH BATTLESUIT operatives selected from the following list:"
    ),
    OperativeSelectionRule(
        text = "DESIGNATOR",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "INFILTRATOR",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "LIBERATOR",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "LODESTAR",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "NEUTRALISER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "With one of the following options:",
    ),
    OperativeSelectionRule(
        text = "Burst cannon; fists •",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Fusion blaster; fists",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Other than INFILTRATOR operatives, your kill\n" +
                "team can only include each operative on this list\n" +
                "once. Your kill team can only include up to two\n" +
                "fusion blasters.",
        isFooter = true
    )
)
