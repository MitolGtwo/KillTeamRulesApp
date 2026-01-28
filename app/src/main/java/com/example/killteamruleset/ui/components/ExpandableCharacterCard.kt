package com.example.killteamruleset.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.model.KeywordInfo
import com.example.killteamruleset.ui.model.Operative

@Composable
fun ExpandableCharacterCard(
    operative: Operative,
    onKeywordClick: (KeywordInfo) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.large
    ) {
        Column {

            // HEADER
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { expanded = !expanded }
                    .padding(16.dp)
            ) {
                CharacterHeader(
                    name = operative.name,
                    imageRes = operative.imageRes
                )
            }

            // BODY
            AnimatedVisibility(
                visible = expanded,
                enter = expandVertically() + fadeIn(),
                exit = shrinkVertically() + fadeOut()
            ) {
                Column(modifier = Modifier.padding(16.dp)) {

                    StatsRow(operative.stats)

                    Spacer(Modifier.height(16.dp))

                    // ✅ HEADER (THIS is the missing piece)
                    WeaponTableHeader()

                    Spacer(Modifier.height(8.dp))

                    operative.weapons.forEach { weapon ->
                        WeaponRow(
                            weapon = weapon,
                            onKeywordClick = onKeywordClick
                        )
                    }

                    Spacer(Modifier.height(12.dp))

                    AbilitiesSection(
                        abilities = operative.abilities,
                        onKeywordClick = onKeywordClick
                    )

                    Spacer(Modifier.height(12.dp))

                    FooterKeywords(operative.keywords)
                }
            }
        }
    }
}