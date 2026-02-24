package com.example.killteamruleset.ui.model

import androidx.annotation.StringRes

data class Equipment(
    val id: String,
    val name: String,
    val lore: Int? = null,
    @StringRes val description: Int,
    val abilities: List<Ability> = emptyList(),
    val weapons: List<WeaponProfile> = emptyList()
)