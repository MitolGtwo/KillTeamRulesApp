package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.model.Team

@Composable
fun TeamDetailScreen(
    team: Team,
    onOperativesClick: () -> Unit,
    onBack: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        // 🔙 Back
        TextButton(onClick = onBack) {
            Text("← Back")
        }

        // 🏷 Team Name
        Text(
            text = team.name,
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold
        )

        // 📊 Info block (THIS is where difficulty & archetype belong)
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant
            )
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text("Difficulty: ${team.difficulty}")
                Spacer(Modifier.height(4.dp))
                Text("Archetype: ${team.archetype}")
            }
        }

        Spacer(Modifier.height(24.dp))

        // 👥 Operatives
        Button(
            onClick = onOperativesClick,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("View Operatives")
        }

        // (Later)
        // Button("Strategy Ploys")
        // Button("Tac Ops")
    }
}

