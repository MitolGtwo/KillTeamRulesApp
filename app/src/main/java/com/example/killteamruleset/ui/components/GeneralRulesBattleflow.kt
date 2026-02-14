package com.example.killteamruleset.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.R

@Composable
fun GeneralRulesBattleflow() {
    Text(
        text = "BATTLEFLOW",
        style = MaterialTheme.typography.titleLarge,
        fontWeight = FontWeight.Bold,
        color = MaterialTheme.colorScheme.primary
    )

    Divider()

    BattleflowOverview() // reuse what you already wrote 💪
}

@Composable
fun BattleflowOverview() {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.fillMaxWidth()
    ) {

        BattleflowStep(
            number = 1,
            title = "Set Up Battle",
            bullets = listOf(
                "Select Kill Teams for the battle",
                "Select Killzone (Volkus, Tombworld, etc)",
                "Select Crit Op"
            )
        )

        BattleflowStep(
            number = 2,
            title = "Roll-Off",
            bullets = listOf(
                "Both players roll a die, the player with the higher result wins the initiative and" +
                " pick a side of the map",
                "The loser gains an Initiative Reroll card"
            )
        )

        BattleflowStep(
            number = 3,
            title = "Select Operatives",
            bullets = listOf(
                "Players simultaneously reveal their Operatives"
            )
        )

        BattleflowStep(
            number = 4,
            title = "Select Equipment",
            bullets = listOf(
                "Each player selects up to 4 equipment total and simultaneously reveals it."
            )
        )

        BattleflowStep(
            number = 5,
            title = "Gain Command Points",
            bullets = listOf(
                "Both players gain 2 Command Points"
            )
        )

        BattleflowStep(
            number = 6,
            title = "Select Tac Ops and Primary Op",
            bullets = listOf(
                "Secretly choose Tac Ops from the kill team archetype"
            )
        )

        BattleflowStep(
            number = 7,
            title = "Set Up Operatives",
            bullets = listOf(
                "Divide your team into 3 thirds",
                "Starting with the roll-off winner, Place the equipments in the killzone, alternating with your opponent",
                "Starting with the roll-off winner, Deploy one third at a time of your Operatives, alternating with your opponent",
                "All operatives must be wholly within your Drop Zone and with a Conceal order"
            )
        )

        BattleflowStep(
            number = 8,
            title = "Begin the Battle",
            bullets = listOf(
                "Start Turning Point 1",
                "Secretly choose Primary Op"
            )
        )

        BattleflowStep(
            number = 9,
            title = "End Battle and Determine Victory",
            bullets = emptyList()
        )


        Text(
            text = "Phases",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet("Every turn is composed of the following phases:")

        GeneralRulesBullet("Ready Step: Start of the round")

        GeneralRulesBullet("Strategy Phase: We resolve Strategy Gambits and Strategy Ploys")

        GeneralRulesBullet("Firefight Phase: We activate Operatives and resolve Firefight Ploys")

        Text(
            text = "Turn Initiative",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet("Every turn, both players roll off to decide who gets initiative, the" +
                " winner chooses who will start activating Operatives")

        GeneralRulesBullet("From the 2nd turning point, the players who starts activating wins" +
                " 1CP while the other player wins 2CP")

        GeneralRulesBullet("The player who lost the roll off wins the according Initiative card:")

        BattleflowStep(
            number = 0,
            title = "Initiative Cards",
            bullets = listOf(
                "Killzone roll Off = Re-roll card",
                "Initiative turning point 1 = 1 +/- card",
                "Initiative turning point 2 = 2 +/- card",
                "Initiative turning point 3 = 3 +/- card",
            )
        )
        RulesImage(
            R.drawable.battleflow_initiative
        )


        GeneralRulesBullet("You can use this cards to affect your initiative roll-off, you can" +
                " use multiple cards at once")


    }
}

@Composable
fun BattleflowStep(
    number: Int? = null,
    title: String,
    bullets: List<String>
) {
    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {

        Text(
            text = "$number. $title",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        bullets.forEach { bullet ->
            GeneralRulesBullet(bullet)
        }

        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
        )
    }
}