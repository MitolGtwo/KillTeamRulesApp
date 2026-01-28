package com.example.killteamruleset.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.KeywordInfo

@Composable
fun AbilitiesSection(
    abilities: List<Ability>,
    onKeywordClick: (KeywordInfo) -> Unit
) {
    Column(modifier = Modifier.fillMaxWidth()) {

        Text(
            text = "Abilities",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold
        )

        Spacer(Modifier.height(8.dp))

        abilities.forEach { ability ->
            AbilityCard(
                ability = ability,
                onKeywordClick = onKeywordClick
            )
            Spacer(Modifier.height(8.dp))
        }
    }
}