package com.example.killteamruleset.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.model.KeywordInfo
import com.example.killteamruleset.ui.model.TacOp
import com.example.killteamruleset.ui.theme.Black

@Composable
fun TacOpsSection(
    tacOps: List<TacOp>,
    onKeywordClick: (KeywordInfo) -> Unit = {}
) {
    Column {

        Text(
            text = "Tac Ops",
            style = MaterialTheme.typography.titleMedium,
            color = Black,
            fontWeight = FontWeight.Bold
        )

        Spacer(Modifier.height(8.dp))

        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
            tacOps.forEach { tacOp ->
                TacOpCard(
                    tacOp = tacOp,
                    onKeywordClick = onKeywordClick
                )
            }
        }
    }
}