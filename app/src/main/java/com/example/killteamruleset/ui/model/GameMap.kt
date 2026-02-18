package com.example.killteamruleset.ui.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class GameMap(
    val id: String,
    val category: MapCategory,
    val number: Int,
    val title: String,
    @DrawableRes val image: Int,
    val randomizable: Boolean = true
)