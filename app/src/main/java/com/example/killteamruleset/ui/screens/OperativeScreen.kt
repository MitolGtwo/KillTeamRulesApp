@file:JvmName("OperativeScreenKt")

package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.killteamruleset.ui.components.ExpandableCharacterCard
import com.example.killteamruleset.ui.components.KeywordPopup
import com.example.killteamruleset.ui.data.TeamRepository
import com.example.killteamruleset.ui.model.KeywordInfo
import com.example.killteamruleset.ui.model.Operative
import com.example.killteamruleset.ui.model.Team

@Composable
fun OperativeScreen(
    operatives: List<Operative>,
    onBack: () -> Unit
) {
    var selectedKeyword by remember { mutableStateOf<KeywordInfo?>(null) }

    Column(modifier = Modifier.fillMaxSize()) {
        TextButton(
            onClick = onBack,
            modifier = Modifier
                .padding(12.dp)
                .height(80.dp)
                .width(100.dp)
        ) {
            Text("← Back",
                color = Color.White,
                fontSize = 20.sp)

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

    // 🔥 POPUP LIVES HERE
    selectedKeyword?.let { keyword ->
        KeywordPopup(
            keyword = keyword,
            onDismiss = { selectedKeyword = null }
        )
    }
}
