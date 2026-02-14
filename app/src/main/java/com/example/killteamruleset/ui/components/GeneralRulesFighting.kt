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

@Composable
fun GeneralRulesFighting() {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.fillMaxWidth()
    ) {

        // ─── HEADER ─────────────────────
        Text(
            text = "FIGHTING",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet(
            "Fighting occurs when an operative engages an enemy operative within Engagement Range."
        )

        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
        )

        // ─── STEP 1 ─────────────────────
        Text(
            text = "1. DECLARE A FIGHT ACTION",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet("The active operative must be within Engagement Range of an enemy operative.")
        GeneralRulesBullet("The operative must have enough APL to perform a Fight action.")
        GeneralRulesBullet("Select one enemy operative to fight.")

        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
        )

        // ─── STEP 2 ─────────────────────
        Text(
            text = "2. SELECT MELEE WEAPONS",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet("Both players select one melee weapon their operative is equipped with.")
        GeneralRulesBullet("Weapon keywords may affect the fight.")

        // 📸 IMAGE SLOT
        // RulesImage(R.drawable.fight_weapon_selection)

        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
        )

        // ─── STEP 3 ─────────────────────
        Text(
            text = "3. ROLL ATTACK DICE",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet("Both players roll a number of dice equal to their weapon’s Attacks.")
        GeneralRulesBullet("Each roll equal to or higher than the Weapon Skill is a success.")
        GeneralRulesBullet("Critical hits are usually rolls of 6.")

        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
        )

        // ─── STEP 4 ─────────────────────
        Text(
            text = "4. RESOLVE STRIKES",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet("The active player resolves the first strike.")
        GeneralRulesBullet("Players alternate resolving one successful hit at a time.")
        GeneralRulesBullet("A hit can either Strike (deal damage) or Parry (discard an enemy hit).")

        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
        )

        // ─── STEP 5 ─────────────────────
        Text(
            text = "5. STRIKE OR PARRY",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet("Strike: deal damage to the enemy operative.")
        GeneralRulesBullet("Parry: discard one of the opponent’s successful hits.")
        GeneralRulesBullet("Critical hits usually require critical hits to parry.")

        // 📸 IMAGE SLOT
        // RulesImage(R.drawable.fight_parry_example)

        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
        )

        // ─── STEP 6 ─────────────────────
        Text(
            text = "6. DAMAGE AND INCAPACITATION",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet("Damage reduces an operative’s Wounds.")
        GeneralRulesBullet("If an operative reaches 0 Wounds, it is incapacitated immediately.")
        GeneralRulesBullet("Remaining hits are discarded if an operative is incapacitated.")

        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
        )

        // ─── IMPORTANT NOTES ────────────
        Text(
            text = "IMPORTANT NOTES",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet("The active operative always resolves the first strike.")
        GeneralRulesBullet("You are not required to alternate if one player has no remaining hits.")
        GeneralRulesBullet("Some abilities and keywords modify the Fight sequence.")
    }
}