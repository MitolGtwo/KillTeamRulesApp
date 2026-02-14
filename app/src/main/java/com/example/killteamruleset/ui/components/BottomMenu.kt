package com.example.killteamruleset.ui.components

import androidx.compose.material3.Surface
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Whatshot
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.R
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.res.painterResource

@Composable
fun BottomMenu(
    onResourcesClick: () -> Unit,
    onBattleClick: () -> Unit,
    onKillTeamsClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .navigationBarsPadding()
    ) {

        // 🔻 ACTUAL BOTTOM BAR
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(64.dp)
                .background(Color.Black)
                .navigationBarsPadding()
                .align(Alignment.BottomCenter),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            BottomTab(
                text = "Resources",
                onClick = onResourcesClick
            )

            Spacer(modifier = Modifier.width(64.dp)) // 👈 space for diamond

            BottomTab(
                text = "Kill Teams",
                onClick = onKillTeamsClick
            )
        }

        // 🔶 CENTER DIAMOND (PART OF BAR)
        BattleDiamondButton(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = (-22).dp),
            onClick = onBattleClick
        )
    }
}

@Composable
fun BattleDiamondButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Box(
        modifier = modifier
            .size(72.dp)
            .rotate(45f)
            .background(
                color = Color.Black,
                shape = RoundedCornerShape(8.dp)
            )
            .border(
                width = 2.dp,
                color = Color(0xFFFF6A00),
                shape = RoundedCornerShape(8.dp)
            )
            .clickable { onClick() },
        contentAlignment = Alignment.Center
    ) {

        // 🔸 ICON INSIDE (counter-rotated)
        Icon(
            painter = painterResource(R.drawable.cross_blades), // your vector
            contentDescription = "Battle",
            tint = Color(0xFFFF6A00),
            modifier = Modifier
                .size(28.dp)
                .rotate(-45f)
        )
    }
}

@Composable
fun BottomTab(
    text: String,
    onClick: () -> Unit
) {
    Text(
        text = text,
        color = Color.White,
        fontWeight = FontWeight.Medium,
        modifier = Modifier
            .padding(horizontal = 24.dp)
            .clickable { onClick() }
    )
}