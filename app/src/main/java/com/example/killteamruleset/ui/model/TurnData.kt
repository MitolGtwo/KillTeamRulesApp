package com.example.killteamruleset.ui.model

data class TurnData(
    val turn: Int,

    val playerCrit: Int,
    val playerTac: Int,
    val playerKill: Int,

    val opponentCrit: Int,
    val opponentTac: Int,
    val opponentKill: Int,

    val playerPloys: List<String>,
    val opponentPloys: List<String>,

    val playerTacOp: String?,
    val opponentTacOp: String?,

    val initiativePlayer: Boolean
)