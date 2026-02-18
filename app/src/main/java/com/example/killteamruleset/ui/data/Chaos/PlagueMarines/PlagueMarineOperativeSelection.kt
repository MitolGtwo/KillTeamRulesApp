package com.example.killteamruleset.ui.data.Chaos.PlagueMarines

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



val PlagueMarineOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1 PLAGUE MARINE CHAMPION Operative"
    ),

    OperativeSelectionRule(
        text = "5 PLAGUE MARINES operatives selected from the following list:"
    ),

    OperativeSelectionRule(
        text = "BOMBARDIER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "FIGTHER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "HEAVY GUNNER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "ICON BEARER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "MALIGNANT PLAGUECASTER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "WARRIOR",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Your kill team can only include each Operative on this list once.",
        isFooter = true
    )
)