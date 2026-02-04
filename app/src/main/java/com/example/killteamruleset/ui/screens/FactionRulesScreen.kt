package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.components.FactionRuleCard
import com.example.killteamruleset.ui.components.FactionRulesBackground
import com.example.killteamruleset.ui.components.KillTeamBackground
import com.example.killteamruleset.ui.data.FactionRuleRepository
import com.example.killteamruleset.ui.data.TeamRepository

@Composable
fun FactionRulesScreen(
    teamId: String,
    onBack: () -> Unit
) {
    val team = TeamRepository.getTeamById(teamId)
    val rules = FactionRuleRepository.getForTeam(teamId)

    // 🔥 Background ONLY here
    Box(modifier = Modifier.fillMaxSize
        ()
        .statusBarsPadding()
        .navigationBarsPadding()) {

        Image(
            painter = painterResource(team.factionRulesBackgroundRes),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // Optional readability wash
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White.copy(alpha = 0.15f))
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            TextButton(onClick = onBack) {
                Text("← Back", color = Color.Black)
            }

            Text(
                text = "FACTION RULES",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            rules.forEach { rule ->
                FactionRuleCard(rule)
            }
        }
    }
}