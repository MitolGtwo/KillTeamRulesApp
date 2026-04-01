package com.example.killteamruleset.ui.screens

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.killteamruleset.state.BattleRepository
import com.example.killteamruleset.ui.theme.CardColor


@Composable
fun BattleSummaryScreen(
    navController: NavHostController,
    playerPrimaryBonus: Int,
    opponentPrimaryBonus: Int,

    mapType: String,
    mapNumber: Int,
    critOpNumber: Int,
    critOpName: String,

    playerName: String,
    opponentName: String,
    playerTeamName: String,
    opponentTeamName: String,

    playerVP: Int,
    opponentVP: Int,
    playerTeamIcon: Int,
    opponentTeamIcon: Int,

    // 🔥 ADD THESE
    playerCrit: Int,
    playerTac: Int,
    playerKill: Int,

    opponentCrit: Int,
    opponentTac: Int,
    opponentKill: Int,

    playerTacOpName: String?,
    opponentTacOpName: String?,

    playerPrimaryOp: String?,
    opponentPrimaryOp: String?,

    ) {



    val context = LocalContext.current

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
            .navigationBarsPadding()
            .verticalScroll(rememberScrollState()) // 🔥 THIS LINE
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top // 🔥 IMPORTANT
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

            SummarySide(
                name = playerName,
                teamName = playerTeamName,
                vp = playerVP,
                icon = playerTeamIcon,
                isWinner = playerVP > opponentVP
            )

            Text(
                text = "VS",
                color = Color.Gray,
                fontSize = 18.sp,
                modifier = Modifier.padding(horizontal = 12.dp)
            )

            SummarySide(
                name = opponentName,
                teamName = opponentTeamName,
                vp = opponentVP,
                icon = opponentTeamIcon,
                isWinner = opponentVP > playerVP
            )
        }

        // 🔥 THIS WAS WRONG BEFORE — NOW CORRECT POSITION
        BattleInfoSection(
            mapType = mapType,
            mapNumber = mapNumber,
            critOpNumber = critOpNumber,
            critOpName = critOpName
        )


        Spacer(modifier = Modifier.height(32.dp))

        Column(
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(
                text = "BATTLE REPORT",
                color = Color.LightGray,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            // 🧍 PLAYER CARD
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(CardColor, shape = RoundedCornerShape(12.dp))
                    .border(1.dp, Color(0x33FFFFFF), RoundedCornerShape(12.dp))
                    .padding(16.dp)
            ) {
                PlayerReportSection(
                    name = playerName,
                    crit = playerCrit,
                    kill = playerKill,
                    tac = playerTac,
                    tacOp = playerTacOpName,
                    primaryOp = playerPrimaryOp,

                    primaryBonus = playerPrimaryBonus

                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            // 👤 OPPONENT CARD
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(CardColor, shape = RoundedCornerShape(12.dp))
                    .border(1.dp, Color(0x33FFFFFF), RoundedCornerShape(12.dp))
                    .padding(16.dp)
            ) {
                PlayerReportSection(
                    name = opponentName,
                    crit = opponentCrit,
                    kill = opponentKill,
                    tac = opponentTac,
                    tacOp = opponentTacOpName,
                    primaryOp = opponentPrimaryOp,
                    primaryBonus = opponentPrimaryBonus

                )
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp)
        ) {
            androidx.compose.material3.Button(
                onClick = {
                    BattleRepository.finishBattle(context)

                    navController.navigate("main") {
                        popUpTo("main") { inclusive = true }
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                shape = RoundedCornerShape(12.dp)
            ) {
                Text(
                    text = "RETURN TO BASE",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 1.sp
                )
            }
        }

    }
}

@Composable
fun SummarySide(
    name: String,
    teamName: String,
    vp: Int,
    icon: Int,
    isWinner: Boolean
) {

    val scale by animateFloatAsState(
        targetValue = if (isWinner) 1.05f else 1f,
        label = ""
    )

    val alpha = if (isWinner) 1f else 0.6f

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .graphicsLayer(scaleX = scale, scaleY = scale)
            .alpha(alpha)
            .border(
                width = if (isWinner) 2.dp else 0.dp,
                color = Color(0xFFFF6A00),
                shape = RoundedCornerShape(12.dp)
            )
            .padding(12.dp)
    ) {

        // 🔥 PLAYER NAME
        Text(
            text = name.uppercase(),
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 1.sp
        )

        Spacer(modifier = Modifier.height(12.dp))

        // 🔥 ICON
        Image(
            painter = painterResource(id = icon),
            contentDescription = null,
            modifier = Modifier.size(110.dp)
        )

        Spacer(modifier = Modifier.height(12.dp))

        // 🔥 TEAM NAME
        Text(
            text = teamName,
            color = if (isWinner) Color.White else Color.Gray,
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(12.dp))

        // 🔥 VP
        Text(
            text = "$vp VP",
            color = if (isWinner) Color(0xFFFF6A00) else Color.Gray,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun BattleInfoSection(
    mapType: String,
    mapNumber: Int,
    critOpNumber: Int,
    critOpName: String
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(6.dp),
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 24.dp)
    ) {

        Text(
            text = "${mapType.uppercase()} MAP $mapNumber",
            color = Color.LightGray,
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold
        )

        Text(
            text = "CRIT OP $critOpNumber – ${critOpName.uppercase()}",
            color = Color(0xFFFF6A00),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun PlayerReportSection(
    name: String,
    crit: Int,
    kill: Int,
    tacOp: String?,
    tac: Int,
    primaryOp: String?,
    primaryBonus: Int,
) {

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {

        // 🔥 NAME (STRONG HEADER)
        Text(
            text = name.uppercase(),
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 1.sp
        )

        Spacer(modifier = Modifier.height(12.dp))

        BreakdownRow("Crit Op", crit.toString())
        BreakdownRow("Kill Op", kill.toString())
        BreakdownRow("Tac Points", tac.toString())

        BreakdownRow(
            "Tac Op",
            tacOp ?: "None",
            isLongText = true
        )

        Spacer(modifier = Modifier.height(12.dp))

        // 🔥 PRIMARY SECTION LABEL
        Text(
            text = "PRIMARY",
            color = Color(0xFFFF6A00),
            fontSize = 11.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 1.sp
        )

        Spacer(modifier = Modifier.height(6.dp))

        val displayPrimary = if (primaryBonus > 0) {
            "${primaryOp ?: "None"} (+$primaryBonus)"
        } else {
            primaryOp ?: "None"
        }

        BreakdownRow(
            "Primary Op",
            displayPrimary,
            highlight = true
        )
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
            color = Color(0xFFD0D0D0),
            fontSize = 11.sp,
            letterSpacing = 1.sp,
            modifier = Modifier.shadow(2.dp)
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