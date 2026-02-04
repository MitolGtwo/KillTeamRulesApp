package com.example.killteamruleset.ui.model


enum class Alliance {
    IMPERIUM,
    CHAOS,
    XENOS,
    FAVORITES
}

data class Team(
    val id: String,
    val name: String,
    val alliance: Alliance,
    val type: TeamType,
    val difficulty: String,
    val archetypes: List<Archetypes>,
    val backgroundRes: Int,
    val factionRulesBackgroundRes: Int,
    val assemblyPdfAsset: String,
    val iconRes: Int,
    val quote: String,
    val isFavorite: Boolean = false
)