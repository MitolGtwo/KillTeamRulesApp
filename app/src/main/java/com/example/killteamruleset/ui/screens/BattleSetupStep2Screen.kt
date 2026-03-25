package com.example.killteamruleset.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.state.BattleSetupState
import com.example.killteamruleset.ui.components.CritOpCard
import com.example.killteamruleset.ui.components.KillTeamBackground
import com.example.killteamruleset.ui.data.CritOpsRepository
import com.example.killteamruleset.ui.data.MapsRepository
import com.example.killteamruleset.ui.model.MapCategory
import com.example.killteamruleset.R

import com.example.killteamruleset.ui.components.MapCard
import com.example.killteamruleset.ui.components.MapViewer


@OptIn(ExperimentalMaterial3Api::class)

@Composable
    fun BattleSetupStep2Screen(
        onBack: () -> Unit,
        onNext: () -> Unit
    ) {

    val context = LocalContext.current
    var category by BattleSetupState.selectedCategory
    var selectedMap by BattleSetupState.selectedMap
    var selectedCritOp by BattleSetupState.selectedCritOp


    var showMapViewer by remember { mutableStateOf(false) }
    var viewerImages by remember { mutableStateOf<List<Int>>(emptyList()) }

    var expandedCategory by remember { mutableStateOf(false) }
    var expandedMap by remember { mutableStateOf(false) }
    var expandedCritOp by remember { mutableStateOf(false) }

    val maps = category?.let { MapsRepository.byCategory(it) } ?: emptyList()

    val isValid = category != null &&
            selectedMap != null &&
            selectedCritOp != null

    LaunchedEffect(category, selectedMap, selectedCritOp) {
        // later you save this in repository
    }

    KillTeamBackground {

        Box(
            modifier = Modifier.fillMaxSize()
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState())
                    .padding(16.dp)
                    .statusBarsPadding()
                    .navigationBarsPadding()
                    .padding(bottom = 80.dp), // space for button
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                // 🔙 BACK
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

                // 🔥 MAP LIST
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

                // 🔥 RESULT
                selectedMap?.let { map ->

                    MapCard(
                        map = map,
                        onClick = { }
                    )

                    Spacer(Modifier.height(8.dp))

                    Button(
                        onClick = {
                            viewerImages = when (map.category) {
                                MapCategory.VOLKUS -> listOf(R.drawable.vk_comp)
                                MapCategory.INTO_THE_DARK -> listOf(
                                    R.drawable.itd_comp1,
                                    R.drawable.itd_comp2
                                )

                                MapCategory.TOMB_WORLD -> listOf(
                                    R.drawable.tw_comp1,
                                    R.drawable.tw_comp2
                                )
                            }
                            showMapViewer = true
                        },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text("VIEW MAP LAYOUT")
                    }
                }

                selectedCritOp?.let {
                    CritOpCard(
                        critOp = it,
                        onKeywordClick = {}
                    )
                }
            }

            // 🔥 FLOATING NEXT BUTTON
            Button(
                onClick = { onNext() },
                enabled = isValid,
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (isValid) Color(0xFFFF6A00) else Color.Gray
                ),
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(16.dp)
            ) {
                Text("NEXT")
            }
        }
    }

// 🔥 MAP VIEWER (OUTSIDE)
    if (showMapViewer) {
        MapViewer(
            images = viewerImages,
            onClose = { showMapViewer = false }
        )
    }
}