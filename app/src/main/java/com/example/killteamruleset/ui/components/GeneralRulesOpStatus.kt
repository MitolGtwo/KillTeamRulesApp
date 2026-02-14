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
fun GeneralRulesOpStatus() {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.fillMaxWidth()
    ) {

        Text(
            text = "ORDERS",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        RulesImage(
            R.drawable.battleflow_orders
        )

        GeneralRulesBullet(
            "Each Operative start with a Conceal order, this Operative is hiding and waiting" +
                    "for an opportunity to strike"
        )
        GeneralRulesBullet(
            "While on Conceal, is hard to shoot an Operative, but it can be charged by an enemy" +
                    " Operative"
        )
        GeneralRulesBullet(
            "The actions that required an Operative to change to Engage are:"
        )
        GeneralRulesBullet(
            "Shooting (Unless is using a Silent weapon)"
        )
        GeneralRulesBullet(
            "A charge action"
        )
        GeneralRulesBullet(
            "Special datacard actions"
        )

        Text(
            text = "How to change orders",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet(
            "At the start of an Operatives activation, you must select what order will" +
                    " they have, either Engage of Conceal, if you want to shoot with this Operative," +
                    " this is the time to change the order to do so"
        )
        GeneralRulesBullet(
            "If an Operative was in engage from a previous turn, you can switch it back to conceal" +
                    " on the start of its nexts activation"
        )

        Text(
            text = "STATS MODIFIERS",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet(
            "Wounded Operative"
        )

        RulesImage(
            R.drawable.battleflow_wounded
        )

        GeneralRulesBullet(
            "When the Wounds stat of an Operative falls below its half, the Operative is" +
                    "wounded, this Operative Move stat is reduced -2\" and its hit stat from all" +
                    "its weapons are worsened by 1"
        )

        Text(
            text = "CHANGES LIMITS",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet(
            "Apl Stat can only be improved +1 and worsen -1"
        )

        GeneralRulesBullet(
            "Move Stat for a Reposition Action cannot be worsened more than 4\""
        )
        GeneralRulesBullet(
            "A Dash Action will always be 3\""
        )

        GeneralRulesBullet(
            "Hit and Save Stat cannot be improved more than 2+ or worsened more than 6+"
        )

    }
}