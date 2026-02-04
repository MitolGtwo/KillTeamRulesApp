package com.example.killteamruleset.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.killteamruleset.ui.data.TeamRepository
import com.example.killteamruleset.ui.pdf.PdfViewer

@Composable
fun AssemblyGuideScreen(
    teamId: String,
    onBack: () -> Unit
) {
    val team = TeamRepository.getTeamById(teamId)

    KillTeamBackground {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            TextButton(onClick = onBack) {
                Text("← Back")
            }

            PdfViewer(
                "pdfs/wrecka_assembly.pdf",
                modifier = Modifier.weight(1f)
            )
        }
    }
}