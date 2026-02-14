package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.components.KeywordChip
import com.example.killteamruleset.ui.components.KeywordPopup
import com.example.killteamruleset.ui.components.KillTeamBackground
import com.example.killteamruleset.ui.data.KeywordRepository
import com.example.killteamruleset.ui.model.KeywordInfo

@Composable
fun KeywordsScreen(
    onBack: () -> Unit
) {
    KillTeamBackground{
    // All keywords, sorted alphabetically
    val keywords = remember {
        KeywordRepository.allKeywords
            .sortedBy { it.displayName }
    }

    var selectedKeyword by remember {
        mutableStateOf<KeywordInfo?>(null)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .navigationBarsPadding()
            .padding(16.dp)
    ) {

        // BACK
        Text(
            text = "← Back",
            modifier = Modifier
                .clickable { onBack() }
                .padding(bottom = 12.dp),
            color = MaterialTheme.colorScheme.primary
        )

        // HEADER
        Text(
            text = "KEYWORDS",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )

        Spacer(Modifier.height(12.dp))

        // GRID (3 per row)
        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            items(keywords) { keyword ->
                KeywordChip(
                    keyword = keyword,
                    onClick = { selectedKeyword = keyword }
                )
            }
        }

    }

    // POPUP
    selectedKeyword?.let {
        KeywordPopup(
            keyword = it,
            onDismiss = { selectedKeyword = null }
        )
    }
    }
}