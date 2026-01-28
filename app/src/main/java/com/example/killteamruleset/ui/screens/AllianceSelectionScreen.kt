package com.example.killteamruleset.ui.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.components.AllianceHeader
import com.example.killteamruleset.ui.components.TeamRow
import com.example.killteamruleset.ui.data.TeamRepository
import com.example.killteamruleset.ui.model.Alliance
import com.example.killteamruleset.ui.model.Team
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.font.FontWeight


@Composable
fun AllianceSelectionScreen(
    onAllianceSelected: (Alliance) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        // Title
        Text(
            text = "Select Alliance",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )

        // Imperium
        AllianceHeader(
            alliance = Alliance.IMPERIUM,
            expanded = false,
            onClick = { onAllianceSelected(Alliance.IMPERIUM) }
        )

        // Chaos
        AllianceHeader(
            alliance = Alliance.CHAOS,
            expanded = false,
            onClick = { onAllianceSelected(Alliance.CHAOS) }
        )

        // Xenos
        AllianceHeader(
            alliance = Alliance.XENOS,
            expanded = false,
            onClick = { onAllianceSelected(Alliance.XENOS) }
        )
    }
}