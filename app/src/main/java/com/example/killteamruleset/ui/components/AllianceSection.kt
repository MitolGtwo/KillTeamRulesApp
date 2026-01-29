package com.example.killteamruleset.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.data.TeamRepository
import com.example.killteamruleset.ui.model.Alliance
import com.example.killteamruleset.ui.model.Team

@Composable
fun AllianceSection(
    alliance: Alliance,
    expanded: Boolean,
    onHeaderClick: () -> Unit,
    onTeamClick: (Team) -> Unit
) {
    Column {

        AllianceHeader(
            alliance = alliance,
            expanded = expanded,
            onClick = onHeaderClick
        )

        AnimatedVisibility(visible = expanded) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 8.dp, top = 8.dp)
            ) {
                TeamRepository
                    .getTeamsByAlliance(alliance)
                    .forEach { team ->
                        TeamRow(
                            team = team,
                            onClick = { onTeamClick(team) }
                        )
                    }
            }
        }
    }
}