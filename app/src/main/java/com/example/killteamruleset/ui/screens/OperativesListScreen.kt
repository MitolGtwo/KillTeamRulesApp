package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.components.ExpandableCharacterCard
import com.example.killteamruleset.ui.components.KeywordPopup
import com.example.killteamruleset.ui.model.KeywordInfo
import com.example.killteamruleset.ui.model.Operative

@Composable
fun OperativesListScreen(
    operatives: List<Operative>,
    onBack: () -> Unit
) {
    var selectedKeyword by remember { mutableStateOf<KeywordInfo?>(null) }

    Column(modifier = Modifier
        .fillMaxSize()
        .navigationBarsPadding()
    )
    {
        TextButton(
            onClick = onBack,
            modifier = Modifier.padding(16.dp)
        ) {
            Text("← Back")
        }

        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(operatives) { operative ->
                ExpandableCharacterCard(
                    operative = operative,
                    onKeywordClick = { keyword ->
                        selectedKeyword = keyword
                    }
                )
            }
        }
    }

    // ✅ THIS must be inside the composable
    selectedKeyword?.let { keyword ->
        KeywordPopup(
            keyword = keyword,
            onDismiss = { selectedKeyword = null }
        )
    }
}