package com.example.killteamruleset.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
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
fun EquipmentCard(
    equipment: Equipment
) {
    var selectedKeyword by remember {
        mutableStateOf<KeywordInfo?>(null)
    }

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White.copy(alpha = 0.85f)
        )
    ) {
        Column(modifier = Modifier.padding(16.dp)) {

            // 🔶 TITLE
            Text(
                text = equipment.name,
                fontWeight = FontWeight.Bold,
                color = Color(0xFFFF6A00),
                style = MaterialTheme.typography.titleMedium
            )

            Divider(
                modifier = Modifier.padding(vertical = 6.dp),
                color = Color(0xFFFF6A00),
                thickness = 2.dp
            )

            // 📜 DESCRIPTION
            RichText(
                text = equipment.description,
                color = Color.Black
            )

            // ⚔️ EQUIPMENT ACTION
            equipment.ability?.let { ability ->
                Spacer(Modifier.height(16.dp))

                Text(
                    text = "EQUIPMENT ACTION",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                Spacer(Modifier.height(6.dp))

                ability.description?.let { description ->
                    AbilityDescriptionText(
                        text = description,
                        enableKeywords = true,
                        backgroundColor = Color.White,
                        textColor = Color.Black
                    )
                }
            }

            // 🔫 WEAPON PROFILES
            if (equipment.weapons.isNotEmpty()) {
                Spacer(Modifier.height(16.dp))

                equipment.weapons.forEach { weapon ->
                    WeaponRow(
                        weapon = weapon,
                        forceBlackText = true, // 👈 equipment-only
                        onKeywordClick = { selectedKeyword = it }
                    )
                }
            }
        }
    }

    // 🔥 KEYWORD POPUP
    selectedKeyword?.let {
        KeywordPopup(
            keyword = it,
            onDismiss = { selectedKeyword = null }
        )
    }
}