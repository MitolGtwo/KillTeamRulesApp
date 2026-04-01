package com.example.killteamruleset.ui.screens






import com.example.killteamruleset.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.killteamruleset.state.BattleRepository
import com.example.killteamruleset.state.OpType
import com.example.killteamruleset.state.OpponentPrimaryOpState
import com.example.killteamruleset.state.OpponentScoreState
import com.example.killteamruleset.state.OpponentTacOpState


import com.example.killteamruleset.state.PlayerPrimaryOpState
import com.example.killteamruleset.state.PlayerScoreState
import com.example.killteamruleset.state.PlayerTacOpState
import com.example.killteamruleset.state.SelectedOp
import com.example.killteamruleset.ui.components.KillTeamBackground
import com.example.killteamruleset.ui.components.TacOpCard
import com.example.killteamruleset.ui.data.PloyRepository
import com.example.killteamruleset.ui.data.TacOpRepository
import com.example.killteamruleset.ui.model.Ploy
import com.example.killteamruleset.ui.model.PloyType
import com.example.killteamruleset.ui.model.TacOp
import com.example.killteamruleset.ui.model.Team
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.TextButton
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable

import com.example.killteamruleset.state.BattleSetupState
import com.example.killteamruleset.state.OpponentPloyState
import com.example.killteamruleset.state.PlayerPloyState
import com.example.killteamruleset.ui.components.CritOpCard
import com.example.killteamruleset.ui.components.InfoIcon
import com.example.killteamruleset.ui.model.BattleSession
import com.example.killteamruleset.ui.model.TurnData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Composable
fun BattleTrackerScreenV2(
    navController: NavController,
    playerName: String,
    opponentName: String,
    playerTeam: Team?,
    opponentTeam: Team?
) {


    val scope = rememberCoroutineScope()
    val context = LocalContext.current
    var currentTurn by remember { mutableStateOf(1) }
    var isFinished by remember { mutableStateOf(false) }
    var viewedTurnIndex by remember { mutableStateOf<Int?>(null) }
    val isViewingHistory = viewedTurnIndex != null
    var battleInitialized by rememberSaveable { mutableStateOf(false) }
    val isOpLocked = currentTurn > 1

    val selectedCategory by BattleSetupState.selectedCategory
    val selectedMap by BattleSetupState.selectedMap
    val selectedCritOp by BattleSetupState.selectedCritOp

    LaunchedEffect(Unit) {
        if (!battleInitialized) {

            val critOp = selectedCritOp

            if (critOp != null) {
                BattleRepository.startNewBattle(
                    context = context,
                    playerName = playerName,
                    opponentName = opponentName,
                    playerTeamId = playerTeam?.id ?: "",
                    opponentTeamId = opponentTeam?.id ?: "",

                    mapType = selectedCategory?.name ?: "",
                    mapNumber = selectedMap?.number ?: 0,
                    critOpNumber = critOp.number,
                    critOpName = critOp.title
                )

                battleInitialized = true
            }
        }
    }

    var battleState by remember { mutableStateOf<BattleSession?>(null) }



    val viewedTurn = if (viewedTurnIndex != null) {
        battleState?.turns?.getOrNull(viewedTurnIndex!!)
    } else null

    val scrollState = rememberScrollState()
    var showInitiativeDialog by remember { mutableStateOf(false) }

    var showCritInfo by remember { mutableStateOf(false) }
    var showKillInfo by remember { mutableStateOf(false) }


    LaunchedEffect(Unit) {
        BattleRepository.loadCurrentBattle(context).collect { battle ->
            battleState = battle

            battle?.let {
                currentTurn = it.currentTurn
                isFinished = it.isFinished
            }
        }
    }


    LaunchedEffect(PlayerPrimaryOpState.selectedOp.value) {

        val op = PlayerPrimaryOpState.selectedOp.value

        BattleRepository.savePrimaryOp(
            context = context,
            isPlayer = true,
            type = op?.type?.name,
            revealed = op?.revealed ?: false
        )
    }
    LaunchedEffect(OpponentPrimaryOpState.selectedOp.value) {

        val op = OpponentPrimaryOpState.selectedOp.value

        BattleRepository.savePrimaryOp(
            context = context,
            isPlayer = false,
            type = op?.type?.name,
            revealed = op?.revealed ?: false
        )
    }





    //Starter turn 1

    if (showInitiativeDialog) {

        AlertDialog(
            onDismissRequest = { },

            title = {
                Text("Who has Initiative?", color = Color.White)
            },

            text = {
                Row(
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier.fillMaxWidth()
                ) {

                    Button(onClick = {

                        showInitiativeDialog = false

                        // 🔥 APPLY CP IN UI
                        PlayerScoreState.cp.value += 1
                        OpponentScoreState.cp.value += 2

                        CoroutineScope(Dispatchers.IO).launch {
                            BattleRepository.updateInitiative(context, true)
                        }

                    }) {
                        Text("You")
                    }

                    Button(onClick = {

                        showInitiativeDialog = false

                        // 🔥 APPLY CP IN UI
                        PlayerScoreState.cp.value += 2
                        OpponentScoreState.cp.value += 1

                        CoroutineScope(Dispatchers.IO).launch {
                            BattleRepository.updateInitiative(context, false)
                        }

                    }) {
                        Text("Opponent")
                    }
                }
            },

            confirmButton = {}
        )
    }






    KillTeamBackground {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .padding(16.dp)
                .statusBarsPadding()
                .navigationBarsPadding(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {


            Text(
                text = if (viewedTurnIndex == null)
                    "TURN $currentTurn / 4"
                else
                    "TURN ${viewedTurnIndex!! + 1} (VIEWING)",
                color = Color(0xFFFF6A00),
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )


            //Turn back
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Button(
                    onClick = {
                        viewedTurnIndex = ((viewedTurnIndex ?: currentTurn - 1) - 1)
                            .coerceAtLeast(0)
                    },
                    enabled = (viewedTurnIndex ?: currentTurn - 1) > 0
                ) {
                    Text("< PREV")
                }

                Button(
                    onClick = {

                        if (viewedTurnIndex != null) {
                            // 🔥 HISTORY MODE → move forward

                            val nextIndex = viewedTurnIndex!! + 1

                            viewedTurnIndex = if (nextIndex >= currentTurn - 1) {
                                null // back to LIVE
                            } else {
                                nextIndex
                            }

                        } else {
                            // 🔥 LIVE MODE → NEXT TURN

                            if (currentTurn < 4) {

                                val turnData = TurnData(
                                    turn = currentTurn,

                                    playerCrit = PlayerScoreState.critOp.value,
                                    playerTac = PlayerScoreState.tacOp.value,
                                    playerKill = PlayerScoreState.killOp.value,

                                    opponentCrit = OpponentScoreState.critOp.value,
                                    opponentTac = OpponentScoreState.tacOp.value,
                                    opponentKill = OpponentScoreState.killOp.value,

                                    playerPloys =
                                        PlayerPloyState.activeStrategyPloys.map { it.id } +
                                                PlayerPloyState.activeFirefightPloys.map { it.id },

                                    opponentPloys =
                                        OpponentPloyState.activeStrategyPloys.map { it.id } +
                                                OpponentPloyState.activeFirefightPloys.map { it.id },

                                    playerTacOp = PlayerTacOpState.selectedTacOp.value?.id,
                                    opponentTacOp = OpponentTacOpState.selectedTacOp.value?.id,

                                    initiativePlayer = false
                                )

                                BattleRepository.nextTurn(context, turnData)

                                // 🔥 RESET UI
                                PlayerPloyState.clearSelections()
                                OpponentPloyState.clearSelections()


                                showInitiativeDialog = true

                                scope.launch {
                                    scrollState.animateScrollTo(0)
                                }

                            } else {

                                val turnData = TurnData(
                                    turn = currentTurn,

                                    playerCrit = PlayerScoreState.critOp.value,
                                    playerTac = PlayerScoreState.tacOp.value,
                                    playerKill = PlayerScoreState.killOp.value,

                                    opponentCrit = OpponentScoreState.critOp.value,
                                    opponentTac = OpponentScoreState.tacOp.value,
                                    opponentKill = OpponentScoreState.killOp.value,

                                    playerPloys =
                                        PlayerPloyState.activeStrategyPloys.map { it.id } +
                                                PlayerPloyState.activeFirefightPloys.map { it.id },

                                    opponentPloys =
                                        OpponentPloyState.activeStrategyPloys.map { it.id } +
                                                OpponentPloyState.activeFirefightPloys.map { it.id },

                                    playerTacOp = PlayerTacOpState.selectedTacOp.value?.id,
                                    opponentTacOp = OpponentTacOpState.selectedTacOp.value?.id,

                                    initiativePlayer = false
                                )

                                // 🔥 SAVE LAST TURN
                                BattleRepository.nextTurn(context, turnData)

                                CoroutineScope(Dispatchers.IO).launch {
                                    BattleRepository.finishBattle(context)
                                }

                                navController.navigate("battle_summary") {
                                    popUpTo("battle_tracker") { inclusive = true }
                                }
                            }
                        }
                    },
                    enabled = viewedTurnIndex != null || currentTurn > 0
                ) {
                    Text(
                        when {
                            viewedTurnIndex != null -> "RETURN TO LIVE >"
                            currentTurn < 4 -> "NEXT TURN >"
                            else -> "FINISH"
                        }
                    )
                }
            }




            // 🔥 PLAYER BLOCK
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {

                // ✅ ROW 1 → VP + ICON
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    val playerCrit = viewedTurn?.playerCrit
                        ?: PlayerScoreState.critOp.value

                    val playerTac = viewedTurn?.playerTac
                        ?: PlayerScoreState.tacOp.value

                    val playerKill = viewedTurn?.playerKill
                        ?: PlayerScoreState.killOp.value

                    VictoryPointsPanel(
                        critOp = playerCrit,
                        tacOp = playerTac,
                        killOp = playerKill
                    )

                    Spacer(Modifier.width(150.dp))

                    FactionIcon(
                        iconRes = playerTeam?.iconRes,
                        onClick = {
                            playerTeam?.let {
                                navController.navigate("team/${it.id}")
                            }
                        }
                    )
                }

                // ✅ NAME
                Text(
                    text = playerName.ifEmpty { "YOU" },
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )

                // ✅ ROW 2 → SCORE + PLOYS
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalAlignment = Alignment.Top
                ) {

                    // 🔥 LEFT → SCORE
                    Column(modifier = Modifier.weight(1f)) {
                        ScorePanel(
                            critOpState = PlayerScoreState.critOp,
                            tacOpState = PlayerScoreState.tacOp,
                            killOpState = PlayerScoreState.killOp,
                            cpState = PlayerScoreState.cp,
                            onCritInfoClick = { showCritInfo = true },
                            onKillInfoClick = { showKillInfo = true },
                            enabled = !isViewingHistory
                        )
                    }

                    // 🔥 RIGHT → PLOYS
                    Column(modifier = Modifier.weight(2f)) {
                        CompactPloyPanel(
                            team = playerTeam,
                            cpState = PlayerScoreState.cp,
                            navController = navController,
                            isPlayer = true,
                            historyPloys = viewedTurn?.playerPloys,
                            isViewingHistory = isViewingHistory
                        )
                        TacOpSelector(
                            team = playerTeam,
                            selectedState = PlayerTacOpState.selectedTacOp,
                            revealedState = PlayerTacOpState.revealed,
                            enabled = !isOpLocked
                        )

                        PrimaryOpPanel(
                            team = playerTeam,
                            selectedState = PlayerPrimaryOpState.selectedOp,
                            onCritInfoClick = { showCritInfo = true },
                            onKillInfoClick = { showKillInfo = true },
                            enabled = !isOpLocked
                        )
                    }
                }
            }


// 🔻 DIVIDER
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(2.dp)
                    .background(Color(0xFFFF6A00))
            )


// 🔥 OPPONENT
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {

                // ✅ ROW 1 → VP + ICON
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    val opponentCrit = viewedTurn?.opponentCrit
                        ?: OpponentScoreState.critOp.value

                    val opponentTac = viewedTurn?.opponentTac
                        ?: OpponentScoreState.tacOp.value

                    val opponentKill = viewedTurn?.opponentKill
                        ?:  OpponentScoreState.killOp.value




                    VictoryPointsPanel(
                        critOp = opponentCrit,
                        tacOp = opponentTac,
                        killOp = opponentKill
                    )


                    Spacer(Modifier.width(150.dp))

                    FactionIcon(
                        iconRes = opponentTeam?.iconRes,
                        onClick = {
                            opponentTeam?.let {
                                navController.navigate("team/${it.id}")
                            }

                        }
                    )
                }

                // ✅ NAME
                Text(
                    text = opponentName.ifEmpty { "YOU" },
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )

                // ✅ ROW 2 → SCORE + PLOYS
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalAlignment = Alignment.Top
                ) {

                    // 🔥 LEFT → SCORE
                    Column(modifier = Modifier.weight(1f)) {
                        ScorePanel(
                            critOpState = OpponentScoreState.critOp,
                            tacOpState = OpponentScoreState.tacOp,
                            killOpState = OpponentScoreState.killOp,
                            cpState = OpponentScoreState.cp,
                            onCritInfoClick = { showCritInfo = true },
                            onKillInfoClick = { showKillInfo = true },
                            enabled = !isViewingHistory
                        )

                    }

                    // 🔥 RIGHT → PLOYS
                    Column(modifier = Modifier.weight(2f)) {
                        CompactPloyPanel(
                            team = opponentTeam,
                            cpState = OpponentScoreState.cp,
                            navController = navController,
                            isPlayer = false,
                            historyPloys = viewedTurn?.opponentPloys,
                            isViewingHistory = isViewingHistory
                        )
                        TacOpSelector(
                            team = opponentTeam,
                            selectedState = OpponentTacOpState.selectedTacOp,
                            revealedState = OpponentTacOpState.revealed,
                            enabled = !isOpLocked
                        )

                        PrimaryOpPanel(
                            team = opponentTeam,
                            selectedState = OpponentPrimaryOpState.selectedOp,
                            onCritInfoClick = { showCritInfo = true },
                            onKillInfoClick = { showKillInfo = true },
                            enabled = !isOpLocked
                        )
                    }

                }
            }

            ///Turn handler






        }

        if (showCritInfo) {

            val critOp = BattleSetupState.selectedCritOp.value

            AlertDialog(
                onDismissRequest = { showCritInfo = false },
                confirmButton = {
                    TextButton(onClick = { showCritInfo = false }) {
                        Text("Close")
                    }
                },
                text = {
                    critOp?.let {
                        CritOpCard(
                            critOp = it,
                            onKeywordClick = {}
                        )
                    } ?: Text("No Crit Op selected", color = Color.White)
                }
            )
        }


        if (showKillInfo) {

            AlertDialog(
                onDismissRequest = { showKillInfo = false },
                confirmButton = {
                    TextButton(onClick = { showKillInfo = false }) {
                        Text("Close")
                    }
                },
                text = {
                    Image(
                        painter = painterResource(R.drawable.battleflow_kill_grade),
                        contentDescription = null,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            )
        }




        }
    }


    @Composable
    fun ScorePanel(
        critOpState: MutableState<Int>,
        tacOpState: MutableState<Int>,
        killOpState: MutableState<Int>,
        cpState: MutableState<Int>,
        onCritInfoClick: () -> Unit,
        onKillInfoClick: () -> Unit,
        enabled: Boolean
    ){

        var critOp by critOpState
        var tacOp by tacOpState
        var killOp by killOpState
        var cp by cpState

        Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {

            SmallCounter("CP", cp, { cp = it }, enabled = enabled)

            // 🔥 CRIT
            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Text("Crit Op", color = Color.White)
                    InfoIcon { onCritInfoClick() }
                }

                SmallCounter("", critOp, { critOp = it }, max = 6, enabled = enabled)
            }

            // 🔥 TAC
            SmallCounter("Tac Op", tacOp, { tacOp = it }, max = 6, enabled = enabled)

            // 🔥 KILL
            Column {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Text("Kill Op", color = Color.White)
                    InfoIcon { onKillInfoClick() }
                }

                SmallCounter("", killOp, { killOp = it }, max = 6, enabled = enabled)
            }
        }
    }

@Composable
fun FactionIcon(
    iconRes: Int?,
    onClick: () -> Unit
) {
    if (iconRes != null) {
        Image(
            painter = painterResource(iconRes),
            contentDescription = null,
            modifier = Modifier
                .shadow(8.dp, shape = RoundedCornerShape(8.dp))
                .size(110.dp) // 🔥 bigger (try 120 if you want more presence)
                .clickable { onClick() }
        )
    }
}

    @Composable
    fun SmallCounter(
        label: String,
        value: Int,
        onChange: (Int) -> Unit,
        max: Int? = null,
        enabled: Boolean
    ) {
        Column {

            if (label.isNotEmpty()) {
                Text(text = label, color = Color.White)
            }

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                // 🔻 SMALL MINUS
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .background(Color(0xFFFF6A00), RoundedCornerShape(50))
                        .clickable(enabled = enabled) {
                            if (value > 0) onChange(value - 1)
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Text("-", color = Color.Black, fontWeight = FontWeight.Bold)
                }

                Text(
                    text = value.toString(),
                    modifier = Modifier.padding(horizontal = 12.dp),
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )

                // 🔺 SMALL PLUS (NOW VISIBLE)
                Box(
                    modifier = Modifier
                        .size(32.dp)
                        .background(Color(0xFFFF6A00), RoundedCornerShape(50))
                        .clickable(enabled = enabled) {
                            if (max == null || value < max) {
                                onChange(value + 1)
                            }
                        },
                    contentAlignment = Alignment.Center
                ) {
                    Text("+", color = Color.Black, fontWeight = FontWeight.Bold)
                }
            }
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun PloySlot(
        allPloys: List<Ploy>,
        selectedState: MutableState<Ploy?>,
        allSelected: List<Ploy?>,
        cpState: MutableState<Int> // 🔥 NEW
    ) {

        var expanded by remember { mutableStateOf(false) }
        var selected by selectedState
        var cp by cpState

        val available = allPloys.filter {
            it !in allSelected || it == selected
        }

        val canSelect = cp > 0

        Box {

            // 🔥 GRIMDARK BOX + ACTIVE HIGHLIGHT
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = if (selected != null)
                            Color(0xFF2A1A00) // 🔥 active glow
                        else
                            Color(0xFF1A1A1A),
                        shape = RoundedCornerShape(6.dp)
                    )
                    .border(
                        width = 1.dp,
                        color = if (selected != null)
                            Color(0xFFFF6A00)
                        else
                            Color.DarkGray,
                        shape = RoundedCornerShape(6.dp)
                    )
                    .clickable(enabled = canSelect) {
                        expanded = true
                    }
                    .padding(12.dp)
            ) {
                Text(
                    text = selected?.name ?: "Select Ploy",
                    color = if (selected != null) Color.White else Color.Gray
                )
            }

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {

                DropdownMenuItem(
                    text = { Text("Clear") },
                    onClick = {
                        if (selected != null) {
                            cp++
                        }
                        selected = null
                        expanded = false
                    }
                )

                available.forEach { ploy ->
                    DropdownMenuItem(
                        text = { Text(ploy.name) },
                        onClick = {
                            if (selected == null && cp > 0) {
                                cp--
                            }
                            selected = ploy
                            expanded = false
                        }
                    )
                }
            }
        }
    }



    @Composable
    fun VictoryPointsPanel(
        critOp: Int,
        tacOp: Int,
        killOp: Int
    ) {

        val total = critOp + tacOp + killOp

        Column(
            modifier = Modifier
                .background(Color(0xFF1A1A1A), RoundedCornerShape(6.dp))
                .border(1.dp, Color(0xFFFF6A00), RoundedCornerShape(6.dp))
                .padding(horizontal = 16.dp, vertical = 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "VP",
                color = Color.Gray,
                fontSize = 12.sp
            )

            Text(
                text = "$total",
                color = Color(0xFFFF6A00),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }
    }
@Composable
fun TacOpSelector(
    team: Team?,
    selectedState: MutableState<TacOp?>,
    revealedState: MutableState<Boolean>,
    enabled: Boolean // 🔥 NEW
) {


    var expanded by remember { mutableStateOf(false) }
    var selected by selectedState

    LaunchedEffect(enabled) {
        if (!enabled) expanded = false
    }

    val tacOps = TacOpRepository.getTacOpsForTeam(team)

    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {

        Text(
            text = "TAC OP",
            color = Color.White,
            fontWeight = FontWeight.Bold
        )

        Box {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF1A1A1A), RoundedCornerShape(6.dp))
                    .border(
                        1.dp,
                        if (enabled) Color(0xFFFF6A00) else Color.DarkGray,
                        RoundedCornerShape(6.dp)
                    )
                    .clickable(enabled = enabled) { expanded = true }
                    .padding(12.dp)
            ) {
                val current = selected

                Text(
                    text = when {
                        current == null -> "Select Tac Op"
                        !revealedState.value -> "Hidden"
                        else -> current.title
                    },
                    color = if (current != null) Color.White else Color.Gray
                )
            }

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {

                tacOps.forEach { tac ->
                    DropdownMenuItem(
                        text = { Text(tac.title) },
                        enabled = enabled,
                        onClick = {
                            selected = tac
                            expanded = false
                        }
                    )
                }
            }
        }

        // 🔥 REVEAL TOGGLE
        selected?.let {

            Row(verticalAlignment = Alignment.CenterVertically) {

                Text("Revealed", color = Color.White)

                Spacer(Modifier.width(8.dp))

                Box(
                    modifier = Modifier
                        .background(
                            if (revealedState.value) Color(0xFFFF6A00)
                            else Color.DarkGray,
                            RoundedCornerShape(20.dp)
                        )
                        .clickable {
                            revealedState.value = !revealedState.value
                        }
                        .padding(horizontal = 16.dp, vertical = 6.dp)
                ) {
                    Text(
                        text = if (revealedState.value) "YES" else "NO",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            if (revealedState.value) {
                TacOpCard(
                    tacOp = it,
                    onKeywordClick = {}
                )
            }
        }
    }
}

@Composable
fun PrimaryOpPanel(
    team: Team?,
    selectedState: MutableState<SelectedOp?>,
    onCritInfoClick: () -> Unit,
    onKillInfoClick: () -> Unit,
    enabled: Boolean
) {

    var expanded by remember { mutableStateOf(false) }
    var selected by selectedState

    LaunchedEffect(enabled) {
        if (!enabled) expanded = false
    }


    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {

        Text(
            text = "PRIMARY OP",
            color = Color.White,
            fontWeight = FontWeight.Bold
        )

        // 🔥 SELECT BOX
        Box {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF1A1A1A), RoundedCornerShape(6.dp))
                    .border(
                        1.dp,
                        if (enabled) Color(0xFFFF6A00) else Color.DarkGray,
                        RoundedCornerShape(6.dp)
                    )
                    .clickable(enabled = enabled) { expanded = true }
                    .padding(12.dp)
            ) {
                Text(
                    text = when {
                        selected == null -> "Select Primary Op"
                        !selected!!.revealed -> "Hidden"
                        else -> when (selected!!.type) {
                            OpType.CRIT -> "Crit Op"
                            OpType.KILL -> "Kill Op"
                            OpType.TAC -> "Tac Op"
                        }
                    },
                    color = if (selected != null) Color.White else Color.Gray
                )
            }

            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false }
            ) {

                DropdownMenuItem(
                    text = { Text("Tac Op") },
                    enabled = enabled,
                    onClick = {
                        selected = SelectedOp(type = OpType.TAC)
                        expanded = false
                    }
                )

                DropdownMenuItem(
                    text = { Text("Kill Op") },
                    enabled = enabled,
                    onClick = {
                        selected = SelectedOp(type = OpType.KILL)
                        expanded = false
                    }
                )

                DropdownMenuItem(
                    text = { Text("Crit Op") },
                    enabled = enabled,
                    onClick = {
                        selected = SelectedOp(type = OpType.CRIT)
                        expanded = false
                    }
                )
            }
        }

        // 🔥 REVEAL TOGGLE
        selected?.let {

            Row(verticalAlignment = Alignment.CenterVertically) {

                Text("Revealed", color = Color.White)

                Spacer(Modifier.width(8.dp))

                // ✅ GRIMDARK TOGGLE
                Box(
                    modifier = Modifier
                        .background(
                            if (it.revealed) Color(0xFFFF6A00)
                            else Color.DarkGray,
                            RoundedCornerShape(20.dp)
                        )
                        .clickable {
                            selected = it.copy(revealed = !it.revealed)
                        }
                        .padding(horizontal = 16.dp, vertical = 6.dp)
                ) {
                    Text(
                        text = if (it.revealed) "YES" else "NO",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            // 🔥 PREVIEW (ONLY WHEN REVEALED)
            if (it.revealed) {

                when (it.type) {

                    OpType.TAC -> {
                        Text("Tac Op Selected", color = Color.White)
                    }

                    OpType.CRIT -> {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Text("CRIT OP", color = Color.White, fontWeight = FontWeight.Bold)

                            InfoIcon {
                                onCritInfoClick()
                            }
                        }
                    }

                    OpType.KILL -> {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(6.dp)
                        ) {
                            Text("KILL OP", color = Color.White, fontWeight = FontWeight.Bold)

                            InfoIcon {
                                onKillInfoClick()
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun CompactPloyPanel(
    team: Team?,
    cpState: MutableState<Int>,
    navController: NavController,
    isPlayer: Boolean,
    historyPloys: List<String>?,
    isViewingHistory: Boolean
) {



    val allPloys = remember(team?.id) {
        team?.id?.let { PloyRepository.getPloysForTeam(it) } ?: emptyList()
    }


    val historyPloyObjects = if (isViewingHistory && historyPloys != null) {
        allPloys.filter { it.id in historyPloys }
    } else emptyList()

    val strategyPloys = remember(allPloys) {
        allPloys.filter { it.type == PloyType.STRATEGY }
    }

    val firefightPloys = remember(allPloys) {
        allPloys.filter { it.type == PloyType.FIREFIGHT }
    }

    val selectedStrategy =
        if (isViewingHistory) {
            historyPloyObjects.filter { it.type == PloyType.STRATEGY }.toMutableList()
        } else {
            if (isPlayer) PlayerPloyState.activeStrategyPloys
            else OpponentPloyState.activeStrategyPloys
        }

    val selectedFirefight =
        if (isViewingHistory) {
            historyPloyObjects.filter { it.type == PloyType.FIREFIGHT }.toMutableList()
        } else {
            if (isPlayer) PlayerPloyState.activeFirefightPloys
            else OpponentPloyState.activeFirefightPloys
        }

    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {

        PloyDropdownBar(
            title = "STRATEGY PLOY",
            ploys = strategyPloys,
            selectedState = selectedStrategy,
            cpState = cpState,
            enabled = !isViewingHistory,
            onInfoClick = {
                team?.let { navController.navigate("teamPloys/${it.id}") }
            }
        )

        PloyDropdownBar(
            title = "FIREFIGHT PLOY",
            ploys = firefightPloys,
            selectedState = selectedFirefight,
            cpState = cpState,
            enabled = !isViewingHistory,
            onInfoClick = {
                team?.let { navController.navigate("teamPloys/${it.id}") }
            }
        )
    }
}

@Composable
fun PloyDropdownBar(
    title: String,
    ploys: List<Ploy>,
    selectedState: MutableList<Ploy>,
    cpState: MutableState<Int>,
    onInfoClick: () -> Unit,
    enabled: Boolean = true
){

    var expanded by remember { mutableStateOf(false) }
    val selectedSet = selectedState
    var cp by cpState

    LaunchedEffect(enabled) {
        if (!enabled) expanded = false
    }

    Column(verticalArrangement = Arrangement.spacedBy(6.dp)) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = title,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )

            // 🔥 INFO BUTTON
            Box(
                modifier = Modifier
                    .size(26.dp)
                    .background(Color(0xFF1A1A1A), RoundedCornerShape(50))
                    .border(1.dp, Color(0xFFFF6A00), RoundedCornerShape(50))
                    .clickable { onInfoClick() },
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "i",
                    color = Color(0xFFFF6A00),
                    fontWeight = FontWeight.Bold
                )
            }
        }

        // 🔥 MAIN BAR (just opens dropdown)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFF1A1A1A), RoundedCornerShape(6.dp))
                .border(1.dp, Color.DarkGray, RoundedCornerShape(6.dp))
                .clickable(enabled = enabled && cp > 0) { expanded = true }
                .padding(12.dp)
        ) {
            Text(
                text = if (selectedSet.isEmpty()) "Select Ploys"
                else "${selectedSet.size} Active",
                color = Color.White
            )
        }

        // 🔥 ACTIVE PLOYS DISPLAY (MULTI)
        selectedSet.forEach { ploy ->
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF2A1A00), RoundedCornerShape(6.dp))
                    .border(1.dp, Color(0xFFFF6A00), RoundedCornerShape(6.dp))
                    .padding(10.dp)
            ) {
                Text(ploy.name, color = Color.White)
            }
        }

        // 🔥 DROPDOWN
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {

            ploys.forEach { ploy ->

                val isSelected = selectedSet.contains(ploy)

                DropdownMenuItem(
                    text = {
                        Text(
                            text = if (isSelected) "✓ ${ploy.name}" else ploy.name
                        )
                    },
                    onClick = {

                        if (isSelected) {
                            selectedSet.remove(ploy)
                            cp++
                        } else {
                            if (cp > 0) {
                                selectedSet.add(ploy)
                                cp--
                            }
                        }
                    }
                )
            }
        }
    }
}

