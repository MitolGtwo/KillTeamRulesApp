package com.example.killteamruleset.ui.components.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.killteamruleset.R
import com.example.killteamruleset.state.BattleRepository
import com.example.killteamruleset.ui.data.ProfileRepository
import com.example.killteamruleset.ui.data.TeamRepository

@Composable
fun MainDashboard(navController: NavHostController) {

    val context = LocalContext.current

    val playerName by ProfileRepository
        .getNameFlow(context)
        .collectAsState(initial = "")

    val battleState by BattleRepository
        .loadCurrentBattle(context)
        .collectAsState(initial = null)

    val history by BattleRepository
        .loadHistory(context)
        .collectAsState(initial = emptyList())

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 12.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        // 🔷 TEAM MASTERY
        SectionBox(
            title = stringResource(R.string.team_mastery),
            modifier = Modifier.height(140.dp)
        )

        // 🔶 BATTLE HISTORY
        SectionBox(
            title = stringResource(R.string.battle_history),
            modifier = Modifier.weight(1f)
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {

                // 🟢 ONGOING BATTLE
                if (battleState != null) {

                    BattleHistoryCard(
                        playerName = if (playerName.isBlank()) "NO NAME" else playerName,
                        opponentName = battleState!!.opponentName,
                        playerIcon = TeamRepository
                            .getTeamById(battleState!!.playerTeamId)?.iconRes ?: 0,
                        opponentIcon = TeamRepository
                            .getTeamById(battleState!!.opponentTeamId)?.iconRes ?: 0,
                        onClick = {
                            navController.navigate("battleSetupStep3") // ✅ FIXED
                        }
                    )
                }

                // 🔽 HISTORY LIST
                history.forEach { battle ->

                    BattleHistoryCard(
                        playerName = battle.playerName,
                        opponentName = battle.opponentName,
                        playerIcon = TeamRepository
                            .getTeamById(battle.playerTeamId)?.iconRes ?: 0,
                        opponentIcon = TeamRepository
                            .getTeamById(battle.opponentTeamId)?.iconRes ?: 0,
                        onClick = {
                            // 🔥 NEXT STEP: open summary screen
                        }
                    )
                }

                // 💤 EMPTY STATE
                if (battleState == null && history.isEmpty()) {
                    Text(
                        text = "No battles yet",
                        color = Color.DarkGray
                    )
                }
            }
        }
    }
}
@Composable
fun SectionBox(
    title: String,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit = {
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
                text = title,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }

        // 📦 CONTENT (NOW DYNAMIC)
        content()
    }
}

