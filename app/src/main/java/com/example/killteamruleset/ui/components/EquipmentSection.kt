package com.example.killteamruleset.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.model.Equipment
import com.example.killteamruleset.ui.model.KeywordInfo

@Composable
fun EquipmentSection(
    title: String,
    equipment: List<Equipment>,
    onKeywordClick: (KeywordInfo) -> Unit
) {
    var compressed by remember { mutableStateOf(true) }

    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {

        // 🔶 HEADER + COMPRESS TOGGLE
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )

            TextButton(onClick = { compressed = !compressed }) {
                Text(
                    text = if (compressed) "Expand" else "Compress",
                    color = MaterialTheme.colorScheme.primary
                )
            }
        }

        if (compressed) {
            EquipmentPager(
                equipment = equipment,
                onKeywordClick = onKeywordClick
            )
        } else {
            equipment.forEach { item ->
                EquipmentCard(equipment = item)
            }
        }
    }
}


@Composable
fun EquipmentPager(
    equipment: List<Equipment>,
    onKeywordClick: (KeywordInfo) -> Unit
) {
    val pagerState = rememberPagerState { equipment.size }

    HorizontalPager(
        state = pagerState,
    ) { page ->
        EquipmentCard(equipment = equipment[page])
    }
}