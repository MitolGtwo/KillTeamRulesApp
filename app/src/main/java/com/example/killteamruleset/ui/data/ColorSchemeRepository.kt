package com.example.killteamruleset.ui.data

import com.example.killteamruleset.ui.model.ColorScheme
import com.example.killteamruleset.R

object ColorSchemeRepository {

    private val schemesByTeam = mapOf(
        "wrecka_krew" to listOf(
            ColorScheme("wk_1", R.drawable.wrecka_scheme, "bottom text"),
            ColorScheme("wk_2", R.drawable.wrecka_scheme2, "Hazard Yellow"),
        )

    )

    fun getForTeam(teamId: String): List<ColorScheme> =
        schemesByTeam[teamId].orEmpty()
}