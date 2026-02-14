package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.components.CritOpCard
import com.example.killteamruleset.ui.components.MapCard
import com.example.killteamruleset.ui.components.RandomizerToggle
import com.example.killteamruleset.ui.data.CritOpsRepository
import com.example.killteamruleset.ui.data.MapsRepository
import com.example.killteamruleset.ui.model.CritOp
import com.example.killteamruleset.ui.model.GameMap
import com.example.killteamruleset.ui.model.MapCategory
import com.example.killteamruleset.ui.model.RandomizerCategory

@Composable
fun MapsCritOpsScreen(
    onMapsClick: () -> Unit,
    onCritOpsClick: () -> Unit
) {
    var selectedCategory by remember { mutableStateOf<MapCategory?>(null) }
    var randomizedMap by remember { mutableStateOf<GameMap?>(null) }
    var randomizedCritOp by remember { mutableStateOf<CritOp?>(null) }

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .navigationBarsPadding(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        item {
            Text(
                text = "MAPS & CRIT OPS",
                style = MaterialTheme.typography.titleLarge,
                fontWeight = FontWeight.Bold
            )
        }

        // ── MAPS ─────────────────
        item {
            ActionCard(
                title = "Maps",
                onClick = onMapsClick
            )
        }

        // ── CRIT OPS ─────────────
        item {
            ActionCard(
                title = "Crit Ops",
                onClick = onCritOpsClick
            )
        }

        // ── RANDOMIZER ───────────
        item {
            ActionCard(
                title = if (selectedCategory == null)
                    "SELECT A MAP SET"
                else
                    "RANDOMIZER",
                enabled = selectedCategory != null,
                highlightColor = Color(0xFFFF6A00),
                onClick = {
                    val maps = MapsRepository.byCategory(selectedCategory!!)
                    randomizedMap = maps.randomOrNull()
                    randomizedCritOp = CritOpsRepository.allCritOps.randomOrNull()
                }
            )
        }

        // ── CATEGORY TOGGLES ─────
        item {
            Text(
                text = "RANDOMIZER",
                fontWeight = FontWeight.Bold
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {

                RandomizerToggle(
                    label = "Volkus",
                    selected = selectedCategory == MapCategory.VOLKUS,
                    modifier = Modifier.weight(1f),
                    onClick = {
                        selectedCategory = MapCategory.VOLKUS
                        randomizedMap = null
                        randomizedCritOp = null
                    }
                )

                RandomizerToggle(
                    label = "ITD",
                    selected = selectedCategory == MapCategory.INTO_THE_DARK,
                    modifier = Modifier.weight(1f),
                    onClick = {
                        selectedCategory = MapCategory.INTO_THE_DARK
                        randomizedMap = null
                        randomizedCritOp = null
                    }
                )

                RandomizerToggle(
                    label = "Tomb World",
                    selected = selectedCategory == MapCategory.TOMB_WORLD,
                    modifier = Modifier.weight(1f),
                    onClick = {
                        selectedCategory = MapCategory.TOMB_WORLD
                        randomizedMap = null
                        randomizedCritOp = null
                    }
                )
            }
        }

        // ── RESULT OUTPUT ────────
        randomizedMap?.let { map ->
            item {
                MapCard(
                    map = map,
                    onClick = { /* fullscreen later */ }
                )
            }
        }

        randomizedCritOp?.let { critOp ->
            item {
                CritOpCard(
                    critOp = critOp,
                    onKeywordClick = {}
                )
            }
        }
    }
}
@Composable
fun ActionCard(
    title: String,
    enabled: Boolean = true,
    highlightColor: Color = Color.Black, // ✅ default
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .clickable(enabled = enabled) { onClick() },
        colors = CardDefaults.cardColors(
            containerColor = if (enabled)
                highlightColor
            else
                Color(0xFF2B2B2B)
        )
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = title.uppercase(),
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
}