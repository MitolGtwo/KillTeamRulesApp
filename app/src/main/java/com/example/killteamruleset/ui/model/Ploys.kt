package com.example.killteamruleset.ui.model

data class Ploy(
    val id: String,
    val name: Int,
    val type: PloyType,
    val lore: Int? = null,
    val description: Int
)

enum class PloyType {
    STRATEGY,
    FIREFIGHT
}