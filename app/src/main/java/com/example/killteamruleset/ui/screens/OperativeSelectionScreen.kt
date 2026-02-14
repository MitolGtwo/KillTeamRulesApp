package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
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
                .statusBarsPadding()
                .navigationBarsPadding()
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

            Spacer(Modifier.height(8.dp))

            rules.forEach { rule ->
                BulletItem(
                    text = rule.text,
                    indent = rule.indent,
                    isFooter = rule.isFooter
                )
            }
        }
    }
}

@Composable
fun BulletItem(
    text: String,
    indent: Int = 0,
    isFooter: Boolean = false
) {
    val isHeaderLine =
        indent == 0 && text.firstOrNull()?.isDigit() == true

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = (indent * 16).dp),
        verticalAlignment = Alignment.Top
    ) {

        // 🔸 BULLET FOR SUB-ITEMS ONLY
        if (indent > 0) {
            Text(
                text = "•",
                modifier = Modifier.padding(end = 8.dp),
                color = Color(0xFFFF6A00),
                fontWeight = FontWeight.Bold
            )
        }

        Text(
            text = text,
            color = when {
                isFooter -> MaterialTheme.colorScheme.onSurface.copy(alpha = 0.6f)
                isHeaderLine -> Color(0xFFFF6A00) // 🔥 ORANGE OPERATIVE HEADER
                else -> MaterialTheme.colorScheme.onSurface
            },
            fontWeight = when {
                isHeaderLine -> FontWeight.Bold
                else -> FontWeight.Normal
            },
            style = when {
                isFooter -> MaterialTheme.typography.bodySmall
                else -> MaterialTheme.typography.bodyMedium
            }
        )
    }
}