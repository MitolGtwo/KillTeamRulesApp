package com.example.killteamruleset.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.model.CritOp
import com.example.killteamruleset.ui.model.KeywordInfo
import com.example.killteamruleset.R

@Composable
fun CritOpCard(
    critOp: CritOp,
    onKeywordClick: (KeywordInfo) -> Unit
) {
    // 🔑 Resolve ALL string resources first
    val titleText = critOp.title?.let { stringResource(it) } ?: ""

    val missionActionLabel = stringResource(R.string.mission_action)
    val additionalRulesLabel = stringResource(R.string.additional_rules)
    val victoryPointsLabel = stringResource(R.string.victory_points)

    val additionalRulesText =
        critOp.additionalRules?.let { stringResource(it) }

    val victoryPointsText =
        stringResource(critOp.victoryPoints)

    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        )
    ) {
        Column {

            // 🔶 TITLE BANNER
            Surface(
                color = Color.Black,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = "CRIT OP ${critOp.number}: ${titleText.uppercase()}",
                    modifier = Modifier.padding(vertical = 10.dp),
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            }

            Column(modifier = Modifier.padding(12.dp)) {

                // ── MISSION ACTION ──
                if (critOp.missionActions.isNotEmpty()) {

                    Text(
                        text = stringResource(R.string.mission_action),
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFFF6A00)
                    )

                    Spacer(Modifier.height(6.dp))

                    critOp.missionActions.forEach { ability ->
                        AbilityCard(
                            ability = ability,
                            onKeywordClick = onKeywordClick
                        )

                        Spacer(Modifier.height(8.dp))
                    }
                }

                // ── ADDITIONAL RULES ──
                additionalRulesText?.let { rulesText ->

                    Spacer(Modifier.height(16.dp))

                    Text(
                        text = additionalRulesLabel,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFFF6A00)
                    )

                    Spacer(Modifier.height(4.dp))

                    AbilityDescriptionText(
                        text = rulesText,
                        enableKeywords = false
                    )
                }

                // ── VICTORY POINTS ──
                Spacer(Modifier.height(16.dp))

                Text(
                    text = victoryPointsLabel,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFF6A00)
                )

                Spacer(Modifier.height(4.dp))

                AbilityDescriptionText(
                    text = victoryPointsText,
                    enableKeywords = false
                )
            }
        }
    }
}