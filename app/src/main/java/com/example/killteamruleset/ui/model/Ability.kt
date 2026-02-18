package com.example.killteamruleset.ui.model

import android.R
import androidx.annotation.StringRes

data class Ability(
    val title: String?,
    @StringRes val usage: Int? = null,
    @StringRes val description: Int? = null,
    val icons: List<Int> = emptyList()
)

/* This is used for Abilities for Operatives and Specific TacOp Actions */