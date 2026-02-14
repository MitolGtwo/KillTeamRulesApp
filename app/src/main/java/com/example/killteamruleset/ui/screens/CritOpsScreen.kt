package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.components.CritOpCard
import com.example.killteamruleset.ui.data.CritOpsRepository
import com.example.killteamruleset.ui.model.KeywordInfo

@Composable
fun CritOpsScreen(
    onBack: () -> Unit,
    onKeywordClick: (KeywordInfo) -> Unit
) {
    val critOps = CritOpsRepository.allCritOps

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        TextButton(onClick = onBack) {
            Text("← Back")
        }

        Spacer(Modifier.height(8.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(critOps) { critOp ->
                CritOpCard(
                    critOp = critOp,
                    onKeywordClick = onKeywordClick
                )
            }
        }
    }
}