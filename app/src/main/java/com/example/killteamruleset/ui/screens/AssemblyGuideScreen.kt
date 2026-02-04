package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import com.example.killteamruleset.ui.components.KillTeamBackground
import com.example.killteamruleset.ui.pdf.PdfViewer
import com.example.killteamruleset.ui.model.Team
import com.example.killteamruleset.ui.pdf.createPdfRecyclerView

@Composable
fun AssemblyGuideScreen(
    team: Team,
    onBack: () -> Unit
) {
    val context = LocalContext.current

    Column(modifier = Modifier.fillMaxSize()) {

        TextButton(onClick = onBack) {
            Text("← Back")
        }

        AndroidView(
            modifier = Modifier.fillMaxSize(),
            factory = {
                createPdfRecyclerView(
                    context = context,
                    assetPath = team.assemblyPdfAsset
                )
            }
        )
    }
}