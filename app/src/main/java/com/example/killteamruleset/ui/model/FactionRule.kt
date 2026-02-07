package com.example.killteamruleset.ui.model

import androidx.annotation.StringRes

data class FactionRule(
    val id: String,
    @StringRes val title: Int,
    @StringRes val lore: Int? = null,
    @StringRes val ruleText: Int? = null,
    val imageRes: Int? = null
)