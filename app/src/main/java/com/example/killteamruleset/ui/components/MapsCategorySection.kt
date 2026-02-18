package com.example.killteamruleset.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.data.MapCategoryReference
import com.example.killteamruleset.ui.data.MapsRepository
import com.example.killteamruleset.ui.model.GameMap
import com.example.killteamruleset.ui.model.MapCategory

@Composable
fun MapsCategorySection(
    title: String,
    category: MapCategory,
    expandedCategory: MapCategory?,
    onHeaderClick: () -> Unit,
    onMapClick: (GameMap) -> Unit
) {
    val isExpanded = expandedCategory == category

    val maps = MapsRepository.byCategory(category)
        .filter { it.randomizable }

    Column {

        // HEADER
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { onHeaderClick() }
        ) {
            Text(
                text = title.uppercase(),
                modifier = Modifier.padding(16.dp),
                fontWeight = FontWeight.Bold
            )
        }

        AnimatedVisibility(visible = isExpanded) {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.padding(top = 8.dp)
            ) {

                // 👇 TERRAIN IMAGE HERE
                MapCategoryReference(category)

                // 👇 MAP LIST
                maps.forEach { map ->
                    MapCard(
                        map = map,
                        onClick = { onMapClick(map) }
                    )
                }
            }
        }
    }
}