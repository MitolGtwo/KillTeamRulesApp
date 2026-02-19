package com.example.killteamruleset.ui.data.Empire.list.AngelsOfDeath

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.model.OperativeSelectionRule


val AngelsOfDeathOperativeSelection: List<OperativeSelectionRule> = listOf(

    OperativeSelectionRule(
        text = "1 ANGEL OF DEATH Operative selected from the following list"
    ),
    OperativeSelectionRule(
        text = "ASSAULT INTERCESSOR SERGEANT with one of option from each of the following:",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Hand Flamer or Heavy bolt Pistol",
        indent = 2
    ),
  OperativeSelectionRule(
        text = "Chainsword, Power Fist, Power Weapon or Thunder Hammer",
        indent = 2
    ),
  OperativeSelectionRule(
        text = "Plasma Pistol; Chainsword",
        indent = 2
    ),

      OperativeSelectionRule(
        text = "INTERCESSOR SERGEANT with one of option from each of the following:",
        indent = 1
    ),
    OperativeSelectionRule(
        text = "Auto Bolt Rifle, Bolt Rifle or Stalker Bolt Rifle",
        indent = 2
    ),
  OperativeSelectionRule(
        text = "Chainsword, Power Fist, Power Weapon or Thunder Hammer",
        indent = 2
    ),
  OperativeSelectionRule(
        text = "SPACE MARINE CAPTAIN",
        indent = 1
    ),

  OperativeSelectionRule(
        text = "5 **ANGEL OF DEATH** Operatives selected from the following list:"
    ),

  
    OperativeSelectionRule(
        text = "**ASSAULT INTERCESSOR GRENADIER**",
        indent = 1
    ),

   OperativeSelectionRule(
        text = "ASSAULT INTERCESSOR WARRIOR",
        indent = 1
    ),

   OperativeSelectionRule(
        text = "ELIMINATION SNIPER",
        indent = 1
    ),

   OperativeSelectionRule(
        text = "HEAVY INTERCESSOR GUNNER",
        indent = 1
    ),

   OperativeSelectionRule(
        text = "INTERCESSOR GUNNER with auxiliary grenade launcher and one of the following options:",
        indent = 1
    ),

   OperativeSelectionRule(
        text = "Auto Bolt Rifle; Fists",
        indent = 2
    ),
  OperativeSelectionRule(
        text = "Bolt Rifle; Fists",
        indent = 2
    ),
  OperativeSelectionRule(
        text = "Stalker Bolt Rifle: Fists",
        indent = 2
    ),

  OperativeSelectionRule(
        text = "INTERCESSOR WARRIOR with one of the following options:",
        indent = 1
    ),

   OperativeSelectionRule(
        text = "Auto Bolt Rifle; Fists",
        indent = 2
    ),
  OperativeSelectionRule(
        text = "Bolt Rifle; Fists",
        indent = 2
    ),
  OperativeSelectionRule(
        text = "Stalker Bolt Rifle: Fists",
        indent = 2
    ),


    OperativeSelectionRule(
    text = "Other than WARRIOR Operatives, your kill team can only include each Operative on this list once.",
    isFooter = true
    )
)
