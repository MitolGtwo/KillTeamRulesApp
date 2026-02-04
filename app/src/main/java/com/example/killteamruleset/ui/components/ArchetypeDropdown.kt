package com.example.killteamruleset.ui.components

import android.R
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
import com.example.killteamruleset.ui.model.Archetypes
import com.example.killteamruleset.ui.theme.Black

@Composable
fun ArchetypeDropdown(
    selected: Archetypes?,
    onSelected: (Archetypes?) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        // ── DROPDOWN BOX ───────────────────────
        Surface(
            shape = RoundedCornerShape(10.dp),
            color = Color.White,
            border = BorderStroke(1.dp, Color(0xFFCCCCCC)),
            modifier = Modifier
                .fillMaxWidth()
                .clickable { expanded = true }
        ) {
            Row(
                modifier = Modifier
                    .padding(horizontal = 12.dp, vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = selected?.displayName ?: "All Archetypes",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Color.Black,
                    modifier = Modifier.weight(1f)
                )

                // ▼ small indicator
                Text(
                    text = "▼",
                    color = Color.DarkGray,
                    fontWeight = FontWeight.Bold
                )
            }
        }

        // ── MENU ───────────────────────────────
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.background(Color.White)
        ) {
            DropdownMenuItem(
                text = {
                    Text(
                        text = "All Archetypes",
                        color = Color.Black
                    )
                },
                onClick = {
                    onSelected(null)
                    expanded = false
                }
            )

            Archetypes.values().forEach { archetype ->
                DropdownMenuItem(
                    text = {
                        Text(
                            text = archetype.displayName,
                            color = Color.Black
                        )
                    },
                    onClick = {
                        onSelected(archetype)
                        expanded = false
                    }
                )
            }
        }
    }
}
