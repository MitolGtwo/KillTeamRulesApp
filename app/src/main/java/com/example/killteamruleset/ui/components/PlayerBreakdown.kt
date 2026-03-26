package com.example.killteamruleset.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PlayerBreakdown(
    crit: Int,
    tac: Int,
    kill: Int,
    tacOp: String?,
    primaryOp: String?
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        BreakdownRow("CRIT", crit.toString())
        BreakdownRow("KILL", kill.toString())
        BreakdownRow("TAC OP", tacOp ?: "None")
        BreakdownRow("TAC", tac.toString())

        BreakdownRow(
            "PRIMARY",
            primaryOp ?: "None",
            highlight = true
        )
    }
}

@Composable
fun BreakdownRow(
    label: String,
    value: String,
    highlight: Boolean = false
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Text(
            text = label,
            color = Color.Gray,
            fontSize = 12.sp
        )

        Text(
            text = value,
            color = if (highlight) Color(0xFFFF6A00) else Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 13.sp
        )
    }
}