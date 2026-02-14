package com.example.killteamruleset.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun BattleDiamond(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .size(90.dp)
            .rotate(45f)
            .background(
                color = Color.Black,
                shape = RoundedCornerShape(6.dp)
            )
            .border(
                width = 2.dp,
                color = Color(0xFFFF6A00),
                shape = RoundedCornerShape(6.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "BATTLE",
            color = Color.White,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.rotate(-45f)
        )
    }
}