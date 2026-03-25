package com.example.killteamruleset.state

import androidx.compose.runtime.mutableStateOf
import com.example.killteamruleset.ui.model.TacOp

object PlayerScoreState {
    var critOp = mutableStateOf(0)
    var tacOp = mutableStateOf(0)
    var killOp = mutableStateOf(0)
    var cp = mutableStateOf(0)
}

object OpponentScoreState {
    var critOp = mutableStateOf(0)
    var tacOp = mutableStateOf(0)
    var killOp = mutableStateOf(0)
    var cp = mutableStateOf(0)
}

object PlayerTacOpState {
    val selectedTacOp = mutableStateOf<TacOp?>(null)
    val revealed = mutableStateOf(false) // 🔥 ADD THIS
}

object OpponentTacOpState {
    val selectedTacOp = mutableStateOf<TacOp?>(null)
    val revealed = mutableStateOf(false)
}


//Tac/crt/kill ops

enum class OpType {
    CRIT,
    TAC,
    KILL
}

data class SelectedOp(
    val type: OpType,
    val revealed: Boolean = false
)

object PlayerPrimaryOpState {
    val selectedOp = mutableStateOf<SelectedOp?>(null)
}

object OpponentPrimaryOpState {
    val selectedOp = mutableStateOf<SelectedOp?>(null)
}