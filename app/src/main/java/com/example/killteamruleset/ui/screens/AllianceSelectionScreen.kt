package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.components.AllianceHeader
import com.example.killteamruleset.ui.model.Alliance
import androidx.compose.ui.text.font.FontWeight
import com.example.killteamruleset.ui.components.AllianceSection
import com.example.killteamruleset.ui.model.Team


@Composable
fun AllianceSelectionScreen(
    onTeamSelected: (Team) -> Unit
) {
    var expandedAlliance by remember { mutableStateOf<Alliance?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        Text(
            text = "Select Alliance",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )

        AllianceSection(
            alliance = Alliance.IMPERIUM,
            expanded = expandedAlliance == Alliance.IMPERIUM,
            onHeaderClick = {
                expandedAlliance =
                    if (expandedAlliance == Alliance.IMPERIUM) null
                    else Alliance.IMPERIUM
            },
            onTeamClick = onTeamSelected
        )

        AllianceSection(
            alliance = Alliance.CHAOS,
            expanded = expandedAlliance == Alliance.CHAOS,
            onHeaderClick = {
                expandedAlliance =
                    if (expandedAlliance == Alliance.CHAOS) null
                    else Alliance.CHAOS
            },
            onTeamClick = onTeamSelected
        )

        AllianceSection(
            alliance = Alliance.XENOS,
            expanded = expandedAlliance == Alliance.XENOS,
            onHeaderClick = {
                expandedAlliance =
                    if (expandedAlliance == Alliance.XENOS) null
                    else Alliance.XENOS
            },
            onTeamClick = onTeamSelected
        )
    }
}