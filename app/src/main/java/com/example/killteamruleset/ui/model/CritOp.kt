package com.example.killteamruleset.ui.model

data class CritOp(
    val id: String,
    val number: Int,                 // 1–9
    val title: String,                 // string resource
    val missionActions: List<Ability> = emptyList(),
    val additionalRules: Int? = null,
    val victoryPoints: Int
)