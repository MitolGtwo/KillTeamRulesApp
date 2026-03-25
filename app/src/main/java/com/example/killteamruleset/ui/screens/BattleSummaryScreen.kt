package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BattleSummaryScreen(
    playerVP: Int,
    opponentVP: Int,
    playerTeamIcon: Int,
    opponentTeamIcon: Int
) {

    val resultText = when {
        playerVP > opponentVP -> "VICTORY"
        playerVP < opponentVP -> "DEFEAT"
        else -> "TIE"
    }

    val resultColor = when (resultText) {
        "VICTORY" -> Color(0xFFFF6A00)
        "DEFEAT" -> Color.Red
        else -> Color.Gray
    }




    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        // 🔥 RESULT TEXT
        Text(
            text = resultText,
            color = resultColor,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(32.dp))

        // 🔥 TEAMS ROW
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {

            // PLAYER
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = playerTeamIcon),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text("$playerVP VP", color = Color.White)
            }

            Text(
                text = "VS",
                color = Color.Gray,
                fontSize = 18.sp
            )

            // OPPONENT
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Image(
                    painter = painterResource(id = opponentTeamIcon),
                    contentDescription = null,
                    modifier = Modifier.size(100.dp)
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text("$opponentVP VP", color = Color.White)
            }
        }
    }
}