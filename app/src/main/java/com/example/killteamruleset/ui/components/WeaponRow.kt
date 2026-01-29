package com.example.killteamruleset.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.model.KeywordInfo
import com.example.killteamruleset.ui.model.WeaponProfile


@Composable
fun WeaponRow(
    weapon: WeaponProfile,
    onKeywordClick: (KeywordInfo) -> Unit
) {
    Column {

        // ─── NAME + STATS ─────────────────────
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = weapon.name,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(1f)
            )

            Row(horizontalArrangement = Arrangement.spacedBy(20.dp)) {
                Text(
                    text = weapon.attacks.toString(),
                    fontWeight = FontWeight.Bold
                )
                Text(weapon.hit)
                Text(weapon.damage)
            }
        }

        // ─── KEYWORDS ─────────────────────────
        FlowRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp),
            modifier = Modifier.padding(top = 4.dp)
        ) {
            weapon.keywords.forEach { keyword ->
                Text(
                    text = keyword.displayName,
                    style = MaterialTheme.typography.bodySmall.copy(
                        textDecoration = TextDecoration.Underline
                    ),
                    modifier = Modifier.clickable {
                        onKeywordClick(keyword)
                    }
                )
            }
        }

        Spacer(Modifier.height(8.dp))

        // ─── SEPARATOR ────────────────────────
        Divider(
            thickness = 2.dp,
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.6f)
        )
    }
}

@Composable
private fun StatCell(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .width(40.dp),
        textAlign = androidx.compose.ui.text.style.TextAlign.Center,
        style = MaterialTheme.typography.bodyMedium
    )
}

