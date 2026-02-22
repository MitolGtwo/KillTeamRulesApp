package com.example.killteamruleset.ui.data.Empire.list.Karskin

import com.example.killteamruleset.ui.model.OperativeSelectionRule

val KasrkinOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1 KASRKIN SERGEANT Operative with one of the following options:"
    ),

    OperativeSelectionRule(
        text = "• Bolt Pistol; Power Weapon",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "• Hot-shot Lasgun; Gun Butt",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "• Hot-shot Laspistol; Power Weapon",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "• Plasma Pistol; Chainsword",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "9 KASRKIN Operatives selected from the following list:",
    ),
    OperativeSelectionRule(
        text = "COMBAT MEDIC",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "DEMO-TROOPER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "GUNNER with flamer and Gun Butt*",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "GUNNER  with Grenade Launcher and Gun Butt*",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "GUNNER Meltagun and Gun Butt*",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "GUNNER Plasma Gun and Gun Butt*",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "RECON-TROOPER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "SHARPSHOOTER*",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "TROOPER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "VOX-TROOPER",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "Other than TROOPER Operatives, you kill team can only include each Operative on this list once.\n\n"+

                "You cannot select more than four of these * Operatives combined.\n\n" +
                "Some Karskin rules refer to a hot-shot weapon. This is a ranged weapon that" +
                " includes hot-shot in its name.",
        isFooter = true
    )
)
