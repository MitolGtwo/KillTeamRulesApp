package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.state.BattleSetupState
import com.example.killteamruleset.ui.components.CritOpCard
import com.example.killteamruleset.ui.components.KillTeamBackground
import com.example.killteamruleset.ui.components.MapCard
import com.example.killteamruleset.ui.data.CritOpsRepository
import com.example.killteamruleset.ui.data.MapsRepository
import com.example.killteamruleset.ui.model.MapCategory
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BattleSetupStep2Screen(
    onBack: () -> Unit
) {


    @Composable
    fun BattleSetupStep2Screen(
        onBack: () -> Unit
    ) {

        var category by BattleSetupState.selectedCategory
        var selectedMap by BattleSetupState.selectedMap
        var selectedCritOp by BattleSetupState.selectedCritOp

        var expandedCategory by remember { mutableStateOf(false) }
        var expandedMap by remember { mutableStateOf(false) }
        var expandedCritOp by remember { mutableStateOf(false) }

        val maps = category?.let { MapsRepository.byCategory(it) } ?: emptyList()

        KillTeamBackground {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp)
                    .statusBarsPadding(),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                TextButton(onClick = onBack) {
                    Text("← Back")
                }

                // 🔥 MAP TYPE
                ExposedDropdownMenuBox(
                    expanded = expandedCategory,
                    onExpandedChange = { expandedCategory = !expandedCategory }
                ) {
                    OutlinedTextField(
                        value = category?.name ?: "Select Map Type",
                        onValueChange = {},
                        readOnly = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .menuAnchor()
                    )

                    ExposedDropdownMenu(
                        expanded = expandedCategory,
                        onDismissRequest = { expandedCategory = false }
                    ) {
                        MapCategory.values().forEach {
                            DropdownMenuItem(
                                text = { Text(it.name) },
                                onClick = {
                                    category = it
                                    selectedMap = null
                                    expandedCategory = false
                                }
                            )
                        }
                    }
                }

                // 🔥 MAP LIST (only if category selected)
                if (category != null) {

                    ExposedDropdownMenuBox(
                        expanded = expandedMap,
                        onExpandedChange = { expandedMap = !expandedMap }
                    ) {
                        OutlinedTextField(
                            value = selectedMap?.title ?: "Select Map",
                            onValueChange = {},
                            readOnly = true,
                            modifier = Modifier
                                .fillMaxWidth()
                                .menuAnchor()
                        )

                        ExposedDropdownMenu(
                            expanded = expandedMap,
                            onDismissRequest = { expandedMap = false }
                        ) {
                            maps.filter { it.randomizable }.forEach {
                                DropdownMenuItem(
                                    text = { Text(it.title) },
                                    onClick = {
                                        selectedMap = it
                                        expandedMap = false
                                    }
                                )
                            }
                        }
                    }
                }

                // 🔥 CRIT OPS
                ExposedDropdownMenuBox(
                    expanded = expandedCritOp,
                    onExpandedChange = { expandedCritOp = !expandedCritOp }
                ) {
                    OutlinedTextField(
                        value = selectedCritOp?.title ?: "Select Crit Op",
                        onValueChange = {},
                        readOnly = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .menuAnchor()
                    )

                    ExposedDropdownMenu(
                        expanded = expandedCritOp,
                        onDismissRequest = { expandedCritOp = false }
                    ) {
                        CritOpsRepository.allCritOps.forEach {
                            DropdownMenuItem(
                                text = { Text(it.title) },
                                onClick = {
                                    selectedCritOp = it
                                    expandedCritOp = false
                                }
                            )
                        }
                    }
                }

                Spacer(Modifier.height(16.dp))

                // 🎲 RANDOMIZER
                if (category != null) {

                    Button(
                        onClick = {
                            val pool = maps.filter { it.randomizable }

                            selectedMap = pool.randomOrNull()
                            selectedCritOp = CritOpsRepository
                                .allCritOps
                                .randomOrNull()
                        },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("RANDOMIZE")
                    }
                }

                // 🔥 RESULT DISPLAY
                selectedMap?.let {
                    MapCard(map = it, onClick = {})
                }

                selectedCritOp?.let {
                    CritOpCard(
                        critOp = it,
                        onKeywordClick = {}
                    )
                }
            }
        }
    }
}