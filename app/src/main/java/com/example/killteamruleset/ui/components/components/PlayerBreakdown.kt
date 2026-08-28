package com.example.killteamruleset.ui.components.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
    primaryOp: String?,

    primaryBase: Int,
    primaryBonus: Int,
    primaryTotal: Int
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        BreakdownRow("CRIT OP", crit.toString())

        BreakdownRow("KILL OP", kill.toString())

        // 🔥 MOVED HERE (AFTER KILL)
        BreakdownRow("TAC OP", tacOp ?: "None")

        BreakdownRow("TAC POINTS", tac.toString())

        BreakdownRow(
            "PRIMARY",
            primaryOp ?: "None",
            highlight = true
        )

        // 🔥 BONUS BREAKDOWN (YOU ALREADY HAVE DATA 😤)

    }
}

@Composable
fun BreakdownRow(
    label: String,
    value: String,
    highlight: Boolean = false,
    isLongText: Boolean = false
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Text(
            text = label.uppercase(),
            color = Color(0xFFB0B0B0),
            fontSize = 11.sp,
            letterSpacing = 1.sp
        )

        Text(
            text = value.uppercase(),
            color = if (highlight) Color(0xFFFF6A00) else Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = if (highlight) 15.sp else 14.sp,
            maxLines = if (isLongText) 2 else 1
        )
    }
}
@Composable
fun BreakdownTripleRow(
    label: String,
    left: String,
    right: String,
    highlight: Boolean = false,
    isLongText: Boolean = false
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        // 🔹 LABEL
        Text(
            text = label,
            color = Color.Gray,
            fontSize = 12.sp,
            modifier = Modifier.weight(1f)
        )

        // 🔹 PLAYER
        Text(
            text = left,
            color = if (highlight) Color(0xFFFF6A00) else Color.White,
            fontSize = if (highlight) 14.sp else 13.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .weight(2f)
                .padding(end = 8.dp),
            maxLines = if (isLongText) 2 else 1
        )

        // 🔹 OPPONENT
        Text(
            text = right,
            color = if (highlight) Color(0xFFFF6A00) else Color.White,
            fontSize = if (highlight) 14.sp else 13.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.weight(2f),
            maxLines = if (isLongText) 2 else 1
        )
    }
}
