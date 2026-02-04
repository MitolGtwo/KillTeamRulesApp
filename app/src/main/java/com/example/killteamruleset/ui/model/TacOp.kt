package com.example.killteamruleset.ui.model

data class TacOp(
    val id: String,
    val archetype: Archetypes,
    val title: String,
    val reveal: String,

    val missionAction: Ability? = null,      // 👈 THIS is the card
    val additionalRules: String?,
    val victoryPoints: String
)