package com.example.killteamruleset.ui.model

data class Ploy(
    val id: String,
    val name: String,
    val type: PloyType,
    val lore: Int? = null,
    val description: Int,
    val abilities: List<Ability> = emptyList()
)

enum class PloyType {
    STRATEGY,
    FIREFIGHT
}