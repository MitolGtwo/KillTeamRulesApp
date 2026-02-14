package com.example.killteamruleset.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun GeneralRulesFAQ() {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.fillMaxWidth()
    ) {

        // ─── HEADER ─────────────────────
        Text(
            text = "FREQUENTLY ASKED QUESTIONS",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
        )

        // ─── FAQ ENTRIES ─────────────────

        Text(
            text = "Do I have to measure everything exactly?",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )
        GeneralRulesBullet(
            "Yes. Kill Team is a precise game. Measurements are always taken base-to-base."
        )

        Spacer(Modifier.height(8.dp))

        Text(
            text = "Can I measure before committing to an action?",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )
        GeneralRulesBullet(
            "Yes. You can measure distances before declaring an action."
        )

        Spacer(Modifier.height(8.dp))

        Text(
            text = "What happens if I forget a rule?",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )
        GeneralRulesBullet(
            "Pause the game and resolve it together. Kill Team encourages fair play over penalties."
        )

        Spacer(Modifier.height(8.dp))

        Text(
            text = "Can I change my order after activating an operative?",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )
        GeneralRulesBullet(
            "No. Once an operative is activated, its order cannot be changed unless a rule allows it."
        )

        Spacer(Modifier.height(8.dp))

        Text(
            text = "Do operatives block movement?",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )
        GeneralRulesBullet(
            "Yes. Operatives cannot move through enemy bases unless a rule explicitly allows it."
        )

        Spacer(Modifier.height(8.dp))

        Text(
            text = "Can I shoot through my own operatives?",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )
        GeneralRulesBullet(
            "Yes, friendly operatives do not block line of sight."
        )

        Spacer(Modifier.height(8.dp))

        Text(
            text = "What if two rules contradict each other?",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )
        GeneralRulesBullet(
            "Specific rules always override general rules."
        )

        Spacer(Modifier.height(8.dp))

        Text(
            text = "Where do I check edge cases?",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )
        GeneralRulesBullet(
            "Check the FAQ, Errata, or tournament rulings. When in doubt, agree with your opponent."
        )

        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
        )

        // ─── FINAL NOTE ──────────────────
        Text(
            text = "REMEMBER",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet(
            "Kill Team is a tactical game, but it's also a social one. Clear communication matters."
        )
    }
}