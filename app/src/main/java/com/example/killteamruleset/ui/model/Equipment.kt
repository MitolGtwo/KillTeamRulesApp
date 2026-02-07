package com.example.killteamruleset.ui.model

import androidx.annotation.StringRes

data class Equipment(
    val id: String,
    val name: Int,
    val lore: Int? = null,
    @StringRes val description: Int,
    val ability: Ability? = null,
    val weapons: List<WeaponProfile> = emptyList()
)