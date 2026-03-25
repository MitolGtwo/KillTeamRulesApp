package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.state.BattleRepository
import com.example.killteamruleset.state.BattleUIState
import com.example.killteamruleset.state.BattleUIState.opponentName
import com.example.killteamruleset.state.BattleUIState.opponentTeam
import com.example.killteamruleset.state.BattleUIState.playerTeam
import com.example.killteamruleset.ui.components.KillTeamBackground
import com.example.killteamruleset.ui.data.ProfileRepository
import com.example.killteamruleset.ui.model.BattleState

@Composable
fun BattleTrackerScreen(
    onSelectTeam: (Boolean) -> Unit,
    onNext: () -> Unit // 👈 ADD THIS
) {

    val context = LocalContext.current

    val playerName by ProfileRepository
        .getNameFlow(context)
        .collectAsState(initial = "")

    var opponentName by BattleUIState.opponentName
    var playerTeam by BattleUIState.playerTeam
    var opponentTeam by BattleUIState.opponentTeam

// ✅ NOW it works
    val isValid = playerTeam != null &&
            opponentTeam != null &&
            opponentName.isNotBlank()

    LaunchedEffect(playerTeam, opponentTeam, opponentName) {
        BattleRepository.saveState(
            context,
            BattleState(
                playerTeamId = playerTeam?.id ?: "",
                opponentTeamId = opponentTeam?.id ?: "",
                opponentName = opponentName
            )
        )
    }

    KillTeamBackground {
        Box(
            modifier = Modifier.fillMaxSize()
        ) {

            // 🔥 MAIN CONTENT
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .statusBarsPadding(),
                verticalArrangement = Arrangement.spacedBy(20.dp)
            ) {

                // 🔥 YOU
                BattleBlock(
                    title = playerName.ifEmpty { "YOU" },
                    subtitle = playerTeam?.name ?: "Select faction",
                    onClick = { onSelectTeam(true) }
                )

                // ⚔️ OPPONENT NAME
                OutlinedTextField(
                    value = opponentName,
                    onValueChange = {
                        if (it.length <= 15) {
                            opponentName = it.replace("\n", "")
                        }
                    },
                    label = { Text("Opponent Name") },
                    singleLine = true, // ✅ prevents multiple lines
                    maxLines = 1,      // ✅ extra safety
                    modifier = Modifier.fillMaxWidth()
                )

                // 🔥 OPPONENT
                BattleBlock(
                    title = opponentName.ifEmpty { "Opponent" },
                    subtitle = opponentTeam?.name ?: "Select faction",
                    onClick = { onSelectTeam(false) }
                )
            }

            // ✅ FLOATING BUTTON (NOW VALID)
            Button(
                onClick = { onNext() },
                enabled = isValid,
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (isValid) Color(0xFFFF6A00) else Color.Gray
                ),
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(16.dp)
            ) {
                Text("NEXT")
            }
        }
    }
    }





@Composable
fun BattleBlock(
    title: String,
    subtitle: String,
    onClick: () -> Unit
) {


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(Color(0xFFEDEDED))
            .clickable { onClick() }
            .padding(16.dp)
    ) {

        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            color = Color.Black
        )

        Spacer(Modifier.height(8.dp))

        Text(
            text = subtitle,
            color = Color.DarkGray
        )
    }
}