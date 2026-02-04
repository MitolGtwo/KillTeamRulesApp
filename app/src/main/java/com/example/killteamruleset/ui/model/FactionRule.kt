package com.example.killteamruleset.ui.model

data class FactionRule(
    val id: String,
    val title: String,
    val lore: String? = null,     // 👈 grey flavor text
    val ruleText: String,// 👈 actual rules
    val imageRes: Int? = null // 👈 OPTIONAL IMAGE
)