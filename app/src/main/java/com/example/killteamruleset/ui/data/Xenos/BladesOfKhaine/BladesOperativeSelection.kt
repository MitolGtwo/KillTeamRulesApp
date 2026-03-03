package com.example.killteamruleset.ui.data.Xenos.BladesOfKhaine

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


val BladesOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1 BLADES OF KHAINE operative selected from the following list:"
    ),
    OperativeSelectionRule(
        text = "• DIRE AVENGER EXARCH with one of the following options:",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "○ Shuriken catapult; fists",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "○ Twin shuriken catapult; gun butts",
        indent = 2
    ),

    OperativeSelectionRule(
        text = "Or one option from each of the following:",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "○ Diresword or power weapon",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "○ Shuriken pistol or shimmershield",
        indent = 2
    ),

    OperativeSelectionRule(
        text = "HOWLING BANSHEE EXARCH with one of the following options:",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "○ Mirrorswords",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "○ Shuriken pistol; executioner",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "○ Shuriken pistol; power weapon",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "○ Shuriken pistol; triskele",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "○ Triskele; power weapon",
        indent = 2
    ),

    OperativeSelectionRule(
        text = "STRIKING SCORPION EXARCH with one of the following options:",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "○ Shuriken pistol; biting blade",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "○ Shuriken pistol; scorpion’s claw and chainsword",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "○ Twin shuriken pistols; twin chainswords",
        indent = 2
    ),

    OperativeSelectionRule(
        text = "7 BLADES OF KHAINE operatives selected from the following list:"
    ),
    OperativeSelectionRule(
        text = "DIRE AVENGER WARRIOR",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "HOWLING BANSHEE WARRIOR",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "STRIKING SCORPION WARRIOR",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "ARCHETYPES\n Seek & Destroy, or the associated archetype of\n" +
                "the most common Aspect keyword in your kill\n" +
                "team (if two keywords are equally most common,\n" +
                "you can choose one of those keywords). Aspect\n" +
                "keywords and their associated archetypes are\n" +
                "as follows:\n• DIRE AVENGER: Security\n" +
                "• HOWLING BANSHEE: Recon\n" +
                "• STRIKING SCORPION: Infiltration",
        isFooter = true
    )
)