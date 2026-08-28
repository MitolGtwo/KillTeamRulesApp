package com.example.killteamruleset.ui.components.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.ui.model.KeywordInfo
import com.example.killteamruleset.ui.model.Operative

@Composable
fun ExpandableCharacterCard(
    operative: Operative,
    alwaysExpanded: Boolean = false,
    onKeywordClick: (KeywordInfo) -> Unit
) {
    var expanded by remember { mutableStateOf(alwaysExpanded) }

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.large
    ) {
        Column {

            // HEADER


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp) // 👈 REQUIRED
                    .clickable { expanded = !expanded }
            ) {
                KillTeamBackground {
                    CharacterHeader(
                        name = operative.name,
                        imageRes = operative.imageRes
                    )
                }
            }

            // BODY
            AnimatedVisibility(
                visible = expanded,
                enter = expandVertically() + fadeIn(),
                exit = shrinkVertically() + fadeOut()
            ) {
                Column(modifier = Modifier.
                padding(16.dp)
                .navigationBarsPadding())
                {

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