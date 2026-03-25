package com.example.killteamruleset.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InfoIcon(onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .size(22.dp)
            .background(Color(0xFF1A1A1A), RoundedCornerShape(50))
            .border(1.dp, Color(0xFFFF6A00), RoundedCornerShape(50))
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "i",
            color = Color(0xFFFF6A00),
            fontWeight = FontWeight.Bold,
            fontSize = 12.sp
        )
    }
}