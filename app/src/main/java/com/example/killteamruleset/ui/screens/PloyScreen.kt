package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.data.PloyRepository
import com.example.killteamruleset.ui.components.KillTeamBackground
import com.example.killteamruleset.ui.components.RichText
import com.example.killteamruleset.ui.model.Ploy
import com.example.killteamruleset.ui.model.PloyType

@Composable
fun PloysScreen(
    teamId: String,
    onBack: () -> Unit
) {
    val ploys = PloyRepository.getForTeam(teamId)

    val strategy = ploys.filter { it.type == PloyType.STRATEGY }
    val firefight = ploys.filter { it.type == PloyType.FIREFIGHT }

    KillTeamBackground {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .navigationBarsPadding()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {

            TextButton(onClick = onBack) { Text("← Back") }

            Text(
                text = "PLOYS",
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.Bold
            )

            PloySection(
                title = "STRATEGY PLOYS",
                ploys = strategy,
                titleColor = Color(0xFFFF6A00)
            )

            PloySection(
                title = "FIREFIGHT PLOYS",
                ploys = firefight,
                titleColor = Color(0xFFFF6A00)
            )
        }
    }
}

@Composable
fun PloySection(
    title: String,
    ploys: List<Ploy>,
    titleColor: Color = MaterialTheme.colorScheme.onSurface
) {
    var compressed by remember { mutableStateOf(true) }

    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = title,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.titleMedium,
                color = titleColor
            )

            Text(
                text = if (compressed) "Expand" else "Compress",
                modifier = Modifier.clickable { compressed = !compressed },
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.primary
            )
        }

        if (compressed) {
            HorizontalPager(
                state = rememberPagerState { ploys.size }
            ) { page ->
                PloyCard(ploys[page])
            }
        } else {
            ploys.forEach { ploy ->
                PloyCard(ploy)
            }
        }
    }
}

@Composable
fun PloyCard(ploy: Ploy) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White.copy(alpha = 0.85f)
        )
    ) {
        Column(modifier = Modifier.padding(16.dp)) {

            // 🔶 TITLE
            Text(
                text = ploy.name,
                color = Color(0xFFFF6A00),
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.titleMedium
            )

            Divider(
                thickness = 2.dp,
                color = Color(0xFFFF6A00),
                modifier = Modifier.padding(vertical = 6.dp)
            )

            // 📜 LORE (OPTIONAL, GREY)
            ploy.lore?.let { loreRes ->
                Text(
                    text = stringResource(loreRes),
                    color = Color.DarkGray,
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(bottom = 12.dp)
                )
            }

            // ⚔️ RULE TEXT
            RichText(
                text = stringResource(ploy.description),
                color = Color.Black
            )
        }
    }
}