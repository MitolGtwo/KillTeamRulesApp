package com.example.killteamruleset.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.model.Equipment

@Composable
fun EquipmentExpandedContent(equipment: Equipment) {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {

        Text(
            text = equipment.description,
            style = MaterialTheme.typography.bodySmall
        )

        equipment.ability?.let { ability ->
            Spacer(Modifier.height(12.dp))

            Text(
                text = "EQUIPMENT ABILITY",
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )

            Spacer(Modifier.height(4.dp))

            ability.title?.let {
                Text(
                    text = it,
                    fontWeight = FontWeight.Bold
                )
            }

            ability.usage?.let {
                Text(
                    text = it,
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.primary
                )
            }

            ability.description?.let {
                AbilityDescriptionText(
                    text = it,
                    enableKeywords = true
                )
            }
        }
    }
}