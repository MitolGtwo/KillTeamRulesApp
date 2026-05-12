package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.killteamruleset.ui.components.EquipmentSection
import com.example.killteamruleset.ui.components.KeywordPopup
import com.example.killteamruleset.ui.components.KillTeamBackground
import com.example.killteamruleset.ui.components.TeamBottomBar
import com.example.killteamruleset.ui.data.EquipmentRepository
import com.example.killteamruleset.ui.data.TeamRepository
import com.example.killteamruleset.ui.data.UniversalEquipmentRepository
import com.example.killteamruleset.ui.model.KeywordInfo
import com.example.killteamruleset.ui.model.TeamScreen

@Composable
fun EquipmentScreen(
    teamId: String,
    onBack: () -> Unit,
    onNavigate: (TeamScreen) -> Unit
) {
    val team = TeamRepository.getTeamById(teamId)
    val factionEquipment = EquipmentRepository.getForTeam(teamId)
    val universalEquipment = UniversalEquipmentRepository.getAll()

    var selectedKeyword by remember { mutableStateOf<KeywordInfo?>(null) }

    Scaffold(
        bottomBar = {
            TeamBottomBar(
                currentScreen = TeamScreen.EQUIPMENT,
                onNavigate = onNavigate,
                teamIconRes = team.iconRes
            )
        }
    ) { padding ->

    KillTeamBackground {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding) // ✅ THIS IS THE FIX
                .statusBarsPadding()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {

            TextButton(
                onClick = onBack,
                modifier = Modifier
                    .padding(12.dp)
                    .height(80.dp)
                    .width(100.dp)
            ) {
                Text("← Back",
                    color = Color.White,
                    fontSize = 20.sp)

            }

            Text(
                text = team.name.uppercase(),
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )

            EquipmentSection(
                title = "FACTION EQUIPMENT",
                equipment = factionEquipment,
                onKeywordClick = { selectedKeyword = it },
                titleColor = Color(0xFFFF6A00),
            )

            EquipmentSection(
                title = "UNIVERSAL EQUIPMENT",
                equipment = universalEquipment,
                onKeywordClick = { selectedKeyword = it },
                titleColor = Color(0xFFFF6A00),
            )
        }
    }

    // 🔥 KEYWORD POPUP (shared)
    selectedKeyword?.let {
        KeywordPopup(
            keyword = it,
            onDismiss = { selectedKeyword = null }
        )
    }
}
}
