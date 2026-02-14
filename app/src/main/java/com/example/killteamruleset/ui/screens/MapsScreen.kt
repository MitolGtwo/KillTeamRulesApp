package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
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
import com.example.killteamruleset.ui.components.FullscreenMapOverlay
import com.example.killteamruleset.ui.components.MapsCategorySection
import com.example.killteamruleset.ui.model.GameMap
import com.example.killteamruleset.ui.model.MapCategory

@Composable
fun MapsScreen(
    onBack: () -> Unit
) {
    var expandedCategory by remember { mutableStateOf<MapCategory?>(null) }
    var expandedMap by remember { mutableStateOf<GameMap?>(null) }

    Box(modifier = Modifier.fillMaxSize()) {

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .navigationBarsPadding(),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            // 🔙 BACK BUTTON
            item {
                TextButton(onClick = onBack) {
                    Text("← Back")
                }
            }

            // 🔥 VOLKUS
            item {
                MapsCategorySection(
                    title = "Volkus",
                    category = MapCategory.VOLKUS,
                    expandedCategory = expandedCategory,
                    onHeaderClick = {
                        expandedCategory =
                            if (expandedCategory == MapCategory.VOLKUS) null
                            else MapCategory.VOLKUS
                    },
                    onMapClick = { expandedMap = it }
                )
            }

            // 🌑 INTO THE DARK
            item {
                MapsCategorySection(
                    title = "Into the Dark",
                    category = MapCategory.INTO_THE_DARK,
                    expandedCategory = expandedCategory,
                    onHeaderClick = {
                        expandedCategory =
                            if (expandedCategory == MapCategory.INTO_THE_DARK) null
                            else MapCategory.INTO_THE_DARK
                    },
                    onMapClick = { expandedMap = it }
                )
            }

            // ☠️ TOMB WORLD
            item {
                MapsCategorySection(
                    title = "Tomb World",
                    category = MapCategory.TOMB_WORLD,
                    expandedCategory = expandedCategory,
                    onHeaderClick = {
                        expandedCategory =
                            if (expandedCategory == MapCategory.TOMB_WORLD) null
                            else MapCategory.TOMB_WORLD
                    },
                    onMapClick = { expandedMap = it }
                )
            }
        }

        // 🖼 FULLSCREEN MAP OVERLAY (on top of everything)
        expandedMap?.let { map ->
            FullscreenMapOverlay(
                map = map,
                onDismiss = { expandedMap = null }
            )
        }
    }
}