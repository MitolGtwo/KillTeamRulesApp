package com.example.killteamruleset.ui.model

data class TacOp(
    val id: String,
    val archetype: Archetypes,
    val title: Int,
    val reveal: Int,

    val missionAction: Ability? = null,      // 👈 THIS is the card
    val additionalRules: Int?,
    val victoryPoints: Int
)