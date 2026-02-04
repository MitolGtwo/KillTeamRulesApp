package com.example.killteamruleset.ui.model

data class Equipment(
    val id: String,
    val name: String,
    val lore: String? = null,
    val description: String,
    val ability: Ability? = null,
    val weapons: List<WeaponProfile> = emptyList()
)