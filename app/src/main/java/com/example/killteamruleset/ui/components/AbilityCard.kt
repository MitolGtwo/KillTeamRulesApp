package com.example.killteamruleset.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.model.*

@Composable
fun AbilityCard(
    ability: Ability,
    onKeywordClick: (KeywordInfo) -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(modifier = Modifier.padding(12.dp)) {

            Text(
                text = ability.title,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = ability.usage,
                style = MaterialTheme.typography.labelSmall
            )

            Spacer(Modifier.height(6.dp))

            AbilityDescriptionText(
                text = ability.description,
                onKeywordClick = onKeywordClick
            )
        }
    }
}