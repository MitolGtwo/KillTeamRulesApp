package com.example.killteamruleset.ui.data.Xenos.WreckaKrew

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

data class OperativeSelectionRule(
    val text: String,
    val indent: Int = 0,
    val isFooter: Boolean = false



)

val WreckaKrewOperativeSelection = listOf(

    OperativeSelectionRule(
        text = "1 WRECKA KREW BOSS NOB operative with one of the following options:"
    ),
    OperativeSelectionRule(
        text = "Rokkit pistol; Smash hammer",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Two rokkit pistols; Choppa",
        indent = 1
    ),

    OperativeSelectionRule(
        text = "2 WRECKA KREW BOMB SQUIG operatives"
    ),

    OperativeSelectionRule(
        text = "5 WRECKA KREW operatives selected from the following list:"
    ),
    OperativeSelectionRule(
        text = "BREAKA BOY DEMOLISHA",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "BREAKA BOY FIGHTER",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "BREAKA BOY KRUSHA",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "TANKBUSTA GUNNER with one of the following options:",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "´Eavy rokkit launcha; Fists",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "Rokkit launcha; Fists",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "TANKBUSTA ROKKITEER with one of the following options:",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Rokkit launcha; Pulsa rokkit; Fists",
        indent = 2
    ),
    OperativeSelectionRule(
        text = "Rokkit launcha; Rokkit rack; Fists",
        indent = 2
    ),
    OperativeSelectionRule(
    text = "Other than BOMB SQUIG, BREAKA BOY FIGHTER and TANKBUSTA GUNNER operatives, your kill " +
            "team can only include each operative on this list once.",
    isFooter = true
    )
)