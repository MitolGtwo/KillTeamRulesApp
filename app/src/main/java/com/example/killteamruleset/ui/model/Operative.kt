package com.example.killteamruleset.ui.model

data class Operative(
    val imageRes: Int,
    val name: String,
    val stats: OperativeStats,
    val weapons: List<WeaponProfile>,
    val abilities: List<Ability>,
    val keywords: List<String>
)