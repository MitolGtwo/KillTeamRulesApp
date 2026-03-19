package com.example.killteamruleset.ui.screens


import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.launch
import androidx.compose.foundation.clickable
import com.example.killteamruleset.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.killteamruleset.state.MapsUIState
import com.example.killteamruleset.state.MapsUIState.selectedCritOp
import com.example.killteamruleset.state.MapsUIState.selectedMap
import com.example.killteamruleset.state.MapsUIState.selectedMapSet
import com.example.killteamruleset.ui.components.CritOpCard
import com.example.killteamruleset.ui.components.KillTeamBackground2
import com.example.killteamruleset.ui.components.MapCard
import com.example.killteamruleset.ui.components.MapViewer
import com.example.killteamruleset.ui.components.RandomizerToggle
import com.example.killteamruleset.ui.data.CritOpsRepository
import com.example.killteamruleset.ui.data.MapsRepository
import com.example.killteamruleset.ui.model.CritOp
import com.example.killteamruleset.ui.model.GameMap
import com.example.killteamruleset.ui.model.MapCategory

@Composable
fun MapsCritOpsScreen(
    onMapsClick: () -> Unit,
    onCritOpsClick: () -> Unit
) {

    var selectedCategory by MapsUIState.selectedCategory
    var selectedMap by MapsUIState.selectedMap
    var selectedCritOp by MapsUIState.selectedCritOp
    var selectedMapSet by MapsUIState.selectedMapSet

    var showMapViewer by remember { mutableStateOf(false) }
    var viewerImages by remember { mutableStateOf<List<Int>>(emptyList()) }

    val listState = rememberLazyListState()
    val scope = rememberCoroutineScope()

    KillTeamBackground2 {

        LazyColumn(
            state = listState,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .navigationBarsPadding(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            item {
                Text(
                    text = "MAPS & CRIT OPS",
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold
                )
            }

            // ── MAPS ─────────────────
            item {
                ActionCard(
                    title = "Maps",
                    onClick = onMapsClick
                )
            }

            // ── CRIT OPS ─────────────
            item {
                ActionCard(
                    title = "Crit Ops",
                    onClick = onCritOpsClick
                )
            }

            // ── RANDOMIZER ───────────
            item {
                ActionCard(
                    title = if (selectedCategory == null)
                        "SELECT A MAP SET"
                    else
                        "RANDOMIZER",
                    enabled = selectedCategory != null,
                    selected = selectedCategory != null,
                    highlightColor = Color.Black,
                    onClick = {

                        selectedCategory?.let { category ->

                            val maps = MapsRepository
                                .byCategory(category)
                                .filter { it.randomizable }

                            selectedMap = maps.randomOrNull()
                            selectedCritOp = CritOpsRepository.allCritOps.randomOrNull()
                            selectedMapSet = category.name

                            scope.launch {
                                listState.animateScrollToItem(6)
                            }
                        }
                    }
                )
            }

            // ── CATEGORY TOGGLES ─────
            item {

                Text(
                    text = "RANDOMIZER",
                    fontWeight = FontWeight.Bold
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {

                    RandomizerToggle(
                        label = "Volkus",
                        selected = selectedCategory == MapCategory.VOLKUS,
                        modifier = Modifier.weight(1f),
                        onClick = {
                            selectedCategory = MapCategory.VOLKUS
                            selectedMap = null
                            selectedCritOp = null
                            selectedMapSet = null
                        }
                    )

                    RandomizerToggle(
                        label = "ITD",
                        selected = selectedCategory == MapCategory.INTO_THE_DARK,
                        modifier = Modifier.weight(1f),
                        onClick = {
                            selectedCategory = MapCategory.INTO_THE_DARK
                            selectedMap = null
                            selectedCritOp = null
                            selectedMapSet = null
                        }
                    )

                    RandomizerToggle(
                        label = "Tomb World",
                        selected = selectedCategory == MapCategory.TOMB_WORLD,
                        modifier = Modifier.weight(1f),
                        onClick = {
                            selectedCategory = MapCategory.TOMB_WORLD
                            selectedMap = null
                            selectedCritOp = null
                            selectedMapSet = null
                        }
                    )
                }
            }

            // ── VIEW MAP ─────────────
            selectedCategory?.let { category ->
                item {

                    Spacer(Modifier.height(12.dp))

                    ActionCard(
                        title = "VIEW MAP LAYOUT",
                        highlightColor = Color(0xFF3A3A3A),
                        onClick = {

                            viewerImages = when (category) {

                                MapCategory.VOLKUS ->
                                    listOf(R.drawable.vk_comp)

                                MapCategory.INTO_THE_DARK ->
                                    listOf(
                                        R.drawable.itd_comp1,
                                        R.drawable.itd_comp2
                                    )

                                MapCategory.TOMB_WORLD ->
                                    listOf(
                                        R.drawable.tw_comp1,
                                        R.drawable.tw_comp2
                                    )
                            }

                            showMapViewer = true
                        }
                    )
                }
            }

            // ── RESULT ──────────────
            selectedMap?.let { map ->
                item {
                    MapCard(
                        map = map,
                        onClick = { }
                    )
                }
            }

            selectedCritOp?.let { critOp ->
                item {
                    CritOpCard(
                        critOp = critOp,
                        onKeywordClick = {}
                    )
                }
            }
        }

        if (showMapViewer) {
            MapViewer(
                images = viewerImages,
                onClose = { showMapViewer = false }
            )
        }
    }
}
@Composable
fun ActionCard(
    title: String,
    enabled: Boolean = true,
    selected: Boolean = false,
    highlightColor: Color = Color.Black,
    onClick: () -> Unit
) {
    val backgroundColor =
        if (!enabled)
            Color(0xFF2B2B2B)
        else if (selected)
            Color(0xFFFF6A00) // orange highlight
        else
            highlightColor

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .clickable(enabled = enabled) { onClick() },
        colors = CardDefaults.cardColors(
            containerColor = backgroundColor
        )
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = title.uppercase(),
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
}