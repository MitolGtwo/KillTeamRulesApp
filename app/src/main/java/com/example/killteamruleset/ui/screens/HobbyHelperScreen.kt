package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.components.GrimdarkActionButton
import com.example.killteamruleset.ui.components.KillTeamBackground
import com.example.killteamruleset.ui.components.TalentReferenceSlider
import com.example.killteamruleset.ui.data.TalentReferenceRepository

@Composable
fun HobbyHelperScreen(
    teamId: String,
    onBack: () -> Unit,
    onColorSchemesClick: () -> Unit,
    onAssemblyGuideClick: () -> Unit
) {
    KillTeamBackground {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {

            TextButton(onClick = onBack) {
                Text("← Back")
            }

            TalentReferenceSlider(
                talents = TalentReferenceRepository.getForTeam(teamId)
            )

            Divider()

            GrimdarkActionButton(
                text = "Color Schemes",
                onClick = onColorSchemesClick
            )

            GrimdarkActionButton(
                text = "Assembly Guide",
                onClick = onAssemblyGuideClick
            )
        }
    }
}

