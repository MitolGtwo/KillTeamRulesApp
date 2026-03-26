package com.example.killteamruleset.ui.model

data class BattleSession(
    val playerName: String,
    val opponentName: String,
    val playerTeamId: String,
    val opponentTeamId: String,

    val currentTurn: Int,
    val isFinished: Boolean,
    val turns: List<TurnData>,
    val initiativeHistory: List<Boolean>,

    val playerCP: Int = 0,
    val opponentCP: Int = 0,

    // 🔥 NEW FIELDS
    val mapType: String = "",          // "Volkus" or "Tombworld"
    val mapNumber: Int = 0,
    val critOpNumber: Int = 0,
    val critOpName: String = ""
)