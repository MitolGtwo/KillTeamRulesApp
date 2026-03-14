package com.example.killteamruleset.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.model.Alliance
import com.example.killteamruleset.ui.model.Team

import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut

@Composable
fun AllianceSection(
    alliance: Alliance,
    teams: List<Team>,
    expanded: Boolean,
    onHeaderClick: () -> Unit,
    onTeamClick: (Team) -> Unit
) {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {

        AllianceHeader(
            alliance = alliance,
            expanded = expanded,
            onClick = onHeaderClick
        )

        AnimatedVisibility(
            visible = expanded,
            enter = expandVertically() + fadeIn(),
            exit = shrinkVertically() + fadeOut()
        ) {

            Column(
                modifier = Modifier.padding(start = 8.dp, top = 8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                teams.forEach { team ->
                    TeamRow(
                        team = team,
                        onClick = { onTeamClick(team) }
                    )
                }
            }
        }
    }
}