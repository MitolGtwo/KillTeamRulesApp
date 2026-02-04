package com.example.killteamruleset.ui.model

data class Ploy(
    val id: String,
    val name: String,
    val type: PloyType,
    val lore: String? = null,
    val description: String
)

enum class PloyType {
    STRATEGY,
    FIREFIGHT
}