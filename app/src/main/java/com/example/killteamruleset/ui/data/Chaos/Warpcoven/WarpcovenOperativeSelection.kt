package com.example.killteamruleset.ui.data.Chaos.Warpcoven


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.model.OperativeSelectionRule



val WarpcovenOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "5 WARPCOVEN operatives selected from the following list:"
    ),

    OperativeSelectionRule(
        text = "SORCERER OF DESTINY 1",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "SORCERER OF TEMPYRION 1",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "SORCERER OF WARPFIRE 1",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "RUBRIC MARINE GUNNER with one of the following options:",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "○ Warpflamer; Fists",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "○ Soulreaper Cannon 2 ; Fists\n",
        indent = 2
    ),

    OperativeSelectionRule(
        text = "RUBRIC MARINE ICON BEARER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "RUBRIC MARINE WARRIOR",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "TZAANGOR CHAMPION 3 with one of the following options:",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "○ Greataxe",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "○ Greatblade",
        indent = 2
    ),

    OperativeSelectionRule(
        text = "TZAANGOR HORN BEARER 3",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "TZAANGOR ICON BEARER 3",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "TZAANGOR WARRIOR 3 with one of the following options:",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "○ Tzaangor blades",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "○ Tzaangor blade & shield",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "○ Autopistol; chainsword",
        indent = 2
    ),

    OperativeSelectionRule(
        text = "You must select at least one friendly SORCERER Operative. Other than WARRIOR Operative," +
                " your kill team can only include each Operative on this list once.\nOne with" +
                " Force Stave, PSYCHIC weapons (1) on their datacard and on of the following options:" +
                "\n• Inferno bolt pistol\n• Prosperine khopesh\n• Warpflame pistol 2\nYour kill team can" +
                "only include up to one Warpflame pistol (2) and up to one Soulreaper Cannon.\n" +
                "These Operatives (3) count as half selection each, meaning you can select both of them" +
                "and it is treated as one selection in total.",
        isFooter = true
    )
)