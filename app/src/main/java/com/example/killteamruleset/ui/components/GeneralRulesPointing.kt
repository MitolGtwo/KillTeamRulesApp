package com.example.killteamruleset.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.R

@Composable
fun GeneralRulesPointing() {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .navigationBarsPadding()
    ) {

        Text(
            text = "THE BIG 3",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        RulesImage(
            R.drawable.battleflow_pointing
        )

        GeneralRulesBullet("In KillTeam there are 3 ways to get Victory points")
        GeneralRulesBullet("CritOp")
        GeneralRulesBullet("TacOp")
        GeneralRulesBullet("KillOp")

        GeneralRulesBullet("Every Op has a top of 6 Victory points")
        GeneralRulesBullet("CritOps and TacOps may vary base on the specific mission")

        Text(
            text = "KILLOP",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )
        RulesImage(
            R.drawable.battleflow_kill_grade
        )

        GeneralRulesBullet("The kill op is base on the amount of Enemy Operatives you incapacitate" +
                " during the game, this is usually scored at the end of the game, the points are based on" +
                " the number of Operatives the enemy kill team has")

        GeneralRulesBullet("In other words, if the enemy has a kill team with a big number of Operatives," +
                " you will have to incapacitate more to score points")

        GeneralRulesBullet("The player who wins more points from the KillOp, gets an additional Victory point," +
                " in case of a tie, no player receives the extra point")


        Text(
            text = "THE PRIMARY OP",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet("At the start of the game, each player secretly chooses a " +
                "Primary Op, this in short, is what you decide will be your main OP to score" +
                "during the game (TacOp, KillOp, CritOp)")

        GeneralRulesBullet("At the end of the battle, both players reveal their Primary Op")

        GeneralRulesBullet("Take the OP you selected, divide it by 2 rounding up, and add that" +
                " amount to the current Victory point you have from that OP")

        GeneralRulesBullet("Example: If your primary Op was the TacOp, and by the end of game" +
                " you score 4 Victory points, after doing the calculation, you will have 6 Victory points of TacOps")






    }


}
