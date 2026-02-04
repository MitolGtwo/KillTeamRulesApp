package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.killteamruleset.ui.components.BulletItem
import com.example.killteamruleset.ui.components.KillTeamBackground
import com.example.killteamruleset.ui.components.OperativeSelectionHeader
import com.example.killteamruleset.ui.data.OperativeSelectionRepository
import com.example.killteamruleset.ui.data.TeamRepository

@Composable
fun OperativeSelectionScreen(
    teamId: String,
    navController: NavController,
    onBack: () -> Unit
) {
    val team = TeamRepository.getTeamById(teamId)
    val rules = OperativeSelectionRepository.getRulesForTeam(teamId)
    KillTeamBackground {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding() // ✅ REQUIRED IMPORT
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        OperativeSelectionHeader(
            teamName = team.name.uppercase(),
            archetypesText = team.archetypes.joinToString(" / ") {
                it.displayName.uppercase()
            },
            onArchetypesClick = {
                navController.navigate(
                    "tacops/${team.archetypes.first().name}"
                )
            }
        )

        rules.forEach { rule ->
            BulletItem(
                text = rule.text,
                indent = rule.indent
            )
        }
    }
    }
}