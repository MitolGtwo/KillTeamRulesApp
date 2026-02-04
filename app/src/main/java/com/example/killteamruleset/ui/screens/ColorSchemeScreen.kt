package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.components.ColorSchemeCard
import com.example.killteamruleset.ui.components.FullscreenImageViewer
import com.example.killteamruleset.ui.components.KillTeamBackground
import com.example.killteamruleset.ui.data.ColorSchemeRepository

@Composable
fun ColorSchemesScreen(
    teamId: String,
    onBack: () -> Unit
) {
    val schemes = ColorSchemeRepository.getForTeam(teamId)

    KillTeamBackground {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            TextButton(onClick = onBack) {
                Text("← Back")
            }

            schemes.forEach { scheme ->
                Image(
                    painter = painterResource(scheme.imageRes),
                    contentDescription = scheme.id,
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(min = 220.dp)
                )
            }
        }


    }


    // 🔥 FULLSCREEN IMAGE VIEWER
   /* selectedImage?.let { res ->
        FullscreenImageViewer(
            imageRes = res,
            onDismiss = { selectedImage = null }
        )
    }
    */

}