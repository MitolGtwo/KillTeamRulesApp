package com.example.killteamruleset.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.model.Equipment
@Composable
fun EquipmentExpandedContent(equipment: Equipment) {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {

        // 📜 EQUIPMENT DESCRIPTION
        Text(
            text = stringResource(equipment.description),
            style = MaterialTheme.typography.bodySmall
        )

        // ⚔️ EQUIPMENT ABILITIES
        if (equipment.abilities.isNotEmpty()) {
            Spacer(Modifier.height(12.dp))

            Text(
                text = "EQUIPMENT ABILITIES",
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.primary
            )

            Spacer(Modifier.height(6.dp))

            equipment.abilities.forEach { ability ->

                ability.title?.let {
                    Text(
                        text = it,
                        fontWeight = FontWeight.Bold
                    )
                }

                ability.usage?.let { usageRes ->
                    Text(
                        text = stringResource(usageRes),
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.primary
                    )
                }

                ability.description?.let { descriptionRes ->
                    AbilityDescriptionText(
                        text = stringResource(descriptionRes),
                        enableKeywords = true
                    )
                }

                Spacer(Modifier.height(8.dp))
            }
        }
    }
}