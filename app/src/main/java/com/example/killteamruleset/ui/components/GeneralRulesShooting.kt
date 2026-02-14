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
fun GeneralRulesShooting() {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.fillMaxWidth()
    ) {

        // ─── HEADER ─────────────────────
        Text(
            text = "SHOOTING",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet(
            "Shooting allows an operative to make a ranged attack against an enemy operative."
        )

        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
        )

        // ─── STEP 1 ─────────────────────
        Text(
            text = "1. SELECT A VALID TARGET",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet("The attacking operative must have an Engage order.")
        GeneralRulesBullet("The target must be visible to the attacker.")
        GeneralRulesBullet("The target must not be Obscured.")
        GeneralRulesBullet("The target must not be Concealed and in Cover.")

        // 📸 IMAGE SLOT
        // RulesImage(R.drawable.shooting_valid_target)

        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
        )

        // ─── STEP 2 ─────────────────────
        Text(
            text = "2. SELECT A RANGED WEAPON",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet("Choose one ranged weapon the operative is equipped with.")
        GeneralRulesBullet("Some weapons have special keywords that affect shooting.")

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

        GeneralRulesBullet("Roll a number of dice equal to the weapon’s Attacks characteristic.")
        GeneralRulesBullet("Each result equal to or higher than the weapon’s Ballistic Skill is a hit.")
        GeneralRulesBullet("Critical hits are usually represented by a 6.")

        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
        )

        // ─── STEP 4 ─────────────────────
        Text(
            text = "4. DEFENDER ROLLS DEFENCE DICE",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet("The defender rolls a number of dice equal to their Defence characteristic.")
        GeneralRulesBullet("Each result equal to or higher than the Save characteristic is a success.")
        GeneralRulesBullet("Cover may allow the defender to retain automatic saves.")

        // 📸 IMAGE SLOT
        // RulesImage(R.drawable.shooting_cover_example)

        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
        )

        // ─── STEP 5 ─────────────────────
        Text(
            text = "5. RESOLVE HITS",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet("The defender allocates successful saves to cancel attacker hits.")
        GeneralRulesBullet("Critical saves cancel critical hits first.")
        GeneralRulesBullet("Remaining hits are resolved as damage.")

        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
        )

        // ─── STEP 6 ─────────────────────
        Text(
            text = "6. DEAL DAMAGE",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet("Normal hits deal normal damage.")
        GeneralRulesBullet("Critical hits deal critical damage.")
        GeneralRulesBullet("Damage reduces the target’s Wounds.")

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

        GeneralRulesBullet("If an operative is reduced to 0 wounds, it is incapacitated.")
        GeneralRulesBullet("Some abilities and keywords modify the shooting sequence.")
        GeneralRulesBullet("An operative can normally shoot only once per activation.")
    }
}