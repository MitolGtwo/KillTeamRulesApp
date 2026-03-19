package com.example.killteamruleset.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.R
@Composable
fun MainDashboard() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        SectionBox(
            title = stringResource(R.string.team_mastery),
            modifier = Modifier.height(140.dp)
        )

        SectionBox(
            title = stringResource(R.string.battle_history),
            modifier = Modifier.weight(1f)
        )
    }
}
@Composable
fun SectionBox(
    title: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(Color(0xFFEDEDED))
    ) {

        // 🔶 HEADER
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(40.dp)
                .background(Color.Black),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = title, // ✅ FIXED
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }

        // 📦 CONTENT
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = stringResource(R.string.content_coming),
                color = Color.DarkGray
            )
        }
    }
}

