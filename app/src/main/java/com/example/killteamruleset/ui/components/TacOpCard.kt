package com.example.killteamruleset.ui.components

import android.R.id.title
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.example.killteamruleset.ui.model.Ability
import com.example.killteamruleset.ui.model.KeywordInfo
import com.example.killteamruleset.ui.model.TacOp
import com.example.killteamruleset.ui.model.bannerColor
import kotlin.collections.forEach


@Composable
fun TacOpCard(
    tacOp: TacOp,
    onKeywordClick: (KeywordInfo) -> Unit
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        )
    ) {
        Column {

            // 🔶 TITLE BANNER
            Surface(
                color = tacOp.archetype.bannerColor(),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = stringResource(tacOp.title).uppercase(),
                    modifier = Modifier.padding(vertical = 10.dp),
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    textAlign = TextAlign.Center
                )
            }

            Column(modifier = Modifier.padding(12.dp)) {

                // ── REVEAL ────────────────────────────
                Text(
                    text = "REVEAL",
                    fontWeight = FontWeight.Bold,
                    color = tacOp.archetype.bannerColor()
                )

                Spacer(Modifier.height(4.dp))

                AbilityDescriptionText(
                    text = stringResource(tacOp.reveal),
                    enableKeywords = false
                )

                // ── MISSION ACTION (OPTIONAL) ─────────
                tacOp.missionAction?.let { ability ->

                    Spacer(Modifier.height(16.dp))

                    Text(
                        text = "MISSION ACTION",
                        color = tacOp.archetype.bannerColor(),
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(Modifier.height(6.dp))

                    ability.title?.let {
                        Text(
                            text = it,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }

                    ability.usage?.let {
                        Text(
                            text = stringResource(it),
                            color = tacOp.archetype.bannerColor(),
                            style = MaterialTheme.typography.labelSmall
                        )
                    }

                    ability.description?.let {
                        AbilityDescriptionText(
                            text = stringResource(it),
                            enableKeywords = false,
                            backgroundColor = Color.White,
                            textColor = Color.Black
                        )
                    }
                }

                // ── ADDITIONAL RULES (OPTIONAL) ───────
                tacOp.additionalRules?.let {

                    Spacer(Modifier.height(16.dp))

                    Text(
                        text = "ADDITIONAL RULES",
                        fontWeight = FontWeight.Bold,
                        color = tacOp.archetype.bannerColor()
                    )

                    Spacer(Modifier.height(4.dp))

                    tacOp.additionalRules?.let {
                        AbilityDescriptionText(
                            text = stringResource(it),
                            enableKeywords = false
                        )
                    }

                    // ── VICTORY POINTS (ALWAYS) ───────────
                    Spacer(Modifier.height(16.dp))

                    Text(
                        text = "VICTORY POINTS",
                        fontWeight = FontWeight.Bold,
                        color = tacOp.archetype.bannerColor()
                    )

                    Spacer(Modifier.height(4.dp))

                    AbilityDescriptionText(
                        text = stringResource(tacOp.victoryPoints),
                        enableKeywords = false
                    )
                }
            }
        }
    }
}
