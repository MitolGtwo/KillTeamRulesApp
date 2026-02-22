package com.example.killteamruleset.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.model.FactionRule
import com.example.killteamruleset.ui.model.KeywordInfo

@Composable
fun FactionRuleCard(rule: FactionRule) {
    var selectedKeyword by remember {
        mutableStateOf<KeywordInfo?>(null)
    }


    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White.copy(alpha = 0.50f)
        )
    ) {
        Column(modifier = Modifier.padding(16.dp)) {

            // 🔶 TITLE
            rule.title?.let {
                Text(
                    text = it,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFF6A00)
                )
            }


            Divider(
                modifier = Modifier.padding(vertical = 6.dp),
                color = Color(0xFFFF6A00),
                thickness = 2.dp
            )

            // 📜 LORE
            rule.lore?.let { loreRes ->
                Text(
                    text = stringResource(loreRes),
                    color = Color.DarkGray,
                    style = MaterialTheme.typography.bodySmall,
                    modifier = Modifier.padding(bottom = 12.dp)
                )
            }

            // ⚔️ RULE TEXT
            rule.ruleText?.let { ruleTextRes ->
                RichText(
                    text = stringResource(ruleTextRes),
                    color = Color.Black
                )
            }

            // 🖼️ IMAGE
            rule.imageRes?.let { resId ->
                Spacer(Modifier.height(16.dp))

                Image(
                    painter = painterResource(resId),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 260.dp)
                        .clip(RoundedCornerShape(8.dp))
                )
            }


            // 🔫 WEAPON PROFILES (THIS WAS MISSING)
            if (rule.weapons.isNotEmpty()) {
                Spacer(Modifier.height(16.dp))

                Text(
                    text = "WEAPON PROFILES",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                Spacer(Modifier.height(8.dp))

                rule.weapons.forEach { weapon ->
                    WeaponRow(
                        weapon = weapon,
                        forceBlackText = true,
                        onKeywordClick = { selectedKeyword = it }
                    )

                    Spacer(Modifier.height(8.dp))
                }
            }
        }
    }

    // 🧠 KEYWORD POPUP
    selectedKeyword?.let {
        KeywordPopup(
            keyword = it,
            onDismiss = { selectedKeyword = null }
        )
    }
}

