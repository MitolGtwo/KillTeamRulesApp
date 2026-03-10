package com.example.killteamruleset.ui.data.Xenos.HandOfTheArchon


import com.example.killteamruleset.ui.model.OperativeSelectionRule


val HandOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "  1 HAND OF THE ARCHON ARCHSYBARITE operative with one of the following options:"
    ),
    OperativeSelectionRule(
        text = "Blast pistol; venom blade",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Splinter pistol; venom blade",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Splinter pistol; agoniser",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Splinter pistol; power weapon",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Splinter rifle; array of blades",
        indent = 1
    ),

    OperativeSelectionRule(
        text = " 8 HAND OF THE ARCHON operatives selected from the following list:"
    ),

    OperativeSelectionRule(
        text = "AGENT",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "CRIMSON DUELLIST",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "DISCIPLE OF YAELINDRA",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "ELIXICANT",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "FLAYER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "GUNNER with one of the following options:",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Blaster; array of blades",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "Shredder; array of blades",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "HEAVY GUNNER with one of the following options:",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Dark lance; array of blades",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "Splinter cannon; array of blades",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "SKYSPLINTER ASSASSIN",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "Other than AGENT operatives, your kill team can\n" +
                "only include each operative on this list once. Your\n" +
                "kill team can only include up to two darklight\n" +
                "weapons (blast pistol, blaster and dark lance are\n" +
                "darklight weapons).",
        isFooter = true
    )
)
