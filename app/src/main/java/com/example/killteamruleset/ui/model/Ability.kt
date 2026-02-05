package com.example.killteamruleset.ui.model

import androidx.annotation.StringRes

data class Ability(
    @StringRes val title: Int? = null,
    @StringRes val usage: Int? = null,
    @StringRes val description: Int? = null,
    val icons: List<Int> = emptyList()
)

/* This is used for Abilities for Operatives and Specific TacOp Actions */