package com.example.killteamruleset.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.R
import com.example.killteamruleset.ui.model.FactionRule

@Composable
fun FactionRuleCard(rule: FactionRule) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White.copy(alpha = 0.50f)
        )
    ) {
        Column(modifier = Modifier.padding(16.dp)) {

            // 🔶 TITLE
            Text(
                text = rule.title.uppercase(),
                color = Color(0xFFFF6A00),
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.titleMedium
            )

            Divider(
                modifier = Modifier.padding(vertical = 6.dp),
                color = Color(0xFFFF6A00),
                thickness = 2.dp
            )

            // 📜 LORE
            rule.lore?.let {
                Text(
                    text = it,
                    color = Color.DarkGray,
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(bottom = 12.dp)
                )
            }

            // ⚔️ RULE TEXT
            RichText(
                text = rule.ruleText,
                color = Color.Black
            )
            rule.imageRes?.let { resId ->
                Spacer(Modifier.height(16.dp))

                Image(
                    painter = painterResource(resId),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 260.dp) // 👈 KEY LINE (tweak this)
                        .clip(RoundedCornerShape(8.dp))
                )
            }
        }
    }
}