package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.killteamruleset.ui.components.KillTeamBackground
import com.example.killteamruleset.ui.data.TeamRepository
import com.example.killteamruleset.ui.components.PdfPagerViewer


@Composable
fun AssemblyGuideScreen(
    teamId: String,
    onBack: () -> Unit
) {
    val team = TeamRepository.getTeamById(teamId)

    KillTeamBackground {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .statusBarsPadding()
        ) {

            TextButton(onClick = onBack) {
                Text("← Back")
            }

            PdfPagerViewer(
                assetPath = team.assemblyPdfAsset,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}