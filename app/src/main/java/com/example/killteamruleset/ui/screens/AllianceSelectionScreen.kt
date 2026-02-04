package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.components.AllianceHeader
import com.example.killteamruleset.ui.model.Alliance
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.killteamruleset.ui.components.AllianceSection
import com.example.killteamruleset.ui.components.KillTeamBackground
/*import com.example.killteamruleset.ui.components.TeamListSection*/
import com.example.killteamruleset.ui.data.FavoritesRepository
import com.example.killteamruleset.ui.data.TeamRepository
import com.example.killteamruleset.ui.model.Team


@Composable
fun AllianceSelectionScreen(
    onTeamSelected: (Team) -> Unit
) {
    var expandedAlliance by remember { mutableStateOf<Alliance?>(null) }

    val context = LocalContext.current
    val favorites by FavoritesRepository
        .favoritesFlow(context)
        .collectAsState(initial = emptySet())

    val favoriteTeams = remember(favorites) {
        TeamRepository.getAllTeams()
            .filter { it.id in favorites }
    }

    KillTeamBackground {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            Text(
                text = "Select Alliance",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            // ⭐ FAVORITES (only show if not empty)
            if (favoriteTeams.isNotEmpty()) {
                AllianceSection(
                    alliance = Alliance.FAVORITES,
                    teams = favoriteTeams,
                    expanded = expandedAlliance == Alliance.FAVORITES,
                    onHeaderClick = {
                        expandedAlliance =
                            if (expandedAlliance == Alliance.FAVORITES) null
                            else Alliance.FAVORITES
                    },
                    onTeamClick = onTeamSelected
                )
            }

            // 🛡 IMPERIUM
            AllianceSection(
                alliance = Alliance.IMPERIUM,
                teams = TeamRepository.getTeamsByAlliance(Alliance.IMPERIUM),
                expanded = expandedAlliance == Alliance.IMPERIUM,
                onHeaderClick = {
                    expandedAlliance =
                        if (expandedAlliance == Alliance.IMPERIUM) null
                        else Alliance.IMPERIUM
                },
                onTeamClick = onTeamSelected
            )

            // 🔥 CHAOS
            AllianceSection(
                alliance = Alliance.CHAOS,
                teams = TeamRepository.getTeamsByAlliance(Alliance.CHAOS),
                expanded = expandedAlliance == Alliance.CHAOS,
                onHeaderClick = {
                    expandedAlliance =
                        if (expandedAlliance == Alliance.CHAOS) null
                        else Alliance.CHAOS
                },
                onTeamClick = onTeamSelected
            )

            // ☣ XENOS
            AllianceSection(
                alliance = Alliance.XENOS,
                teams = TeamRepository.getTeamsByAlliance(Alliance.XENOS),
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
}