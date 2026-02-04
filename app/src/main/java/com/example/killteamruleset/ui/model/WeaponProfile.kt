package com.example.killteamruleset.ui.model

data class WeaponProfile(
    val name: String,
    val type: WeaponType,
    val attacks: Int,
    val hit: String,
    val damage: String,
    val keywords: List<KeywordInfo> = emptyList(),
    val extraRules: List<String> = emptyList()
)