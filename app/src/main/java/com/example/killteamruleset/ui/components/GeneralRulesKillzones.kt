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
fun GeneralRulesKillzones() {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier.fillMaxWidth()
    ) {

        // ─── HEADER ─────────────────────
        Text(
            text = "KILLZONES",
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet(
            "A Killzone represents the battlefield where operatives fight."
        )

        GeneralRulesBullet(
            "Each Killzone is made up of terrain features that affect movement, visibility, and combat."
        )

        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
        )

        // ─── TERRAIN TYPES ───────────────
        Text(
            text = "TERRAIN TYPES",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet("Open Terrain: provides no cover or movement restriction.")
        GeneralRulesBullet("Light Terrain: provides cover but does not block visibility.")
        GeneralRulesBullet("Heavy Terrain: blocks visibility and provides strong cover.")

        // 📸 IMAGE SLOT
        // RulesImage(R.drawable.killzone_terrain_types)

        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
        )

        // ─── OBSCURING & VISIBILITY ──────
        Text(
            text = "OBSCURING & VISIBILITY",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet("Terrain can obscure operatives from being targeted.")
        GeneralRulesBullet("An operative is Obscured if terrain blocks part of the line of sight.")
        GeneralRulesBullet("Obscured operatives are harder or impossible to shoot.")

        // 📸 IMAGE SLOT
        // RulesImage(R.drawable.killzone_obscuring_example)

        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
        )

        // ─── COVER ──────────────────────
        Text(
            text = "COVER",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet("Cover allows operatives to retain or block hits.")
        GeneralRulesBullet("Light cover protects against normal hits.")
        GeneralRulesBullet("Heavy cover protects against both normal and critical hits.")

        // 📸 IMAGE SLOT
        // RulesImage(R.drawable.killzone_cover_example)

        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
        )

        // ─── MOVEMENT & VERTICALITY ──────
        Text(
            text = "MOVEMENT & VERTICALITY",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet("Operatives may climb, traverse, or drop from terrain.")
        GeneralRulesBullet("Vertical distance costs movement equal to the height moved.")
        GeneralRulesBullet("Falling may cause damage if the drop is too high.")

        // 📸 IMAGE SLOT
        // RulesImage(R.drawable.killzone_vertical_movement)

        Divider(
            thickness = 1.dp,
            color = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
        )

        // ─── KILLZONE TYPES ──────────────
        Text(
            text = "KILLZONE TYPES",
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary
        )

        GeneralRulesBullet("Open Killzones focus on ranged combat and maneuvering.")
        GeneralRulesBullet("Into the Dark Killzones use close corridors and doors.")
        GeneralRulesBullet("Special Killzones may add unique rules or hazards.")

        // 📸 IMAGE SLOT
        // RulesImage(R.drawable.killzone_types)

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

        GeneralRulesBullet("Always agree on Killzone setup before the battle begins.")
        GeneralRulesBullet("Terrain placement can heavily affect game balance.")
        GeneralRulesBullet("Some missions or Crit Ops modify Killzone rules.")
    }
}