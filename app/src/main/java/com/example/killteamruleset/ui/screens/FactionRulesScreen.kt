package com.example.killteamruleset.ui.screens

import com.example.killteamruleset.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import com.example.killteamruleset.ui.components.TeamBottomBar
import com.example.killteamruleset.ui.data.FactionRuleRepository
import com.example.killteamruleset.ui.data.TeamRepository

import com.example.killteamruleset.ui.model.TeamScreen

@Composable
fun FactionRulesScreen(
    teamId: String,
    onBack: () -> Unit,
    onNavigate: (TeamScreen) -> Unit
) {
    val team = TeamRepository.getTeamById(teamId) ?: return
    val rules = FactionRuleRepository.getForTeam(teamId).orEmpty()


    Scaffold(
        bottomBar = {
            TeamBottomBar(
                currentScreen = TeamScreen.RULES,
                onNavigate = onNavigate,
                teamIconRes = team.iconRes
            )
        }
    ) { padding ->

        val backgroundRes = team.factionRulesBackgroundRes ?: R.drawable.default_bg

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding) // ✅ ONLY HERE
                .statusBarsPadding()
        ) {

            // 🔥 Background
            Image(
                painter = painterResource(backgroundRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            // 🔥 Overlay
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.White.copy(alpha = 0.15f))
            )

            // 🔥 Content
            Column(
                modifier = Modifier
                    .fillMaxSize()
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
    }



