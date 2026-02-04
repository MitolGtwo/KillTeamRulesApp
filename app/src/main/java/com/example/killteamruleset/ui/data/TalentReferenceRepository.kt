package com.example.killteamruleset.ui.data

import com.example.killteamruleset.ui.model.TalentReference
import com.example.killteamruleset.R


object TalentReferenceRepository {

    fun getForTeam(teamId: String): List<TalentReference> =
        when (teamId) {
            "wrecka_krew" -> listOf(
                TalentReference(
                    id = "wrecka_talent_1",
                    imageRes = R.drawable.wreckaart1
                ),
                TalentReference(
                    id = "wrecka_talent_3",
                    imageRes = R.drawable.wreckaart1
                )
            )
            else -> emptyList()
        }
}