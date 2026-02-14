package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import com.example.killteamruleset.ui.components.GeneralRulesBullet
import com.example.killteamruleset.ui.components.GeneralRulesContent
import com.example.killteamruleset.ui.components.GeneralRulesSection
import com.example.killteamruleset.ui.components.KillTeamBackground
import com.example.killteamruleset.ui.model.GeneralRulesPage

@Composable
fun GeneralRulesScreen(
    onBack: () -> Unit
) {
    var currentPage by remember {
        mutableStateOf(GeneralRulesPage.WHAT_YOU_NEED)
    }
    var menuExpanded by remember { mutableStateOf(false) }

    KillTeamBackground {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .navigationBarsPadding()
                .statusBarsPadding()
        ) {

            // ─── TOP BAR ───────────────────────
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Text(
                    text = "← Back",
                    modifier = Modifier.clickable { onBack() },
                    color = MaterialTheme.colorScheme.primary
                )

                Spacer(Modifier.weight(1f))

                // 🔘 MENU BUTTON
                Box {
                    IconButton(onClick = { menuExpanded = true }) {
                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = "General rules menu",
                            tint = Color.White
                        )
                    }

                    DropdownMenu(
                        expanded = menuExpanded,
                        onDismissRequest = { menuExpanded = false }
                    ) {
                        GeneralRulesPage.values().forEach { page ->
                            DropdownMenuItem(
                                text = { Text(page.title) },
                                onClick = {
                                    currentPage = page
                                    menuExpanded = false
                                }
                            )
                        }
                    }
                }
            }

            Divider()

            // ─── CONTENT ───────────────────────
            GeneralRulesContent(page = currentPage)
        }
    }
}